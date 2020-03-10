package behavioral_design_pattern;

public class Mediator_Design_Pattern {
	public static void main(String[] args) {
	      User anthony = new User("Anthony");
	      User tony = new User("Tony");

	      anthony.sendMessage("Hi, Anthony!");
	      tony.sendMessage("Welcome, Tony!");
	   }
}
