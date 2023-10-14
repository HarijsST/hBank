import java.util.ArrayList;
import java.util.List;

public class StaticAdressExample {

    private static String adress = "Brīvības 5";

    private static String getAdress() {
        return adress;
    }

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        StaticAdressExample adress1 = new StaticAdressExample();
        StaticAdressExample adress2 = new StaticAdressExample();
        StaticAdressExample adress3 = new StaticAdressExample();

        //Jānomaina katram objektam atseviski, jo objekta mainīgie
        adress1.setId(11);
        adress2.setId(22);
        adress3.setId(33);

        //Nomainam vienu reizi - nomainās visiem, jo klases (static) mainīgais
        adress = "Valdemāra 11";

        System.out.println(adress1);
        System.out.println(adress2);
        System.out.println(adress3);

        List<StaticAdressExample> adressExampleList = new ArrayList<>();
        adressExampleList.add(adress1);
        adressExampleList.add(adress2);
        adressExampleList.add(adress3);

        System.out.println(adressExampleList);
    }

    @Override
    public String toString() {
        return "StaticAdressExample{" +
                "id=" + id +
                ", adress=" + getAdress() +
                '}';
    }
}
