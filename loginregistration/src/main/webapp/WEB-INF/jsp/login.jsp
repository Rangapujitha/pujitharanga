<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<form method="post" action="loginPage">
<div>Username:
<input type="text" name="username"/>
</div>
<div>Password:
<input type="text" name="password"/>
</div>
<div>
 <input type="submit" value="submit" />  &nbsp  &nbsp
  <a href="/regPage">New User</a>
</div>

<div>
${msg}
</div>

</form>