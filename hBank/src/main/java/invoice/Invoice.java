package invoice;


public class Invoice{
    public static void main(String[] args) {
        OurCompany ourCompany = new OurCompany("Lācītis Ķepainītis", "Brīvības iela 15");
        System.out.println(ourCompany.details());

        ClientCompany client = new ClientCompany(1,"Euronics", "Ieriķu iela 5B");
        ClientCompany client2 = new ClientCompany(2, "Rimi Baltic", "A.Deglava iela 161a");
        ClientCompany client3 = new ClientCompany(3, "Depo", "Noliktavu iela 7");

        Generation generation = new Generation();
        generation.invoiceDay();
        generation.invoiceNumber();
        System.out.println(generation.invoiceNumbers);
        System.out.println(client.details());
    }
}
