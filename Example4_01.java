//java�����鸳ֵ
public class Example4_01{
	public static void main(String[] args){
		int[] a,b;
		int i;
		a = new int [4];//��������
		b = new int [3];
		for(i = 0 ; i < a.length ; i++)//Ϊ����Ԫ�ظ�ֵ
			a[i] = i * 10;
		for(i = 0 ; i< b.length ; i++)
			b[i] = 5 + i * 10;
		System.out.print("��������ĵ�ַ");
		System.out.println(a+","+b);//��ӡa��b��ֵ������������ĵ�ַ
		for(i = 0 ; i < a.length ; i++)
			System.out.printf("%3d",a[i]);
		System.out.println();
		for(i = 0 ; i < b.length ; i++)
			System.out.printf("%3d",b[i]);
		System.out.println();
		a = b ;
		System.out.print("��ֵ����������ĵ�ַ��");
		System.out.println(a+","+b);//�ٴ�ӡa��b��ֵ
		for(i =0 ;i < a.length ; i++)//��ֵ��a��b����ʾ��2������
			System.out.printf("%3d",a[i]);
		System.out.println();
	}
}