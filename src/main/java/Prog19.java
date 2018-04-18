
/**
 * 19.打印出如下图案（菱形） -------------------------
 *
 *** 
 ****** 
 ******** 
 ****** 
 *** 
 * 
 * 
 * 
 * 程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，利用双重 for循环，第一层控制行，第二层控制列。
 * 
 * 
 */

import java.util.Scanner;



public class Prog19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int num1 = 1;
		while (x == 0) {

				System.out.println("输入一个奇数：");
				num1 = scanner.nextInt();
				if ((num1 + 1) % 2 == 0) {
					x = 1;
				}else {
					System.out.println("对不起，你输入的数不是奇数");
				}

			} 
		

		int num = (num1 - 1) / 2;

		int[] 空格 = new int[num];
		int[] 星星 = new int[num];
		for (int i = 0; i < num; i++) {
			空格[i] = num - i;
			星星[i] = 1 + i * 2;

		}
		for (int i = 0; i < num; i++) {
			for (int j = 1; j <= 空格[i]; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 星星[i]; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 空格[i]; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 0; i < num1; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = num - 1; i > -1; i--) {
			for (int j = 1; j <= 空格[i]; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 星星[i]; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 空格[i]; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
