
public class Number {
	private int num1;
	private int num2;
    public Number() {
    	num1=0;
    	num2=0;
    }
    public Number(int x,int y) {
    	num1=x;
    	num2=y;
    }
    public int getNum1() {
    	return num1;
    }
    public void setNum1(int x) {
    	num1=x;
    }
    public int getNum2() {
    	return num2;
    }
    public void setNum2(int y) {
    	num1=y;
    }
    public void print() {
    	System.out.print("num1" + num1 + ",num2" + num2);
    }
}
