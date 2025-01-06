<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Eye Clear - Healthcare Website</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <nav>
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#services">Services</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
        </nav>
    </header>

    <section id="home">
        <h1>Welcome to Eye Clear</h1>
        <p>Your vision, our mission.</p>
        <a href="#services" class="btn">Explore Services</a>
    </section>

    <section id="about">
        <h2>About Us</h2>
        <p>We provide top-notch eye care services with modern technology.</p>
    </section>

    <section id="services">
        <h2>Our Services</h2>
        <div class="service">
            <h3>Eye Exams</h3>
            <p>Comprehensive eye tests by experts.</p>
        </div>
        <div class="service">
            <h3>Prescription Glasses</h3>
            <p>Customized eyewear for your vision needs.</p>
        </div>
        <div class="service">
            <h3>Eye Health Tracking</h3>
            <p>Track your eye health with our smart tools.</p>
        </div>
    </section>

    <section id="contact">
        <h2>Contact Us</h2>
        <form action="ContactServlet" method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="message">Message:</label>
            <textarea id="message" name="message" rows="4" required></textarea>

            <button type="submit">Send Message</button>
        </form>
    </section>

    <footer>
        <p>&copy; 2024 Eye Clear. All rights reserved.</p>
    </footer>
</body>
</html>

/* CSS Styles */

/* Reset some default styles */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    font-family: Arial, sans-serif;
    line-height: 1.6;
    background-color: #f4f4f4;
    color: #333;
}

header {
    background: #333;
    color: white;
    padding: 1em 0;
    text-align: center;
}

header nav ul {
    list-style: none;
    display: flex;
    justify-content: center;
}

header nav ul li {
    margin: 0 15px;
}

header nav ul li a {
    color: white;
    text-decoration: none;
    font-size: 18px;
}

section {
    padding: 2em 0;
    text-align: center;
}

section h2 {
    margin-bottom: 1em;
}

.service {
    background: white;
    padding: 1em;
    margin: 1em;
    border-radius: 5px;
}

form {
    max-width: 600px;
    margin: 0 auto;
    padding: 1em;
    background: white;
    border-radius: 5px;
}

form label {
    display: block;
    margin: 0.5em 0 0.2em;
}

form input, form textarea {
    width: 100%;
    padding: 0.5em;
    margin-bottom: 1em;
    border: 1px solid #ccc;
    border-radius: 5px;
}

form button {
    background: #333;
    color: white;
    border: none;
    padding: 0.7em 2em;
    border-radius: 5px;
    cursor: pointer;
}

form button:hover {
    background: #555;
}

footer {
    text-align: center;
    padding: 1em 0;
    background: #333;
    color: white;
}
