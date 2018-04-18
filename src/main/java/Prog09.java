import java.util.Scanner;

/**
 * 9.指定范围的完数 ----------------
 * 
 * 一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
 * 
 */
public class Prog09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("你想知道0到多少里面的所有完数：");
		int num1 = scanner.nextInt();

		int total = 0;// 总数

		for (int num = 2; num <= num1; num++) {
			
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					total = total + i;
				}
			}
			if (num == total+1) {
				System.out.println(num);
			} else {
				total = 0;
			}
		}
	}

}
