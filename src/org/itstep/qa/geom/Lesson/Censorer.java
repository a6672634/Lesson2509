package org.itstep.qa.geom.Lesson;

public class  Censorer{
    public Censorer(){}
    // Напишите метод, заменяющий в строке все вложенные слова "бяка" на " вырезано цензурой"
     public String censore(String str) {
        return str.replace("бяка", "вырезано цензурой");
    }

}

