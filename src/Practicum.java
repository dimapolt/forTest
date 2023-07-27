import java.util.HashMap;

import java.util.ArrayList;
import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {

        HashMap<Integer, Month> hm = new HashMap<>();

        for (int name : hm.keySet()){
            for (int i = 0; i < hm.get(name).expenses.size(); i++) {
                hm.get(name).expenses.get(i);
            }
        }


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


    public static String checkStatus(String status){
        switch (status) { // Если "IN_PROGRESS" или "DONE" возвращаем их же
            case "IN_PROGRESS":
                return "IN_PROGRESS";
            case "DONE":
                return "DONE";
            default:
                return "NEW"; // Во всех остальных случаях возвращаем "NEW"
        }
    }

    public static String updateEpicStatus(){

        ArrayList<String> al = new ArrayList<>();

        al.add("DONE");
        al.add("DONE");
        al.add("DONE");
        al.add("DONE");
        al.add("DONE");
        al.add("DONE");
        al.add("DONE");
        al.add("DONE");
        al.add("DONE");
        al.add("DONE");




            int newCounter = 0;
            int doneCounter = 0;

            for (String status : al){

                if (status == "NEW") {
                    newCounter++;
                } else if (status == "DONE") {
                    doneCounter++;
                }
            }

            if (newCounter == al.size()){

                return "NEW";
            } else if (doneCounter == al.size()){

                return "DONE";
            } else {

                return "IN_PROGRESS";
            }

    }


}