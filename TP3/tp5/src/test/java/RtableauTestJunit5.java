import ma.emsi.Rtableau;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class RtableauTestJunit5 {

    private Rtableau tableau;

    @BeforeEach
    public void setup() {
        tableau = new Rtableau(5);
    }

    @AfterEach
    public void tearDown() {
        tableau = null;
    }

    @Test
    public void testAjouterSucces() {
        // Objectif : Vérifier l'ajout d'un élément valide
        tableau.ajouter("element1");
        assertTrue(tableau.contenir("element1"), "L'élément aurait dû être ajouté");
    }

    @Test
    public void testAjouterEchec() {
        // Test : Échec lors de l'ajout d'un élément au-delà de la capacité maximale
        tableau = new Rtableau(1);
        tableau.ajouter("element1");
        Exception exception = assertThrows(Exception.class, () -> tableau.ajouter("element2"),
                "Une exception aurait dû être levée pour capacité dépassée");
        assertNotNull(exception.getMessage(), "Le message de l'exception ne doit pas être null");
    }

    @Test
    public void testSupprimerElementNonExistant() {
        // Test : Suppression d'un élément absent
        assertFalse(tableau.supprimer("elementInexistant"), "La suppression aurait dû échouer");
    }

    @Test
    public void testViderTableau() {
        // Test : Vidage complet du tableau
        tableau.ajouter("element1");
        tableau.ajouter("element2");
        tableau.vider();
        assertEquals(0, tableau.taille(), "Le tableau aurait dû être vide");
    }
}
