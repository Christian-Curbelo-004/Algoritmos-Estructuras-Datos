package Ej17;

public class Libro{
    private String titulo;
    private double precioReposicion;
    private String codigo;
    private  int cantidadEjemplaresDisponibles;

    public Libro(String titulo, double precioReposicion, String codigo, int cantidadEjemplaresDisponibles){
        this.titulo = titulo;
        this.precioReposicion = precioReposicion;
        this.codigo = codigo;
        this.cantidadEjemplaresDisponibles = cantidadEjemplaresDisponibles;
    }

    // getters de los atributos privados
    public String getTitulo(){
        return titulo;
    }

    public double getPrecioReposicion(){
        return precioReposicion;
    }
    public String getCodigo(){
        return codigo;
    }
    public int getCantidadEjemeplaresDisponibles(){
        return cantidadEjemplaresDisponibles;
    }

}