import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        int A = a.nextInt();
        int B = b.nextInt();
        int result = 0;

        for (int i = 0; i < B; i++) {
            result = result + A;
        }
        System.out.println("A * B = " + result);
    }

}
