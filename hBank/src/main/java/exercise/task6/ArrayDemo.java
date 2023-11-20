package exercise.task6;

public class ArrayDemo {

    public static void main(String[] args) {
        // 1. Izveidojam atsauci - masivs nav izveidots
        int[] numbers;
        // Seit pievienot neko nevar vel
        numbers = new int[10];

        // 2. Izveidojam tuksu masivu ar konkretu izmeru
        // Izmers ir 3
        int[] numbers3  = new int[3];

        // 2.1 atkartojam to ko izdaram 3. punkta
        int[] numbers31  = new int[3];
        // seit kastites ir izveidotas, bet ir tuksas
        numbers31[0] = 1;
        numbers31[1] = 2;
        numbers31[2] = 3;

        // 3. Izveidojam ar jau inicializciju - ar vertibam
        // Sis izveido masivu ar izmeru - 3
        // Tad kad masivs ir izveidots - tam izmeru mainit nevar
        // 3. punkts un 2.1 punkts logiski izdara vienu un to pasu
        int[] numbers2 = {1,2,3};

        int[] number4 = {};
        // tas ir vienads ar
        int[] numbers5 = new int[0];
    }
}
