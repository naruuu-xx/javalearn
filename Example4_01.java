//java中数组赋值
public class Example4_01{
	public static void main(String[] args){
		int[] a,b;
		int i;
		a = new int [4];//创建数组
		b = new int [3];
		for(i = 0 ; i < a.length ; i++)//为数组元素赋值
			a[i] = i * 10;
		for(i = 0 ; i< b.length ; i++)
			b[i] = 5 + i * 10;
		System.out.print("两个数组的地址");
		System.out.println(a+","+b);//打印a，b的值，即两个数组的地址
		for(i = 0 ; i < a.length ; i++)
			System.out.printf("%3d",a[i]);
		System.out.println();
		for(i = 0 ; i < b.length ; i++)
			System.out.printf("%3d",b[i]);
		System.out.println();
		a = b ;
		System.out.print("赋值后两个数组的地址：");
		System.out.println(a+","+b);//再打印a和b的值
		for(i =0 ;i < a.length ; i++)//赋值后a和b都表示第2个数组
			System.out.printf("%3d",a[i]);
		System.out.println();
	}
}