import java.util.Scanner;
/**
 5.条件运算符使用
----------------

利用条件运算符的嵌套来完成此题：学习成绩&gt;=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。

程序分析：(a&gt;b)?a:b这是条件运算符的基本例子。

 
 */
public class Prog05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x=0;
		while (x==0) {
			System.out.println("多少分：");
			int achievement = scanner.nextInt();
			if (achievement>=90) {
				System.out.println("A");
			}else if (achievement>=60) {
				System.out.println("B");
			}else if (achievement>=0) {
				System.out.println("C");
			}else {
				System.out.println("对不起，你输入的分数有误");
			}
		}
		
	}

}
