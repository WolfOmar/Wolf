import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<String>();
		Collection<String> b=new ArrayList<String>();
		a.add("hello");
		a.add(0,"world!");
		System.out.println(a);
		b.add("hah");
		b.addAll(b);
		System.out.println(b);
		

	}

}
