<%@page import="com.home.web.utils"%>
<html>
<title>CICE</title>
<body>
<h1>Soy <%= utils.getNombre() %></h1>
<form action="Dispatcher" method="get">
First name: <input type="text" name="first_name"><br/>
Last name: <input type="text" name="last_name">
<input type="submit" value="Submit">
</form>
</body>
</html>