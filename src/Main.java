import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        //int[] days = {2,5, 10,15, 2,4, 1,5,1, 19,12,10,13, 3,4, 15,17,10,90,89};
//        Random random = new Random();
//        for (int i=0; i<days.length; i++){
//            days[i]=random.nextInt(10000);
//            System.out.println(days[i]);
//        }
//        int[] days = new int[10];
//        days[0] = 5;
//        days[1] = 2;
//        days[2] = 6;
//
//        days[3] = 10;
//        days[4] = 10;
//        days[5] = 20;
//        days[6] = 1;
//        days[7] = 1;
//
//        days[8] = 10;
//        days[9] = 50;
//
//
        ArrayList<String> arrayList = new ArrayList<>();
         arrayList.add("Болт");
         arrayList.add("Гайка");
         arrayList.add("Гвоздь");
         arrayList.add("Лебедь");
         arrayList.add("Брус");
         arrayList.add("Доска");
         arrayList.add("Молоток");
         arrayList.add("Линейка");
         arrayList.add("Саморез");

        String val;

        HashMap<Integer, String> hm = new HashMap<>();
         for (int i = 0; i < arrayList.size(); i++){
             val = arrayList.get(i);
             hm.put(i,val);
         }


        System.out.println(Integer.valueOf("01"));


    }



    static String getMonthNumber(String monthName){
        char[] monthNameToChar = monthName.toCharArray();
        String monthNumber = String.valueOf(monthNameToChar[6])+String.valueOf(monthNameToChar[7]);
        return monthNumber;
    }

    static String getYearNumber(String monthName) {
        String[] parts = monthName.split(","); // mm,yyyy
        String yearName = parts[1];
        return yearName;
    }


}