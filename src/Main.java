import java.util.Scanner;
import java.util.TreeSet;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            TreeSet<Integer> tree = new TreeSet<>();
            int M = scan.nextInt();
            for(int i=1;i<=M;i++){
                tree.add(scan.nextInt());
            }
            for(Integer a: tree)
                System.out.println(a);
        }
    }
}
