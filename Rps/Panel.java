package ComputerClub.Rps;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel implements MouseListener, KeyListener {
	/**
	 * extends JPanel implements MouseListener, KeyListener
	 */
	// Clicking mouse draws the screen.

	int width = 400;
	int height = 200;

	Image[] imageAr;

	Thread thread;
	Image image;
	Graphics g;

	// Vars for gLoop Above

	public Panel() {
		super();

		setPreferredSize(new Dimension(width, height));
		setFocusable(true);
		requestFocus();

		addKeyListener(this);
		addMouseListener(this);

		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		g = (Graphics2D) image.getGraphics();
		this.setSize(new Dimension(width, height));
		pStart();
	}

	/**
	 * Methods go below here.
	 * 
	 */

	public void pStart() {
		imageInit();
		draw();
	}

	void simpleGame(int playChoice) {
		if (playChoice == 1) {
			System.out.println("you picked rock");
		} else if (playChoice == 2) {
			System.out.println("you picked paper");
		} else if (playChoice == 3) {
			System.out.println("you picked scissors");
		}
		Random rand = new Random();
		int compChoice = rand.nextInt(3);
		if (compChoice == 0) {
			System.out.println("computer picked rock");
		} else if (compChoice == 1) {
			System.out.println("computer picked paper");
		} else if (compChoice == 2) {
			System.out.println("computer picked scissors");
		}

		if (playChoice == 1) {
			if (compChoice == 0) {
				System.out.println("tie");
			} else if (compChoice == 1) {
				System.out.println("you lost");
			} else if (compChoice == 2) {
				System.out.println("you win");
			}
		} else if (playChoice == 1) {
			if (compChoice == 0) {
				System.out.println("you win");
			} else if (compChoice == 1) {
				System.out.println("tie");
			} else if (compChoice == 2) {
				System.out.println("you lost");
			}
		} else if (playChoice == 2) {
			if (compChoice == 0) {
				System.out.println("you lost");
			} else if (compChoice == 1) {
				System.out.println("you win");
			} else if (compChoice == 2) {
				System.out.println("tie");
			}
		}
	}

	int imageMargin = 10;
	int image1Width;
	int image2Width;
	int image3Width;

	int image1Height;
	int image2Height;
	int image3Height;

	void draw() {
		g.drawImage(imageAr[0], imageMargin, imageMargin, null);
		g.drawImage(imageAr[1], imageMargin * 2 + image1Width, imageMargin,
				null);
		g.drawImage(imageAr[2], imageMargin * 3 + image1Width + image2Width,
				imageMargin, null);
	}

	/**
	 * Methods go above here.
	 * 
	 */

	public void drwGm() {
		Graphics g2 = this.getGraphics();
		g2.drawImage(image, 0, 0, null);
		g2.dispose();
	}

	public void imageInit() {
		imageAr = new Image[3];
		ImageIcon ie = new ImageIcon(this.getClass()
				.getResource("res/Rock.jpg"));
		imageAr[0] = ie.getImage();
		ie = new ImageIcon(this.getClass().getResource("res/Paper.jpg"));
		imageAr[1] = ie.getImage();
		ie = new ImageIcon(this.getClass().getResource("res/Scissors.png"));
		imageAr[2] = ie.getImage();

		image1Width = imageAr[0].getWidth(null);
		image2Width = imageAr[1].getWidth(null);
		image3Width = imageAr[2].getWidth(null);

		image1Height = imageAr[0].getHeight(null);
		image2Height = imageAr[1].getHeight(null);
		image3Height = imageAr[2].getHeight(null);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent me) {
		System.out.println("*click*");
		draw();
		drwGm();
		if (me.getX() > imageMargin && me.getX() < imageMargin + image1Width) {
			if (me.getY() > imageMargin
					&& me.getY() < image1Height + imageMargin) {
				// System.out.println("rock");
				simpleGame(1);
			}
		}
		if (me.getX() > imageMargin * 2 + image1Width
				&& me.getX() < imageMargin * 2 + image1Width + image2Width) {
			if (me.getY() > imageMargin
					&& me.getY() < image2Height + imageMargin) {
				// System.out.println("Paper");
				simpleGame(2);
			}
		}
		if (me.getX() > imageMargin * 3 + image1Width + image2Width
				&& me.getX() < imageMargin * 3 + image1Width + image2Width
						+ image3Width) {
			if (me.getY() > imageMargin
					&& me.getY() < image3Height + imageMargin) {
				// System.out.println("Scissors");
				simpleGame(3);
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent ke) {

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
