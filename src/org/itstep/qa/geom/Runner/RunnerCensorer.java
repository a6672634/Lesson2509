package org.itstep.qa.geom.Runner;

import org.itstep.qa.geom.Lesson.Censorer;

public class RunnerCensorer {
    public static void main(String[] args) {
        Censorer censorer = new Censorer();
        System.out.println(censorer.censore("бяка лдьвлдьафыа льда"));
    }
}

