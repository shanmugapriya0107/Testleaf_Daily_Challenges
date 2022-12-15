package daily.challenges;

import java.util.Arrays;

public class NinthDecFridayNumAppearsTwiceExceptForOne {

	public static void main(String[] args) {
		int[] num = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(num);
		for (int i = 0; i < num.length-1; i++)
		{
			if(num[i]==num[i+1])
			{
				System.out.print(num[i]+ " ");
			}
		}

	}
}