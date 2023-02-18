public class Arbol {
    private Nodo raiz;

    public Arbol() {

    }

    public boolean existe(int busqueda) {
        return existe(this.raiz, busqueda);
    }

    private boolean existe(Nodo n, int busqueda) {
        if (n == null) {
            return false;
        }
        if (n.getDato() == busqueda) {
            return true;
        } else if (busqueda < n.getDato()) {
            return existe(n.getizq(), busqueda);
        } else {
            return existe(n.getder(), busqueda);
        }

    }

    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(Nodo padre, int dato) {
        if (dato > padre.getDato()) {
            if (padre.getder() == null) {
                padre.setder(new Nodo(dato));
            } else {
                this.insertar(padre.getder(), dato);
            }
        } else {
            if (padre.getizq() == null) {
                padre.setizq(new Nodo(dato));
            } else {
                this.insertar(padre.getizq(), dato);
            }
        }
    }

    private void preorden(Nodo n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getizq());
            preorden(n.getder());
        }
    }

    private void inorden(Nodo n) {
        if (n != null) {
            inorden(n.getizq());
            n.imprimirDato();
            inorden(n.getder());
        }
    }

    private void postorden(Nodo n) {
        if (n != null) {
            postorden(n.getizq());
            postorden(n.getder());
            n.imprimirDato();
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
}
