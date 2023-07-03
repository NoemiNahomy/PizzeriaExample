package com.solid.services;

import com.solid.factory.PedidoPizzaFactory;
import com.solid.factory.PizzeriaFactory;
import com.solid.models.pizza.PizzaCarnivora;
import com.solid.models.pizza.PizzaMargarita;
import com.solid.models.pizza.PizzaPersonalizada;
import com.solid.models.promocion.Promocion2x1;
import com.solid.models.promocion.PromocionEntregaGratis;
import com.solid.models.promocion.PromocionNormal;
import com.solid.repository.IPizza;
import com.solid.repository.IPromocion;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private static OrderService instance;
    public IPromocion getPromocionDay(String day){
        IPromocion promotion;
        switch( day )
        {
            case "MARTES", "MIERCOLES":
                promotion = new Promocion2x1();
                break;
            case "JUEVES":
                promotion = new PromocionEntregaGratis();
                break;
            default:
                promotion = new PromocionNormal();
                break;
        }
        return promotion;
    }

    private OrderService() {
    }

    public static OrderService getInstance() {
        if (instance == null) {
            instance = new OrderService();
        }
        return instance;
    }

    public JSONObject getPedirPizza(String code,String day) throws JSONException {

        PizzeriaFactory creator = new PedidoPizzaFactory();
        IPizza pizza = creator.crearPedidoPizza( code );

        PromocionContext context;
        context = new PromocionContext(getPromocionDay( day ));

        JSONObject json = new JSONObject();
        json.put("pizza",prepararPizza(pizza));
        json.put("promocion",context.procesar());

        return json;

    }

    public JSONObject prepararPizza(IPizza pizza ) throws JSONException {
        JSONObject json = new JSONObject();
        if(pizza instanceof PizzaMargarita){
            PizzaMargarita margarita = new PizzaMargarita();
            margarita.preparar();
            margarita.agregarMaza();
            margarita.agregarQueso();
            margarita.agregarTomate();
            margarita.agregarGramosCarne(100);
            json.put("nombre:", margarita.getMargarita().getNombre());
            json.put("detalle:",  margarita.getMargarita().toString());
        } else if (pizza instanceof PizzaCarnivora) {
            PizzaCarnivora carnivora = new PizzaCarnivora();
            carnivora.preparar();
            carnivora.agregarMaza();
            carnivora.agregarQueso();
            carnivora.agregarTomate();
            carnivora.agregarGramosCarne(1000);
            json.put("nombre:", carnivora.getCarnivora().getNombre());
            json.put("detalle:",  carnivora.getCarnivora().toString());
        }else {
            PizzaPersonalizada personalizada = new PizzaPersonalizada();
            personalizada.preparar();
            personalizada.agregarMaza();
            personalizada.agregarQueso();
            personalizada.agregarTomate();
            personalizada.agregarGramosCarne(1500);
            json.put("nombre:", personalizada.getPersonalizada().getNombre());
            json.put("detalle:",  personalizada.getPersonalizada().toString());
        }
        return json;
    }
}
