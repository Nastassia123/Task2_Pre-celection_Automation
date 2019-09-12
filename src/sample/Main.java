package sample;

import comparator.CaloriesOfVegetablesComparator;
import exception.EmptyCollectionException;
import exception.VegetableIsNotFoundException;
import operation.SaladCaloriesCalculator;
import operation.VegetablesFilter;
import structure.*;
import sqlconnection.SQLConnect;
import stream.FileReader;
import stream.FileWriter;
import xmlparser.ParseXMLToTheObjects;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
/*
1) Шеф-повар. Определить иерархию овощей. Сделать салат. Посчитать калорийность.
Провести сортировку овощей для салата на основе одного из параметров.
 Найти овощи в салате, соответствующие заданному диапазону параметров
2) PRE-SELECTION FOR TEST AUTOMATION MENTORING PARTICIPATION:
JAVA, part 3Task 1Дляобъектноймодели,реализованнойвзадании
 Необходимо реализовать класс ыпользовательских исключений и организовать обработку возможных  исключительных ситуаций, например,
если элемент отсутствует в коллекции, если мы не можем удалить текущий элементит.д.Комментарии оставлять в классах исключений.
Создать минимум 3 пользовательских исключенияи и спользовать минимум 5 встроенных исключений.T ask
  Дополнить сценарии,реализованные в задании  добавить чтение данных из файла  запись данных файл, используя I/O Streams.
3) PRE-SELECTION FOR TEST AUTOMATION MENTORING PARTICIPATION: JAVA, part 4Task 1 Дополнить объектную модель, реализованнуюврамкахзаданий
 Добавить чтение данных из следующих источников:- из базы данных(базу данных можно выбрать самостоятельно)с использованием jdbc– драйвера;
- из xml-файла или из json-файла(на выбор). Все источники данных должны реализовывать общий интерфейс или наследовать общий абстрактный класс.
 */

    public static void main(String[] args) throws IOException, StringIndexOutOfBoundsException, SQLException, VegetableIsNotFoundException, EmptyCollectionException {
        /*VegetableDatabase databaseconnection = new VegetableDatabase();
        databaseconnection.read();


 */
        Salad salad = new Salad();
        //Create a salad
        List<Vegetable> saladList = new ArrayList<Vegetable>();
        Tomato tomato = new Tomato(123, "Tomato", 34);
        saladList.add(new Carrot(300, "Carrot", 45));
        saladList.add(new Potato(200, "Potato", 100));
        saladList.add(new Carrot(100, "Potato", 200));
        saladList.add(new Carrot(100, "Potato", 200));
        //Task 4.2
        ParseXMLToTheObjects domBuilder = new ParseXMLToTheObjects();
        domBuilder.buildSetVegetables("VegetableXML.xml");
        System.out.println("Parsed XML Data");
        System.out.println(domBuilder.getTomatoes().toString().replace("[", "").replace("]", ""));
        //VegetableDatabase vegetableFromDatabase = new VegetableDatabase(23, "f", 33);
        //vegetableFromDatabase.read();
        System.out.println("Sorted collection by calories");
        Collections.sort(saladList, new CaloriesOfVegetablesComparator());
        for (Vegetable vegetableFromSaladAfterSorting :
                saladList) {
            System.out.println(vegetableFromSaladAfterSorting.toString());
        }
        System.out.println("Write information to the file");
        FileWriter writeDataToTheFile = new FileWriter();
        writeDataToTheFile.writeToFile(saladList, "DataFromDataToWriteFil1e.txt");
        System.out.println("Filtered result");
        VegetablesFilter vegetablesFilter = new VegetablesFilter();
        int filterForCalories = 200;
        int filterForWeight = 100;
        //System.out.println("Vegetable with " + vegetablesFilter.findVegetableByParameters(saladList, filterForCalories, filterForWeight));
        //vegetablesFilter.findVegetableByParameters(saladList, filterForCalories, filterForWeight);
        System.out.println(vegetablesFilter.findVegetableByParameters(saladList, filterForCalories, filterForWeight).toString().replace("[", "").replace("]", ""));
        //   vegetablesFilter.findVegetableByParameters(saladList, filterForCalories, filterForWeight);
        System.out.println("Read result from text file");
        FileReader fileReader = new FileReader();
        fileReader.readFile("dataToRead.txt");
        //System.out.println(fileReader.ReadFile("C:/Users/Nastassia_Chaliapina/Desktop/Java_Lessons/PreCelection_task2_1/dataToRead.txt"));
        SaladCaloriesCalculator saladCaloriesCalculator = new SaladCaloriesCalculator();
        System.out.println("Salad's calories");
        System.out.println("Calories amount of salad salad =" + saladCaloriesCalculator.calculateCalories(saladList));
        System.out.println("SQL connection result");
        SQLConnect sqlConnect = new SQLConnect();
        sqlConnect.SQLConnection();

        //Exception if smth in the collestion has incorrect calories amount
       /*for (Vegetable vegetableFromSalad:
             saladList) {
            if (vegetableFromSalad.getCalories()<0) {
                throw new AddVegetableWithInvalidCalories();
            }
        }
*/
       /* for (Vegetable vegetableFromSaladAfterSorting2:
            saladList ) {
            System.out.println(vegetableFromSaladAfterSorting2.toString());
           //
            try {
                vegetableFromSaladAfterSorting2.checkVegetableWeight(vegetableFromSaladAfterSorting2);
            }
             catch (AddVegetableWithInvalidWeight e) {
               throw new AddVegetableWithInvalidWeight("Error" + vegetableFromSaladAfterSorting2.getWeight()+ "  negative weight");
            }
        }*/
   /*
        try {
            saladList.get(10);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("No such element found in the collection");
        }
        VegetableDatabase vegetableFromDatabase = new VegetableDatabase();
        vegetableFromDatabase.read();
        */
    }
}

