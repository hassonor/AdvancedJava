package JavaHTPE11.ch_3;

import javax.swing.*;

public class Welcome1 {
    public static void main(String[] args) {
        String name, message;
        name = JOptionPane.showInputDialog("Enter your name");
        message = "Your name is: " + name;
        JOptionPane.showMessageDialog(null, message);

        JOptionPane.showMessageDialog(null, "Bad Input", "Error Dialog Test", JOptionPane.ERROR_MESSAGE);
    }
}
