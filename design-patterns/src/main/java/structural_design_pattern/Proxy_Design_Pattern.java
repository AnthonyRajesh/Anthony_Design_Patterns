package structural_design_pattern;

public class Proxy_Design_Pattern {
	public static void main(String[] args) {
	      File file = new ProxyFile("test1");
	      file.display(); 
	      System.out.println("");
	      file.display(); 	
	   }
}
