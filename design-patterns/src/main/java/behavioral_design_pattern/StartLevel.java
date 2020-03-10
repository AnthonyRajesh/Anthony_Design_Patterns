package behavioral_design_pattern;

public class StartLevel implements Level {

		   public void doAction(Context context) {
		      System.out.println("It's in start level");
		      context.setLevel(this);	
		   }

		   public String toString(){
		      return "First Level";
		   }
		}
