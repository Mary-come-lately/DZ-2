public class Third {
    public static void main(String[] args) {
        int x = 1;
        int sum = 1;
        do{
            x *= 2;
            sum += x;
            System.out.println(x);
        }while(x < 256);
        System.out.println( "Sum = " + sum);
    }
}
