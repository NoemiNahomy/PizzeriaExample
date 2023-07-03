package com.solid.models.pizza;

import com.solid.repository.IPizza;
import com.solid.repository.Preparar;
import org.json.JSONException;
import org.json.JSONObject;

public class PizzaPersonalizada implements IPizza, Preparar {
    Pizza personalizada;

    public Pizza getPersonalizada() {
        return personalizada;
    }

    public void setPersonalizada(Pizza personalizada) {
        this.personalizada = personalizada;
    }

    @Override
    public String preparar() throws JSONException {
        personalizada = new Pizza();
        personalizada.setNombre("Personalizada");
        JSONObject json = new JSONObject();
        json.put("Ingredientes",personalizada.toString());
        return json.toString();
    }

    @Override
    public void reset() {
        personalizada = new Pizza();
    }

    @Override
    public void agregarQueso() {
        personalizada.setQueso(true);

    }

    @Override
    public void agregarMaza() {
        personalizada.setMaza(true);
    }

    @Override
    public void agregarTomate() {
        personalizada.setTomate(true);
    }


    @Override
    public void agregarGramosCarne(int gramos) {
        personalizada.setGramosCarne(gramos);
    }

    @Override
    public void agregarChorizo() {
        personalizada.setChorizo(true);
    }
}
