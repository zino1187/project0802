package ex;
//java.lang ��Ű���� ������ �⺻�� �Ǵ� ��Ű����
//������� �ʴ´�... String, Object..
public class MyException {

	public static void main(String[] args) {
		int[] arr = new int[5];
		String s="";
		
		try {
			arr[0]=1;
			arr[1]=3;
			arr[2]=7;
			arr[3]=8;
			arr[4]=9;
			arr[5]=10;//������ ����...
		}catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();//�����ڿ�..
			System.out.println("�迭�� ũ�⸦ �Ѿ�׿�..");
		}
	}

}
