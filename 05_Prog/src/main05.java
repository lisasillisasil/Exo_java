
// real time digital clock

import javax.swing.JFrame;

public class main05 {

	public static JFrame fenetre; // window created
	public static DigitalClock digitalclock;

	public static void main(String[] args) {

		// declaration of variables

		fenetre = new JFrame("Clock");// title window, nothing else
		digitalclock = new DigitalClock();

		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(500, 500);
		fenetre.setLocation(150, 150);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		fenetre.setContentPane(digitalclock);
		fenetre.setVisible(true);

	}

}
