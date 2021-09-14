public class Foto implements Imprimivel{

    private String nome;
    private String tipo;

    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie! \t\t\t\tNome: "+nome+"\tTipo: "+tipo);
    }
}
