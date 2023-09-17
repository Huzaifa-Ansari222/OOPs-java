public class BoxConstructor {
    public static void main(String[] args) {
Box obj=new Box(1,2,3);//3argument passed and it active 3 parameter constructor
        System.out.println(obj.L+" "+obj.w+" "+obj.h);

        Box obj1=new Box();//constructor with 0 argument
        System.out.println(obj1.L+" "+obj1.w+" "+obj1.h);

        Box obj2=new Box(10);//constructor with 1 argument
        System.out.println(obj2.L+" "+obj2.w+" "+obj2.h);
        System.out.println(obj2.L);//sdie x side
    }
}
class Box{
    int L;
    int w;
    int h;

    public Box(int L, int w, int h) {
        this.L= -1;
        this.w = -1;
        this.h = -1;
    }
    Box(){
        this.L=00;
        this.w=00;
        this.h=00;
    }
    Box(int side){
        this.L=side*side;
        this.w=side;
        this.h=side;
    }


}
