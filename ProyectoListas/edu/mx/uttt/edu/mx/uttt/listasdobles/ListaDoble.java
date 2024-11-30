package edu.mx.uttt.listasdobles;

public class ListaDoble {

    private String nombreLista;
    private NodoListaDoble primerNodo;
    private NodoListaDoble ultimoNodo;

    public ListaDoble() {
        this("Mi Lista Doble");
    }

    public ListaDoble(String nombreLista) {
        this.nombreLista = nombreLista;
        primerNodo = ultimoNodo = null;
    }

    public boolean estaVacia() {
        return primerNodo == null;

        // if (primerNodo == null) {
        // return true;
        // } else {
        // return false;
        // }

        // return primerNodo == null ? true : false;
    }

    public void insertarAlFrente(int dato) {
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
            primerNodo = ultimoNodo = new NodoListaDoble(dato);
            return;
        } else {
            primerNodo.anteriorNodo = new NodoListaDoble(null, dato, primerNodo);
            primerNodo = primerNodo.anteriorNodo;
        }
    }

    public void insertarAlFinal(int dato) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoListaDoble(dato);
            return;
        }

        NodoListaDoble nuevoNodo = new NodoListaDoble(null, dato, ultimoNodo);
        ultimoNodo.sigNodo = nuevoNodo;
        ultimoNodo = nuevoNodo;
    }

    public int eliminarDelFrente() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return -999;
        }

        int datoAEliminar = primerNodo.dato;

        // Si solo hay un nodo
        if (primerNodo == ultimoNodo) {
            primerNodo = ultimoNodo = null;
        } else {
            primerNodo = primerNodo.sigNodo;
            primerNodo.anteriorNodo = null;
        }

        return datoAEliminar;
    }

    public int eliminarDelFinal() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return -999;
        }

        int datoAEliminar = ultimoNodo.dato;

        // Si solo hay un nodo
        if (primerNodo == ultimoNodo) {
            primerNodo = ultimoNodo = null;
        } else {
            ultimoNodo = ultimoNodo.anteriorNodo;
            ultimoNodo.sigNodo = null;
        }

        return datoAEliminar;
    }

    public void insertarEnPosicion(int dato, int posicion) {
        if (posicion < 0) {
            System.out.println("La posición no puede ser negativa.");
            return;
        }

        if (posicion == 0) {
            insertarAlFrente(dato);
            return;
        }

        NodoListaDoble actual = primerNodo;
        int contador = 0;

        // Navegar hasta la posición anterior
        while (actual != null && contador < posicion - 1) {
            actual = actual.sigNodo;
            contador++;
        }

        if (actual == null) {
            System.out.println("La posición es mayor que el tamaño de la lista.");
        } else {
            NodoListaDoble nuevoNodo = new NodoListaDoble(actual.sigNodo, dato, actual);

            if (actual.sigNodo != null) {
                actual.sigNodo.anteriorNodo = nuevoNodo;
            } else {
                ultimoNodo = nuevoNodo; // Actualizar último nodo si se inserta al final
            }

            actual.sigNodo = nuevoNodo;
        }
    }

    public int eliminarEnPosicion(int posicion) {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return -999;
        }

        if (posicion < 0) {
            System.out.println("La posición no puede ser negativa.");
            return -999;
        }

        if (posicion == 0) {
            return eliminarDelFrente();
        }

        NodoListaDoble actual = primerNodo;
        int contador = 0;

        // Navegar hasta el nodo en la posición
        while (actual != null && contador < posicion) {
            actual = actual.sigNodo;
            contador++;
        }

        if (actual == null) {
            System.out.println("La posición es mayor que el tamaño de la lista.");
            return -999;
        }

        int datoAEliminar = actual.dato;

        if (actual.sigNodo != null) {
            actual.sigNodo.anteriorNodo = actual.anteriorNodo;
        } else {
            ultimoNodo = actual.anteriorNodo; // Actualizar último nodo si se elimina el final
        }

        if (actual.anteriorNodo != null) {
            actual.anteriorNodo.sigNodo = actual.sigNodo;
        }

        return datoAEliminar;
    }

    public int buscar(int dato) {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return -1;
        }

        NodoListaDoble actual = primerNodo;
        int posicion = 0;

        while (actual != null) {
            if (actual.dato == dato) {
                return posicion;
            }
            actual = actual.sigNodo;
            posicion++;
        }

        System.out.println("El dato no se encontró en la lista.");
        return -1;
    }

    public void ordenar() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        boolean huboCambio;

        do {
            NodoListaDoble actual = primerNodo;
            huboCambio = false;

            while (actual != null && actual.sigNodo != null) {
                if (actual.dato > actual.sigNodo.dato) {
                    // Intercambiar valores
                    int temp = actual.dato;
                    actual.dato = actual.sigNodo.dato;
                    actual.sigNodo.dato = temp;
                    huboCambio = true;
                }
                actual = actual.sigNodo;
            }
        } while (huboCambio);
    }

    public void imprimir(boolean tipo) {
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
            return;
        } else {
            if (tipo == true) {
                NodoListaDoble aux = primerNodo;
                while (aux != null) {
                    System.out.print(aux.dato + " -> ");
                    aux = aux.sigNodo;
                }
                System.out.println("");
            } else {
                NodoListaDoble aux = ultimoNodo;
                while (aux != null) {
                    System.out.print(aux.dato + " <- ");
                    aux = aux.anteriorNodo;
                }
                System.out.println("");
            }
        }

    }

}
