package behavioral_design_pattern;

public class State_Design_Pattern {
	public static void main(String[] args) {
	      Context context = new Context();

	      StartLevel level1 = new StartLevel();
	      level1.doAction(context);

	      System.out.println(context.getLevel().toString());

	      StopLevel level2 = new StopLevel();
	      level2.doAction(context);

	      System.out.println(context.getLevel().toString());
	}
}
