import java.util.Scanner;

/**
 * 
 * Q
 * 
 * 1.指数计算问题 --------------
 * 
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 * 
 */

public class Prog01 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("第几月：");
		int month = scanner.nextInt();
		
		
		int x = 1;//成熟的兔子数	
		int i = 3;//天数
		
		int z = 0;//总数
		
		int[] a = new int[100];//每天兔子出生数
		
		
		for (; i < month+1; i++) {

			x=x+a[i-2];//今天所有成熟的兔子数 =昨天成熟兔子数   + 前天出生的兔子
			a[i] = x;//今天出生兔子数（今天出生兔子数   =    今天成熟兔子数
			

		}
		z=x+a[i-1]+a[i-2];	//所有兔子数   =    今天所有成熟的兔子数+昨天出生兔子数+前天出生小兔子数
		System.out.println(z);

	

	}
 

}
