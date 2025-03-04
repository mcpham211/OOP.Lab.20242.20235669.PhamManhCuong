import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So hang ma tran: ");
        int rows = scanner.nextInt();
        System.out.print("So cot ma tran: ");
        int cols = scanner.nextInt();

        // Khai báo hai ma trận và ma trận kết quả
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] resultMatrix = new int[rows][cols];

        // Nhập giá trị cho ma trận thứ nhất
        System.out.println("Gia tri ma tran thu nhat:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Gia tri tai hang " + (i + 1) + ", cột " + (j + 1) + ": ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Nhập giá trị cho ma trận thứ hai
        System.out.println("Gia tri ma tran thu hai:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Gia tri tai hang " + (i + 1) + ", cột " + (j + 1) + ": ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Cộng hai ma trận
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // In ma trận kết quả
        System.out.println("Ma tran sau khi cong:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Đóng scanner
        scanner.close();
    }
}