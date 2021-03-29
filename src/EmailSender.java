import com.email.durgesh.Email;
public class EmailSender {
	static String otp="1234";
	static String  emailmain;
	
	public static void emailaddres(String emailaddress)
	{
		  emailmain = emailaddress;
	}
  public static void  emailotp(String [] args)
  {
	  
    try {
    	System.out.println(emailmain);
      Email email= new Email("placementinfo123@gmail.com","Qwerty@1234");
      email.setFrom("placementinfo123@gmail.com","placementinformationsystem");
      email.setSubject("this email is for testung ...");
      email.setContent(otp,"text/html");
      email.addRecipient("190330065@klh.edu.in");
      email.send();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  public static String mailotp(String [] args) {
	return otp;
	 
  }
}