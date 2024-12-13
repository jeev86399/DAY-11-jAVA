import java.util.*;
public class arraylist166{
    //array list to array
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(890);
        a.add(80);
        a.add(84);
        a.add(900);
        int b[]=new int[a.size()];
        for(int i=0;i<a.size();i++)
        b[i]=a.get(i);
        System.out.println(Arrays.toString(b));
    }
}