package exercise;

public class SmallerScopeTest extends ScopeTest{

    private String name; // +

    public SmallerScopeTest(String n) { // +
        super(n);
        this.name = n;
    }
    public static void main(String[] args) { // +/-1
        new SmallerScopeTest("NEW SCOPE TEST"); // +
        //todo args
    }
}
