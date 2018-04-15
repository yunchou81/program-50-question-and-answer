import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

/**
 * 2.指定范围包含的素数 --------------------
 * 
 * 判断101-200之间有多少个素数，并输出所有素数。
 * 
 * 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
 * 
 * 
 **/
public class Prog02 {

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("第一个数：");
		// int month = scanner.nextInt();
		// System.out.println("第二个数：");
		// int month2 = scanner.nextInt();
		int[] a = new int[201];
		int month = 100;
		int month2 = 200;
		int i = 2;
		boolean flag = true;
		while (flag) {
			while (i < 201) {
				if (a[i] == 0) {
					for (int j = 2; (i * j) < 201; j++) {
						a[i * j] = 1;
					}
					i++;
				} else {
					i++;
				}
			}
			for (int j = 1; j < a.length; j++) {
				if (j >= month && j < month2 && a[j] == 0) {

					System.out.println("第" + j + "是质素");

				}

			}
			flag = false;
		}
	}

}
