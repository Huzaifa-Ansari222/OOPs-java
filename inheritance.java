public class inheritance {
    public static void main(String[] args) {
        Child ob=new Child();
        System.out.println(ob.money);
        System.out.println(ob.childname+" "+ob.lastName);//child can access parent properties
        Parent ob1=new Parent();
        System.out.println(ob.childMoney);//parent can access child properties
//        System.out.println(ob1.weight);
//        System.out.println(ob1.childName);
    }
}
class Parent{
    final int money=10000;

    String lastName="Ansari";

}
class Child extends Parent{
    int childMoney=100;
    String childname="huzaifa";
   // int weight =4;
}