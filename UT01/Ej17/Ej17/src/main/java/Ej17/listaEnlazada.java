package Ej17;

// lista enlazada
public class listaEnlazada<T> implements  TDALista<T>{
    Nodo<T> primero; // Referencia al primer nodo de la lista || Si la lista esta vacia, primero vale null
    
    @Override

    // metodo insertar
    public boolean insertar(T dato){ // Metodo para insertar un dato generico en la lista y devuelve true si la insercion se hizo bien
        Nodo<T> nuevoNodo = new Nodo<>(dato); // crea nodo que guarda el dato recibido 
        if(primero == null){ // verifica si la lista esta vacia
            primero = nuevoNodo; // Si está vacía, el nuevo nodo pasa a ser el primer nodo.
        }
        else{ 
            Nodo<T> actual = primero; // Si la lista ya tiene elementos, se crea una referencia auxiliar llamada actual  y apunta al primer nodo
            while (actual.siguiente != null ){ // se recorre la lista mientras exista un nodo luego del nodo actual ||  avanza hasta el ultimo nodo, pero no hasta null
                actual = actual.siguiente; // actual pasa a apuntar al siguiente nodo.
            }
            actual.siguiente = nuevoNodo; // la referencia siguiente apunte al nuevo nodo
        }
        return true; // el dato fue insertado.
    }

    // metodo buscar
    @Override
    public T buscar(Predicate<T> criterio){ // T y no boolean porque devuelve el objeto buscado 
        Nodo<T> actual = primero; // al no estar insertando nada, tengo que crear una referencia auxiliar al primer nodo

        while(actual != null){
            
        }

    }

}