package worker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BasketWindow {

	private static BasketRobot robot = null;

	public static void captureShot() {
		robot.captureShot();
	}

	public static void Window() {
		try {
			robot = new BasketRobot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		int width = 1366 / 2;
		int height = 768;

		JFrame frame = new JFrame("Basket");
				frame.getContentPane().add(robot, BorderLayout.CENTER);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setSize(width, height);

				BasketWindow windowForSolver = new BasketWindow();
				frame.addMouseListener(robot);
			}

			public static void init() {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
				Window();
			}
		});
	}

	public static void makeShot() {
		robot.makeShot();
	}
}

