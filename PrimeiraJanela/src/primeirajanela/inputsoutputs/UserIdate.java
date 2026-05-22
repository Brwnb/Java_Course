
package primeirajanela.inputsoutputs;


import javax.swing.JOptionPane;

public class UserIdate {

   
    public static void main(String args[]) {
       
         
        String name = JOptionPane.showInputDialog("Type your name: ");
        String age = JOptionPane.showInputDialog("Type your age: ");
        JOptionPane.showMessageDialog(null, "Hello " + name + ", Welcome!" + "\n" 
                + "Your age is " + age + "." + "\n" + "You can access the system!!");
        
        int resposta = JOptionPane.showConfirmDialog(null, "Do you want to continue");
        
        if(resposta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "You choose to continue");
        }else{
            JOptionPane.showMessageDialog(null, "You choose to stop");
        }
     
    }
}
