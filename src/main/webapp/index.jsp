<html>
<body>
<h2>Hello World!</h2>

<form action="NextPage.jsp">			
			 Please enter a color <br>
			<input type="text" name="FirstName"size="20px">
			<input type="text" name="LastName"size="20px">
			<input type="submit" value="submit">
			
			<input type="button" value="New Click" name="clickclick" 
			onclick="document.forms[0].action = 'NextPage.jsp'; return true;" />
									
</form>

</body>
</html>
