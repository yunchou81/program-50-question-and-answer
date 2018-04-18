/**
 
 33.打印出杨辉三角形（要求打印出10行如下图）
-------------------------------------------

程序分析：  
1  
1 1  
1 2 1  
1 3 3 1  
1 4 6 4 1  
1 5 10 10 5 1
 */
public class Prog33 {

	public static void main(String[] args) {
		final int NMAX = 10; 
		 
	      // allocate triangular array
	      int[][] odds = new int[NMAX + 1][];
	      for (int n = 0; n <= NMAX; n++)
	         odds[n] = new int[n + 1];  
	 
	      // fill triangular array
	      for (int n = 0; n < odds.length; n++)
	         for (int k = 0; k < odds[n].length; k++)
	         {
	            /*
	             * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
	             */
	            int lotteryOdds = 1;
	            for (int i = 1; i <= k; i++)
	               lotteryOdds = lotteryOdds * (n - i + 1) / i;
	 
	            odds[n][k] = lotteryOdds;
	         }
	 
	      // print triangular array
	      for (int[] row : odds)
	      {
	         for (int odd : row)
	            System.out.printf("%4d", odd);
	         System.out.println();
	      }
	}

}
