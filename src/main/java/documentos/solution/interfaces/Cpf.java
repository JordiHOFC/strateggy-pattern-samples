package documentos.solution.interfaces;

public class Cpf implements Documento{
    private String numero;

    public Cpf(String numero) {
        this.numero = numero;
    }

    @Override
    public String getNumero() {
        return numero;
    }

    @Override
    public boolean validar() {
        return numero.matches("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}");
    }
}
