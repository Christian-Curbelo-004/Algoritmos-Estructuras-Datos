package EjSucursales;

import java.util.function.Predicate;

public interface TDALIST<T>{
    public boolean insertar(T dato);
    T buscar(Predicate<T> criterio);

}