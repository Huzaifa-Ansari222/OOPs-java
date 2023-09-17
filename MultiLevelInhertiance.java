public class MultiLevelInhertiance {
    public static void main(String[] args) {
        GrandFather obj1 =new GrandFather(1,"hi",2);//making object for grandFather
        System.out.println(obj1.lastName+" "+obj1.GFmoney+" "+ obj1.age);

        Father obj2=new Father(100,"ansari",45,1000);//making object for father
        System.out.println(obj2.lastName+" "+obj2.GFmoney+" "+ obj2.age+" "+ obj2.fatherMoney);//inherited the grandfather

        Son obj3=new Son(00,"none",22,100,00);//inherted the father and grand father
        System.out.println(obj2.lastName+" "+obj2.GFmoney+" "+ obj2.age+" "+ obj2.fatherMoney+" "+obj3.childMoney);
    }
}
class GrandFather{
    int GFmoney=1000;
    String lastName="ansariGF";
    int  age=80;

     GrandFather(int money,String lastName, int age) {
        this.GFmoney = 1000;
        this.lastName = "AnsariGF";
        this.age = 80;
    }
}
class Father extends GrandFather {
  int fatherMoney=10;

     Father(int GFmoney, String lastName, int age, int fatherMoney) {
        super(GFmoney, lastName, age);//super refer to upward class of it means grandfather
        this.fatherMoney = 10;
    }
}
class Son extends Father{
int childMoney=00;

    public Son(int GFmoney, String lastName, int age, int fatherMoney, int childMoney) {
        super(GFmoney, lastName, age, fatherMoney);//super refer to upward class of it means father
        this.childMoney = childMoney;
    }
}
