package exercise.task4;

public class EvenOddNumber {
    int number;
    public String getNumberType(int number) {
        if(number % 2 == 0){
            return "Even";
        }else return "Odd";
    }
}
