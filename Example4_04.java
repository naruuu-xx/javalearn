public class Example4_04{
	public static void main(String[] args){
		int[][] a={{-4 , 5 , -7},
			{2, -3 , -4},
			{3 , 4 , 5}};
			int[][] b={{1 , 2},
			{5 , 6}, 
			{-7 , 9},};
			int[][] result = mul(a,b);
			print(result);
	}
	//mul����ֵ��������һ����ά����
	static int[][] mul(int[][] x , int[][] y)
	{
		int i , j , k;//ѭ�����Ʊ���
		//����������Ŀռ� 
		//�г���Ϊx������г��ȣ��г���Ϊy�����һ�е��г���
		int[][] z=new int[x.length][y[0].length];
		for(i = 0 ; i < x.length ; i++)
		{	for(j = 0 ; j < y[0].length ; j++)
			{
				z[i][j] = 0;
				for(k = 0 ; k < x[0].length ; k++)
					z[i][j] = z[i][j] + x[i][k] * y[k][j];
			}
		}
		return z;
	}
	static void print(int[][] x){
		int i , j;
		for(i = 0 ; i < x.length ; i++){
			for(j = 0 ; j < x[i].length ; j++)
				System.out.printf("%5d",x[i][j]);
			System.out.println();
		}
	}
}