package utils.SentEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.testng.annotations.Test;
@Test
public class EmailSend {
	public static void main(String[] args) throws Exception {
		System.out.println("Email Started sending");
		// Create the attachment
		EmailAttachment attachment1 = new EmailAttachment();
		attachment1.setPath("test-output\\Report.html");
		attachment1.setDisposition(EmailAttachment.ATTACHMENT);
		attachment1.setDescription("Extent Report");
		attachment1.setName("Extent Report");

		EmailAttachment attachment2 = new EmailAttachment();
		attachment2.setPath("C:\\Users\\Codetru\\eclipselevel\\pom\\test-output\\Report.html");
		attachment2.setDisposition(EmailAttachment.ATTACHMENT);
		attachment2.setDescription("TestNG Default Report");
		attachment2.setName("TestNG Default Report");

		EmailAttachment attachment3 = new EmailAttachment();
		attachment3.setPath("screenshots\\screenshot1.png");
		attachment3.setDisposition(EmailAttachment.ATTACHMENT);
		attachment3.setDescription("Screenshot1");
		attachment3.setName("Screenshot1");

		EmailAttachment attachment4 = new EmailAttachment();
		attachment4.setPath("screenshots\\screenshot2.png");
		attachment4.setDisposition(EmailAttachment.ATTACHMENT);
		attachment4.setDescription("Screenshot2");
		attachment4.setName("Screenshot2");

		// Create the email message
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com");
		email.setSSLOnConnect(true);
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("fayaztssoft@gmail.com", ""));
		email.setSSLOnConnect(true);
		email.setFrom("fayaztssoft@gmail.com");
		email.setSubject("Bronto Doctor login Extent Report ");
		email.setMsg("Extent Reports and Screenshots");
		email.addTo("ayaz@codetru.com");
		email.attach(attachment1);
		email.attach(attachment2);
		email.attach(attachment3);
		email.attach(attachment4);
		email.send();
		System.out.println("Mail sent");

	}

}