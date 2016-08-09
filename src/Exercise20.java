import java.util.ArrayList;  
import java.util.Collection;  
import java.util.Collections;  
import java.util.Comparator;  
import java.util.HashSet;  
import java.util.Iterator;  
import java.util.List;  
import java.util.Scanner;  
import java.util.Set;  
  
  
public class Exercise20 {  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
  
        Scanner cin = new Scanner(System.in);  
        String line;  
        int root;  
        line = cin.nextLine();  
        line = cin.nextLine();  
        root = Integer.parseInt(line);  
        List<node> all = new ArrayList<node>();  
        node first = new node(root);  
        all.add(first);  
        line = cin.nextLine();  
        while (cin.hasNext()){  
            line = cin.nextLine();  
            if(line.trim().equals("End"))  
                break;  
            String[] tmp = line.split(",");  
            int index=-1;  
            node t1=new node(Integer.parseInt(tmp[0])),t2=new node(Integer.parseInt(tmp[1]));  
            index = all.indexOf(t1);  
            if(-1 != index){  
                t1 = all.get(index);  
            }  
            else  
                all.add(t1);  
            index = all.indexOf(t2);  
            if(-1 != index){  
                t2 = all.get(index);  
            }  
            else  
                all.add(t2);  
            t1.friends.add(t2);  
            t2.friends.add(t1);   
        }  
        int count=0;  
        Set<node> rr = new HashSet<node>();  
        rr.add(first);  
        first.r = true;  
        Set<node> sender = new HashSet<>();  
        Set<node> receive = new HashSet<>();  
        sender.add(first);  
        while(!yanzheng(all)){  
              
            count += sendMsg(sender, receive);  
//          copyMsg(receive, all);  
            sender.clear();  
            sender.addAll(receive);  
            receive.clear();  
  
        }  
        System.out.println(count-1);  
    }  
    private static void copyMsg(Set<node> receive, List<node> all) {  
        // TODO Auto-generated method stub  
        Iterator<node> it = receive.iterator();  
        while(it.hasNext()){  
            node x = it.next();  
            all.get(all.indexOf(x)).r = true;  
        }  
    }  
    private static int sendMsg(Set<node> sender, Set<node> receive) {  
        // TODO Auto-generated method stub  
        Set<node> friends ;  
        int max = 0,count=0,c=0;  
        node maxNode = null;  
        for(node x:sender){  
            friends = x.friends;  
            for(node xx:friends){  
                if(!xx.r){  
                    receive.add(xx);  
                }  
            }  
        }  
        while(!yanzheng(receive)){  
            max = 0;  
            for(node x:sender){  
                c=0;  
                friends = x.friends;  
                for(node xx:friends){  
                    if(!xx.r){  
                        c++;  
                    }  
                }  
                if(c>max){  
                    max = c;  
                    maxNode = x;  
                }  
            }  
            if(maxNode!=null){  
                maxNode.sendMsg();  
                count++;  
            }  
        }  
          
        return count;  
    }  
    public static boolean yanzheng(Collection<node> all){  
        boolean result = true;  
        Iterator<node> its = all.iterator();  
        while(its.hasNext())  
            if(!its.next().r)  
            {  
                result=false;  
                break;  
            }  
        return result;  
    }  
}  
class node{  
    int num;  
    boolean r = false;  
    public node(int num) {  
        super();  
        this.num = num;  
    }  
  
    Set<node> friends = new HashSet<node>();  
      
    public void sendMsg(){  
        for(node x:friends)  
        {  
            if(!x.r)  
            x.r = true;  
        }  
    }  
    public int findNew(){  
        int c=0;  
        for(node x:friends)  
        {  
            if(!x.r)  
            c++;  
        }  
        return c;  
    }  
      
    @Override  
    public boolean equals(Object obj) {  
        // TODO Auto-generated method stub  
        node tmp = (node) obj;  
        if(this.num == tmp.num)  
            return true;  
        else  
            return false;  
    }  
    @Override  
    public String toString() {  
        // TODO Auto-generated method stub  
        return String.valueOf(this.num);  
    }  
      
  
}  