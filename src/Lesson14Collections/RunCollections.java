package Lesson14Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class RunCollections {
    public static void main(String[] args) {
        LinkedList<String> citiesList = new LinkedList<>(); //Хранилище названия городов
        ArrayList<String> arrayList = new ArrayList<>();    //Основное хранилище всех городов
        HashSet<String> hashSet = new HashSet<>();  //Уникальные названия из основного хранилища
        citiesList.add(0,"Monaco");
        citiesList.add(1,"Moscow");
        citiesList.add(2,"Paris");
        citiesList.add(3,"Dublin");
        citiesList.add(4,"New York");
        citiesList.add(5,"Rome");

        for (int i = 0; i < Math.random() * 5000000; i++){
            arrayList.add(citiesList.get((int) (Math.random()*6)));
        }
        for (String element : arrayList){
            hashSet.add(arrayList.get(arrayList.indexOf(element)));
        }

        System.out.println(arrayList);
        System.out.println(hashSet);
        elementsSum(arrayList,citiesList);
    }

    private static void elementsSum(ArrayList<String> list, LinkedList<String> citiesList) {
        int count = 0;
        for (String s : citiesList) {
            for (String component : list) {
                if (s.equals(component)) {
                    count++;
                }
            }
            System.out.println("Городов " + s + " содержится в хранилище " + count + " штук!");
            count = 0;
        }
    }
}
