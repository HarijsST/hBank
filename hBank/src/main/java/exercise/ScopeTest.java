package exercise;

public class ScopeTest {

    public static String staticBaloon = "Static Red";
    public ScopeTest(String zole){

    }
    public void doSomething(String baloon){
        System.out.println(baloon);
    }
    public void doSomethingElse(){
        System.out.println();
    }
    public static void main(String[] args) {
//        System.out.println(staticBaloon);
        String ball = "Oak tree";
        new ScopeTest(ball);
        String kabacis = "Oak tree";
        new ScopeTest(kabacis);
    }
}
