//判断一个正整数是否是素数
import java.util.*;
public class Example3_13
{
	public static void main(String[] args)
	{
		int x , x1 , i;
		boolean flag = true;
		Scanner reader = new Scanner(System.in);
		
		System.out.print("输入一个正整数：");
		x = reader.nextInt();
		
		x1 = x/2;
		for(i = 2;i <= x1;i++)
			if(x % i == 0)
				flag = false;
			
			if(flag)
				System.out.printf("%d是素数。\n",x);
			else
				System.out.printf("%d不是素数。\n",x);
			
		
	}
}