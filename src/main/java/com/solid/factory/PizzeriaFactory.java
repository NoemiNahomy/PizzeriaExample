package com.solid.factory;

import com.solid.repository.IPizza;
import org.json.JSONException;

public abstract class PizzeriaFactory {
    public abstract IPizza crearPedidoPizza(String codigo) throws JSONException;

}
