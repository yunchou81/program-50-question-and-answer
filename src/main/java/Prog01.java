/**
 * 
 * Q
 * 
 * 1.指数计算问题 --------------
 * 
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 * 
 * A
 * 
 * 观察分析
 * 
 * 分析每个月兔子数目 数列 1,1,2,3,5,8,13,21.... 即为斐波那契数目
 * 
 * 逻辑分析
 * 第n个月的兔子数目为 = f(n)
 *              = 上个月兔子数目 + 这个月新生兔子数目
 *              = 上个月兔子数目 + 这个月成熟兔子数目(每个成熟兔子生一个小兔子)
 *              = 上个月兔子数目 + 上上个月兔子数目(上上个月兔子 在这个月会全部成熟)
 *              = f(n-1)    + f(n-2)
 * 
 */

public class Prog01 {

	public static void main(String[] args) {

		for (int i = 1; i < 50; i++) {
			System.out.println("第" + i + "个月兔子数目");
			System.out.println("fun1:" + fun1(i) + " fun2:" + fun2(i) + " fun3:" + fun3(i));
		}

	}

	// 数组计算每月数目
	private static long fun1(int n) {
		if(n==1) {
			return 1;
		}
		 
		long arr[] = new long[n]; // 这个数组时用来计算每月有兔子的对数
		arr[0] = arr[1] = 1;
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n-1];
	}

	// 使用递归计算 斐波那契数列
	private static long fun2(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return fun2(n - 1) + fun2(n - 2);
	}

	// 使用递归计算 斐波那契数列
	private static long fun3(int n) {
		return 0;
	}

}
