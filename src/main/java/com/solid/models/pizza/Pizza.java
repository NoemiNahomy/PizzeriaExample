package com.solid.models.pizza;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pizza {

    private String nombre;
    private boolean Maza;
    private boolean chorizo;
    private boolean queso;
    private int gramosCarne;

    private boolean tomate;
    public Pizza() {

    }

    public Pizza(String nombre) {
        this.nombre = nombre;
    }

    public Pizza(String nombre, boolean maza, boolean chorizo, boolean queso, int gramosCarne) {
        this.nombre = nombre;
        Maza = maza;
        this.chorizo = chorizo;
        this.queso = queso;
        this.gramosCarne = gramosCarne;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nombre='" + nombre + '\'' +
                ", Maza=" + Maza +
                ", chorizo=" + chorizo +
                ", queso=" + queso +
                ", gramosCarne=" + gramosCarne +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public Pizza setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public boolean isMaza() {
        return Maza;
    }

    public Pizza setMaza(boolean masa) {
        this.Maza = Maza;
        return this;
    }

    public boolean isTomate() {
        return tomate;
    }

    public Pizza setTomate(boolean tomate) {
        this.tomate = tomate;
        return this;
    }

    public boolean isChorizo() {
        return chorizo;
    }

    public Pizza setChorizo(boolean chorizo) {
        this.chorizo = chorizo;
        return this;
    }

    public int getGramosCarne() {
        return gramosCarne;
    }

    public Pizza setGramosCarne(int gramosCarne) {
        this.gramosCarne = gramosCarne;
        return this;
    }

    public boolean isQueso() {
        return queso;
    }

    public Pizza setQueso(boolean queso) {
        this.queso = queso;
        return this;
    }


}
