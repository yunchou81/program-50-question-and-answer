import java.util.Iterator;
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

		boolean[] 合数表 = new boolean[input + 1];// 数组初始化是false
		// false是假
		//
		合数表[0] = true;// 0不是质数
		合数表[1] = true;// 1不是质数

		int[] 质因数 = new int[input + 1];
		int input1 = input;
		int k = 0;
		int i = 2;

		// 开始构建合数表
		boolean flag = true;
		while (flag) {
			while (i <= input) {// 进入条件为 i<分解数，
				if (合数表[i] == false) {// 进入条件为质数
					for (int j = 2; (i * j) <= input; j++) {//
						合数表[i * j] = true; // i*j是合数
					}
					i++;
				} else {
					i++;
				}
			}
			flag = false;
		}
		// 构建合数表结束

		// 分解质因数
		i = 2;
		if (合数表[input] == false) {// 如果分解数 本身 是质数，直接输出 分解数
			System.out.println(input + "分解质因素为" + input);
		} else {
			while (input1 != 1) {// 最后的一个 为1
				// 判断这个数是否是质数 并且 是否为因数 不是则跳到下一个数
				if (合数表[i] == false && input1 % i == 0) {
					质因数[k] = i;// 记录因数
					input1 = input1 / i;// 分解此因数
					k++;
				} else {
					i++;
				}

			}

			System.out.print(input + "分解质因素为" );
			for (int j = 0; 质因数[j] > 0; j++) {
				System.out.print(质因数[j] + ",");
			}

		}
	}

}
