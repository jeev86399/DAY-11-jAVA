import java.util.*;
interface printable{
}
class h implements printable{
    public void print()
    {
        System.out.println("HELLO STUDENTS");
    }
}
public class markerint1{
    public static void main(String ags[]){
        h f=new h();
        f.print();
    }
}