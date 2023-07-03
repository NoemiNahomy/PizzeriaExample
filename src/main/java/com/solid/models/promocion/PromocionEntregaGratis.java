package com.solid.models.promocion;

import com.solid.repository.IPromocion;

public class PromocionEntregaGratis implements IPromocion {
    @Override
    public String aplicarPromocion() {
        return "Entrega gratis";
    }
}
