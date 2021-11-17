package abb;

public class ArbolBinarioBusqueda {
   private Nodo raiz;

   public ArbolBinarioBusqueda() {
       raiz = null;
   }
   /*Arbol esta vacio */
    public  boolean estaVacio(){
        return raiz == null;
    }

    /*metodo recursivo para insertar un nodo a nuestra abb*/
private void insertar(Nodo padre, Nodo hijo, int dato){
    if(hijo == null){//caso base
        Nodo nuevo = new Nodo(null, dato, null);
         if (dato >= padre.getDato()){
            padre.setDerecho(nuevo);
         }else {
             padre.setIzquierdo(nuevo);
         }

    }else {// llamada recursiva

        if (dato >= padre.getDato()){
            insertar(hijo, hijo.getDerecho(),dato);
        }else {
            insertar(hijo, hijo.getIzquierdo(),dato);
        }

    }

}

// Metodo auxiliar para insertar un nuevo nodo al abb

    public void insetar(int dato){
    if (estaVacio()){
        Nodo nuevo = new Nodo(null, dato, null);
        raiz = nuevo;

        }else {
        if (dato >= raiz.getDato()){
            insertar(raiz,raiz.getDerecho() ,dato);
        }else {
            insertar(raiz,raiz.getIzquierdo() ,dato);
        }
    }
    }


    /*Metodo recursivo para recorrer / mostrar el arbol en Orden*/

    private void motrarInOrden(Nodo nodo){
        if (nodo == null) {  //caso base

        }else { //llamada recursiva

            motrarInOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + "  ");
            motrarInOrden(nodo.getDerecho());

        }
    }

    /*Metodo auxiliar  para recorrer / mostrar el arbol InOrden*/

    public void  mostrarInOrden(){
        Nodo temp = raiz;
        motrarInOrden(raiz);
        System.out.println();
    }
}
