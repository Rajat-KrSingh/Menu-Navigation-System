package com.menu;
import java.util.ArrayList;
public class MenuTree {
    private MenuNode root;
    // Constructor
    public MenuTree(String rootName) {
        root = new MenuNode(rootName);
    }
    // Return root
    public MenuNode getRoot() {
        return root;
    }
    // Search a menu using DFS (Recursive)
    public MenuNode searchMenu(MenuNode current, String menuName) {
        if (current == null)
            return null;
        if (current.getMenuName().equals(menuName))
            return current;
        for (MenuNode child : current.getChildren()) {
            MenuNode result = searchMenu(child, menuName);
            if (result != null)
                return result;
        }return null;
    }
    public MenuNode searchMenuByParent(String parentName, String menuName) {
        MenuNode parent = searchMenu(root, parentName);
        if (parent == null)
            return null;
        for (MenuNode child : parent.getChildren()) {
            if (child.getMenuName().equals(menuName))
                return child;
        }return null;
    }
    // Add a menu under a parent
    public String addMenu(String parentName, String newMenuName) {
        MenuNode parent = searchMenu(root, parentName);
        if (parent == null) {
            return "Parent menu not found.";
        }
        // Allow duplicate names in different branches, but not under the same parent.
        for (MenuNode child : parent.getChildren()) {
            if (child.getMenuName().equals(newMenuName)) {
                return "A menu with this name already exists under the selected parent.";
            }
        }MenuNode newMenu = new MenuNode(newMenuName);
        newMenu.setParent(parent);
        parent.getChildren().add(newMenu);
        return "Menu added successfully.";
    }
    // Delete a menu
    public String deleteMenu(String parentName, String menuName) {
        MenuNode node = searchMenuByParent(parentName, menuName);
        if (node == null)
            return "Menu not found.";
        MenuNode parent = node.getParent();
        if (parent != null) {
            parent.getChildren().remove(node);
            return "Menu deleted successfully.";
        }return "Unable to delete menu.";
    }
    // Rename a menu
    public String renameMenu(String parentName, String oldName, String newName) {
        MenuNode menu = searchMenuByParent(parentName, oldName);
        if (menu == null)
            return "Menu not found.";
        for (MenuNode child : menu.getParent().getChildren()) {
            if (child.getMenuName().equals(newName))
                return "Another menu with this name already exists.";
        }
        menu.setMenuName(newName);
        return "Menu renamed successfully.";
    }
    // Search menu
    public String findMenu(String parentName, String menuName) {
        MenuNode menu = searchMenuByParent(parentName, menuName);
        if (menu == null)
            return "Menu not found.";
        return "Menu found : " + menu.getMenuName();
    }
    // Display Tree
    public String displayTree() {
        StringBuilder sb = new StringBuilder();
        displayRecursive(root, 0, sb);
        return sb.toString();
    }
    // Recursive helper
    private void displayRecursive(MenuNode node, int level, StringBuilder sb) {
        if (node == null)
            return;
        for (int i = 0; i < level; i++) {
            sb.append("    ");
        }sb.append("- ").append(node.getMenuName()).append("\n");
        for (MenuNode child : node.getChildren()) {
            displayRecursive(child, level + 1, sb);
        }
    }
    // Count total menus
    public int countMenus(MenuNode node) {
        if (node == null)
            return 0;
        int count = 1;
        for (MenuNode child : node.getChildren()) {
            count += countMenus(child);
        }return count;
    }
    // Height of Tree
    public int treeHeight(MenuNode node) {
        if (node == null)
            return -1;
        int maxHeight = -1;
        for (MenuNode child : node.getChildren()) {
            maxHeight = Math.max(maxHeight, treeHeight(child));
        }return maxHeight + 1;
    }
}