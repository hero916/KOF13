
public class KDash extends Character{

    public KDash() throws Exception {
    }

    public static void main(String[] args) throws Exception {

        new PressButton().reset();
        Thread.sleep(2000);
        KDash kDash = new KDash();
        //kDash.K624624AC(100);
        kDash.K3BC();
    }

    public void K6A(long interval) throws Exception{
        pressButton.K(PressButton.K6, PressButton.KA);
        Thread.sleep(interval);
    }

    public void K6D(long interval) throws Exception {
        pressButton.K(PressButton.K6, PressButton.KD);
        Thread.sleep(interval);
    }

    public void K2626A(long interval) throws Exception {
        pressButton.K26();
        Thread.sleep(10);
        pressButton.K26();
        Thread.sleep(30);
        pressButton.K(PressButton.KA, 1000l);
        Thread.sleep(interval);
    }


    public void K3BC() throws Exception {
        K2(200);
        K7l(200);
        D(400);
        C(200);
        K6A(350);
        KBC(250);
        C(120);
        //kDash.K6A(220);

        for(int i= 0; i< 4 ; i++){
            K623A(120);
            K24B(240);
            K24B(450);
        }
        K623A(150);
        K2626A(0);
        K624624AC(100);
    }



}
