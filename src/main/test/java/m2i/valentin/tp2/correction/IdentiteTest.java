package m2i.valentin.tp2.correction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class IdentiteTest {

    @Mock
    private Adresse adresseMock;
    @InjectMocks
    private Identite identite;

    @Test
    public void changerAdresse() {
        Adresse nouvelleAdresseMock = mock(Adresse.class);

        identite.setAdresse(nouvelleAdresseMock);

        assertEquals(identite.getAdresse(), nouvelleAdresseMock);
    }
}