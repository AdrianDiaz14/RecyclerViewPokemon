package com.company.recyclerview;

public class Elemento {
    int imagen;
    String nombre;
    String descripcion;

    public Elemento(int imagen, String nombre, String descripcion) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Elemento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
