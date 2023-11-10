package serializationExample;

import java.io.*;

public class ReaderWriter {

    public static void main(String[] args) {
        Person p1 = new Person("John", 30, "Male");
        Person p2 = new Person("Rachel", 25, "Female");
        String pathname = "hbank/src/main/resources/myObjects.txt";

        try {
            //Start of object writing
            FileOutputStream f = new FileOutputStream(new File(pathname));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(p1);
            o.writeObject(p2);

            o.close();
            f.close();
            //End of object writing


            //Start of object reading
            FileInputStream fi = new FileInputStream(new File(pathname));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            Person pr1 = (Person) oi.readObject();
            Person pr2 = (Person) oi.readObject();
            oi.readObject();

            // Read objects
//            CarModel carModel = (CarModel) oi.readObject();
//            carModel = switch (carModel.getBrand()) {
//                case "BMW" -> (Bmw) carModel;
//                case "Volvo" -> (Volvo) carModel;
//                case "Subaru" -> (Subaru) carModel;
//            };

            System.out.println(pr1.toString());
            System.out.println(pr2.toString());

            oi.close();
            fi.close();
            //End of object reading

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
