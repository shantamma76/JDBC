<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        
        .form-container {
            background-color: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }
        
        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }

        label {
            font-weight: bold;
            color: #555;
            margin-bottom: 5px;
            display: block;
        }

        input[type="text"], input[type="email"], input[type="number"], input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            cursor: pointer;
            border: none;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        .form-container pre {
            display: none;
        }
    </style>
</head>
<body>

    <div class="form-container">
        <h2>Registration Form</h2>
        <form action="save" method="post">
            <label for="firstName">First Name</label>
            <input type="text" id="firstName" name="firstName">

            <label for="lastName">Last Name</label>
            <input type="text" id="lastName" name="lastName">

            <label for="email">Email</label>
            <input type="email" id="email" name="email">
            
            <label for="age">Age</label>
            <input type="number" id="age" name="age">
            
           <label for="mobile">Mobile No</label>
            <input type="number" id="mobile" name="mobile">

            <label for="address">Address</label>
            <input type="text" id="address" name="address">

            <input type="submit" value="SUBMIT">
        </form>
    </div>

</body>
</html>



