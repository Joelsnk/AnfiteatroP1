package Anfiteatro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author Galford
 */
public class LimpiarConsola {
    
    public void limpiar()throws AWTException{
        
        Robot objRobot = new Robot();
        objRobot.keyPress(KeyEvent.VK_CONTROL);
        objRobot.keyPress(KeyEvent.VK_L);
        objRobot.keyRelease(KeyEvent.VK_CONTROL);
        objRobot.keyRelease(KeyEvent.VK_L);
        
    }
    
}
