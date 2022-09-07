package documentos;

public class DocumentoValidator {
    public TipoDocumento tipo;
    public String documento;

    public DocumentoValidator(TipoDocumento tipo, String documento) {
        this.tipo = tipo;
        this.documento = documento;
    }

    public boolean validar() {
        if (tipo.equals(TipoDocumento.CPF)) {
            return documento.matches("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}");
        }
        return documento.matches("[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}\\/[0-9]{4}\\-[0-9]{2}");
    }

}
