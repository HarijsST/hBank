package done;

import carWerhouse.models.cars.Bmw;
import carWerhouse.models.cars.CarModel;
import carWerhouse.models.cars.Subaru;
import carWerhouse.models.cars.Volvo;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        List<CarModel> carList = new ArrayList<>();
        carList.add(new Bmw("BMW", "745", 2004, "Sedan", "Germany"));
        carList.add(new Subaru("Subaru", "XV", 2020, "SUV", "Japan"));
        carList.add(new Volvo("Volvo", "XC60", 2024, "SUV", "Sweden"));
        FileWriterDemo fileWriterDemo = new FileWriterDemo();
        String result = fileWriterDemo.listToFile(carList);
        System.out.println(result);
    }

    public String listToFile(List<CarModel> carList) throws IOException {
        //   "file.txt"       pašā projekta saknē (root)
        //   "./file2.txt"    joprojām root jeb saknē
        //   Path path = Paths.get("file3.txt");   joprojām saknē
        //   Path path2 = Path.of("file4.txt");   joprojām saknē

        // Faila lasīšanai, ar šo piekļūstam pa taisno resources mapei
        // ClassLoader.getSystemClassLoader().getResource("FileToRead.txt");
        // String path = "hBank/src/main/resources/file5.txt"; // Relative path
        // URL resource = ClassLoader.getSystemClassLoader().getResource("file5.txt");
        // FileWriterDemo fileWriterDemo = new FileWriterDemo();
        // URL resource = fileWriterDemo.getClass().getClassLoader().getResource("file5.txt");
        //ClassLoader.getSystemClassLoader().getClass().getResource()

        Path path = Path.of("hBank/src/main/resources/file.txt");
        FileWriter fileWriter = new FileWriter(path.toString());
        for (CarModel cars : carList) {
            fileWriter.write(cars.getBrand() + " " + cars.getModel() + " " + cars.getYear() + " " + cars.getType() + " " + cars.getCarCountry() + " " + cars.getEngine() + System.lineSeparator());
        }
        fileWriter.close();
        return "Successfuly complate";
    }
}
