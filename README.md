# WebAPPLab9<br>
This web app extends the lecture demo by implementing the "forgot password" functionality. 
A new Gmail account was created and used for this app.
To use "forgot password" functionality, the user needs to edit his actual gmail account information in WEB-INF/web.xml and replace "youremail@gmail.com" and "password" with actual address and password,
<env-entry>
        <env-entry-name>webmail-username</env-entry-name>
        <env-entry-type>java.lang.String</env-entry-type>
        <env-entry-value>youremail@gmail.com</env-entry-value>
    </env-entry>
    <env-entry>
        <env-entry-name>webmail-password</env-entry-name>
        <env-entry-type>java.lang.String</env-entry-type>
        <env-entry-value>password</env-entry-value>
    </env-entry>
