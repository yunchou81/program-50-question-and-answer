
/**
 * 
 * 
 * 6.公约数和公倍数 ----------------
 * 
 * 输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 
 * 程序分析：利用辗除法。
 */
import java.util.Scanner;

public class Prog06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("第一个数：");
		int num1 = scanner.nextInt();
		System.out.println("第二个数：");
		int num2 = scanner.nextInt();
		int temp;
		int a;
		int b;
		if (num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		a = num1;
		b = num2;
		while (b != 0)
		{
			temp = a % b;
			a = b;
			b = temp;
		}
		System.out.println(num1 + "和" + num2 + "的最大公约数是" + a);
		System.out.println(num1 + "和" + num2 + "的最小公倍数是" + num1 * num2 / a);
	}
}
