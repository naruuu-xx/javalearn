//�ҳ���45��ʼ������������ֱ��ĳһ���������д���10������Ϊֹ
public class Example3_16{
	public static void main(String[] args){
		int x,x1,i;
		int counter = 0;
		boolean flag = true;
		outer:
		for(x = 45;;x++)
		{
			flag = true;
			x1 = (int)Math.sqrt(x);
			for(i = 2;i <= x1;i++)
				if(x %i == 0){
					if(i > 10)
						break outer;
					flag = false;
					break;
				}
				if(flag){
					System.out.printf("%6d",x);
					counter++;
					if(counter % 10 == 0)
						System.out.println();
				}
		}
	}	
}