
/**
 15.排序
-------

输入三个整数x,y,z，请把这三个数由小到大输出。

程序分析：我们想办法把最小的数放到x上，先将x与y进行比较，如果x&gt;y则将x与y的值进行交换，然后再用x与z进行比较，如果x&gt;z则将x与z的值进行交换，这样能使x最小。

 
 */
import java.util.Scanner;

public class Prog15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean[] array = new boolean[101];
		int[] a = new int[100];

		int x = 1;

		for (int i = 1; i <= 100; i++) {
			if (x == 0) {
				i = 100;
			} else {
				System.out.println("第" + i + "个数");
				x = scanner.nextInt();
				array[x] = true;
			}

		}

		for (int i = 1; i < 101; i++) {
			if (array[i]) {
				System.out.print(i);
				System.out.print("<");
			}
		}

		// Scanner scanner = new Scanner(System.in);
		// System.out.println("第一个数：");
		// int num1 = scanner.nextInt();
		// System.out.println("第二个数：");
		// int num2 = scanner.nextInt();
		// System.out.println("第二个数：");
		// int num3 = scanner.nextInt();
		//
		// if (num3 < num2 && num2 < num1) {
		// System.out.println(num3 + "<" + num2 + "<" + num1);
		// }
		// if (num3 < num1 && num1 < num2) {
		// System.out.println(num3 + "<" + num1 + "<" + num2);
		// }
		// if (num2 < num3 && num3 < num1) {
		// System.out.println(num2 + "<" + num3 + "<" + num1);
		// }
		// if (num2 < num1 && num1 < num3) {
		// System.out.println(num2 + "<" + num1 + "<" + num3);
		// }
		// if (num1 < num2 && num2 < num3) {
		// System.out.println(num1 + "<" + num2 + "<" + num3);
		// }
		// if (num1 < num3 && num3 < num2) {
		// System.out.println(num1 + "<" + num3 + "<" + num2);
		// }

	}

}