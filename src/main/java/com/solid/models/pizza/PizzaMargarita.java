package com.solid.models.pizza;

import com.solid.repository.IPizza;
import com.solid.repository.Preparar;
import org.json.JSONException;
import org.json.JSONObject;

public class PizzaMargarita implements IPizza, Preparar {
    Pizza margarita;

    public Pizza getMargarita() {
        return margarita;
    }

    public void setMargarita(Pizza margarita) {
        this.margarita = margarita;
    }

    @Override
    public String preparar() throws JSONException {
        margarita = new Pizza();
        margarita.setNombre("Margarita");
        JSONObject json = new JSONObject();
        json.put("Ingredientes",margarita.toString());
        return json.toString();
    }

    @Override
    public void reset() {
      margarita = new Pizza();
    }

    @Override
    public void agregarQueso() {
        margarita.setQueso(true);

    }

    @Override
    public void agregarMaza() {
        margarita.setMaza(true);
    }

    @Override
    public void agregarTomate() {
        margarita.setTomate(true);
    }


    @Override
    public void agregarGramosCarne(int gramos) {
        margarita.setGramosCarne(gramos);
    }

    @Override
    public void agregarChorizo() {
        margarita.setChorizo(true);
    }
}
