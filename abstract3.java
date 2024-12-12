import java.util.*;
abstract interface math{
    void print();
}
class d implements math{
    //over riding
    public void print(){
        System.out.println("HELLO");
    }
}
public class abstract3{
    public static void main(String args[]){
        d f=new d();
        f.print();
    }
}