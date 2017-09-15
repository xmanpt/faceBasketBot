import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main implements MouseListener{



	public static void main(String[] argv) throws Exception {


		Robot robot = new Robot();
		robot.mouseMove(800, 200);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseMove(800, 400);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("s");
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
}

   