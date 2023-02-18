public class Main {
    public static void main(String[] args)
    {
        Arbol arbol = new Arbol();
        arbol.insertar(1);
        arbol.insertar(2);
        arbol.insertar(3);
        arbol.insertar(4);
        arbol.insertar(0);
        System.out.println("Recorriendo inorden:");
        arbol.inorden();
        System.out.println();
        System.out.println("Recorriendo postorden:");
        arbol.postorden();
        System.out.println();
        System.out.println("Recorriendo preorden:");
        arbol.preorden();
        System.out.println();
        System.out.print("¿El 1 esta en el arbol? ");
        System.out.println(arbol.existe(1)); // true
        System.out.print("¿El 7 esta en el arbol? ");
        System.out.println(arbol.existe(7)); // false
        System.out.print("¿El 0 esta en el arbol? ");
        System.out.println(arbol.existe(0)); // true
    }
}
