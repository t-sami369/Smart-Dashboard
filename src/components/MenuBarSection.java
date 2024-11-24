package components;

import javax.swing.*;

public class MenuBarSection{
    public static JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        // File menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.add(new JMenuItem("Save"));
        fileMenu.add(new JMenuItem("Exit"));
        menuBar.add(fileMenu);

        // View menu with checkbox
        JMenu viewMenu = new JMenu("View");
        JCheckBoxMenuItem darkMode = new JCheckBoxMenuItem("Enable Dark Mode");
        viewMenu.add(darkMode);
        menuBar.add(viewMenu);

        // Tools menu with radio buttons
        JMenu toolsMenu = new JMenu("Tools");
        JRadioButtonMenuItem tool1 = new JRadioButtonMenuItem("Tool 1");
        JRadioButtonMenuItem tool2 = new JRadioButtonMenuItem("Tool 2");
        ButtonGroup toolsGroup = new ButtonGroup();
        toolsGroup.add(tool1);
        toolsGroup.add(tool2);
        toolsMenu.add(tool1);
        toolsMenu.add(tool2);
        menuBar.add(toolsMenu);

        return menuBar;
    }
}

