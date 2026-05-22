
package primeirajanela.inputsoutputs.soma;

/**
 *
 */

import javax.swing.JOptionPane;

public class Soma {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String value1 = JOptionPane.showInputDialog("Type one Value:");
        String value2 = JOptionPane.showInputDialog("Type another Value:");
        
        double num1 = Double.parseDouble(value1);
        double num2 = Double.parseDouble(value2);
        
        JOptionPane.showMessageDialog(null, "Sum result: " + (num1 + num2));
    }
}
