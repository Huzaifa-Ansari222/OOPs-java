package Encapsulation;

public class ExampleOfEncapsulation {
      private long phoneNO=7004661449L;

    public long getPhoneNO() {
        return phoneNO;
    }
}
//class child extends ExampleOfEncapsulation{
//
//    public child() {
//    }
//
//
//}
class Main2{
    public static void main(String[] args) {
        ExampleOfEncapsulation obj  =new ExampleOfEncapsulation();
        System.out.println(obj.getPhoneNO());

    }
}
