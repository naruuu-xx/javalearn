//������������С�����˳�����в����
import java.util.*;
public class Example3_2{
	public static void main(String[] args)
	{
		int a , b , c , t;
		Scanner reader = new Scanner(System.in);
		System.out.println("��������������:");
		a = reader.nextInt();
		b = reader.nextInt();
		c = reader.nextInt();
		if(a > b){
			t = a;
			a = b;
			b = t;
		}//ȷ��a��a,b����С����
		if(a > c)
		{
			t = a;
			a = c;			
			c = t;
		}//ȷ��a ��	a,b,c�� ��С����
		if(b > c)
		{
			t = b;
			b = c;
			c = t;
		}
		System.out.println("��������С�����˳���ǣ�");
		System.out.printf("%d %d %d\n",a , b , c);
	}
}