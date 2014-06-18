/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Admin
 */
public class Support {

    public static boolean sendFeedBackMail(String email, String fullName, String title, String content) {

        boolean isCheck = false;
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(DataFile.emailSend, DataFile.passEmailSend);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(DataFile.emailSend));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(DataFile.emailReceive));
            String subject = "Phản hồi từ người dùng.";
            message.setSubject(subject);
            String contents = "Họ và tên: " + fullName
                    + "\nEmail: " + email
                    + "\nTiêu đề: " + title
                    + "\nNội dung" + content;
            message.setContent(contents, "text/html; charset=UTF-8");
            message.setHeader("Content-Type", "text/plain; charset=UTF-8");
            Transport.send(message);
            isCheck = true;
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        return isCheck;
    }
    /**
     * Convert three args day month year to type java.sql.Date
     * @param day 
     * @param month
     * @param year
     * @return Date type: yyyy/MM/dd
     */
    public static Date convertToDate(String day, String month, String year) {
        Date date = null;
        try {
            String bd = year + "/" + month + "/" + day;
            SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            java.util.Date utilBD = df.parse(bd);
            date = new Date(utilBD.getTime());
        } catch (ParseException ex) {
            Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }
}
