package m2i.valentin.tp2.classes.identite;

import m2i.valentin.tp2.classes.adresse.Adresse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentiteTest {

    private Identite identite;
    private Adresse adresse;

    @BeforeEach
    public void setUp() {
        this.adresse = new Adresse(1, "Rue des Poulets", 59000, "Lille", "France");
        this.identite = new Identite("Dupont", "Jean", adresse);
    }

    /**
     * Permet de tester le getter du nom de la classe Identite.
     */
    @Test
    @DisplayName("Test de la méthode GetNom de la classe Identite")
    public void testGetNom() {
        assertEquals("Dupont", this.identite.getNom(), "Le nom doit être égal à Dupont");
    }

    /**
     * Permet de tester le getter du prénom de la classe Identite.
     */
    @Test
    @DisplayName("Test de la méthode GetPrenom de la classe Identite")
    public void testGetPrenom() {
        assertEquals("Jean", this.identite.getPrenom(), "Le prénom doit être égal à Jean");
    }

    /**
     * Permet de tester le lien entre la classe Identite et la classe Adresse.
     */
    @Test
    @DisplayName("Test de la méthode GetAdresse de classe Identite")
    public void testGetAdresse() {
        assertEquals(this.adresse, this.identite.getAdresse(), "L'adresse doit être égale à l'adresse créée");
    }
}