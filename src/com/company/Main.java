package com.company;

import com.company.graphic.MainFrame;
import com.company.logic.GameStatus;

import javax.swing.*;

/**
 * Игра визульная новела
 * Шаги:
 * 1) Создание класса FRAME  3х панелей и покрасить их
 * 2) На панель с картикой добавить картинку
 * 3) На панель с кнопками добавить layout  3 кнопки
 * 4) На панель с текстом добавить текст
 * 5) По нажатию по кнопке менять картинку
 * 6) Написать свой ActionListener
 * 7) Делать ветвления сюжета
 * 8) Добавить статусы и сущность хода игры
 * 9) Проинициализировать все ходы игрока
 * 10) Написать обработчик статуса
 * 11) Готово
 */
public class Main {
    //Текущее состояние игры
    //по ходу игры (по нажатиям по кнопкам) состояние будет меняться
    public static GameStatus gameStatus = GameStatus.START;

    public static void main(String[] args) {
        //инициализация графического приложения
        new MainFrame();
    }

}
