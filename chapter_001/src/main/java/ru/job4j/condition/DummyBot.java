package ru.job4j.condition;

/**
 * Class Point для вычисления координат.
 * @author Prohorov Mikhail (mailto:gorunovka93@gmail.com)
 * @since 11.10.2018
 * @version $Id$
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl =  "До скорой встречи.";
        }
        return rsl;
    }
}