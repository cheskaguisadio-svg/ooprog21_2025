import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
           
            String name = JOptionPane.showInputDialog(null, "Enter your name:", "Name Input", JOptionPane.QUESTION_MESSAGE);
            
            
            if (name == null) {
                System.exit(0);
            }
            
           
            int confirm = JOptionPane.showConfirmDialog(null, 
                    "Do you want your name to be shown?", 
                    "Confirm", 
                    JOptionPane.YES_NO_CANCEL_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);
            
            if (confirm == JOptionPane.YES_OPTION) {
                
                JOptionPane.showMessageDialog(null, "Your name is: " + name, "Name Display", JOptionPane.INFORMATION_MESSAGE);
                break; 
            } 
            else if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                
                continue;
            } 
            else {
               
                System.exit(0);
            }
        }
    }
}
