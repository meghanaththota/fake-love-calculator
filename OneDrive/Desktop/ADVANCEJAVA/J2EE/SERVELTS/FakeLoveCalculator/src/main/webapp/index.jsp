
<!DOCTYPE html>
<html>
<head>
    <title>Fake Love Calculator</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #ff758c, #a18cd1);
            padding: 20px;
        }

        h2 {
            color: white;
            font-size: 32px;
            margin-bottom: 10px;
            text-shadow: 2px 2px 5px #8b3a62;
        }

        .subtitle {
            color: white;
            margin-bottom: 25px;
            font-size: 15px;
        }

        form {
            display: flex;
            flex-direction: column;
            width: 100%;
            max-width: 380px;
            gap: 12px;
            padding: 30px;
            border-radius: 20px;
            background: rgba(255, 255, 255, 0.92);
            box-shadow: 0 12px 35px rgba(0, 0, 0, 0.2);
        }

        .heart {
            text-align: center;
            font-size: 48px;
            margin-bottom: 8px;
        }

        label {
            color: #6d3155;
            font-weight: bold;
            font-size: 14px;
        }

        input[type="text"] {
            padding: 13px;
            border: 2px solid #f3c4d9;
            border-radius: 10px;
            outline: none;
            font-size: 15px;
            transition: 0.3s;
        }

        input[type="text"]:focus {
            border-color: #e84393;
            box-shadow: 0 0 8px rgba(232, 67, 147, 0.25);
        }

        input[type="submit"] {
            margin-top: 12px;
            padding: 13px;
            border: none;
            border-radius: 10px;
            background: linear-gradient(135deg, #ff4b7d, #c445b5);
            color: white;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            transition: 0.3s;
        }

        input[type="submit"]:hover {
            transform: translateY(-3px);
            box-shadow: 0 7px 15px rgba(196, 69, 181, 0.35);
        }

        .footer {
            color: white;
            margin-top: 20px;
            font-size: 13px;
        }
    </style>
</head>

<body>

    <h2>Love Calculator</h2>
    <p class="subtitle">Discover your crush compatibility!</p>

    <form action="info" method="get">

        <div class="heart"></div>

        <label for="user">YOUR NAME</label>
        <input type="text"
               placeholder="Enter your name"
               id="user"
               name="user"
               required>

        <label for="crush">YOUR CRUSH'S NAME</label>
        <input type="text"
               placeholder="Enter your crush's name"
               id="crush"
               name="crush"
               required>

        <input type="submit" value="Calculate Love">

    </form>

    <p class="footer">Made with using Java Servlets</p>

</body>
</html>
