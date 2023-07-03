package com.solid.models.pizza;

import com.solid.repository.IPizza;
import com.solid.repository.Preparar;
import org.json.JSONException;
import org.json.JSONObject;

public class PizzaCarnivora implements IPizza , Preparar {
    Pizza carnivora;

    public Pizza getCarnivora() {
        return carnivora;
    }

    public void setCarnivora(Pizza carnivora) {
        this.carnivora = carnivora;
    }

    @Override
    public String preparar() throws JSONException {
        carnivora = new Pizza();
        carnivora.setNombre("Carnivora");
        JSONObject json = new JSONObject();
        json.put("Ingredientes",carnivora.toString());
        return json.toString();
    }

    @Override
    public void reset() {
        carnivora = new Pizza();
    }

    @Override
    public void agregarQueso() {
        carnivora.setQueso(true);

    }

    @Override
    public void agregarMaza() {
        carnivora.setMaza(true);
    }

    @Override
    public void agregarTomate() {
        carnivora.setTomate(true);
    }


    @Override
    public void agregarGramosCarne(int gramos) {
        carnivora.setGramosCarne(gramos);
    }

    @Override
    public void agregarChorizo() {
        carnivora.setChorizo(true);
    }
}
