# 🌳 Menu Navigation System

### Built with Java, JSP, Servlets & Tree Data Structure --- Hierarchical Menu Management Web Application

------------------------------------------------------------------------

## 📁 Project Structure

    MenuNavigationSystem/
    │
    ├── src/
    │   └── com/
    │       └── menu/
    │           ├── MenuNode.java
    │           ├── MenuTree.java
    │           └── MenuServlet.java
    │
    ├── WebContent/
    │   ├── index.jsp
    │   ├── style.css
    │   └── WEB-INF/
    │       └── web.xml
    │
    ├── README.md      ← Project Documentation

------------------------------------------------------------------------

## ⚙️ Setup Instructions (Apache Tomcat)

### Step 1: Install Requirements

Install:

- Java JDK 21 (or later)
- Apache Tomcat 10
- VS Code (or any Java IDE)

------------------------------------------------------------------------

### Step 2: Compile the Project

Open Command Prompt inside the project folder and run:

```cmd
javac -cp "C:\Program Files\Apache Tomcat\apache-tomcat-10.1.57\lib\servlet-api.jar" -d WebContent\WEB-INF\classes src\com\menu\*.java
```

------------------------------------------------------------------------

### Step 3: Deploy the Project

Copy the project folder to:

    C:\Program Files\Apache Tomcat\apache-tomcat-10.1.57\webapps\

------------------------------------------------------------------------

### Step 4: Start Apache Tomcat

Go to:

    C:\Program Files\Apache Tomcat\apache-tomcat-10.1.57\bin

Run:

    startup.bat

or

```cmd
catalina.bat run
```

------------------------------------------------------------------------

### Step 5: Run the Project

Open browser:

    http://localhost:8080/MenuNavigationSystem-Web/menu

------------------------------------------------------------------------

## 🌳 Data Structure Used

General Tree

Each menu is represented as a node.

Every node can contain multiple child menus, forming a hierarchical menu structure.

------------------------------------------------------------------------

## 📋 Modules Explained

### 1. MenuNode.java

Represents an individual menu node.

Stores:

- Menu Name
- Parent Menu
- Child Menus

------------------------------------------------------------------------

### 2. MenuTree.java

Implements all tree operations.

Functions include:

- Add Menu
- Delete Menu
- Rename Menu
- Search Menu
- Display Menu Tree
- Count Total Menus
- Calculate Tree Height

------------------------------------------------------------------------

### 3. MenuServlet.java

Acts as the controller.

Responsibilities:

- Receives user requests
- Calls MenuTree methods
- Sends updated data to JSP
- Displays success/error messages

------------------------------------------------------------------------

### 4. index.jsp

Main user interface.

Provides:

- Add Menu
- Delete Menu
- Rename Menu
- Search Menu
- Refresh Menu Tree
- Tree Display
- Statistics Dashboard

------------------------------------------------------------------------

### 5. style.css

Provides the complete UI styling.

Features:

- Animated gradient background
- Responsive dashboard layout
- Statistics cards
- Professional form styling
- Interactive buttons
- Modern user interface

------------------------------------------------------------------------

## ✨ Features

- Add Parent Menu / Submenu
- Delete Existing Menu
- Rename Menu
- Search Menu
- Display Hierarchical Menu Tree
- Count Total Menus
- Calculate Tree Height
- Refresh Tree View
- Responsive Dashboard Interface
- Modern Animated UI

------------------------------------------------------------------------

## 🌲 Example Menu Tree

```text
Main Menu
├── File
│   ├── Open
│   ├── Save
│   └── Exit
│
├── Edit
│   ├── Copy
│   ├── Paste
│   └── Undo
│
└── View
    ├── Zoom In
    └── Zoom Out
```

------------------------------------------------------------------------

## ⚡ Algorithms Used

### Add Menu

- Searches the parent menu
- Inserts child node

### Delete Menu

- Finds parent and child
- Removes selected node

### Rename Menu

- Searches selected node
- Updates menu name

### Search Menu

- Uses Recursive Depth-First Search (DFS)

### Count Menus

- Recursive traversal

### Calculate Height

- Recursive height calculation

------------------------------------------------------------------------

## 📊 Time Complexity

| Operation | Complexity |
|-----------|------------|
| Add Menu | O(n) |
| Delete Menu | O(n) |
| Rename Menu | O(n) |
| Search Menu | O(n) |
| Count Menus | O(n) |
| Tree Height | O(n) |

------------------------------------------------------------------------

## 🛠️ Tech Stack

- **Frontend:** HTML, CSS, JSP
- **Backend:** Java Servlets
- **Language:** Java
- **Server:** Apache Tomcat
- **Data Structure:** General Tree

------------------------------------------------------------------------

## 💡 Common Issues

**Tomcat not starting**

→ Verify JAVA_HOME is configured correctly.

------------------------------------------------------------------------

**404 Error**

→ Ensure the project is copied into the Tomcat `webapps` directory.

------------------------------------------------------------------------

**Servlet not working**

→ Recompile Java files and copy the updated `.class` files into `WEB-INF/classes`.

------------------------------------------------------------------------

**CSS changes not visible**

→ Refresh the browser using **Ctrl + F5** or restart Tomcat.

------------------------------------------------------------------------

**Compilation Errors**

→ Make sure `servlet-api.jar` is included while compiling.

------------------------------------------------------------------------

## 👨‍💻 Developed by

- Rajat Kumar Singh

------------------------------------------------------------------------

## 📚 Academic Purpose

This project was developed as a **Data Structures & Algorithms Mini Project** to demonstrate the practical implementation of a **General Tree** using **Java Servlets, JSP, HTML, and CSS** for hierarchical menu management.
