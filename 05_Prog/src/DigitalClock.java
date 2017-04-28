
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class DigitalClock extends JPanel {

	// lancement timer
	private JTextField jtextTime;
	private JPanel content;

	public DigitalClock() {

		jtextTime = new JTextField("Digital Clock", 5); // on one line
		jtextTime.setEditable(false); // edition banned
		jtextTime.setFont(new Font("Verdana", 1, 18));
		content = new JPanel(); // declared content for JtextTime
		content.add(jtextTime);
		content.add(jtextTime);
		javax.swing.Timer t = new javax.swing.Timer(1000, new ClockListener());
		t.start();
	}

	public class ClockListener implements ActionListener {

		@Override // héritage de la classe parente
		public void actionPerformed(ActionEvent e) {
			SimpleDateFormat dt = new SimpleDateFormat("HH:mm:ss"); // dt like g
			jtextTime.setText(dt.format(Calendar.getInstance().getTime()));

		}

	}

	public void paint(Graphics g) {
		g.drawOval(40, 25, 400, 400);
		// g.setColor(Color.RED);
		// g.fillOval(40, 25, 400, 400);

	}

}
