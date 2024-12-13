import java.util.*;
public class arrlistacc46{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            a.add(s);
        }
        Collections.sort(a);
    System.out.println(a);
}
}