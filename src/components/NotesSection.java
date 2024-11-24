package components;

import javax.swing.*;

public class NotesSection {
    public static JScrollPane createNotes() {
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        return new JScrollPane(textArea);
    }
}

