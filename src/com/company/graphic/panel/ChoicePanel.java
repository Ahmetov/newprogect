package com.company.graphic.panel;

import com.company.graphic.button.ButtonActionListener;
import com.company.graphic.button.ChoiceButton;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Панель с кнопками
 * Содержит в себе ссылки на панель с картинкой и текстом,
 * чтобы текст и картинки можно было менять по нажатиям по кнопкам
 */
public class ChoicePanel extends JPanel {
    private ImagePanel imagePanel;
    private StoryPanel storyPanel;

    public ChoicePanel(ImagePanel imagePanel, StoryPanel storyPanel) {
        this.imagePanel = imagePanel;
        this.storyPanel = storyPanel;

        this.setSize(300, 300);
        this.setLocation(0, 500);
        this.setBackground(Color.RED);
        this.setLayout(new GridLayout(3, 1));
        fillButtons();
    }

    /**
     * Заполнение панели кнопками
     */
    void fillButtons() {
        ChoiceButton button1 = new ChoiceButton("стив");
        button1.addActionListener(
                new ButtonActionListener(imagePanel, storyPanel, "resources/steeve.jpg", "Это стив")
        );
        this.add(button1);

        ChoiceButton button2 = new ChoiceButton("стив");
        button2.addActionListener(
                new ButtonActionListener(imagePanel, storyPanel, "resources/pig.png", "Это свинья")
        );
        this.add(button2);

        ChoiceButton button3 = new ChoiceButton("стив");
        button3.addActionListener(
                new ButtonActionListener(imagePanel, storyPanel, "resources/creeper.jpeg", "Это крипер")
        );
        this.add(button3);
    }
}
