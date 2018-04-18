
/**
 24.倒序打印
-----------

给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。

 
 */
import java.util.Scanner;

public class Prog24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("一个数给我：");
		int num = scanner.nextInt();
		int num1 = num;
		int x = 1;
		int h = 0;

		while (num1 > 10) {
			num = num1 % 10;
			num1 = (num1 - num) / 10;
			h = h * 10 + num;
			x++;
			
		}
		h = h * 10 + num1;

		System.out.println("是" + x + "位数");
		System.out.println(h);
	}

}
