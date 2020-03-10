package behavioral_design_pattern;

public class Message {
	   public static void showMessage(User user, String message){
	      System.out.println("To "+user.getName()+": "+message);
	   }
}
