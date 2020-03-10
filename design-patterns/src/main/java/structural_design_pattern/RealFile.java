package structural_design_pattern;

public class RealFile implements File {

		   private String fileName;

		   public RealFile(String fileName){
		      this.fileName = fileName;
		      loadFromDisk(fileName);
		   }

		   public void display() {
		      System.out.println("Displaying " + fileName);
		   }

		   private void loadFromDisk(String fileName){
		      System.out.println("Loading " + fileName);
		   }
		}
