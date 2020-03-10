package behavioral_design_pattern;

	public class Context {
		   private Level level;

		   public Context(){
		     level = null;
		   }

		   public void setLevel(Level level){
		      this.level = level;		
		   }

		   public Level getLevel(){
		      return level;
		   }
	}
