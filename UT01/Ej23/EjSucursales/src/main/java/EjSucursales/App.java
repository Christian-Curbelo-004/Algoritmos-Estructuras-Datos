package EjSucursales;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        // Creamos el directorio de sucursales
        DirectorioSucursales directorio = new DirectorioSucursales();

        // Abrimos el archivo ubicado en src/main/resources
        File archivo = new File("src/main/resources/sucursales.txt");

        // Scanner para leer el archivo
        Scanner scanner = new Scanner(archivo);

        // Recorremos el archivo línea por línea
        while (scanner.hasNextLine()) {

            // Cada línea contiene el nombre de una ciudad
            String ciudad = scanner.nextLine().trim();

            // Agregamos la ciudad a la lista
            directorio.agregarSucursal(ciudad);
        }

        // Cerramos el Scanner
        scanner.close();

        // Mostramos las ciudades cargadas
        System.out.println("Sucursales:");

        directorio.listarSucursales("\n");

        // Mostramos la cantidad total
        System.out.println(
            "Cantidad de sucursales: "
            + directorio.cantidadSucursales()
        );
    }
}
