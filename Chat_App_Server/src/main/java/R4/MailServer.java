package R4;

import R4.Utillity.CodeGenerator;
import R4.Utillity.ConfigLoader;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailServer {

    private final String serverMail = ConfigLoader.retrieveProperty("SERVER_MAIL");
    private final String serverMailPass = ConfigLoader.retrieveProperty("SERVER_PASS");
    private final Authenticator authenticator = generateAuthentication();
    private final Properties properties = generateProperties();


    private Properties generateProperties(){
        Properties mailProperties = new Properties();
        mailProperties.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        mailProperties.put("mail.smtp.socketFactory.port", "465"); //SSL Port
        mailProperties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
        mailProperties.put("mail.smtp.auth", "true"); //Enabling SMTP Authentication
        mailProperties.put("mail.smtp.port", "465"); //SMTP Port
        return mailProperties;
    }

    private Authenticator generateAuthentication() {
        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(serverMail, serverMailPass);
            }
        };
        return auth;
    }

    private Session createSession(String recipientMail){
        return Session.getDefaultInstance(properties, authenticator);

    }

    public void sendMail(String recipientMail){
        try {
            MimeMessage msg = new MimeMessage(createSession(recipientMail));
            msg.setSubject("TestEmailResetCode", "UTF-8");
            msg.setText("Your password reset code is: " + CodeGenerator.generateCharacterCode(7,0.4), "UTF-8");
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientMail, false));
            Transport.send(msg);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
