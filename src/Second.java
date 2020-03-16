public class Second {
    public static void main(String[] args) {
        int hours  = 0;
        int cell = 1;
        while(hours < 24){
            cell *= 2;
            hours += 3;
            System.out.println("hours " + hours + " cells " + cell);

        }
        System.out.println("From " + hours + " will be " + cell + " cells");

    }
}
