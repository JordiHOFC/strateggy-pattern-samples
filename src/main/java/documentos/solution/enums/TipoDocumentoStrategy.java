package documentos.solution.enums;

public enum TipoDocumentoStrategy {
    CPF {
        @Override
        public  boolean validate(String documento) {
            return documento.matches("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}");
        }
    },
    CNPJ {
        @Override
        public boolean validate(String documento){
            return documento.matches("[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}\\/[0-9]{4}\\-[0-9]{2}");
        }
    };

    public abstract boolean validate(String documento);
}
