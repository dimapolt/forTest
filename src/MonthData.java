public class MonthData {
    int[] days = new int[10];

    public MonthData() {
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
    }

    public void printMonth(){
        for (int i = 0; i < days.length; i++) {
            System.out.print(i + "-" + days[i]+";");
        }
        System.out.println("");
    }
}
