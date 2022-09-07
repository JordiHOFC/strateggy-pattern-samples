package documentos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DocumentoValidatorTest {
    private DocumentoValidator validator;

    @Test
    void aMascaradoCPFDeveSerInvalida() {
        this.validator = new DocumentoValidator(TipoDocumento.CPF, "34472540096");

        assertFalse(
                validator.validar(),
                "A mascara deveria ser invalida"
        );
    }

    @Test
    void aMascaradoCPFDeveSerValida() {
        this.validator = new DocumentoValidator(TipoDocumento.CPF, "284.960.090-33");

        assertTrue(
                validator.validar(),
                "A mascara deveria ser invalida"
        );
    }

    @Test
    void aMascaradoCNPJDeveSerInvalida() {
        this.validator = new DocumentoValidator(TipoDocumento.CNPJ, "21891511000110");

        assertFalse(
                validator.validar(),
                "A mascara deveria ser invalida"
        );

    }

    @Test
    void aMascaradoCNPJDeveSerValida() {
        this.validator = new DocumentoValidator(TipoDocumento.CNPJ, "39.324.633/0001-90");

        assertTrue(
                validator.validar(),
                "A mascara deveria ser invalida"
        );

    }

}