package Ej17;
public class Biblioteca{
    private TDALista<Libro> catalogo;

    public Biblioteca(){
        catalogo = new listaEnlazada<Libro>();
    }

    public void incorporarLibro(Libro libro){
        catalogo.insertar(libro);
    }

    public Libro buscarLibro(String codigo){
       return catalogo.buscar(libro -> libro.getCodigo().equals(codigo));
    }
    
    public boolean agregarEjemplares(String codigo, int cantidad){
        Libro libro = buscarLibro(codigo);

        if(libro != null){
            libro.insertar(cantidad);
            return true;

        }
        return false;
    }
    
    public int registrarPrestamo(String codigo, int cantidad){
        

    }

}