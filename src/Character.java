import java.awt.event.KeyEvent;

public class Character {
    PressButton pressButton = new PressButton();

    public Character() throws Exception {
    }

    public void K8(long interval) throws Exception {
        pressButton.K(PressButton.K8);
        Thread.sleep(interval);
    }

    public void K8l(long interval) throws Exception {
        pressButton.K(PressButton.K8, 90l);
        Thread.sleep(interval);
    }

    public void K7(long interval) throws Exception {
        pressButton.K(PressButton.K6, PressButton.K8);
        Thread.sleep(interval);
    }

    public void K7l(long interval) throws Exception {
        pressButton.K(PressButton.K6, PressButton.K8, 100l);
        Thread.sleep(interval);
    }


    public void K2(long interval) throws Exception {
        pressButton.K(PressButton.K2);
        Thread.sleep(interval);
    }

    public void A(long interval) throws Exception {
        pressButton.K(PressButton.KA);
        Thread.sleep(10);
        pressButton.K(PressButton.KA);
        Thread.sleep(interval);
    }

    public void B(long interval) throws Exception {
        pressButton.K(PressButton.KB);
        Thread.sleep(10);
        pressButton.K(PressButton.KB);
        Thread.sleep(interval);
    }

    public void C(long interval) throws Exception {
        pressButton.K(PressButton.KC);
        Thread.sleep(10);
        pressButton.K(PressButton.KC);
        Thread.sleep(interval);
    }

    public void D(long interval) throws Exception {
        pressButton.K(PressButton.KD);
        Thread.sleep(10);
        pressButton.K(PressButton.KD);
        Thread.sleep(interval);
    }

    public void K66(long interval) throws Exception {
        pressButton.K(PressButton.K6);
        Thread.sleep(10);
        pressButton.K(PressButton.K6, interval);
    }

    public void K44() throws Exception {
        pressButton.K(PressButton.K4);
        Thread.sleep(10);
        pressButton.K(PressButton.K4);
    }

    public void K623A(long interval) throws Exception {
        pressButton.K623();
        Thread.sleep(30);
        pressButton.K(PressButton.KA);
        Thread.sleep(interval);
    }

    public void K623C(long interval) throws Exception {
        pressButton.K623();
        Thread.sleep(30);
        pressButton.K(PressButton.KC);
        Thread.sleep(interval);
    }


    public void K626C(long interval) throws Exception {
        pressButton.K626();
        Thread.sleep(30);
        pressButton.K(PressButton.KC);
        Thread.sleep(interval);
    }

    public void K26C(long interval) throws Exception {
        pressButton.K26();
        Thread.sleep(30);
        pressButton.K(PressButton.KC);
        Thread.sleep(interval);
    }

    public void K24A(long interval) throws Exception {
        pressButton.K24();
        Thread.sleep(30);
        pressButton.K(PressButton.KA);
        Thread.sleep(interval);
    }

    public void K24AC(long interval) throws Exception {
        pressButton.K24();
        Thread.sleep(30);
        pressButton.K(PressButton.KAC);
        Thread.sleep(interval);
    }

    public void K24C(long interval) throws Exception {
        pressButton.K24();
        Thread.sleep(30);
        pressButton.K(PressButton.KC);
        Thread.sleep(interval);
    }

    public void K26A(long interval) throws Exception {
        pressButton.K26();
        Thread.sleep(30);
        pressButton.K(PressButton.KA);
        Thread.sleep(interval);
    }

    public void K2626A(long interval) throws Exception {
        pressButton.K26();
        Thread.sleep(30);
        pressButton.K26();
        Thread.sleep(30);
        pressButton.K(PressButton.KA);
        Thread.sleep(interval);
    }

    public void K2624C(long interval) throws Exception {
        pressButton.K2624();
        Thread.sleep(30);
        pressButton.K(PressButton.KC);
        Thread.sleep(interval);
    }

    public void K2624A(long interval) throws Exception {
        pressButton.K2624();
        Thread.sleep(30);
        pressButton.K(PressButton.KA);
        Thread.sleep(interval);
    }


    public void K24B(long interval) throws Exception {
        pressButton.K24();
        Thread.sleep(30);
        pressButton.K(PressButton.KB);
        Thread.sleep(interval);
    }


    public void KBC(long interval) throws Exception{
        pressButton.K(PressButton.KB, PressButton.KC);
        Thread.sleep(interval);
    }

    public void K624624AC(long interval) throws Exception {
        pressButton.K624();
        Thread.sleep(50);
        pressButton.K624();
        Thread.sleep(80);
        pressButton.K(KeyEvent.VK_NUMPAD4);
        Thread.sleep(interval);
    }
}
