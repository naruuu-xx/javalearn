//�ж�һ���������Ƿ�������
import java.util.*;
public class Example3_13
{
	public static void main(String[] args)
	{
		int x , x1 , i;
		boolean flag = true;
		Scanner reader = new Scanner(System.in);
		
		System.out.print("����һ����������");
		x = reader.nextInt();
		
		x1 = x/2;
		for(i = 2;i <= x1;i++)
			if(x % i == 0)
				flag = false;
			
			if(flag)
				System.out.printf("%d��������\n",x);
			else
				System.out.printf("%d����������\n",x);
			
		
	}
}