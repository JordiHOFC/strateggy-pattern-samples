package documentos.solution.enums;

import documentos.solution.enums.DocumentoValidatorSolution;
import documentos.solution.enums.TipoDocumentoStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoValidatorSolutionTest {
    private DocumentoValidatorSolution validator;

    @Test
    void aMascaradoCPFDeveSerInvalida() {
        this.validator = new DocumentoValidatorSolution(TipoDocumentoStrategy.CPF, "34472540096");

        assertFalse(
                validator.validar(),
                "A mascara deveria ser invalida"
        );
    }

    @Test
    void aMascaradoCPFDeveSerValida() {
        this.validator = new DocumentoValidatorSolution(TipoDocumentoStrategy.CPF, "284.960.090-33");

        assertTrue(
                validator.validar(),
                "A mascara deveria ser invalida"
        );
    }

    @Test
    void aMascaradoCNPJDeveSerInvalida() {
        this.validator = new DocumentoValidatorSolution(TipoDocumentoStrategy.CNPJ, "21891511000110");

        assertFalse(
                validator.validar(),
                "A mascara deveria ser invalida"
        );

    }

    @Test
    void aMascaradoCNPJDeveSerValida() {
        this.validator = new DocumentoValidatorSolution(TipoDocumentoStrategy.CNPJ, "39.324.633/0001-90");

        assertTrue(
                validator.validar(),
                "A mascara deveria ser invalida"
        );

    }
}