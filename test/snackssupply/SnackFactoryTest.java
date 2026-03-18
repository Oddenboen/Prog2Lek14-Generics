package snackssupply;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import snacks.Limb;
import snacks.Pez;
import snacks.Smartie;
import snacks.Søm;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SnackFactoryTest {

    private SnackFactory factory;
    private SnackBar snackBar;

    @BeforeEach
    void setup() {
        factory = new SnackFactory();
        snackBar = new SnackBar();
    }

    @Test
    void test_Limb_5() {
        Limb[] limbs = new Limb[5];
        limbs = factory.getNewSnacks(limbs);
        double weight = 1;
        Random random = new Random(67);

        for (Limb limb : limbs) {
            limb.setWeight(weight);
            weight = random.nextDouble() * 100;
        }

        snackBar.sortSnacks(limbs);

        for (int i = 0; i < limbs.length - 1; i++) {
            assertTrue(limbs[i].compareTo(limbs[i + 1]) <= 0);
        }

    }

    @Test
    void test_Smartie_5() {
        Smartie[] smarties = new Smartie[5];
        smarties = factory.getNewSnacks(smarties);
        snackBar.sortSnacks(smarties);

        for (int i = 0; i < smarties.length - 1; i++) {
            assertTrue(smarties[i].compareTo(smarties[i + 1]) <= 0);
        }
    }

    @Test
    void test_Pez_5() {
        Pez[] pezs = new Pez[5];
        pezs = factory.getNewSnacks(pezs);
        snackBar.sortSnacks(pezs);

        for (int i = 0; i < pezs.length - 1; i++) {
            assertTrue(pezs[i].compareTo(pezs[i + 1]) <= 0);
        }
    }

    @Test
    void test_Pez_500() {
        Pez[] pezs = new Pez[500];
        pezs = factory.getNewSnacks(pezs);
        snackBar.sortSnacks(pezs);

        for (int i = 0; i < pezs.length - 1; i++) {
            assertTrue(pezs[i].compareTo(pezs[i + 1]) <= 0);
        }
    }

    @Test
    void test_Pez_0() {
        Pez[] pezs = new Pez[0];
        pezs = factory.getNewSnacks(pezs);
        snackBar.sortSnacks(pezs);

        assertEquals(0, pezs.length);
    }

    @Test
    void test_Søm() {
        Søm[] søm = new Søm[3];
        søm = factory.getNewSnacks(søm);

        for (Søm sømet : søm) {
            assertNull(sømet);
        }
    }

    @Test
    void test_null() {
        assertThrows(NullPointerException.class, () -> {
            factory.getNewSnacks(null);
        });
    }
}