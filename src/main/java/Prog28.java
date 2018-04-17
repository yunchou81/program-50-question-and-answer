import java.util.Scanner;

/**
 28.对10个数进行排序
-------------------

程序分析：可以利用选择法，即从后9个比较过程中，选择一个最小的与第一个元素交换，
下次类推，即用第二个元素与后8个进行比较，并进行交换。

 
 */
public class Prog28 {

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

	}

}
