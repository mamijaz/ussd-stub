<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>My Mobile</title>
	<link rel="stylesheet" href="Emulation/style-emu.css">
	<script src="Emulation/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="Emulation/app.js"></script>
</head>
<body>
<center>
	<form action="" method="post" id="loginForm" >
		<table class="msgbox" id="msgbox" style="display: none;">
			<tbody>
			<tr id="display" style="display: none; height: 80px">
				<td style="width: 230px"><p class="p" id="content" style="white-space: pre-wrap;"></p></td>
			</tr>
			<tr id="input" style="display: none;">
				<td style="width: 230px"><input type="text" id="pin"
												class="textbox"></td>
			</tr>
			<tr id="reply" style="display: none;">
				<td><button type="submit" class="btn"
							onclick="sendOkResponse()">Ok</button></td>
				<td><button type="submit" class="btn"
							onclick="sendCancelResponse()">Cancel</button></td>
			</tr>
			</tbody>
		</table>
	</form>
</center>
</body>
</html>