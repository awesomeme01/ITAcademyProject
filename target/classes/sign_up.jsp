<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>SIGN UP|</title>
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<link rel="stylesheet" type="text/css" href="css/sign_up.css">

</head>
<body>
	<header>
		<h1><span>Create</span>Account</h1>
	</header>
	<form class="form1" action="sign_up" method= "post">
	<h1>Регистрация</h1>
	<h5>ФИО<span class="redstar">*</span></h5>
	<input class="focuses" type="text" name ="fullname">
	<h5>Логин<span class="redstar">*</span></h5>
	<input class="focuses" type="text" name ="login">
	<h5>Почта<span class="redstar">*</span></h5>
	<input type="text" class="focuses" name="email">
	<h5>Дата рождения</h5>
	<input type="date" class="focuses" name="birthdate">
	<h5>Пол<span class="redstar">*</span></h5>
	<select class="focuses" name="gender">
		<option value="male">Мужчина</option>
		<option value="female">Женщина</option>
	</select>
	<h5>Пароль<span class="redstar">*</span></h5>
	<input type="password" name="password">
	<input id="submitBtn" type="submit" name="submit">
	<div id="backBlock">
<a id="back" href="index.jsp">Назад</a>
</div>
</form>
</body>
</html>