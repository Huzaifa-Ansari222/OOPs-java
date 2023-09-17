public class Heirarchical_inheritance {
    public static void main(String[] args) {
        Dad obj=new Dad();
        Child1 obj1=new Child1();
        Child2 obj2=new Child2();
        Child3 obj3=new Child3();
    }
}
class Dad{
    public Dad() {
        System.out.print("\nam dad"); }
}
class Child1 extends Dad{
    public Child1() {
        System.out.println(" of child1");
    }
}
class Child2 extends Dad{
    public Child2() {
        System.out.println(" of child2");
    }
}
class Child3 extends Dad{
    public Child3() {
        System.out.println(" of child3");
    }
}
