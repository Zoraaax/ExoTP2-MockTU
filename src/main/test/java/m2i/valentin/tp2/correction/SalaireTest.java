package m2i.valentin.tp2.correction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaireTest {

    private Salaire salaire;

    @BeforeEach
    public void setUp() {
        salaire = new Salaire(15);
    }

    @Test
    public void testPayer() {
        double result = salaire.payer(10);

        assertEquals(150, result);
    }

    @Test
    public void testPayerAvecHeuresSupp() {
        double result = salaire.payer(152.67);

        assertEquals(2293.80, result);
    }

    @Test
    public void testPayerHeuresNormales() {
        double result = salaire.payer();

        assertEquals(2275.05, result);
    }
}