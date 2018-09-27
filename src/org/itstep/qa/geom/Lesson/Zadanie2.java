package org.itstep.qa.geom.Lesson;

public class Zadanie2 {
    // Напишите метод , заменяющий в строке все вложенные слова "бяка" на " вырезано цензурой"
    private static String censore(String str) {
        return str.replace("бяка", "вырезано цензурой");
    }

    public boolean censore() {
        return false;
    }
}

