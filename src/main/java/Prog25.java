import java.util.Scanner;

/**
 * 
 * 25.回文数 ---------
 * 
 * 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 * 
 */
public class Prog25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int h = 0;
		int y = 0;
		while (y == 0) {
			System.out.println("一个数给我：");
			int num = scanner.nextInt();
			if (num == 0) {
				y = 1;
			}
			num1 = num;
			num2 = num;
			h = 0;
			while (num1 > 10) {
				num = num1 % 10;
				num1 = (num1 - num) / 10;
				h = h * 10 + num;

			}
			h = h * 10 + num1;
			if (num2 == h) {
				System.out.println(num2 + "是回文数");
			} else {
				System.out.println(num2 + "不是回文数");
			}

		}

	}

}
