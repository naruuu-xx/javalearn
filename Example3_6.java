//��һԪ���η���a*x*x+b*x+c = 0 �ĸ��� a,b,c�����ݴӼ�������
import java.util.*;
public class Example3_6{
	public static void main(String[] args){
		double a , b , c;
		double p , q , disc;
		double x1 , x2;
		Scanner reader = new Scanner (System.in);
		System.out.println("������һԪ���η��̵�����ϵ��");
		a = reader.nextDouble();
		b = reader.nextDouble();
		c = reader.nextDouble();
		disc = b * b - 4 * a * c;
		p = -b / ( 2 * a ) ;
		q = Math.sqrt(Math.abs(disc)) / (2 * a);
		if(a== 0.0){
			System.out.println("���η���ϵ��Ϊ�㣬����һ�����η���");
			return;
		}
		else if (disc > 0.0){
			x1 = p + q;
			x2 = p - q;
			System.out.println("�������������ȵ�ʵ��");
			System.out.printf("x1=%.2f,x2=%.2f\n",x1,x2);
		}
		else if(disc == 0.0){
			x1 = x2 = p;
			System.out.println("������������ȵ�ʵ��");
			System.out.printf("x1 = x2 =%.2f\n",x1);
		}
		else{
			System.out.println("��������������");
			System.out.printf("x1=%.2f%+.2fi,",p,q);
			System.out.printf("x2=%.2f%+.2fi",p,-q);
		}
		
	}	
}