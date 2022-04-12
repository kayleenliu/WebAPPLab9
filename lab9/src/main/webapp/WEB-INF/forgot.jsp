<%-- 
    Document   : forgot
    Created on : Apr 11, 2022, 9:14:55 PM
    Author     : Kayleen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <div>
            <div>
                <div>
                <h1>Forgot Password</h1>
                <form action="forgot" method="post">
                        <div>
                            <label for="email">Email:</label>
                            <input type="email" name="email" id="email" required>
                        </div>
                        <button type="submit" value="Sign in">Submit</button>
                </form>
                <p>${message} </p>
                </div>
            </div>
        </div>
        
    </body>
</html>
