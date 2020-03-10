package creational_design_pattern;

public class Singleton_Design_pattern {
	public static void main(String args[])
	{   
		GetPlanFactory plan = new GetPlanFactory();
		String planName="Domesticplan";   
        int units=567;  
        Plan p = plan.getPlan(planName);  
        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
        p.getRate();  
        p.calculateBill(units);  
	}  
}
