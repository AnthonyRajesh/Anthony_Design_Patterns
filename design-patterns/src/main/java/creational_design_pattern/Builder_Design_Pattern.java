package creational_design_pattern;

public class Builder_Design_Pattern {
	public void main(String args[])
	{
		User user1 = new User.UserBuilder("Anthony", "Yeurva").age(20).phone("9887678989").build();	 
		System.out.println(user1);
		User user2 = new User.UserBuilder("Phani", "Yadav").age(16).phone("7689998656").build();
		System.out.println(user2);
		User user3 = new User.UserBuilder("Sravan", "Deepak").build();
		System.out.println(user3);
	}
}
