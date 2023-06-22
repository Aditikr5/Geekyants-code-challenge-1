public class Test {
    public String name="Geekyants123";
    private Test(){
        //private constructor
    }
    // static factory method
    public static Test getObject(){
        return new Test();
    }
    // to print the name
    public void getName(){
        System.out.println("Name in Test class: "+ name);
    }
}
