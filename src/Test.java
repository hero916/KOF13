import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

import java.awt.event.KeyEvent;


public class Test implements NativeKeyListener {

    public static void main(String[] args) throws Exception {
        GlobalScreen.registerNativeHook();
        GlobalScreen.addNativeKeyListener(new Test());
    }

    public void nativeKeyPressed(NativeKeyEvent e){
        try {
            Iori iori = new Iori();
            if(e.getKeyCode() == NativeKeyEvent.VC_7){
                System.out.println(e.getKeyCode());
                iori.K24AC(120);
                iori.K24A(0);
            }
            if(e.getKeyCode() == NativeKeyEvent.VC_8){
                System.out.println(e.getKeyCode());
                iori.K24A(80);
                iori.K24A(0);
            }
            if(e.getKeyCode() == NativeKeyEvent.VC_9){
                System.out.println(e.getKeyCode());
                iori.K2624A(0);
            }



        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}