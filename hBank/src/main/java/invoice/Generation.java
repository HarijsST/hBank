package invoice;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Generation {
    List<Integer> invoiceNumbers = new ArrayList<>(List.of(5, 7, 3));

    public void invoiceDay() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }

    public void invoiceNumber() {
        int invoiceNr = 0;
        Random random = new Random();
        boolean found = false;
        while (!found) {
            invoiceNr = random.nextInt(10);
            if (invoiceNumbers.isEmpty()) {
                invoiceNumbers.add(invoiceNr);
                found = true;
            } else if (!invoiceNumbers.contains(invoiceNr)) {
                invoiceNumbers.add(invoiceNr);
                found = true;
            }
        }
        System.out.println("Invoice Nr. " + invoiceNr);
    }
}
