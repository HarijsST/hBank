package exercise.task4;

public class GreatestOfTwo {
    int first;
    int second;

    public int getGreatest(int first, int second) {
        if(first > second){
            return first;
        }else{
            return second;
        }
    }
}
