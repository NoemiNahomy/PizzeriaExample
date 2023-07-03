package com.solid.models.promocion;

import com.solid.repository.IPromocion;

public class Promocion2x1 implements IPromocion {

    @Override
    public String aplicarPromocion() {
        return "Se aplico la promocion 2x1";
    }
}
