import java.awt.*;
import java.awt.event.KeyEvent;

public class PressButton {

    public static int K6 = KeyEvent.VK_D;
    public static int K2= KeyEvent.VK_S;
    public static int K4 = KeyEvent.VK_A;
    public static int K8 = KeyEvent.VK_W;

    public static int KA= KeyEvent.VK_NUMPAD1;
    public static int KB = KeyEvent.VK_NUMPAD2;
    public static int KC = KeyEvent.VK_NUMPAD3;
    public static int KD = KeyEvent.VK_NUMPAD5;

    public static int KBC = KeyEvent.VK_NUMPAD0;

    public static int KAC = KeyEvent.VK_NUMPAD4;

    public static int KBD = KeyEvent.VK_NUMPAD6;

    private Robot robot = new Robot();

    public PressButton() throws AWTException {

    }

    public void reset(){
        robot.keyPress(KeyEvent.VK_2);
    }

    public  void K26() throws InterruptedException {
        robot.keyPress(K2);
        Thread.sleep(10);
        robot.keyPress(K6);
        Thread.sleep(50);
        robot.keyRelease(K2);
        Thread.sleep(10);
        robot.keyRelease(K6);
    }

    public  void K24() throws InterruptedException {
        robot.keyPress(K2);
        Thread.sleep(10);
        robot.keyPress(K4);
        Thread.sleep(50);
        robot.keyRelease(K2);
        Thread.sleep(10);
        robot.keyRelease(K4);
    }

    public void K2624() throws InterruptedException {
        robot.keyPress(K2);
        Thread.sleep(15);
        robot.keyPress(K6);
        Thread.sleep(10);
        robot.keyRelease(K2);
        Thread.sleep(10);
        robot.keyRelease(K6);
        robot.keyPress(K2);
        Thread.sleep(10);
        robot.keyPress(K4);
        Thread.sleep(10);
        robot.keyRelease(K2);
        Thread.sleep(10);
        robot.keyRelease(K4);

    }

    public void K623() throws InterruptedException {
        robot.keyPress(K6);
        Thread.sleep(10);
        robot.keyRelease(K6);
        robot.keyPress(K2);
        Thread.sleep(10);
        robot.keyRelease(K2);
        robot.keyPress(K2);
        robot.keyPress(K6);
        Thread.sleep(50);
        robot.keyRelease(K6);
        robot.keyRelease(K2);

    }

    public void K626() throws InterruptedException {
        robot.keyPress(K6);
        Thread.sleep(10);
        robot.keyRelease(K6);
        robot.keyPress(K2);
        Thread.sleep(10);
        robot.keyRelease(K2);
        robot.keyPress(K2);
        robot.keyPress(K6);
        Thread.sleep(10);
        robot.keyRelease(K2);
        Thread.sleep(30);
        robot.keyRelease(K6);

    }

    public void K421() throws InterruptedException {
        robot.keyPress(K4);
        Thread.sleep(10);
        robot.keyRelease(K4);
        robot.keyPress(K2);
        Thread.sleep(10);
        robot.keyRelease(K2);
        robot.keyPress(K2);
        robot.keyPress(K4);
        Thread.sleep(50);
        robot.keyRelease(K4);
        robot.keyRelease(K2);
    }

    public void K(int button) throws InterruptedException{
        K(button,15l);
    }

    public void K(int button, Long time) throws InterruptedException{
        robot.keyPress(button);
        Thread.sleep(time);
        robot.keyRelease(button);
    }


    public void K(int button1, int button2) throws InterruptedException{
        robot.keyPress(button1);
        robot.keyPress(button2);
        Thread.sleep(15l);
        robot.keyRelease(button1);
        robot.keyRelease(button2);
    }

    public void K(int button1, int button2, int button3) throws InterruptedException{
        robot.keyPress(button1);
        robot.keyPress(button2);
        robot.keyPress(button3);
        Thread.sleep(15l);
        robot.keyRelease(button1);
        robot.keyRelease(button2);
        robot.keyRelease(button3);
    }

    public void K(int button1, int button2, Long time) throws InterruptedException{
        robot.keyPress(button1);
        robot.keyPress(button2);
        Thread.sleep(time);
        robot.keyRelease(button1);
        robot.keyRelease(button2);
    }

    public void K624() throws InterruptedException {
        robot.keyPress(K6);
        Thread.sleep(30);
        robot.keyRelease(K6);
        Thread.sleep(30);
        robot.keyPress(K2);
        Thread.sleep(30);
        robot.keyRelease(K2);
        Thread.sleep(30);
        robot.keyPress(K4);
        Thread.sleep(30);
        robot.keyRelease(K4);
        Thread.sleep(30);
    }


}
