
public class MainClass{
    public static void main(String[] args){
        // created object using static factory method
        Test t =  Test.getObject();
        // calling function to print name in Test class
        t.getName();
    }
}
