import java.util.Scanner;

/**
 * 
 * 8.求s=a+aa+aaa+aaaa+aa...a的值 ------------------------------
 * 
 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 * 
 * 程序分析：关键是计算出每一项的值。
 * 
 */

public class Prog08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入数：");
		int num1 = scanner.nextInt();
		System.out.println("几次：");
		int num2 = scanner.nextInt();
		int num3 = 0;// 总数
		int[] array = new int[num2];
		for (int i = 0; i < num2; i++) {
			array[i] = num1;
			num1 = num1 * 10 + array[0];
		}

		for (int i = 0; i < num2; i++) {
			System.out.print(array[i]);
			num3 = num3 + array[i];
			if (i < num2) {
				System.out.print("+");
			}
		}
		System.out.println("=" + num3);
	}

}
