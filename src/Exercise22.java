
public class Exercise22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Str_Get("9,AUStralia");
	}
		public static void Str_Get(String str)
		{
			char[] ch=str.toCharArray();
			StringBuffer buf = new StringBuffer();
			for (int i=0;i<ch.length;i++)
			{
				if (ch[i]>=65 && ch[i]<=90)
				{
					buf.append(ch[i]);
				}
			}
			System.out.println(buf.toString());
		}
}
