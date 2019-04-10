# SMS x Discord web server

This is the part that enables you to send messages via SMS to Discord via SendGrid. You'll need a VPS and a domain name.

# Builidng the jar 

This is a Java EE Application so use the `install -P runnable-package` command with Maven to get a JAR file in `/target`. After that you can just do `java -jar <jarname>` to run the server. You will need to download and run [this](https://github.com/EmotionalLove/SMS_x_Discord) alongside this.