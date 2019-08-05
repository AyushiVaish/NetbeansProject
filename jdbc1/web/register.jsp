<%-- 
    Document   : register
    Created on : Nov 1, 2018, 3:48:07 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type ="text/javascript" >
            window.onload = function() {
                var txtPassword = document.getElementById("txtPassword");
                var txtConfirmPassword = document.getElementById("txtConfirmPassword");
                txtPassword.onchange= ConfirmPassword;
                txtConfirmPassword.onkeyup= ConfirmPassword;
                function ConfirmPassword() {
                    txtConfirmPassword.setCustomValidity("");
                    if(txtPassword.value != txtConfirmPassword.value) {
                        txtConfirmPassword.setCustomValidity("Passwords do not much");
                    }
                }
            }
            </script>
    </head>
    <body>
        <form method="post" action="ControllerServlet" id="form1">
            <center>
                <div>
                    
                    <table border ="2" align="center">
                                <caption> <h2>
                            New User Registration Form 
                                    </h2></caption>
                                    <tr><td><label for ="txtUsername">
                            Username
                                </label></td>
                                <td><input name="txtUsername" type="email" id="txtUsername" placeholder="Enter your email" required /></td></tr>
                                    </br>
                                            <tr><td>
                                                    <label for ="txtPassword">
                                                        Password
                                                    </label>
                                        </td>
                                        <td><input name="txtPassword" type="password" id="txtPassword" title="Password must contain :Minimum 9 characters"
                                                   placeholder="Enter password" required pattern="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$" /></td></tr>
                    
                    
                                            </br>
                                            <tr><td>
                                                    <label for ="txtConfirmPassword">
                                                       Confirm Password
                                                    </label>
                                                </td>
                                           <td><input name="txtConfirmPassword" type="password" id="txtPassword"  placeholder="Confirm password" /></td></tr>
                                            </br>
                                              <tr>  <td><input name="btnSignup" type="submit"  value="Sign Up" id="btnSignup"/></td>
                                                  <td> <i>if already registered,kindly login here <a href="login2.html"> Login</a></i></td></tr>
                    
                    
                    
                    
                    
            </center>
</div>
        </form>
    </body>
</html>
