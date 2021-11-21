package model;

import lombok.Getter;

public class servicioCliente {
    private @Getter String CELULAR;

    public servicioCliente(String CELULAR) {
        this.CELULAR = CELULAR;
    }
}
