package documentos.solution.enums;

public class DocumentoValidatorSolution {
    public TipoDocumentoStrategy tipo;
    public String documento;

    public DocumentoValidatorSolution(TipoDocumentoStrategy tipo, String documento) {
        this.tipo = tipo;
        this.documento = documento;
    }

    public boolean validar() {
        return tipo.validate(documento);
    }

}
