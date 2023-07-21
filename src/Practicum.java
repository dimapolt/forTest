import java.util.Arrays;
import java.util.Objects;

import static java.lang.Math.abs;
import java.util.ArrayList;

public class Practicum {
    public static void main(String[] args) {

        System.out.println("Удалил отсюда массив");

        int[] days = new int[10];
        days[0] = 5;
        days[1] = 2;
        days[2] = 6;

        days[3] = 10;
        days[4] = 10;
        days[5] = 20;
        days[6] = 1;
        days[7] = 1;

        days[8] = 10;
        days[9] = 50;

        System.out.println("days = " + days);



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

        System.out.println(arrayList);


//
//        List<String> list = Arrays.asList();
//        List<String> list2 = list;
//
//
//         String choice = new String();
//         choice = "42";
//
//         switch (choice){
//             case "1":
//                 System.out.println("1");
//                 break;
//             case "2":
//                 System.out.println("2");
//                 break;
//             case "3":
//                 System.out.println("3");
//                 break;
//             case "4":
//                 System.out.println("4");
//                 break;
//             case "5":
//                 System.out.println("5");
//                 break;
//             case "6":
//                 System.out.println("6");
//                 break;
//             default:
//                 System.out.println("Default");
//         }

//        OrdersManager ordersManager = new OrdersManager();
//
//        ordersManager.printAllOrders();
//        System.out.println("Всего заказов на сумму: " + ordersManager.getOrdersSum());
//
//        String maxOrderCustomerName = ordersManager.getMaxOrderCustomerName();
//        System.out.println("Самая большая сумма заказов у " + maxOrderCustomerName);
//        ordersManager.printCustomerOrders(maxOrderCustomerName);
//
//        ordersManager.removeUnprofitableOrders();







    }

    static String getYearNumber1(String yearName){
        char[] yearNameToChar = yearName.toCharArray();
        String yearNumber = String.valueOf(yearNameToChar[2]) + String.valueOf(yearNameToChar[3]) +
                String.valueOf(yearNameToChar[4]) + String.valueOf(yearNameToChar[5]);
        return yearNumber;
    }
    static String getYearNumber2(String yearName){
        return yearName.substring(2,6);
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