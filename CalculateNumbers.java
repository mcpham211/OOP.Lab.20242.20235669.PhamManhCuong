import javax.swing.JOptionPane;

public class CalculateNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;
        String result;

        strNum1 = JOptionPane.showInputDialog(null, "Nhập số thứ nhất:", "Input Number", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);

    
        strNum2 = JOptionPane.showInputDialog(null, "Nhập số thứ hai:", "Input Number", JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        String division;
        if (num2 != 0) {
            double quotient = num1 / num2;
            division = String.valueOf(quotient);
        } else {
            division = "Không thể chia cho 0";
        }

        result = "Tổng: " + sum + "\n" +
                 "Hiệu: " + difference + "\n" +
                 "Tích: " + product + "\n" +
                 "Thương: " + division;
                 
        JOptionPane.showMessageDialog(null, result, division, 0);
    }
}