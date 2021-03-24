package com.company.graphic;

import com.company.graphic.panel.ChoicePanel;
import com.company.graphic.panel.ImagePanel;
import com.company.graphic.panel.StoryPanel;

import javax.swing.*;

/**
 * Главное окно приложения
 */
public class MainFrame extends JFrame {
    private ImagePanel imagePanel = new ImagePanel();
    private StoryPanel storyPanel = new StoryPanel();
    private ChoicePanel choicePanel;

    public MainFrame() {
        //подключим к ChoicePanel ссылки на другие панели
        choicePanel = new ChoicePanel(imagePanel, storyPanel);

        //настройка окна
        this.setSize(1000,850);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);

        //добавление элементов
        this.add(imagePanel);
        this.add(storyPanel);
        this.add(choicePanel);

        this.setVisible(true);
    }
}
