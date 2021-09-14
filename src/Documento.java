public class Documento implements Imprimivel{

    private String nome;
    private String tipo;

    @Override
    public void imprimir() {
        System.out.println("Sou um documento do Word! \t\tNome: "+nome+"\tTipo: "+tipo);
    }
}
