package com.menu;
import java.util.ArrayList;
public class MenuNode {
    String menuName;
    MenuNode parent;
    ArrayList<MenuNode> children;
    // Constructor
    public MenuNode(String menuName) {
        this.menuName = menuName;
        this.parent = null;
        this.children = new ArrayList<>();
    }
    // Getter for menu name
    public String getMenuName() {
        return menuName;
    }
    // Setter for menu name
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    // Getter for parent
    public MenuNode getParent() {
        return parent;
    }
    // Setter for parent
    public void setParent(MenuNode parent) {
        this.parent = parent;
    }
    // Getter for children
    public ArrayList<MenuNode> getChildren() {
        return children;
    }
}