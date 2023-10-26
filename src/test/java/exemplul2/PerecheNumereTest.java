package exemplul2;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class PerecheNumereTest {

    @org.junit.jupiter.api.Test
    void suntConsecutiveInFibonacci() {
        PerecheNumere p = new PerecheNumere(2,3);
        assertTrue(p.suntConsecutiveInFibonacci());
        PerecheNumere p2= new PerecheNumere(5,6);
        assertFalse(p2.suntConsecutiveInFibonacci());
        PerecheNumere p3 = new PerecheNumere(6,23);
        assertFalse(p3.suntConsecutiveInFibonacci());
    }

    void celMicMultipluComun() {
        PerecheNumere p = new PerecheNumere(2,3);
        Assertions.assertEquals(6,p.celMicMultipluComun());
        PerecheNumere p2 = new PerecheNumere(5,6);
        assertEquals(30, p2.celMicMultipluComun());
        PerecheNumere p3 = new PerecheNumere(3,4);
        assertEquals(12,p3.celMicMultipluComun());
    }

    @org.junit.jupiter.api.Test
    void sumaCifrelorEgala() {
        PerecheNumere p = new PerecheNumere(2,3);
        assertFalse(p.sumaCifrelorEgala());
        PerecheNumere p2= new PerecheNumere(5,6);
        assertFalse(p2.sumaCifrelorEgala());
        PerecheNumere p3 = new PerecheNumere(6,23);
        assertFalse(p3.sumaCifrelorEgala());
    }

    @org.junit.jupiter.api.Test
    void numarCifrePareEgale() {
        PerecheNumere p = new PerecheNumere(2,3);
        assertFalse(p.numarCifrePareEgale());

        PerecheNumere p2 = new PerecheNumere(5,6);
        assertFalse(p2.numarCifrePareEgale());

        PerecheNumere p3 = new PerecheNumere(2,4);
        assertTrue(p3.numarCifrePareEgale());
    }
}