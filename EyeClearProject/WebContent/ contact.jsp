<!DOCTYPE html>
<html lang="en">
<head>
    <title>Contact Us</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h2>Contact Us</h2>
    <form action="ContactServlet" method="post">
        <label>Name: <input type="text" name="name" required></label><br>
        <label>Email: <input type="email" name="email" required></label><br>
        <label>Message: <textarea name="message" rows="4" required></textarea></label><br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
