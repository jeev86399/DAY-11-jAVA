import java.util.*;
public class arraylist266{
    //array list to array
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(890);
        a.add(80);
        a.add(84);
        a.add(900);
        Object b[]=a.toArray();
        System.out.println(Arrays.toString(b));
    }
}