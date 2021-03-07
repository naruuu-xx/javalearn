/*用switch语句将成绩等级转换为百分制等级
A 85~100 B 70~84 C 60~69 D 不及格
*/
import java.util.*;
public class Example3_7
{
	public static void main(String[] args)
	{
		String grade;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("输入学生的成绩等级（A、B、C或D）");
		grade = reader.next();
		
		switch(grade.charAt(0))
		{
			case 'A':System.out.println("百分成绩为：85~100.");
			break;
			case 'B':System.out.println("百分成绩为：70~84.");
			break;
			case 'C':System.out.println("百分成绩为：60~69.");
			break;
			case 'D':System.out.println("成绩不合格.");
			default:System.out.println("输入错误.");
		}
	}
}