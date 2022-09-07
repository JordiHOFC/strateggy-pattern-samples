package documentos.solution.interfaces;

import documentos.solution.enums.DocumentoValidatorSolution;
import documentos.solution.enums.TipoDocumentoStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoValidatorInterfaceSolutionTest {
    private DocumentoValidatorInterfaceSolution validator;

    @BeforeEach
    void setUp() {
        this.validator = new DocumentoValidatorInterfaceSolution();
    }

    @Test
    void aMascaradoCPFDeveSerInvalida() {


        assertFalse(
                validator.validate(new Cpf("34472540096")),
                "A mascara deveria ser invalida"
        );
    }

    @Test
    void aMascaradoCPFDeveSerValida() {

        assertTrue(
                validator.validate(new Cpf("284.960.090-33")),
                "A mascara deveria ser valida"
        );
    }

    @Test
    void aMascaradoCNPJDeveSerInvalida() {

        assertFalse(
                validator.validate(new Cnpj("21891511000110")),
                "A mascara deveria ser invalida"
        );

    }

    @Test
    void aMascaradoCNPJDeveSerValida() {

        assertTrue(
                validator.validate(new Cnpj("39.324.633/0001-90")),
                "A mascara deveria ser valida"
        );

    }

}