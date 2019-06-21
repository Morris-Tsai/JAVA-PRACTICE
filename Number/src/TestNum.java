
public class TestNum {
	public static int max(int x, int y) {
		return x>y?x:y;
	}
	public static void swap(Number num) {
		int temp;
		temp=num.getNum1();
		num.setNum1(num.getNum2());
		num.setNum2(temp);
	}

}
