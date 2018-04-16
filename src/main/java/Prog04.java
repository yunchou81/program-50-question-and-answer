import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

/**
 * 
 * 4.分解质因数 ------------
 * 
 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3\*5。
 * 
 * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
 * 
 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
 * (2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。
 * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
 * 
 */
public class Prog04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("要分解的数：");
		int input = scanner.nextInt();
		int[] a = new int[input + 1];
		int[] b = new int[input + 1];
		int input1 = input;
		int k = 0;
		int i = 2;
		a[0] = 1;
		a[1] = 1;
		boolean flag = true;
		while (flag) {
			while (i <= input) {
				if (a[i] == 0) {
					for (int j = 2; (i * j) <= input; j++) {
						a[i * j] = 1;
					}
					i++;
				} else {
					i++;
				}
			}
			flag = false;
		}
		flag = true;
		i = 2;
		if (a[input] == 0) {
			System.out.println(input + "分解质因素为" + input);
		} else {
			while (input1 != 1) {
				if (a[i] == 0) {
					if (input1 % i == 0) {
						b[k] = i;
						input1 = input1 / i;
						k = k + 1;
					} else {
						i++;
					}

				} else {
					i++;
				}

			}
			System.out.println(input + "分解质因素为");
			k = 0;
			// for (k = 0;a[k]!=0; k++) {
			// System.out.println(k);
			// System.out.println(b[k]);
			while (a[k] > 0) {
				System.out.println(b[k]);
				k = k + 1;
			}
		}

	}

}
