//将三个整数由小到大的顺序排列并输出
import java.util.*;
public class Example3_2{
	public static void main(String[] args)
	{
		int a , b , c , t;
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入三个整数:");
		a = reader.nextInt();
		b = reader.nextInt();
		c = reader.nextInt();
		if(a > b){
			t = a;
			a = b;
			b = t;
		}//确保a是a,b中最小的数
		if(a > c)
		{
			t = a;
			a = c;			
			c = t;
		}//确保a 是	a,b,c中 最小的数
		if(b > c)
		{
			t = b;
			b = c;
			c = t;
		}
		System.out.println("三个数由小到大的顺序是：");
		System.out.printf("%d %d %d\n",a , b , c);
	}
}