package ComputerClub;

import javax.swing.JFrame;

public class Frames extends JFrame {
	public Frames() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel());
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setTitle("ColePole");
	}

	public static void main(String[] args) {
		new Frames();
	}
}
