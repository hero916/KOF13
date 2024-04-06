import java.awt.*;
import java.awt.event.KeyEvent;

public class KOF13 {
    public static void main(String[] args) throws Exception {
            Robot robot = new Robot();

        K(robot, KeyEvent.VK_W);
        Thread.sleep(250);
        K(robot, KeyEvent.VK_NUMPAD3);
        Thread.sleep(400);
        K(robot, KeyEvent.VK_NUMPAD3);
        Thread.sleep(200);
        K6(robot,KeyEvent.VK_NUMPAD1);
        Thread.sleep(350);
        K(robot, KeyEvent.VK_NUMPAD0);
        Thread.sleep(200);

        K(robot, KeyEvent.VK_NUMPAD3);
        Thread.sleep(200);
//        K6(robot,KeyEvent.VK_NUMPAD1);
//        Thread.sleep(350);

        for(int i =0; i < 4 ;i++){
            KBC1(robot);
            System.out.println(i);
        }

        K623(robot,KeyEvent.VK_NUMPAD1);
        K2626(robot,KeyEvent.VK_NUMPAD1);
        K624(robot);
        K624(robot);
        Thread.sleep(100);
        K(robot, KeyEvent.VK_NUMPAD4);


//        Thread.sleep(50);
//        K26(robot,KeyEvent.VK_NUMPAD3);
//
//        Thread.sleep(100);
//        K6(robot,KeyEvent.VK_NUMPAD5);
//
//        Thread.sleep(800);
//        K24(robot, KeyEvent.VK_NUMPAD2);
//        Thread.sleep(300);
//        K24(robot, KeyEvent.VK_NUMPAD2);
//
//        Thread.sleep(400);
//        K623(robot,KeyEvent.VK_NUMPAD1);
//        Thread.sleep(50);
//        K2626(robot,KeyEvent.VK_NUMPAD3);

    }

    public static void KBC1(Robot robot) throws InterruptedException {
        K623(robot,KeyEvent.VK_NUMPAD1);
        Thread.sleep(90);
        K24(robot, KeyEvent.VK_NUMPAD2);
        Thread.sleep(200);
        K24(robot, KeyEvent.VK_NUMPAD2);
        Thread.sleep(400);
    }
    public static void K(Robot robot, int button) throws InterruptedException{
        robot.keyPress(button);
        Thread.sleep(10);
        robot.keyRelease(button);
    }
    public static void K6(Robot robot, int button) throws InterruptedException {
        robot.keyPress(KeyEvent.VK_D);
        robot.keyPress(button);
        Thread.sleep(10);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(button);
    }

    public static void K26(Robot robot, int button) throws InterruptedException {
        robot.keyPress(KeyEvent.VK_S);
        Thread.sleep(10);
        robot.keyPress(KeyEvent.VK_D);
        Thread.sleep(50);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(10);

        robot.keyPress(button);
        robot.keyRelease(KeyEvent.VK_D);
        Thread.sleep(50);
        robot.keyRelease(button);
    }

    public static void K2626(Robot robot, int button) throws InterruptedException {
        robot.keyPress(KeyEvent.VK_S);
        Thread.sleep(10);
        robot.keyPress(KeyEvent.VK_D);
        Thread.sleep(50);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(10);
        robot.keyRelease(KeyEvent.VK_D);
        Thread.sleep(50);

        robot.keyPress(KeyEvent.VK_S);
        Thread.sleep(10);
        robot.keyPress(KeyEvent.VK_D);
        Thread.sleep(50);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(10);
        robot.keyRelease(KeyEvent.VK_D);
        Thread.sleep(50);

        robot.keyPress(button);
        Thread.sleep(900);
        robot.keyRelease(button);
    }

    public static void K623(Robot robot, int button) throws InterruptedException {
        robot.keyPress(KeyEvent.VK_D);
        Thread.sleep(10);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_S);
        Thread.sleep(10);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_D);
        Thread.sleep(50);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(10);

        robot.keyPress(button);
        Thread.sleep(50);
        robot.keyRelease(button);
    }

    public static void K24(Robot robot, int button) throws InterruptedException {
        robot.keyPress(KeyEvent.VK_S);
        Thread.sleep(10);
        robot.keyPress(KeyEvent.VK_A);
        Thread.sleep(50);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(10);

        robot.keyPress(button);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(50);
        robot.keyRelease(button);
    }


    public static void K624(Robot robot) throws InterruptedException {
        robot.keyPress(KeyEvent.VK_D);
        Thread.sleep(10);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_S);
        Thread.sleep(10);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(10);
        robot.keyPress(KeyEvent.VK_A);
        Thread.sleep(50);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(10);

    }
}
