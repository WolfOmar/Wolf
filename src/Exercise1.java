import java.util.*;
public class Exercise1 {
	static String s;

	public static void main(String[] args) {
		int n=0;
		int[] newArr=new int[12];
		Test m=null;
		m=new Test();//********สตภýปฏ
		//s=new Exercise1();
		//System.out.println(m.b);
				m.zouke(3);
		// TODO Auto-generated method stub
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		for (int i=0;i<oldArr.length;i++)
		{
			if (oldArr[i]!=0)
			{
				newArr[n]=oldArr[i];
				n++;
				//n=oldArr[i];
				//System.out.print(n+" ");
			}
		}
			java.util.Arrays.sort(newArr);
			for (int x:newArr)
			{
				System.out.print(x+" ");
			}
			//System.out.println(Exercise1.s);
	}

}
