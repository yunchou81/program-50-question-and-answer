import java.util.Scanner;

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
		// System.out.println("第几月：");
		// int month = scanner.nextInt();
		int[] a = new int[100];
		int i = 2;
		while (i<=1000) {
			if (a[i] == 0) {
			for (int j = 0; i*j < 1000; j++) {
				a[i*j]=1;
			}
		} else {
			i++;
		}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
			
		}
	}

}
