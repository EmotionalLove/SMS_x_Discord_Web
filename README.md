# SMS x Discord web server

This is the part that enables you to send messages via SMS to Discord via SendGrid. You'll need a VPS and a domain name.

# Builidng the jar 

This is a Java EE Application so use `install` and then `install -P runnable-package` in Maven to get a JAR file in `/target`. After that you can just do `java -jar <jarname>` to run the server. You will need to download and run [this](https://github.com/EmotionalLove/SMS_x_Discord) alongside this.

# Usage

Upon running it for the first time you'll get a file called server_config.yml. You'll need to edit it and add your discord token and the private channel ID you're going to be communicating with. After that, just re-run it, and it'll be waiting for POST requests to `http://example.com:10080/SmsXDiscord/axiom/send` I plan on adding a passphrase feature in the future so that if someone gets ahold of your URL, they can't send random messages to whomever you're communicating with.