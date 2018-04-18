
/**
 
 20.数列求和
-----------

有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。

程序分析：请抓住分子与分母的变化规律。

 */

import java.util.Scanner;

public class Prog20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("这个数列前多少之和：");
		int num = scanner.nextInt();
		int molecule[] = new int[num + 1]; // 分子表
		int mole[] = new int[num + 1]; // 分子倍数表
		int denominator[] = new int[num + 1];// 分母表

		molecule[1] = 2; // 将第一个分子设为2；
		denominator[1] = 1;// 将第一个分母设为1；

		for (int i = 2; i < molecule.length; i++) {
			molecule[i] = molecule[i - 1] + denominator[i - 1];
			denominator[i] = molecule[i - 1];

		}
		for (int i = 1; i < denominator.length; i++) {
			mole[i] = molecule[i];
		}

		for (int i = 1; i < molecule.length; i++) {
			for (int j = 1; j < denominator.length; j++) {
				if (i != j) {
					mole[i] = mole[i] * denominator[j];
				}

			}
		}

		int 总分子 = 0;
		int 总分母 = 1;
		for (int i = 1; i < denominator.length; i++) {
			总分子 = mole[i] + 总分子;
			总分母 = 总分母 * denominator[i];
		}

		int temp = 0;
		int a = 总分子;
		int b = 总分母;
		if (b < a) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		while (b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}

		int num1 = 0;
		int num2 = 0;
		num1 = 总分子 / a;
		num2 = 总分母 / a;
		// System.out.println(num1+"/"+num2);

		for (int i = 1; i < molecule.length; i++) {
			System.out.print("(" + molecule[i] + "/" + denominator[i] + ")");
			if (i < molecule.length - 1) {
				System.out.print("+");
			}
		}


		if (总分子 ==num1) {
			System.out.print("="+总分子+"/"+总分母);
		}else {
			System.out.print("="+总分子+"/"+总分母+"="+num1+"/"+num2);
		}
		
		
		
	}

}
