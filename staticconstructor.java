public class staticconstructor {//instance variable
    int age;
    String name;
    boolean married;
    static long population;
public staticconstructor(int age ,String name,boolean married){//constructor
    this.name=name;
    this.age=age;
    this.married=married;
    staticconstructor.population +=1;//to acess static we use class name here
}
}
