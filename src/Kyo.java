public class Kyo {
    public static void main(String[] args) throws Exception {

        PressButton pressButton1 = new PressButton();
        pressButton1.K623();
        Thread.sleep(40);
        pressButton1.K(PressButton.KA);
        Thread.sleep(40);
        pressButton1.K421();
        pressButton1.K(PressButton.KB);

        Thread.sleep(800);
        pressButton1.K623();
        Thread.sleep(40);
        pressButton1.K(PressButton.KC);
        Thread.sleep(40);
        pressButton1.K421();
        pressButton1.K(PressButton.KB);

        Thread.sleep(800);
        pressButton1.K623();
        Thread.sleep(40);
        pressButton1.K(PressButton.KC);
        Thread.sleep(40);
        pressButton1.K421();
        pressButton1.K(PressButton.KB);


    }
}
