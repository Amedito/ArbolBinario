public class Nodo {
        private int dato;
        private Nodo izq;
        private Nodo der;

        public Nodo (int dato){
                this.dato=dato;
                this.izq=this.der=null;
        }

        public int getDato(){
                return dato;
        }

        public Nodo getizq() {
                return izq;
        }

        public void setizq(Nodo izq) {
                this.izq = izq;
        }

        public Nodo getder() {
                return der;
        }

        public void setder(Nodo der) {
                this.der = der;
        }

        public void imprimirDato() {
                System.out.print(" "+this.getDato());
        }
}
