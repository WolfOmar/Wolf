import java.util.Arrays;
public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[]={67,34,59,29,21,44};
		int age[]={32,44,50,983,10,23,18};
		java.util.Arrays.sort(score);
		print(score);
		System.out.println("\n-----------");
		java.util.Arrays.sort(age);
				print(age);

	}

	private static void print(int[] score) {
		// TODO Auto-generated method stub
		for (int i=0;i<score.length;i++)
		{
			System.out.print(score[i]+"\t");
		}
	}

}
