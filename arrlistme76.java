import java.util.*;
public class arrlistme76{
    public static void main(String args[]){
        // array list methods
        ArrayList<Integer> a=new ArrayList<>();
        a.add(809);
        a.add(873);
        a.add(90);
        System.out.println(a);
        System.out.println(a.contains(90));
        System.out.println(a.contains(354));
        a.remove(1);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}