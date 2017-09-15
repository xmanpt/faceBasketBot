import worker.BasketRobot;
import worker.BasketWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MichaelJordan {

	private JFrame frmExample;

	public MichaelJordan() {
		BasketWindow.init();

		frmExample = new JFrame();
		frmExample.setTitle("BasketBall");
		frmExample.setBounds(100, 100, 266, 240);
		frmExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExample.getContentPane().setLayout(null);

		JButton btnReadShot = new JButton("Read Shot");
		btnReadShot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BasketWindow.captureShot();
			}
		});
		btnReadShot.setBounds(63, 34, 138, 48);
		frmExample.getContentPane().add(btnReadShot);

		JButton btnPlay = new JButton("Shot!!!");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BasketWindow.makeShot();
			}
		});
		btnPlay.setBounds(63, 34*2+48, 138, 48);
		frmExample.getContentPane().add(btnPlay);

	}



	public static void main(String[] args) {
		EventQueue.invokeLater(
				new Runnable() {
					public void run() {
						try {
							MichaelJordan window = new MichaelJordan();
							window.frmExample.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
	}

}
