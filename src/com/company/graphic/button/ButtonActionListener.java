package com.company.graphic.button;

import com.company.graphic.panel.ChoicePanel;
import com.company.graphic.panel.ImagePanel;
import com.company.graphic.panel.StoryPanel;
import com.company.logic.GameStatus;
import com.company.logic.StoryInitializer;
import com.company.logic.model.GameTurn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Обработка событий кнопки
 * При выборе действий (нажатию кнопки) должна меняться картинка игры и текст истории
 */
public class ButtonActionListener implements ActionListener {
    private ImagePanel imagePanel;
    private StoryPanel storyPanel;
    //Статус по нажатию
    private GameStatus gameStatus;

    private String imagePath;
    private String storyText;

    public ButtonActionListener(ImagePanel imagePanel, StoryPanel storyPanel, String imagePath, String storyText) {
        this.imagePanel = imagePanel;
        this.storyPanel = storyPanel;
        this.imagePath = imagePath;
        this.storyText = storyText;
    }

    public ButtonActionListener(ImagePanel imagePanel, StoryPanel storyPanel, GameStatus gameStatus) {
        this.imagePanel = imagePanel;
        this.storyPanel = storyPanel;
        this.gameStatus = gameStatus;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (GameTurn turn : StoryInitializer.turns) {
            if (turn.getGameStatus() == gameStatus) {
                imagePanel.setImage("resources/" + turn.getImagePath());
                storyPanel.changeText(turn.getStoryText());
                break;
            }
        }
    }
}
