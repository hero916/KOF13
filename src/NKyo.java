public class NKyo extends  Character{
    public NKyo() throws Exception {

    }

    public static void main(String[] args) throws Exception {
        new PressButton().reset();
        Thread.sleep(2000);
        NKyo kyo = new NKyo();

        kyo.K2BC();
    }

    public void K2BC() throws Exception {
        K2(200);
        K7l(250);
        J2C(400);
        C(180);
        K3D(600);
        KBC(150);
        D(120);
        K26A(300);
        K26A(360);
        for(int i= 0; i< 4 ; i++){
            K623C(150);
            K26C(780);
        }
        K626C(200);
        K26BD(00);
    }

    public void K26BD(long interval) throws Exception{
        pressButton.K26();
        Thread.sleep(30);
        pressButton.K(PressButton.KB, PressButton.KD);
        Thread.sleep(interval);
    }
    public void J2C(long interval) throws Exception{
        pressButton.K(PressButton.K2, PressButton.KC);
        Thread.sleep(interval);
    }

    public void K3D(long interval) throws Exception{
        pressButton.K(PressButton.K2, PressButton.K6,PressButton.KD);
        Thread.sleep(interval);
    }

    public void K6C(long interval) throws Exception{
        pressButton.K(PressButton.K6, PressButton.KC);
        Thread.sleep(interval);
    }

}
