import java.util.*;
public class arrlistacc26{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            a.add(s);
        }
        System.out.println(a);
    }
}