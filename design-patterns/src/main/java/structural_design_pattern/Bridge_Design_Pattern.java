package structural_design_pattern;

public class Bridge_Design_Pattern {
	public static void main(String[] args) {
	      Shape circle1 = new Circle(100,100, 10, new FirstCircle());
	      Shape circle2 = new Circle(100,100, 10, new SecondCircle());

	      circle1.draw();
	      circle2.draw();
	   }
}
