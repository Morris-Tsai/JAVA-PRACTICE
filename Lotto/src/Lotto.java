import java.lang.*;
import java.io.Console;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console =System.console();
		System.out.println("��J�}�C�j�p");
		int lottoSize=0;
		try {
			lottoSize=Integer.parseInt(console.readLine());
			if((lottoSize>48)||(lottoSize<6))
				throw new CmyException();
		}
		catch(NumberFormatException e) {
			System.out.println("�y�Ƥ����Ʀr,�N�Q�]�w��6�y");
			lottoSize=6;
			
		}catch(CmyException e) {
			e.showMessage();
			lottoSize=e.changeSize();
		}finally {
			System.out.println("�ֳz�}���y�Ƭ�"+lottoSize);
		}
		int lottoAry[]=new int[lottoSize];
		System.out.println("�s��ֳz�}�����}�C���鲣�ͧ���");
		

	}

}
