package structural_design_pattern;

	public abstract class Shape {
		   protected Draw draw;
		   
		   protected Shape(Draw draw){
		      this.draw = draw;
		   }
		   public abstract void draw();	
		}
