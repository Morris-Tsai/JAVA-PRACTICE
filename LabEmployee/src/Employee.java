
public class Employee {
       private Employee boss;
       private String ID;
       private double total_bonus;
       public  Employee(String ID) {
    	   this.ID=ID;
    	   
       }
       public Employee(String ID, Employee boss) {
    	   this.ID=ID;
    	   this.boss=boss;
    	   
       }
       public void addBonus(double value) {
    	   double bonus =value*0.1;
    	   total_bonus+=bonus;
    	   if(boss!=null) {
    		   boss.addBonus(bonus);
    	   }
       }
       public double getBonus() {
    	   return  total_bonus;
       }
	
	public String toString() {
		// TODO Auto-generated method stub
		return ID;
	}
     
       
}
