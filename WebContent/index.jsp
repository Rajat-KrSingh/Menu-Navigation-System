<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Menu Navigation System</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<body>
<div class="container">
    <h1>Menu Navigation System</h1>
    <div class="message">
        ${message}
    </div>
    <div class="dashboard">
        <!-- Add -->
        <div class="panel">
            <h2>➕ Add Menu</h2>
            <form action="menu" method="post">
                <input type="hidden" name="action" value="add">
                <label>Parent Menu</label>
                <input type="text" name="parent" required>
                <label>New Menu</label>
                <input type="text" name="child" required>
                <button type="submit">Add Menu</button>
                <input type="reset" value="Clear">
            </form>
        </div>
        <!-- Delete -->
        <div class="panel">
            <h2>🗑 Delete Menu</h2>
            <form action="menu" method="post">
                <input type="hidden" name="action" value="delete">
                <label>Parent Menu</label>
                <input type="text" name="parent" required>
                <label>Menu Name</label>
                <input type="text" name="menu" required>
                <button type="submit">Delete</button>
                <input type="reset" value="Clear">
            </form>
        </div>
        <!-- Rename -->
        <div class="panel">
            <h2>✏️ Rename Menu</h2>
            <form action="menu" method="post">
                <input type="hidden" name="action" value="rename">
                <label>Parent Menu</label>
                <input type="text" name="parent" required>
                <label>Current Name</label>
                <input type="text" name="oldName" required>
                <label>New Name</label>
                <input type="text" name="newName" required>
                <button type="submit">Rename</button>
                <input type="reset" value="Clear">
            </form>
        </div>
        <!-- Search -->
        <div class="panel">
            <h2>🔍 Search Menu</h2>
            <form action="menu" method="post">
                <input type="hidden" name="action" value="search">
                <label>Parent Menu</label>
                <input type="text" name="parent" required>
                <label>Menu Name</label>
                <input type="text" name="menu" required>
                <button type="submit">Search</button>
                <input type="reset" value="Clear">
            </form>
        </div>
    </div>
    <div class="refresh-box">
        <form action="menu" method="get">
            <button type="submit">Refresh Menu Tree</button>
        </form>
    </div>
    <hr>
    <h2>🌳 Current Menu Tree</h2>
    <pre>${tree}</pre>
    <div class="stats">
        <div class="card">
            <h2>${count}</h2>
            <p>📊 Total Menus</p>
        </div>
        <div class="card">
            <h2>${height}</h2>
            <p>📏 Tree Height</p>
        </div>
    </div>
    <footer>
        DSA Mini Project • Menu Navigation System
        <br><br>
        Developed by Rajat Kumar Singh
    </footer>
</div>
</body>
</body>
</html>