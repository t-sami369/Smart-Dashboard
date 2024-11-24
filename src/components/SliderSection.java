package components;

import javax.swing.*;
import java.awt.*;

public class SliderSection {
    public static JPanel createSlider() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 10, 10));

        JLabel datasetLabel = new JLabel("Select Dataset:");
        String[] datasets = {"Dataset 1", "Dataset 2", "Dataset 3"};
        JComboBox<String> datasetCombo = new JComboBox<>(datasets);

        JLabel sliderLabel = new JLabel("Adjust Parameter:");
        JSlider slider = new JSlider(0, 100, 50);

        panel.add(datasetLabel);
        panel.add(datasetCombo);
        panel.add(sliderLabel);
        panel.add(slider);

        return panel;
    }
}
