import javax.swing.*;
import java.awt.*;

public class Window_2 extends JFrame {
    public static void main(String[] args) {
        Window_2 myWindow = new Window_2();
        myWindow.setTitle("Просте вікно");
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
