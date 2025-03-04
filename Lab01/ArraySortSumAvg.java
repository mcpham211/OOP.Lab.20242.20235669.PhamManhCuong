import java.util.Arrays;
import java.util.Scanner;

public class ArraySortSumAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So phan tu mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Phan tu mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(array));

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / n;

        System.out.println("Tong: " + sum);
        System.out.println("Gia tri trung binh: " + average);
        scanner.close();
    }
}
