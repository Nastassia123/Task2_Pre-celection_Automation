package stream;

import exception.EmptyCollectionException;
import structure.Vegetable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class FileWriter {

    public void writeToFile(List<Vegetable> salad, String pathtoWrite) throws EmptyCollectionException {

        List<String> lines = new ArrayList<>();
        for (Vegetable vegetbleFromSalad : salad) {
            lines.add(vegetbleFromSalad.toString());
            try {
                Files.write(Paths.get(pathtoWrite), lines);
                if (lines.size() == 0) {
                    throw new IOException();
                }
            } catch (IOException e) {
                throw new EmptyCollectionException("Empty collection - unable to write into the file");
            }
        }
    }
}


