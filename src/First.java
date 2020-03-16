public class First {
    public static void main(String[] args) {
        int days = 1;
        float distance = 10;
        while (days < 7){
            System.out.println("Day - " + days + "   Distance = " + distance  + " km");
            distance += distance * 10/100;
            days++;
        }
        System.out.println("The final Distance on " + days + " Day is " + distance + " km");
    }
}
