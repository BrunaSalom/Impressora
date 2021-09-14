import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Contrato contrato1 = new Contrato();
        Foto foto1 = new Foto();
        Documento documento1 = new Documento();

        Impressora print1 = new Impressora(){
            @Override
            public void imprimirTudo(){
                super.imprimirTudo();
            }
        };

        print1.adicionarImprimivel(contrato1);
        print1.adicionarImprimivel(foto1);
        print1.adicionarImprimivel(documento1);

        print1.imprimirTudo();

    }
}
