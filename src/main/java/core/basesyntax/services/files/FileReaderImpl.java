package core.basesyntax.services.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReaderImpl implements FileReader {

    @Override
    public List<String> read(String fileName) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner myReader = new Scanner(file);

            if (myReader.hasNextLine()) {
                myReader.nextLine(); // Skip the header line
            }

            while (myReader.hasNextLine()) {
                list.add(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return list;
    }

}
