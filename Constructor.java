public class Constructor {
    public static void main(String[] args) {
     Studentdata1 huzz=new Studentdata1();
     Studentdata1 hanj=new Studentdata1();

        System.out.println(hanj.roll);
        System.out.println(hanj.marks);
        System.out.println(hanj.name);

        System.out.println(huzz.roll);
        System.out.println(huzz.marks);
        System.out.println(huzz.name);
    }
}
class Studentdata1{
    int roll;
    float marks;
            String name;
            Studentdata1(){
                this.roll=79;
                this.marks=45.4f;
                this.name="huzaifa ansari";
            }
}