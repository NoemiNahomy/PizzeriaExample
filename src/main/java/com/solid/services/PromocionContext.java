package com.solid.services;

import com.solid.repository.IPromocion;

public class PromocionContext {
    private IPromocion promocionStrategia;

    public PromocionContext(IPromocion promotionStrategy) {

        this.promocionStrategia = promotionStrategy;
    }

    public String procesar() {

        return promocionStrategia.aplicarPromocion();
    }
}
