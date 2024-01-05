package m2i.valentin.tp2.classes.salaire;

import m2i.valentin.tp2.classes.adresse.Adresse;
import m2i.valentin.tp2.classes.salarie.Salarie;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

class SalaireTest {
    private Salaire salaire;

    @BeforeEach
    public void setUp() {
        this.salaire = new Salaire(10);
    }

    @AfterEach
    public void tearDown() {
        this.salaire = null;
    }

    /**
     * Permet de tester le setter du taux horaire de la classe Salaire.
     *
     * @param tauxHoraire
     */
    @ParameterizedTest(name = "Test de la méthode setTauxHoraire avec un taux horaire de {0}")
    @ValueSource(doubles = {8.8, 9.2, 14.3, 9.0})
    @DisplayName("Test de la méthode setTauxHoraire de la classe Salaire")
    public void testSetTauxHoraire(double tauxHoraire) {
        this.salaire.setTauxHoraire(tauxHoraire);
        assertEquals(tauxHoraire, this.salaire.getTauxHoraire(), "Le taux horaire doit être égal à " + tauxHoraire);
    }

    /**
     * Permet de tester la méthode setTauxHoraire de la classe Salaire avec un taux horaire inférieur au taux horaire minimum.
     *
     * @param tauxHoraire
     */
    @ParameterizedTest(name = "Test de la méthode setTauxHoraire avec un taux horaire de {0}")
    @ValueSource(doubles = {8.7, 0, -1, -10})
    @DisplayName("Test de la méthode setTauxHoraire de la classe Salaire qui doit renvoyer une exception")
    public void testSetTauxHoraireException(double tauxHoraire) {
        assertThrows(IllegalArgumentException.class, () -> {
            this.salaire.setTauxHoraire(tauxHoraire);
        });
    }

    /**
     * Permet de tester la méthode payer de la classe Salaire avec un nombre d'heures travaillées inférieur à 0.
     *
     * @param heuresTravaillees
     */
    @ParameterizedTest(name = "Test de la méthode payer avec un nombre d'heures travaillées de {0}")
    @ValueSource(doubles = {-1, -10, -100})
    @DisplayName("Test de la méthode payer de la classe Salaire qui doit renvoyer une exception")
    public void testPayerAvecValeurNegativeOuNul(double heuresTravaillees) {
        assertThrows(IllegalArgumentException.class, () -> {
            this.salaire.payer(heuresTravaillees);
        });
    }

    /**
     * Permet de tester la méthode payer de la classe Salaire avec un nombre d'heures travaillées supérieur à 0.
     *
     * @param heuresTravaillees
     */
    @ParameterizedTest(name = "Test de la méthode payer avec un nombre d'heures travaillées de {0}")
    @ValueSource(doubles = {0, 1, 10, 100})
    @DisplayName("Test de la méthode payer de la classe Salaire")
    public void testPayerAvecValeurPositive(double heuresTravaillees) {
        double salaire = this.salaire.payer(heuresTravaillees);
        assertEquals(heuresTravaillees * this.salaire.getTauxHoraire(), salaire, "Le salaire doit être égal à " + heuresTravaillees * this.salaire.getTauxHoraire());
    }
}