import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class InsertNewFeedback extends HttpServlet {

  /**
   * Process the HTTP Post request
   */
  public void doPost(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {

    HttpSession session = request.getSession(true);

    // Here you would create a Feedback like the following. I won't do it
    // because I will not demonstrate persistence of info into the database
    
    //Feedback feedback = new Feedback();
    //feedback.setName(request.getParameter("name"));
    //feedback.setAddress(request.getParameter("address"));
    //feedback.setCity(request.getParameter("city"));
    //feedback.setZipCode(request.getParameter("state"));
    //feedback.setState(request.getParameter("zip"));
    //feedback.setCountry(request.getParameter("country"));
    // Bla Bla Bla....Do the same for all fields

    String msgBody;
    msgBody =	"Name: "	+ request.getParameter("name")			+
    			"\nAddress: " + request.getParameter("address")		+
    			"\nCity: "	+ request.getParameter("city")			+
				"\nZipCode: "	+ request.getParameter("zip")		+
                "\nState: "	+ request.getParameter("state")			+
                "\nCountry: "	+ request.getParameter("country")	+
                "\nEmail: "	+ request.getParameter("email")			+
                "\nCategory: "+ request.getParameter("category")	+
                "\nConfidential: "+ request.getParameter("confidential") +
                "\nCritical: "+ request.getParameter("critical")	+
				"\nCeo: "+ request.getParameter("ceo")				+
                "\nArea: "+ request.getParameter("area")			+
                "\nFeedback: "+ request.getParameter("feedback");

    // Here you would create a FeedbackManager instance to add the new feedback
    // into the database. I will not show this here at this moment. The idea is
    // how to work with javamail. However you can look at The JavaSaxParser
    // example in tutorials to see how you would insert data into the database.

    //FeedbackManager feedbackMgr = new FeedbackManager();
    //feedbackMgr.add(feedback);

    // Retrieve the feedback just inserted, get the ID to include in the email

    //Vector vFeedback = new Vector();
    //vFeedback = feedbackMgr.findWhere("where...get the latest feedback");
    //vFeedback = null;
    //vFeedback = (Feedback) vFeedback.firstElement();

    // Here the insertion of a new feedback would be complete. Now send the email to
    // appropriate people and send user back to the 'main page'.

    SendMail sendMail = new SendMail();
    sendMail.setMailHost("Snhexch02");
    sendMail.setFromAddress("hisiomara@hotmail.com");
    sendMail.setToAddress("hisiomara@hotmail.com");
    sendMail.setSubject("Testando mail");
    sendMail.setMessageTxt(msgBody);
    sendMail.setContentType("text/plain");
    sendMail.sendMessage(sendMail.getMessageTxt());

    RequestDispatcher dispatcher =
      this.getServletContext().getRequestDispatcher("/ToBeContinued.htm");
    dispatcher.forward(request, response);
  }
}

