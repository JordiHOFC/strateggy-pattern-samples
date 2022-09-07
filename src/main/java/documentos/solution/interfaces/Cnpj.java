package documentos.solution.interfaces;

public class Cnpj implements Documento{
    private String numero;

    public Cnpj(String numero) {
        this.numero = numero;
    }

    @Override
    public String getNumero() {
        return numero;
    }

    @Override
    public boolean validar() {
        return numero.matches("[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}\\/[0-9]{4}\\-[0-9]{2}");
    }
}
