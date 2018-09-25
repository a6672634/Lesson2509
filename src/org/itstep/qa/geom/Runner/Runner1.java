package org.itstep.qa.geom.Runner;

import org.itstep.qa.geom.Treugolnik;

public class Runner1 {
    public static void main(String[] args) {
        Treugolnik treugolnik = new Treugolnik();
        treugolnik.getMultiple(1,2,3);
        treugolnik.getMultiple(1,2);
        treugolnik.getMultiple(1,2,1);
    }
}
