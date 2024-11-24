package components;

import javax.swing.*;
import java.awt.*;

public class Preferences {
    public static JPanel createPreferences() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel themeLabel = new JLabel("Choose Theme:");
        JRadioButton lightTheme = new JRadioButton("Light");
        JRadioButton darkTheme = new JRadioButton("Dark");
        ButtonGroup themeGroup = new ButtonGroup();
        themeGroup.add(lightTheme);
        themeGroup.add(darkTheme);

        JCheckBox showStatusBar = new JCheckBox("Show Status Bar");
        JCheckBox enableNotifications = new JCheckBox("Enable Notifications");

        panel.add(themeLabel);
        panel.add(lightTheme);
        panel.add(darkTheme);
        panel.add(showStatusBar);
        panel.add(enableNotifications);

        return panel;
    }
}

