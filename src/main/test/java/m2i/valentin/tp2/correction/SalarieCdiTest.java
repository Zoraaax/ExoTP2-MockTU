package m2i.valentin.tp2.correction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SalarieCdiTest {

    @InjectMocks
    private SalarieCdi salarieCdi;

    @Mock
    private Salaire salaireMock;

    @Mock
    private Identite identiteMock;

    @Test
    @DisplayName("La demande de changement d'adresse est transmise")
    public void testDemenager() {
        Adresse nouvelleAdresseMock = mock(Adresse.class);
        salarieCdi.demenager(nouvelleAdresseMock);
        verify(
                identiteMock,
                times(1)
        ).setAdresse(nouvelleAdresseMock);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 20, 12",
            "20, 20, 24",
            "100, 10, 110"
    })
    public void testAugmentation(
            double tauxHoraireInitial,
            double pourcentageAugmentation,
            double nouveauTauxHoraire
    ) {
        // Arrange
        when(salaireMock.getTauxHoraire()).thenReturn(tauxHoraireInitial);

        // Act
        salarieCdi.augmenter(pourcentageAugmentation);

        // Assert
        verify(
                salaireMock
        ).setTauxHoraire(nouveauTauxHoraire);
    }

    @ParameterizedTest
    @ValueSource(doubles = {100, 200, 1200, 400}) // Lorsqu'on a un paramètre en commun il vaut mieux utiliser ValueSource
    public void testTravaillerAvecParams(
            double heuresTravaillees
    ) {
        salarieCdi.travailler(heuresTravaillees);
        verify(
                salaireMock
        ).payer(heuresTravaillees);
    }

    @Test
    public void testTravaillerSansParams() {
        salarieCdi.travailler();
        verify(
                salaireMock
        ).payer(151.67);
    }
}