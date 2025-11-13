package fr.universite.ws;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Tests unitaires pour le service de communication
 */
public class TestServiceCommunication extends TestCase
{
    /**
     * Constructeur du test
     *
     * @param nomTest nom du cas de test
     */
    public TestServiceCommunication(String nomTest)
    {
        super(nomTest);
    }

    /**
     * @return la suite de tests à exécuter
     */
    public static Test suite()
    {
        return new TestSuite(TestServiceCommunication.class);
    }

    /**
     * Test de validation basique
     */
    public void testServiceValide()
    {
        assertTrue(true);
    }
}