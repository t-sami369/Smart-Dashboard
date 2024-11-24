import javax.swing.*;
import java.awt.*;
import components.*;

public class SmartDashboard {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Smart Dashboard");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Add MenuBar
        frame.setJMenuBar(MenuBarSection.createMenuBar());

        // Add panels
        frame.add(HeaderSection.createHeader(), BorderLayout.NORTH);
        frame.add(NotesSection.createNotes(), BorderLayout.CENTER);
        frame.add(Preferences.createPreferences(), BorderLayout.WEST);
        frame.add(SliderSection.createSlider(), BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
