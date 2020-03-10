package structural_design_pattern;

public class FirstCircle implements Draw{
	
		   public void drawCircle(int radius, int x, int y) {
		      System.out.println("color: red, radius:"+ radius+", point:(" +x+","+y+")");
		   }
		}