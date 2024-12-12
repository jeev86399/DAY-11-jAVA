import java.util.*;
interface out{
    void outm();
        interface in{
            void innm();
        }
    }
    class nestedint4 implements out.in{
        public void innm(){
            System.out.println("HELLO I'm INNER METHOD");
        }
        public static void main(String args[]){
            nestedint4 h=new nestedint4();
            h.innm();
        }
    }