package com.company.logic;

import com.company.graphic.button.ButtonActionListener;
import com.company.graphic.button.ChoiceButton;
import com.company.graphic.panel.ImagePanel;
import com.company.graphic.panel.StoryPanel;
import com.company.logic.model.GameTurn;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Инициализация всех ходов
 * Делается до логики игры
 */
public class StoryInitializer {
    private ImagePanel imagePanel;
    private StoryPanel storyPanel;
    public static ArrayList<GameTurn> turns = new ArrayList<>();

    public StoryInitializer(ImagePanel imagePanel, StoryPanel storyPanel) {
        this.imagePanel = imagePanel;
        this.storyPanel = storyPanel;
        this.initializeStory();
    }

    //Инициализация всех ходов
    public void initializeStory() {
        //Стартовый ход
        GameTurn start = new GameTurn();
        start.setGameStatus(GameStatus.START);
        start.setImagePath("wake.jpg");
        start.setStoryText("Вы проснулись!\n" +
                "Вам не очень хорошо и вы хотите спать\n" +
                "Что будете делать?");
        start.addChoiceButton(
                new ChoiceButton("Проснуться", new ButtonActionListener(
                        imagePanel,
                        storyPanel,
                        GameStatus.WAKING_UP))
        );
        start.addChoiceButton(
                new ChoiceButton("Попить", new ButtonActionListener(
                        imagePanel,
                        storyPanel,
                        GameStatus.DRINK_WATER
                ))
        );
        //Попить воды
        GameTurn drinkWater = new GameTurn();
        drinkWater.setGameStatus(GameStatus.DRINK_WATER);
        drinkWater.setStoryText("Вы немного попили воды\n" +
                "Но это был уксус...\n" +
                "Вы отравились и вам очень плохо\n" +
                "Что будем делать?");
        drinkWater.addChoiceButton(
                new ChoiceButton("Выпить таблетку", new ButtonActionListener(
                        imagePanel,
                        storyPanel,
                        GameStatus.TAKE_PILL
                ))
        );
        drinkWater.addChoiceButton(
                new ChoiceButton("Забить", new ButtonActionListener(
                        imagePanel,
                        storyPanel,
                        GameStatus.DEAD
                ))
        );

        //Добавление ходов в список
        turns.add(start);
        turns.add(drinkWater);
    }
}
