package com.company;

import com.company.graphic.MainFrame;

/**
 * Игра визуальная новела
 * Шаги:
 * 1) Создание класса FRAME  3х панелей и покрасить их
 * 2) На панель с картинкой добавить картинку
 * 3) На панель с кнопками добавить layout  3 кнопки
 * 4) На панель с текстом добавить текст
 * 5) По нажатию по кнопке менять картинку
 * 6) Написать свой ActionListener
 * 7) Делать ветвления сюжета
 * 8) Добавить статусы и сущность хода игры
 * 9) Проинициализировать все ходы игрока
 * 10) Написать обработчик статуса
 * 11) Написать главное меню
 * 11) Готово
 */
public class Main {

    public static void main(String[] args) {
        //инициализация графического приложения
        new MainFrame();
    }

}
