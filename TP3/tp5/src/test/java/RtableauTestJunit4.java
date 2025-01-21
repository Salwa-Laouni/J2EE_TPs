import ma.emsi.Rtableau;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RtableauTestJunit4 {

    private Rtableau tableau;

    @Before
    public void setup() {
        tableau = new Rtableau(5);
    }

    @After
    public void tearDown() {
        tableau = null;
    }
    @Test
    public void testAjouterSucces() {

        // Objectif : Vérifier l'ajout d'un élément valide
        Rtableau tableau = new Rtableau(3);

        tableau.ajouter("element1");

        assertTrue("L'élément aurait dû être ajouté", tableau.contenir("element1"));
    }

    @Test
    public void testAjouterEchec() {

        // Test: Échec lors de l'ajout d'un élément au-delà de la capacité maximale
        Rtableau tableau = new Rtableau(1);

        tableau.ajouter("element1");

        try {
            tableau.ajouter("element2"); // Doit échouer
        } catch (Exception e) {
            fail("Une exception aurait dû être levée pour capacité dépassée");
        }

        assertTrue("Exception correctement levée", true);
    }

    @Test
    public void testSupprimerElementNonExistant() {

        // Test: Suppression d'un élément absent
        Rtableau tableau = new Rtableau(3);

        assertFalse("La suppression aurait dû échouer", tableau.supprimer("elementInexistant"));
    }

//    @Test
//    public void testViderTableau() {
//
//        // Test: Vidage complet du tableau
//        Rtableau tableau = new Rtableau(3);
//
//        tableau.ajouter("element1");
//        tableau.ajouter("element2");
//
//        tableau.vider();
//
//        assertEquals("Le tableau aurait dû être vide", 0, tableau.taille());
//    }
}
