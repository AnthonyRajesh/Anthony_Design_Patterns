package behavioral_design_pattern;

	public class StopLevel implements Level {

		   public void doAction(Context context) {
		      System.out.println("It's in last level");
		      context.setLevel(this);	
		   }

		   public String toString(){
		      return "Last Level";
		   }
		}
