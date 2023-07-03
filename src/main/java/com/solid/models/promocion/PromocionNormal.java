package com.solid.models.promocion;

import com.solid.repository.IPromocion;

public class PromocionNormal implements IPromocion {
    @Override
    public String aplicarPromocion() {
        return "Sin promocion, precio normal";
    }
}
