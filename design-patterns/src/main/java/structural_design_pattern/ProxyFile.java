package structural_design_pattern;

public class ProxyFile implements File{

		   private RealFile realfile;
		   private String fileName;

		   public ProxyFile(String fileName){
		      this.fileName = fileName;
		   }

		   public void display() {
		      if(realfile == null){
		         realfile = new RealFile(fileName);
		      }
		      realfile.display();
		   }
		}

