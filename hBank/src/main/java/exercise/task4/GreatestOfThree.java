package exercise.task4;

public class GreatestOfThree {
    int first;
    int second;
    int third;

    public int getGreatest(int first, int second, int third) {
        if(first > second && first > third){
            return first;
        } else if (second > first && second > third) {
            return second;
        }else if(first == second && first == third){
            return first;
        }else {return third;}
    }
}
