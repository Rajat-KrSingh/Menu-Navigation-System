package com.menu;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/menu")
public class MenuServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    // Shared tree for the whole application
    private static MenuTree tree = new MenuTree("Phone");
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String action = request.getParameter("action");
        String message = "";
        if ("add".equals(action)) {
            String parent = request.getParameter("parent");
            String child = request.getParameter("child");
            message = tree.addMenu(parent, child);
        } else if ("delete".equals(action)) {
            String parent = request.getParameter("parent");
            String menu = request.getParameter("menu");
            message = tree.deleteMenu(parent, menu);
        } else if ("rename".equals(action)) {
            String parent = request.getParameter("parent");
            String oldName = request.getParameter("oldName");
            String newName = request.getParameter("newName");
            message = tree.renameMenu(parent, oldName, newName);
        } else if ("search".equals(action)) {
            String parent = request.getParameter("parent");
            String menu = request.getParameter("menu");
            message = tree.findMenu(parent, menu);
        }
        request.setAttribute("message", message);
        request.setAttribute("tree", tree.displayTree());
        request.setAttribute("count", tree.countMenus(tree.getRoot()));
        request.setAttribute("height", tree.treeHeight(tree.getRoot()));
        request.getRequestDispatcher("index.jsp")
               .forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", "Welcome!");
        request.setAttribute("tree", tree.displayTree());
        request.setAttribute("count", tree.countMenus(tree.getRoot()));
        request.setAttribute("height", tree.treeHeight(tree.getRoot()));
        request.getRequestDispatcher("index.jsp")
               .forward(request, response);
    }
}