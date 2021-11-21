package model;

import lombok.Getter;

public class portafolio {
    private @Getter String DATE;
    private @Getter String PORTAFOLIO;
    private @Getter float NOMINAL;
    private @Getter float PRECIO;
    private @Getter float TOTAL;

    public portafolio(String DATE, String PORTAFOLIO, float NOMINAL, float PRECIO, float TOTAL) {
        this.DATE = DATE;
        this.PORTAFOLIO = PORTAFOLIO;
        this.NOMINAL = NOMINAL;
        this.PRECIO = PRECIO;
        this.TOTAL = TOTAL;
    }
}
