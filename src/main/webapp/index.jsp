<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-32">
    <title>Rezervare Bilete Teatru</title>
</head>
<body>
<h1>Rezerva bilete la teatru</h1>
<form action="booking" method="post">
    <label for="name">Nume:</label>
    <input type="text" id="name" name="name" required><br><br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required><br><br>

    <label for="phone">Numar de telefon:</label>
    <input type="tel" id="phone" name="phone" required><br><br>

    <label for="play">Piesa de teatru:</label>
    <select id="play" name="play" required>
        <option value="Hamlet">Hamlet</option>
        <option value="Romeo și Julieta">Romeo si Julieta</option>
        <option value="O scrisoare pierdută">O scrisoare pierduta</option>
    </select><br><br>

    <label for="date">Data:</label>
    <input type="date" id="date" name="date" required><br><br>

    <label>Tip bilet:</label><br>
    <input type="radio" id="child" name="ticketType" value="Copil" required>
    <label for="child">Copil</label><br>
    <input type="radio" id="student" name="ticketType" value="Elev/Student" required>
    <label for="student">Elev/Student</label><br>
    <input type="radio" id="adult" name="ticketType" value="Adult" required>
    <label for="adult">Adult</label><br><br>

    <button type="submit">Rezervă</button>
</form>
</body>
</html>
