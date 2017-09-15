package worker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class BasketRobot extends JPanel implements MouseListener {

	public static Robot robot = null;
	public static BufferedImage currentShot;
	public Point base = new Point(330-8, 607-30);//new Point(1016, 607);
	public Point target;


	public BasketRobot() throws AWTException {
		robot = new Robot();
	}

	@Override
	protected void paintComponent(Graphics g) {
		if(currentShot==null){
			captureShot();
		}
		g.drawImage(currentShot, 0, 0, this);

		if(target!=null) {
			g.setColor(Color.red);
			g.fillArc(base.x-5, base.y-5, 10, 10, 0, 360);
			g.drawLine(base.x, base.y, target.x, target.y);
			g.fillArc(target.x-5, target.y-5, 10, 10, 0, 360);
		}
		//1016, 606
		//333, 606
		//g.fillArc(333, 606, 10, 10, 0, 360);

	}

	public void captureShot(){
		currentShot = robot.createScreenCapture(new Rectangle(683+8, 0+30, 683, 768));
		revalidate();
		repaint();

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		target = new Point(e.getX()-8, e.getY()-30);
		System.out.println("new target: [ "+(target.x)+", "+(target.y)+"]");

		/*

		robot.mouseMove(1016, 607);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseMove(1016, 400);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		*/
		revalidate();
		repaint();
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

	public void makeShot() {
		int dX = 1016-base.x;
		int dY = 607-base.y;
		System.out.println("Making the shot: ["+1016+" ,"+607+"] => [ "+(target.x+dX)+", "+(target.y+dY)+"]");
		robot.mouseMove(1016, 607);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseMove(target.x+dX, target.y+dY);
		//robot.mouseMove(1016, 400);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
}
