
public class Main {

	public static void main(String[] args) {
		
		Number myNum =new Number(5,10);
		myNum.print();
        int myMax = TestNum.max(myNum.getNum1(), myNum.getNum2());
        System.out.println("max(5,10):" + myMax  );
        TestNum.swap(myNum);
        myNum.print();
	}

}
