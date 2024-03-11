import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, 
                                    "Please input the first number: ", 
                                    "Input the first number", 
                                    JOptionPane.INFORMATION_MESSAGE);  
        strNum2 = JOptionPane.showInputDialog(null,
                                                "Please input the second number:",
                                                "Input the second number",
                                                JOptionPane.INFORMATION_MESSAGE);   
        Double doubleNum1 = Double.parseDouble(strNum1);
        Double doubleNum2 = Double.parseDouble(strNum2);
        
        // Calculate and display sum of 2 double numbers
        Double sum = doubleNum1 + doubleNum2;
        String strSum = "The sum of 2 numbers " + strNum1 + " and " + strNum2+ ": " + Math.round(sum);
        JOptionPane.showMessageDialog(null, strSum);

        // Calculate and display product of 2 double numbers
        Double product = doubleNum1 * doubleNum2;
        String strPro = "The product of 2 numbers " + strNum1 + " and " + strNum2+ ": " + product;
        JOptionPane.showMessageDialog(null, strPro);

        // Calculate and display quotient of 2 double numbers
        Double quotient = doubleNum1/doubleNum2;
        String strQuo = "The product of 2 numbers " + strNum1 + " and " + strNum2+ ": " + quotient; 
        JOptionPane.showMessageDialog(null, strQuo);
    }
}
