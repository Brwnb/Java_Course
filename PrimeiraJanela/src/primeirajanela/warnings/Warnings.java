
package primeirajanela.warnings;


import javax.swing.JOptionPane;

public class Warnings {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        JOptionPane.showMessageDialog(null,"Please, see the message!!!", "message",JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"Warning, Don't do this!!!", "warning",JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"ERROR", "error",JOptionPane.ERROR_MESSAGE);
    }
}
