package botwrite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class BotWrite {

    public static void main(String[] args) throws AWTException {
        
        Robot bot = new Robot();
        
        bot.setAutoDelay(200);
        
        bot.delay(2000);
        
        bot.keyPress(KeyEvent.VK_D);
        bot.keyRelease(KeyEvent.VK_D);
        
        bot.keyPress(KeyEvent.VK_E);
        bot.keyRelease(KeyEvent.VK_E);
        
        bot.keyPress(KeyEvent.VK_S);
        bot.keyRelease(KeyEvent.VK_S);
        
        bot.keyPress(KeyEvent.VK_L);
        bot.keyRelease(KeyEvent.VK_L);
        
        bot.keyPress(KeyEvent.VK_I);
        bot.keyRelease(KeyEvent.VK_I);
        
        bot.keyPress(KeyEvent.VK_G);
        bot.keyRelease(KeyEvent.VK_G);
        
        bot.keyPress(KeyEvent.VK_A);
        bot.keyRelease(KeyEvent.VK_A);
        
        bot.keyPress(KeyEvent.VK_N);
        bot.keyRelease(KeyEvent.VK_N);
        
        bot.keyPress(KeyEvent.VK_D);
        bot.keyRelease(KeyEvent.VK_D);
        
        bot.keyPress(KeyEvent.VK_O);
        bot.keyRelease(KeyEvent.VK_O);
        
        bot.keyPress(KeyEvent.VK_ALT);
        bot.keyPress(KeyEvent.VK_F4);
       
        bot.keyRelease(KeyEvent.VK_F4);
    }
    
}
