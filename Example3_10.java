//循环实现 1+2+...+100的值
import java.util.*;
public class Example3_10
{
	public static void main(String[] args)
	{
		int i , sum;
		i = 1;
		sum = 0;
		while(i <= 100)
		{
			sum = sum + i;
			i++;
		}
		/*for(i=1;i<=100;i++)
		{
			sum = sum + i;
		}*/
		/*do{
			sum = sum + i;
			i++;
		}
		while(i < = 100);*/
		System.out.println("sum="+sum);
		
	}
}