# ❤️ Fake Love Calculator

A fun web application built using **Java Servlets, HTML, and CSS** that calculates a playful love score based on the names of a user and their crush.

## ✨ Features

- 📝 Collects the user's name and crush's name through an HTML form.
- ⚙️ Processes form data using Java Servlets.
- ❤️ Generates a love score using Java's `hashCode()` method.
- 💌 Displays different messages based on the calculated score.
- 🎨 Attractive UI with a romantic background, gradient colors, and styled result card.
- 🔄 **Try Again** button to return to the input form.
- 📱 Responsive layout for different screen sizes.

## 🛠️ Technologies Used

- **Java** — Core logic and hash-code calculation
- **Jakarta Servlets** — Server-side request processing
- **HTML5** — Form structure
- **CSS3** — Styling and responsive design
- **Apache Tomcat** — Servlet container
- **Git & GitHub** — Version control and project hosting

## ⚙️ How It Works

1. The user enters their name and their crush's name in the HTML form.
2. The form sends the data to the `LoveCalculator` Servlet using an HTTP GET request.
3. The Servlet retrieves the input using `request.getParameter()`.
4. A score between 0 and 100 is generated using Java's `hashCode()` method.
5. The score and names are passed to the `Display` Servlet using request attributes.
6. The `Display` Servlet generates a styled HTML response with a message based on the score.
7. The user can click **Try Again** to calculate another result.

## 💖 Love Score Messages

| Score | Message |
|---|---|
| 85–100 | Perfect Pair, Darlings! 💖 |
| 70–84 | A Little More Perfection! 💕 |
| 50–69 | Needs More Understanding! 💗 |
| 0–49 | Not a Perfect Match Yet! 💔 |

## 📂 Project Structure

```text
FakeLoveCalculator/
├── src/
│   └── com/
│       └── megha/
│           ├── LoveCalculator.java
│           └── Display.java
├── WebContent/
│   └── index.html
├── .gitignore
└── README.md
```

*Note: The exact web folder may differ depending on your Eclipse project configuration.*

## 🚀 How to Run

1. Clone or download this repository.
2. Import the project into Eclipse as a Dynamic Web Project, or configure it according to your existing project structure.
3. Configure Apache Tomcat in Eclipse.
4. Ensure the required Jakarta Servlet API is available through the Tomcat runtime.
5. Run the project on the server.
6. Open the application's `index.html` page in your browser.
7. Enter both names and click **Calculate Love**.

## 🎯 Learning Outcomes

This project helped me practice:

- Java Servlet lifecycle and request handling
- Retrieving form data using `getParameter()`
- Passing data between Servlets using `setAttribute()` and `RequestDispatcher`
- Generating dynamic HTML responses using `PrintWriter`
- Applying CSS to server-generated HTML
- Using Git and GitHub for version control

## ⚠️ Disclaimer

This project is created for **fun and educational purposes only**. The love score is based on a simple hash-code calculation and does not represent actual love, personality, or relationship compatibility.

## 👨‍💻 Author

**Meghanath**

A Java developer in progress, learning by building practical projects.



## 👨‍💻 Author

**Meghanath Thota**

GitHub: 
