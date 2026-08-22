package EjSucursales;

import java.io.FileNotFoundException;

public class App{
    public static void main(String[]args) throws FileNotFoundException{
        DirectorioSucursales directorio;

        directorio = new DirectorioSucursales();

        cargarArchivo("sucursales.txt", directorio);

        System.out.println("Sucursales");
        directorio.listarSucursales("\n");

        System.out.println("La cantidad de sucursales" + directorio.cantidadSucursales());
        
        directorio = new DirectorioSucursales();
        cargar 


    }
}