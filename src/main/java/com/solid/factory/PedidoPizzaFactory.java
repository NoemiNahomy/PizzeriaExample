package com.solid.factory;

import com.solid.models.pizza.PizzaMargarita;
import com.solid.models.pizza.PizzaCarnivora;
import com.solid.models.pizza.PizzaPersonalizada;
import com.solid.repository.IPizza;
import org.json.JSONException;

public class PedidoPizzaFactory extends PizzeriaFactory {

    @Override
    public IPizza crearPedidoPizza(String code) throws JSONException {
        IPizza pizza;
        switch( code )
        {
            case "margarita":
                pizza = new PizzaMargarita();
                break;
            case "carnivora":
                pizza = new PizzaCarnivora();
                break;
            case "personalizada":
                pizza = new PizzaPersonalizada();
                break;
            default:
                pizza = null;
        }
        return pizza;
    }

}
