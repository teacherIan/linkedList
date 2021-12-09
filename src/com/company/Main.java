package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        System.out.println(addCities(cities,"Athens"));
        //System.out.println(addCities(cities,"Shanghai"));
        System.out.println(addCities(cities,"Seoul"));
        System.out.println(addCities(cities,"Boston"));
        System.out.println(addCities(cities,"New York"));
        System.out.println(addCities(cities,"Hainan"));

        seeCities(cities);
    }

    public  static void seeCities(LinkedList<?> linkedList) {

        Iterator<?> iterator = linkedList.iterator();

        System.out.println("===============");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("---------------");
    }

    public static boolean addCities(LinkedList<String> cities, String newCity) {
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("You have no cities available");
        }
        while(listIterator.hasNext()) {
            int compare = listIterator.next().compareTo(newCity);

            if(compare == 0) {
                System.out.println("This city already exists");
                return false;
            }
            if(compare < 0) {
                if(listIterator.hasPrevious()) {
                    listIterator.previous();
                    cities.add(newCity);
                    return true;
                }
            }

        }
        cities.add(newCity);
        return true;
    }


}
