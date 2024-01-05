package m2i.valentin.tp2.classes.salarie;

import m2i.valentin.tp2.classes.adresse.Adresse;
import m2i.valentin.tp2.classes.identite.Identite;
import m2i.valentin.tp2.classes.salaire.Salaire;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class SalarieTest {

    @Mock
    private Identite identiteMock;

    @Mock
    private Salaire salaireMock;

    @InjectMocks
    private Salarie salarie;

    @BeforeEach
    public void setUp() {
        identiteMock = new Identite("Dupont", "Jean", new Adresse(4, "Rue du dindon", 57183, "Grange", "France"));
        salaireMock = new Salaire(10);
    }

    @Test
    @DisplayName("Test de la méthode travailler")
    public void testTravailler() {

    }

}