package invoice;


public class Invoice{
    public static void main(String[] args) {
        OurCompany ourCompany = new OurCompany("Lācītis Ķepainītis", "Brīvības iela 15");
        System.out.println(ourCompany.rekviziti());

        Clients client = new Clients(1,"Euronics", "Ieriķu iela 5B");
        Clients client2 = new Clients(2, "Rimi Baltic", "A.Deglava iela 161a");
        Clients client3 = new Clients(3, "Depo", "Noliktavu iela 7");

        Generation generation = new Generation();
        generation.today();
    }
}
