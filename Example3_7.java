/*��switch��佫�ɼ��ȼ�ת��Ϊ�ٷ��Ƶȼ�
A 85~100 B 70~84 C 60~69 D ������
*/
import java.util.*;
public class Example3_7
{
	public static void main(String[] args)
	{
		String grade;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("����ѧ���ĳɼ��ȼ���A��B��C��D��");
		grade = reader.next();
		
		switch(grade.charAt(0))
		{
			case 'A':System.out.println("�ٷֳɼ�Ϊ��85~100.");
			break;
			case 'B':System.out.println("�ٷֳɼ�Ϊ��70~84.");
			break;
			case 'C':System.out.println("�ٷֳɼ�Ϊ��60~69.");
			break;
			case 'D':System.out.println("�ɼ����ϸ�.");
			default:System.out.println("�������.");
		}
	}
}