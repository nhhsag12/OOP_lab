import javax.swing.JOptionPane;
import java.lang.Math;

public class EquationSolver {
    public static void firstDegreeEquation(){
        JOptionPane.showMessageDialog(null, "First-degree equation: ax + b = 0:");
        String a, b;
        a = JOptionPane.showInputDialog(null, "Input a: ");
        b = JOptionPane.showInputDialog(null, "Input b: ");
        Double douA = Double.parseDouble(a);
        Double douB = Double.parseDouble(b);
        if(douA==0){
            if(douB==0){
                JOptionPane.showMessageDialog(null, "Infinite solution");
            }else{
                JOptionPane.showMessageDialog(null, "No solution");
            }
        }else{
            String solution = "The solution is: " + (-douB/douA);
            JOptionPane.showMessageDialog(null, solution);
        }
    }

    public static void secondDegreeEquation(){
        JOptionPane.showMessageDialog(null, "Second-degree equation: a^2 + bx + c = 0:");
        String a, b, c;
        a = JOptionPane.showInputDialog(null, "Input a: ");
        b = JOptionPane.showInputDialog(null, "Input b: ");
        c = JOptionPane.showInputDialog(null, "Input c: ");
        Double douA = Double.parseDouble(a);
        Double douB = Double.parseDouble(b);
        Double douC = Double.parseDouble(c);
        Double delta = douB*douB - 4*douA*douC;
        if(delta<0){
            JOptionPane.showMessageDialog(null, "No solution");
        }else if(delta==0){
            String sol = "The solution is: " + -douB/(2*douA);
            JOptionPane.showMessageDialog(null, sol);
        }else{
            Double x1 = (-douB - Math.sqrt(delta))/(2*douA);
            Double x2 = (-douB + Math.sqrt(delta))/(2*douA);
            String sol = "The first solution is: " + x1 +"\nThe second solution is: " + x2;
            JOptionPane.showMessageDialog(null,sol);
        }
    }

    public static void systemFirstDegreeEquation(){
        JOptionPane.showMessageDialog(null, """
            System of first-degree equation:
            a11*x1 + a12*x2=b1
            a21*x1 + a22*x2=b2
        """);
        String a11, a12, a21, a22, b1, b2;
        a11 = JOptionPane.showInputDialog(null, "Input a11: ");
        a12 = JOptionPane.showInputDialog(null, "Input a12: ");
        b1 = JOptionPane.showInputDialog(null, "Input b1: ");
        a21 = JOptionPane.showInputDialog(null, "Input a21: ");
        a22 = JOptionPane.showInputDialog(null, "Input a22: ");
        b2 = JOptionPane.showInputDialog(null, "Input b2: ");
        Double douA11 = Double.parseDouble(a11);
        Double douA12 = Double.parseDouble(a12);
        Double douA21 = Double.parseDouble(a21);
        Double douA22 = Double.parseDouble(a22);
        Double douB1 = Double.parseDouble(b1);
        Double douB2 = Double.parseDouble(b2);

        Double determinant = douA11 * douA22 - douA12 * douA21;
        if(determinant==0){
            if(douA11 * douB2 == douA21 * douB1 && douA12 *douB2 == douA22 * douB1){
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
            }else{
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        }else{
            Double x1 = (douA22 * douB1 - douA12 * douB2)/determinant;
            Double x2 = (douA11 * douB2 - douA21 * douB1)/determinant;
            JOptionPane.showMessageDialog(null, "The solution of the system is x1 = " + x1 + " and x2 = " + x2);
        }
    }
    public static void main(String[] args) {
        Double douChoice;
        do{
            String menu = """
                    1) The first-degree equation
                    2) The second-degree equation
                    3) The system of first-degree equations
                    0) Exit
                    """;
            String choice = JOptionPane.showInputDialog(null, menu, "Menu", JOptionPane.INFORMATION_MESSAGE);
            douChoice = Double.parseDouble(choice);
            switch (choice) {
                case "1":
                    firstDegreeEquation();
                    break;
                case "2": 
                    secondDegreeEquation();
                    break;
                case "3":
                    systemFirstDegreeEquation();
                    break;
                default:
                    break;
            }
        }while(douChoice > 3.0 || douChoice < 0);
    }
}
