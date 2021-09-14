public abstract class Impressora {

    private Imprimivel[] lista = new Imprimivel[0];

    public void imprimirTudo() {
        for (int i = 0; i < lista.length; i++) {
            lista[i].imprimir();
        }
        lista = new Imprimivel[0];
    }

    public void adicionarImprimivel(Imprimivel item) {
        int base = lista.length;
        Imprimivel[] aux = new Imprimivel[base + 1];
        for (int x = 0; x < lista.length; x++) {
            aux[x] = lista[x];
        }
        aux[base] = item;
        lista = aux;
    }
}
