//����sort����ʵ����������
public class Example4_02{
	public static void main(String[] args){
		int[] a = {10 , 22 , -52 , 73 , 42};
		int[] b = {12 , 34 , 656 ,  -34 , 98 , -235 , 78 , 69 , -24};
		sort(a);
		sort(b);
		print(a);
		print(b);
	}
	//����sort������������������
	//ǰ�йؼ���static���ܱ�main�������ã���ΪmainҲ��static
	static void sort(int[] x)
	{
		int i , j ,k;
		for(i = 0 ; i < x.length-1 ; i++){
			k = i;
			for(j = i+1 ; j < x.length ; j++)
				if(x[j] < x[k])
					k = j;
			if(k != i){
				int t = x[i];
				x[i] = x[k];
				x[k] = t;
			}
		}
	}
	static void print(int[] x){
		for(int t:x)
			System.out.printf("%4d",t);
		System.out.println();
	}
}




