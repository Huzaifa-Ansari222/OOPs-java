public class multilevelex {
    public static void main(String[] args) {
        Son1 obj=new Son1();
    }
}
class GrandFather1{
     GrandFather1() {
         System.out.println("am grand father");
    }
}
class Father1 extends GrandFather1{

    Father1(){
        System.out.println("am father");
    }
}
class Son1 extends Father1 {
    Son1() {
        System.out.println("am son");
    }
}