import java.lang.*;
import java.io.Console;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console =System.console();
		System.out.println("輸入陣列大小");
		int lottoSize=0;
		try {
			lottoSize=Integer.parseInt(console.readLine());
			if((lottoSize>48)||(lottoSize<6))
				throw new CmyException();
		}
		catch(NumberFormatException e) {
			System.out.println("球數不為數字,將被設定為6球");
			lottoSize=6;
			
		}catch(CmyException e) {
			e.showMessage();
			lottoSize=e.changeSize();
		}finally {
			System.out.println("樂透開獎球數為"+lottoSize);
		}
		int lottoAry[]=new int[lottoSize];
		System.out.println("存放樂透開獎的陣列實體產生完畢");
		

	}

}
