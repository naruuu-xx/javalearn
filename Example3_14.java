//求100以内的所有素数
public class Example3_14
{
	public static void main(String[] args)
	{
		int x , x1 , i;
		int counter = 0;
		boolean flag = true;
		for(x = 2;x < 100;x++)
		{
			flag = true;
			x1 = (int)Math.sqrt(x);
			for(i = 2;i <= x1;i++)
				if(x%i == 0)
					flag = false;
				
			if(flag)
			{
				System.out.printf("%4d",x);
				counter++;
				if(counter % 5 == 0)
					System.out.println();
		
			}
		}
	}
}