import javax.swing.*;
import java.awt.*;

public class Windows_1 {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame("Simple Window");
        myWindow.setSize(300,500);
        myWindow.setLocation(585,330);
        Container contentPane = myWindow.getContentPane();
        contentPane.setBackground(Color.YELLOW);
        myWindow.setVisible(true);
        System.out.println(myWindow.getLocation());
        System.out.println(myWindow.getTitle());
        System.out.println(myWindow.getBackground());
    }
}
