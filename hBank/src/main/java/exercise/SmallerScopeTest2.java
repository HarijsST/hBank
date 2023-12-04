package exercise;

public class SmallerScopeTest2 {
    static class SmallObject {
        public SmallObject(){
            System.out.println("Hey you just created a small Object");
        }
    }
    private SmallObject smallObject;

    public SmallerScopeTest2(SmallObject s) {
        this.smallObject = s;
    }
    public static void main(String[] args) {
        SmallObject smallObject = new SmallObject();
        new SmallerScopeTest2(smallObject);
        SmallerScopeTest2 smallerScopeTest2 = new SmallerScopeTest2(smallObject);
        smallerScopeTest2.getName();
    }

    public String getName(){
        System.out.println("Hello world");
        return "asdasd";
    }
}
