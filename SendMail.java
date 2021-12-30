/**
 * File Name:   SendMail.java
 * @date        April 20 2001
 * @author      Siomara Pantarotto
 * Description: Definition of Class SendMail.
 * 				Sends email messages using SMTP protocal.
 * 				Uses JavaBean Activation Foundation.
 * 				Complies to JavaMail API standards.
 **/

 import java.io.*;
 import java.util.*;
 import javax.mail.*;
 import javax.activation.*;
 import javax.mail.internet.*;

 public class SendMail{

    private String mailHost		= null;
    private String fromAddress	= null;
    private String toAddress	= null;
    private String subject		= null;
    private String messageTxt	= null;
    private String contentType	= null;

    /**
    * Default constructor - No argument for Java Bean Requirement
    **/
    public SendMail()
    {
    }

   /**
    * Constructor
    * @params mailHost     - SMTP server name
    * @params fromAddress  - From address in RFC822 format
    * @params toAddress    - To address in RFC822 format
    * @params subject      - Subject for the email message
    * @params messageTxt   - Email template file
    * @params contentType  - Content type for the email message
    **/
    public SendMail(String mailHost,String fromAddress, String toAddress,
    				String subject, String messageTxt, String contentType)
    {
        this.mailHost		= mailHost;
        this.fromAddress	= fromAddress;
        this.toAddress		= toAddress;
        this.subject		= subject;
        this.messageTxt		= messageTxt;
        this.contentType	= contentType;
    }

   /**
    * Constructor
    * @params mailHost     - SMTP server name
    * @params fromAddress  - From address in RFC822 format
    **/
    public SendMail(String mailHost,String fromAddress)
    {
        this.mailHost    = mailHost;
        this.fromAddress = fromAddress;
    }

   /**
    * Set and Get methods for attribute mailHost
    *
    * @params mailHost  - SMTP server name
    **/
    public void setMailHost(String mailHost)
    {
        this.mailHost    = mailHost;
    }
   /* @return MESSAGE_TXT */
    public String getMailHost()
    {
        return this.mailHost;
    }


   /**
    * Set and Get methods for attribute fromAddress
    *
    * @params fromAddress  - From address in RFC822 format
    */
    public void setFromAddress(String fromAddress)
    {
        this.fromAddress    = fromAddress;
    }
    /* @return fromAddress */
    public String getFromAddress()
    {
        return this.fromAddress;
    }


   /**
	* Set and Get methods for attribute toAddress
    *
    * @params toAddress  - To address in RFC822 format
    */
    public void setToAddress(String toAddress)
    {
        this.toAddress      = toAddress;
    }
    /* @return toAddress */
    public String getToAddress()
    {
        return this.toAddress;
    }

   /**
   	* Set and Get methods for attribute subject
    *
    * @params subject - Subject for the email message
    */
    public void setSubject(String subject)
    {
        this.subject = subject;
    }
    /* @return subject */
    public String getSubject()
    {
        return this.subject;
    }

   /**
    * @params message_txt - Subject for the email message
    */
    public void setMessageTxt(String messageTxt)
    {
        this.messageTxt  = messageTxt;
    }

    public String getMessageTxt()
    {
        return this.messageTxt;
    }

   /**
    * @params content_type  - Content type for the email message
    */
    public void setContentType(String contentType)
    {
        this.contentType = contentType;
    }

    public String getContentType()
    {
        return this.contentType;
    }

   /**
    * Sends email notifications
    *
    * @param msg - Message to send
    */
    public void sendMessage(String mailtext)
    {
        boolean debug = false;
        Properties props = new Properties();
        props.put("mail.smtp.host", this.getMailHost());
        Session session = Session.getDefaultInstance(props,null);
        session.setDebug(debug);

        try
        {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(this.getFromAddress()));
            msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(
            							this.getToAddress(), false));
            msg.setSubject(this.getSubject());
            msg.setDataHandler(new DataHandler(mailtext,this.getContentType()));
            Transport.send(msg);
        }
        catch(Exception e )
        {
            e.printStackTrace();
            System.exit(-1);
        }
        props = null;
    }
    /////////////////////////////////////////////////////////////////
    // Delete or block this main section after testing
    /////////////////////////////////////////////////////////////////
//	public static void main(String args[]){
//
//        SendMail sm = new SendMail(args[0],args[1],args[2],args[3],args[4],args[5]);
//        sm.sendMessage(sm.MESSAGE_TXT);
//        sm = null;
//
//    }
    /////////////////////////////////////////////////////////////////

 } /*End of Class*/
