<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>${pageTitle}</title>
    <link rel="stylesheet" href="styles.css">
    <link rel="icon" href="images/icon.svg">
</head>
<body>
<div id="container">
    <form method="post">
        <input type="text" name="login" placeholder="Login">
        <input type="password" name="password" placeholder="Password">
        <input id="button" type="submit" value="Login">
    </form>
    ${message}
</div>
</body>
</html>