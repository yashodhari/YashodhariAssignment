package RobotClass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class DemoRobotClass {
	
	public static void main(String[]arge) throws IOException, AWTException {
		Runtime.getRuntime().exec("NotePad");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_SHIFT);
	}

}
