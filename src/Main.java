import abb.ArbolBinarioBusqueda;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();


        // insetar elementos
        abb.insetar(3);
        abb.insetar(2);
        abb.insetar(4);
        abb.insetar(1);
        abb.insetar(3);
        abb.insetar(5);
        abb.insetar(7);
        abb.insetar(6);

        //recorremos/mostramos los elementos del arbol InOrden
        abb.mostrarInOrden();

    }
}
