
public class CmyException extends Exception {
	public CmyException() {
		super();
	}
	public void showMessage() {
		System.out.println("例外訊息:陣列大小錯誤");
	}
	public int changeSize() {
		System.out.println("例外訊息:陣列大小將被重設為6");
		return 6;
	}

}
