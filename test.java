public class test {
    public static void main(String[] args) {
       staticconstructor obj = new staticconstructor(12,"huzaifa", false);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.married);
       staticconstructor obj2 =new staticconstructor(45,"hanj", false);
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.married);
       // System.out.println(obj.population); work but give warning dnt do this
       // System.out.println(obj2.population);
        System.out.println(staticconstructor.population); //right ways to do this
        System.out.println(staticconstructor.population);
    }
}
