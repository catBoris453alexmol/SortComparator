package ru.sapteh;

import Sort.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName ="Student.txt";
        File file = new File(fileName);
        file.createNewFile();
        List<Person> listSort= new ArrayList<>();
        //Reading from file
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))){
            while (fileReader.ready()){
                Person person = getPerson(fileReader.readLine()) ;
                listSort.add(person);
            }
        }

        //sorted

       // Collections.sort(listSort, new SortByLastName());
        //Collections.sort(listSort, new SortByFirstName());
       // Collections.sort(listSort, new SortByPatronomic());
        //Collections.sort(listSort, new SortByAge());
        Collections.sort(listSort, new SortByPricework());




        //writing in file
        try (FileWriter fw = new FileWriter(file)){
            for (Person person : listSort) {
                fw.write(person.toString());
                fw.write("\n");
            }
        }
    }
    public static Person getPerson(String strLine){
        String[] strings = strLine.split(" ");
        String lastName = strings[0];
        String firstName = strings[1];
        String patronomic = strings[2];
        int age = Integer.parseInt(strings[3]);
        int pricework = Integer.parseInt(strings[4]);
        return new Person(lastName,firstName,patronomic,age,pricework);
    }
}
