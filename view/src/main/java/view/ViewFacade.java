package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */

public class ViewFacade extends JFrame implements IView {
	/**
	 * the serialVersionUID.
	 */
	private static final long serialVersionUID = 9182866186936817112L;
	public JFrame frame = new JFrame("Lorann");
	public ViewFacade() {
		super();
	}

	/**
	 * the method printWindow
	 *
	 * @param level.
	 * 				the level in the game.
	 */
	public void printWindow(String level) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new printMap(level));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);

	}

    /**
    * This class creates the map and sets all its settings
    * @author chris
    *
    */
	public class printMap extends JPanel {

		/**
        * the serialVersionUID.
        */
		private static final long serialVersionUID = 8681057499389021710L;
		/**
		 * JLabel l.
		 */
		private JLabel l = new JLabel();
		/**
		 * JLabel f1.
		 */
		private JLabel f1 = new JLabel();
		/**
		 * JLabel m1.
		 */
		private JLabel m1 = new JLabel();
		/**
		 * JLabel m2.
		 */
		private JLabel m2 = new JLabel();
		/**
		 * JLabel m3.
		 */
		private JLabel m3 = new JLabel();
		/**
		 * JLabel m4.
		 */
		private JLabel m4 = new JLabel();
		/**
		 * lock.
		 */
		Lock lock = new ReentrantLock();
		/**
		 * the move of Lorran.
		 */
		private boolean move = true;
		/**
		 * the move of mob1.
		 */
		private boolean move1 = false;
		/**
		 * the move of mob2.
		 */
		private boolean move2 = false;
		/**
		 * the move of mob3.
		 */
		private boolean move3 = false;
		/**
		 * the move of mob4.
		 */
		private boolean move4 = false;
		/**
		 * br : shows if the fireball is ready.
		 */
		private boolean br = true;
		/**
		 * the points.
		 */
		private int points = 0;
		/**
		 * the old xDelta of Lorann.
		 */
		private int oldxDelta = 0;
		/**
		 * the old yDelta of Lorann.
		 */
		private int oldyDelta = 0;
		/**
		 * the level in the game.
		 */
		private String level;
		/**
		 * an empty board set before the use of the pre-created maps
		 */
		private char map[][] = {
				{ 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
				{ 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
				{ 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
				{ 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
				{ 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
				{ 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
				{ 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
				{ 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
				{ 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
				{ 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
				{ 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
				{ 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',
						'N' } };

        /**
		 * constructor printMap
		 * @param level
		 */
		public printMap(String level) {
			this.level = level;
			setBackground(Color.black);
			setLayout(new GridLayout(13, 20));

			for (int y = 0; y < 12; y++) {
				for (int x = 0; x < 20; x++) {
					char caracter = level.charAt(x + y * 20);
					switch (caracter) {
					case 'A':
						// JLabel l = new JLabel();
						l.setIcon(new ImageIcon(new ImageIcon("sprite/Lorann.gif").getImage().getScaledInstance(64, 64,
								Image.SCALE_DEFAULT)));
						// l.setBounds((i%20)*64, ((i-(i%20))/20)*42,
						// (i%20)*64+64, ((i-(i%20))/20)*42+64);
						add(l);
						map[y][x] = caracter;
						break;
					case 'B':
						f1.setIcon(new ImageIcon(new ImageIcon("sprite/Fireball.gif").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						// f1.setBounds((i%20)*64, ((i-(i%20))/20)*42,
						// (i%20)*64+64, ((i-(i%20))/20)*42+64);
						add(f1);
						map[y][x] = caracter;
						break;
					case 'C':
						JLabel c = new JLabel();
						c.setIcon(new ImageIcon(new ImageIcon("sprite/crystal_ball.png").getImage()
								.getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
						// c.setBounds((i%20)*64, ((i-(i%20))/20)*42,
						// (i%20)*64+64, ((i-(i%20))/20)*42+64);
						add(c);
						map[y][x] = caracter;
						break;
					case 'D':
						JLabel gc = new JLabel();
						gc.setIcon(new ImageIcon(new ImageIcon("sprite/gate_closed.png").getImage()
								.getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
						// gc.setBounds((i%20)*64, ((i-(i%20))/20)*42,
						// (i%20)*64+64, ((i-(i%20))/20)*42+64);
						add(gc);
						map[y][x] = caracter;
						break;
					case 'E':
						JLabel go = new JLabel();
						go.setIcon(new ImageIcon(new ImageIcon("sprite/gate_open.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						// go.setBounds((i%20)*64, ((i-(i%20))/20)*42,
						// (i%20)*64+64, ((i-(i%20))/20)*42+64);
						add(go);
						map[y][x] = caracter;
						break;
					case 'F':
						JLabel bo = new JLabel();
						bo.setIcon(new ImageIcon(new ImageIcon("sprite/bone.png").getImage().getScaledInstance(64, 64,
								Image.SCALE_DEFAULT)));
						// bo.setBounds((i%20)*64, ((i-(i%20))/20)*42,
						// (i%20)*64+64, ((i-(i%20))/20)*42+64);
						add(bo);
						map[y][x] = caracter;
						break;
					case 'G':
						JLabel hb = new JLabel();
						hb.setIcon(new ImageIcon(new ImageIcon("sprite/horizontal_bone.png").getImage()
								.getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
						// bh.setBounds((i%20)*64, ((i-(i%20))/20)*42,
						// (i%20)*64+64, ((i-(i%20))/20)*42+64);
						add(hb);
						map[y][x] = caracter;
						break;
					case 'H':
						JLabel vb = new JLabel();
						vb.setIcon(new ImageIcon(new ImageIcon("sprite/vertical_bone.png").getImage()
								.getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
						// vb.setBounds((i%20)*64, ((i-(i%20))/20)*42,
						// (i%20)*64+64, ((i-(i%20))/20)*42+64);
						add(vb);
						map[y][x] = caracter;
						break;
					case 'I':
						m1.setIcon(new ImageIcon(new ImageIcon("sprite/monster_1.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						// m1.setBounds((i%20)*64, ((i-(i%20))/20)*42,
						// (i%20)*64+64, ((i-(i%20))/20)*42+64);
						add(m1);
						map[y][x] = caracter;
						break;
					case 'J':
						m2.setIcon(new ImageIcon(new ImageIcon("sprite/monster_2.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						// m2.setBounds((i%20)*64, ((i-(i%20))/20)*42,
						// (i%20)*64+64, ((i-(i%20))/20)*42+64);
						add(m2);
						map[y][x] = caracter;
						break;
					case 'K':
						m3.setIcon(new ImageIcon(new ImageIcon("sprite/monster_3.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						// m3.setBounds((i%20)*64, ((i-(i%20))/20)*42,
						// (i%20)*64+64, ((i-(i%20))/20)*42+64);
						add(m3);
						map[y][x] = caracter;
						break;
					case 'L':
						m4.setIcon(new ImageIcon(new ImageIcon("sprite/monster_4.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						// m4.setBounds((i%20)*64, ((i-(i%20))/20)*42,
						// (i%20)*64+64, ((i-(i%20))/20)*42+64);
						add(m4);
						map[y][x] = caracter;
						break;
					case 'M':
						JLabel p = new JLabel();
						p.setIcon(new ImageIcon(new ImageIcon("sprite/purse.png").getImage().getScaledInstance(64, 64,
								Image.SCALE_DEFAULT)));
						// p.setBounds((i%20)*64, ((i-(i%20))/20)*42,
						// (i%20)*64+64, ((i-(i%20))/20)*42+64);
						add(p);
						map[y][x] = caracter;
						break;
					case 'N':
						JLabel empt = new JLabel();
						empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						// empt.setBounds((i%20)*64, ((i-(i%20))/20)*42,
						// (i%20)*64+64, ((i-(i%20))/20)*42+64);
						add(empt);
						map[y][x] = caracter;
						break;
					}
				}
			}
			for (int i = 0; i < 20; i++) {
				if (i == 8) {
					JLabel t = new JLabel("Poin");
					Font font = new Font("Arial", Font.BOLD, 30);
					t.setForeground(Color.red);
					t.setFont(font);
					add(t);
					continue;
				} else if (i == 9) {
					JLabel t = new JLabel("ts : ");
					Font font = new Font("Arial", Font.BOLD, 30);
					t.setForeground(Color.red);
					t.setFont(font);
					add(t);
					continue;
				} else if (i == 10) {
					JLabel t = new JLabel(Integer.toString(points));
					Font font = new Font("Arial", Font.BOLD, 30);
					t.setForeground(Color.red);
					t.setFont(font);
					add(t);
					continue;
				}
				JLabel empt = new JLabel();
				empt.setIcon(new ImageIcon(
						new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
				add(empt);
			}

			addKeyBinding("left", KeyEvent.VK_Q, new MoveAction(-1, 0));
			addKeyBinding("right", KeyEvent.VK_D, new MoveAction(1, 0));
			addKeyBinding("up", KeyEvent.VK_Z, new MoveAction(0, -1));
			addKeyBinding("down", KeyEvent.VK_S, new MoveAction(0, 1));
			addKeyBinding("up_left", KeyEvent.VK_A, new MoveAction(-1, -1));
			addKeyBinding("up_right", KeyEvent.VK_E, new MoveAction(1, -1));
			addKeyBinding("down_right", KeyEvent.VK_C, new MoveAction(1, 1));
			addKeyBinding("down_left", KeyEvent.VK_W, new MoveAction(-1, 1));
			addKeyBinding("space", KeyEvent.VK_SPACE, new MoveAction(2, 2));
			addKeyBinding("left", KeyEvent.VK_NUMPAD4, new MoveAction(-1, 0));
			addKeyBinding("right", KeyEvent.VK_NUMPAD6, new MoveAction(1, 0));
			addKeyBinding("up", KeyEvent.VK_NUMPAD8, new MoveAction(0, -1));
			addKeyBinding("down", KeyEvent.VK_NUMPAD2, new MoveAction(0, 1));
			addKeyBinding("up_left", KeyEvent.VK_NUMPAD7, new MoveAction(-1, -1));
			addKeyBinding("up_right", KeyEvent.VK_NUMPAD9, new MoveAction(1, -1));
			addKeyBinding("down_right", KeyEvent.VK_NUMPAD3, new MoveAction(1, 1));
			addKeyBinding("down_left", KeyEvent.VK_NUMPAD1, new MoveAction(-1, 1));
		}

        /**
		 * the add of keyBinding.
		 * @param name
		 * @param keyCode
		 * @param action
		 */
		protected void addKeyBinding(String name, int keyCode, Action action) {
			InputMap inputMap = getInputMap(WHEN_IN_FOCUSED_WINDOW);
			ActionMap actionMap = getActionMap();

			inputMap.put(KeyStroke.getKeyStroke(keyCode, 0), name);
			actionMap.put(name, action);
		}

        /**
		 * This class uses the different threads
		 * @author chris
		 *
		 */
		public class MoveAction extends AbstractAction {
            /**
			 * the serialVersionUID
			 */
			private static final long serialVersionUID = -5280474716180691317L;

			/**
			 * the relative position of Lorann.
			 */
			private final int xDelta, yDelta;

            /**
			 * the constructor moveAction.
			 * @param xDelta
			 * @param yDelta
			 */
			public MoveAction(int xDelta, int yDelta) {
				this.xDelta = xDelta;
				this.yDelta = yDelta;
			}

			@Override
			public void actionPerformed(ActionEvent e) {

				if (xDelta == 2 && yDelta == 2 && br) {
					br = false;
					Thread b = new Thread(new RunImplball());
					b.start();
				} else if (xDelta != 2 && yDelta != 2 && move) {
					Thread t = new Thread(new RunImpl(xDelta, yDelta));
					t.start();
					if (br) {
						oldxDelta = xDelta;
						oldyDelta = yDelta;
					}
				}
				if (!move1) {
					try {
						TimeUnit.MILLISECONDS.sleep(11);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					move1 = true;
					Thread m1 = new Thread(new RunImplmob1());
					m1.start();
				}
				if (!move2) {
					try {
						TimeUnit.MILLISECONDS.sleep(13);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					move2 = true;
					Thread m2 = new Thread(new RunImplmob2());
					m2.start();
				}
				if (!move3) {
					try {
						TimeUnit.MILLISECONDS.sleep(17);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					move3 = true;
					Thread m3 = new Thread(new RunImplmob3());
					m3.start();
				}
				if (!move4) {
					try {
						TimeUnit.MILLISECONDS.sleep(19);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					move4 = true;
					Thread m4 = new Thread(new RunImplmob4());
					m4.start();
				}
			}

		}

        /**
		 * This class allows The player's character to move on the panel
		 * @author chris
		 *
		 */
		public class RunImpl implements Runnable {
			private int xDelta;
			private int yDelta;

            /**
			 * the constructor RunImpl.
			 * @param xDelta
			 * @param yDelta
			 */
			public RunImpl(int xDelta, int yDelta) {
				this.xDelta = xDelta;
				this.yDelta = yDelta;
			}

			public void run() {

				int index = getComponentZOrder(l), index2 = getComponentZOrder(l);
				index += xDelta;
				index += (yDelta * 20);
				if ((index - (index % 20)) / 20 < 0 || (index - (index % 20)) / 20 > 11) {
					index -= (yDelta * 20);
					oldyDelta -= yDelta;
				} else if (index % 20 < 0 || index % 20 > 19) {
					index -= xDelta;
					oldxDelta -= xDelta;
				}

				if (map[(index - (index % 20)) / 20][index % 20] == 'N') {

					if (xDelta == -1 && yDelta == 0) {
						l.setIcon(new ImageIcon(new ImageIcon("sprite/lorann_l.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						try {
							lock.lock();
							try {
								setComponentZOrder(getComponent(index), index2);
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								setComponentZOrder(l, index);
								map[(index - (index % 20)) / 20][index % 20] = 'A';
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(500);
							l.setIcon(new ImageIcon(new ImageIcon("sprite/Lorann.gif").getImage().getScaledInstance(64,
									64, Image.SCALE_DEFAULT)));
							revalidate();
							repaint();

						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					} else if (xDelta == 1 && yDelta == 0) {
						l.setIcon(new ImageIcon(new ImageIcon("sprite/lorann_r.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						try {
							lock.lock();
							try {
								setComponentZOrder(getComponent(index), index2);
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								setComponentZOrder(l, index);
								map[(index - (index % 20)) / 20][index % 20] = 'A';
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(500);
							l.setIcon(new ImageIcon(new ImageIcon("sprite/Lorann.gif").getImage().getScaledInstance(64,
									64, Image.SCALE_DEFAULT)));
							revalidate();
							repaint();

						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					} else if (xDelta == 0 && yDelta == -1) {
						l.setIcon(new ImageIcon(new ImageIcon("sprite/lorann_u.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						try {
							lock.lock();
							try {
								setComponentZOrder(getComponent(index), index2);
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								setComponentZOrder(l, index);
								map[(index - (index % 20)) / 20][index % 20] = 'A';
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(500);
							l.setIcon(new ImageIcon(new ImageIcon("sprite/Lorann.gif").getImage().getScaledInstance(64,
									64, Image.SCALE_DEFAULT)));
							revalidate();
							repaint();

						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					} else if (xDelta == 0 && yDelta == 1) {
						l.setIcon(new ImageIcon(new ImageIcon("sprite/lorann_b.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						try {
							lock.lock();
							try {
								setComponentZOrder(getComponent(index), index2);
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								setComponentZOrder(l, index);
								map[(index - (index % 20)) / 20][index % 20] = 'A';
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(500);
							l.setIcon(new ImageIcon(new ImageIcon("sprite/Lorann.gif").getImage().getScaledInstance(64,
									64, Image.SCALE_DEFAULT)));
							revalidate();
							repaint();

						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					} else if (xDelta == 1 && yDelta == 1) {
						l.setIcon(new ImageIcon(new ImageIcon("sprite/lorann_br.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						try {
							lock.lock();
							try {
								setComponentZOrder(getComponent(index), index2);
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								setComponentZOrder(l, index);
								map[(index - (index % 20)) / 20][index % 20] = 'A';
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(500);
							l.setIcon(new ImageIcon(new ImageIcon("sprite/Lorann.gif").getImage().getScaledInstance(64,
									64, Image.SCALE_DEFAULT)));
							revalidate();
							repaint();

						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					} else if (xDelta == -1 && yDelta == 1) {
						l.setIcon(new ImageIcon(new ImageIcon("sprite/lorann_bl.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						try {
							lock.lock();
							try {
								setComponentZOrder(getComponent(index), index2);
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								setComponentZOrder(l, index);
								map[(index - (index % 20)) / 20][index % 20] = 'A';
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(500);
							l.setIcon(new ImageIcon(new ImageIcon("sprite/Lorann.gif").getImage().getScaledInstance(64,
									64, Image.SCALE_DEFAULT)));
							revalidate();
							repaint();

						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}

					else if (xDelta == 1 && yDelta == -1) {
						l.setIcon(new ImageIcon(new ImageIcon("sprite/lorann_ur.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						try {
							lock.lock();
							try {
								setComponentZOrder(getComponent(index), index2);
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								setComponentZOrder(l, index);
								map[(index - (index % 20)) / 20][index % 20] = 'A';
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(500);
							l.setIcon(new ImageIcon(new ImageIcon("sprite/Lorann.gif").getImage().getScaledInstance(64,
									64, Image.SCALE_DEFAULT)));
							revalidate();
							repaint();

						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					} else if (xDelta == -1 && yDelta == -1) {
						l.setIcon(new ImageIcon(new ImageIcon("sprite/lorann_ul.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						try {
							lock.lock();
							try {
								setComponentZOrder(getComponent(index), index2);
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								setComponentZOrder(l, index);
								map[(index - (index % 20)) / 20][index % 20] = 'A';
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(500);
							l.setIcon(new ImageIcon(new ImageIcon("sprite/Lorann.gif").getImage().getScaledInstance(64,
									64, Image.SCALE_DEFAULT)));
							revalidate();
							repaint();

						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				} else if (map[(index - (index % 20)) / 20][index % 20] == 'C') {
					JLabel empt = new JLabel();
					empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64, 64,
							Image.SCALE_DEFAULT)));
					JLabel go = new JLabel();
					go.setIcon(new ImageIcon(new ImageIcon("sprite/gate_open.png").getImage().getScaledInstance(64, 64,
							Image.SCALE_DEFAULT)));
					lock.lock();
					try {
						remove(index);
						add(empt, index2);
						for (int y = 0; y < 12; y++) {
							for (int x = 0; x < 20; x++) {
								if (map[y][x] == 'D') {
									map[y][x] = 'E';
									remove(x + y * 20);
									add(go, (x + y * 20));
								}
							}
						}
						map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
						setComponentZOrder(l, index);
						map[(index - (index % 20)) / 20][index % 20] = 'A';
					} finally {
						lock.unlock();
					}
					revalidate();
					repaint();
				} else if (map[(index - (index % 20)) / 20][index % 20] == 'M') {
					points += 65;
					JLabel t = new JLabel(Integer.toString(points));
					Font font = new Font("Arial", Font.BOLD, 30);
					t.setForeground(Color.red);
					t.setFont(font);
					JLabel empt = new JLabel();
					empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64, 64,
							Image.SCALE_DEFAULT)));
					lock.lock();
					try {
						remove(250);
						add(t, 250);
						remove(index);
						add(empt, index2);
						map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
						setComponentZOrder(l, index);
						map[(index - (index % 20)) / 20][index % 20] = 'A';
					} finally {
						lock.unlock();
					}
					revalidate();
					repaint();
				} else if (map[(index - (index % 20)) / 20][index % 20] == 'B') {
					JLabel empt = new JLabel();
					empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64, 64,
							Image.SCALE_DEFAULT)));
					br = true;
					lock.lock();
					try {
						map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
						map[(index - (index % 20)) / 20][index % 20] = 'A';
						remove(index);
						add(empt, index2);
						setComponentZOrder(l, index);
					} finally {
						lock.unlock();
					}
					revalidate();
					repaint();
				} else if (map[(index - (index % 20)) / 20][index % 20] == 'I'
						|| map[(index - (index % 20)) / 20][index % 20] == 'J'
						|| map[(index - (index % 20)) / 20][index % 20] == 'K'
						|| map[(index - (index % 20)) / 20][index % 20] == 'L'
						|| map[(index - (index % 20)) / 20][index % 20] == 'D') {
					lock.lock();
					try {
						move = false;
						move1 = false;
						move2 = false;
						move3 = false;
						move4 = false;
						br = true;
						l.setIcon(new ImageIcon("sprite/crane.png"));
						revalidate();
						repaint();
						try {
							TimeUnit.MILLISECONDS.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						l.setIcon(new ImageIcon("sprite/crane.png"));
						revalidate();
						repaint();
						try {
							TimeUnit.MILLISECONDS.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						l.setIcon(new ImageIcon("sprite/crane.png"));
						revalidate();
						repaint();
						try {
							TimeUnit.MILLISECONDS.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						l.setIcon(new ImageIcon("sprite/crane.png"));
						revalidate();
						repaint();
						try {
							TimeUnit.MILLISECONDS.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						l.setIcon(new ImageIcon("sprite/crane.png"));
						revalidate();
						repaint();
						try {
							TimeUnit.MILLISECONDS.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						l.setIcon(new ImageIcon("sprite/crane.png"));
						revalidate();
						repaint();
						try {
							TimeUnit.MILLISECONDS.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						removeAll();
						frame.setContentPane(new printMap(level));
					} finally {
						lock.unlock();
					}
					revalidate();
					repaint();
				}
			}
		}

        /**
		 * This class allows the first monster to move on the panel
		 * @author chris
		 *
		 */
		public class RunImplmob1 implements Runnable {

			public void run() {

				while (move1) {
					int indexm1 = getComponentZOrder(m1), indm1 = getComponentZOrder(m1);
					int xDelta = (int) (Math.random() * 3) - 1;
					int yDelta = (int) (Math.random() * 3) - 1;
					indexm1 += xDelta;
					indexm1 += (yDelta * 20);
					if ((indexm1 - (indexm1 % 20)) / 20 < 0 || (indexm1 - (indexm1 % 20)) / 20 > 11) {
						indexm1 -= (yDelta * 20);
					}
					if (indexm1 % 20 < 0 || indexm1 % 20 > 19) {
						indexm1 -= xDelta;
					}
					if (map[(indexm1 - (indexm1 % 20)) / 20][indexm1 % 20] == 'N') {
						lock.lock();
						try {
							map[(indexm1 - (indexm1 % 20)) / 20][indexm1 % 20] = 'I';
							map[(indm1 - (indm1 % 20)) / 20][indm1 % 20] = 'N';
							setComponentZOrder(getComponent(indexm1), indm1);
							setComponentZOrder(m1, indexm1);
						} finally {
							lock.unlock();
						}
						revalidate();
						repaint();
						try {
							TimeUnit.MILLISECONDS.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else if (map[(indexm1 - (indexm1 % 20)) / 20][indexm1 % 20] == 'A') {
						lock.lock();
						try {
							move = false;
							move1 = false;
							move2 = false;
							move3 = false;
							move4 = false;
							br = true;
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							removeAll();
							frame.setContentPane(new printMap(level));
						} finally {
							lock.unlock();
						}
						revalidate();
						repaint();
					} else if (map[(indexm1 - (indexm1 % 20)) / 20][indexm1 % 20] == 'B') {
						JLabel empt = new JLabel();
						empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						lock.lock();
						try {
							map[(indm1 - (indm1 % 20)) / 20][indm1 % 20] = 'N';
							remove(indm1);
							add(empt, indm1);
						} finally {
							lock.unlock();
						}
						revalidate();
						repaint();
					}
				}
			}
		}

		/**
		 * This class allows the second monster to move on the panel
		 * @author chris
		 *
		 */
		public class RunImplmob2 implements Runnable {

			public void run() {

				while (move2) {
					int indexm2 = getComponentZOrder(m2), indm2 = getComponentZOrder(m2);
					int xDelta = (int) (Math.random() * 3) - 1;
					int yDelta = (int) (Math.random() * 3) - 1;
					indexm2 += xDelta;
					indexm2 += (yDelta * 20);
					if ((indexm2 - (indexm2 % 20)) / 20 < 0 || (indexm2 - (indexm2 % 20)) / 20 > 11) {
						indexm2 -= (yDelta * 20);
					}
					if (indexm2 % 20 < 0 || indexm2 % 20 > 19) {
						indexm2 -= xDelta;
					}
					if (map[(indexm2 - (indexm2 % 20)) / 20][indexm2 % 20] == 'N') {
						lock.lock();
						try {
							map[(indexm2 - (indexm2 % 20)) / 20][indexm2 % 20] = 'J';
							map[(indm2 - (indm2 % 20)) / 20][indm2 % 20] = 'N';
							setComponentZOrder(getComponent(indexm2), indm2);
							setComponentZOrder(m2, indexm2);
						} finally {
							lock.unlock();
						}
						revalidate();
						repaint();
						try {
							TimeUnit.MILLISECONDS.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else if (map[(indexm2 - (indexm2 % 20)) / 20][indexm2 % 20] == 'A') {
						lock.lock();
						try {
							move = false;
							move1 = false;
							move2 = false;
							move3 = false;
							move4 = false;
							br = true;
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							removeAll();
							frame.setContentPane(new printMap(level));
						} finally {
							lock.unlock();
						}
						revalidate();
						repaint();
					} else if (map[(indexm2 - (indexm2 % 20)) / 20][indexm2 % 20] == 'B') {
						JLabel empt = new JLabel();
						empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						lock.lock();
						try {
							map[(indm2 - (indm2 % 20)) / 20][indm2 % 20] = 'N';
							remove(indm2);
							add(empt, indm2);
						} finally {
							lock.unlock();
						}
						revalidate();
						repaint();
					}
				}
			}
		}

		/**
		 * This class allows the third monster to move on the panel
		 * @author chris
		 *
		 */
		public class RunImplmob3 implements Runnable {

			public void run() {

				while (move3) {
					int indexm3 = getComponentZOrder(m3), indm3 = getComponentZOrder(m3);
					int xDelta = (int) (Math.random() * 3) - 1;
					int yDelta = (int) (Math.random() * 3) - 1;
					indexm3 += xDelta;
					indexm3 += (yDelta * 20);
					if ((indexm3 - (indexm3 % 20)) / 20 < 0 || (indexm3 - (indexm3 % 20)) / 20 > 11) {
						indexm3 -= (yDelta * 20);
					}
					if (indexm3 % 20 < 0 || indexm3 % 20 > 19) {
						indexm3 -= xDelta;
					}
					if (map[(indexm3 - (indexm3 % 20)) / 20][indexm3 % 20] == 'N') {
						lock.lock();
						try {
							map[(indexm3 - (indexm3 % 20)) / 20][indexm3 % 20] = 'K';
							map[(indm3 - (indm3 % 20)) / 20][indm3 % 20] = 'N';
							setComponentZOrder(getComponent(indexm3), indm3);
							setComponentZOrder(m3, indexm3);
						} finally {
							lock.unlock();
						}
						revalidate();
						repaint();
						try {
							TimeUnit.MILLISECONDS.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else if (map[(indexm3 - (indexm3 % 20)) / 20][indexm3 % 20] == 'A') {
						lock.lock();
						try {
							move = false;
							move1 = false;
							move2 = false;
							move3 = false;
							move4 = false;
							br = true;
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							removeAll();
							frame.setContentPane(new printMap(level));
						} finally {
							lock.unlock();
						}
						revalidate();
						repaint();
					} else if (map[(indexm3 - (indexm3 % 20)) / 20][indexm3 % 20] == 'B') {
						JLabel empt = new JLabel();
						empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						lock.lock();
						try {
							map[(indm3 - (indm3 % 20)) / 20][indm3 % 20] = 'N';
							remove(indm3);
							add(empt, indm3);
						} finally {
							lock.unlock();
						}
						revalidate();
						repaint();
					}
				}
			}
		}

		/**
		 * This class allows the forth monster to move on the panel
		 * @author chris
		 *
		 */
		public class RunImplmob4 implements Runnable {

			public void run() {

				while (move4) {
					int indexm4 = getComponentZOrder(m4), indm4 = getComponentZOrder(m4);
					int xDelta = (int) (Math.random() * 3) - 1;
					int yDelta = (int) (Math.random() * 3) - 1;
					indexm4 += xDelta;
					indexm4 += (yDelta * 20);
					if ((indexm4 - (indexm4 % 20)) / 20 < 0 || (indexm4 - (indexm4 % 20)) / 20 > 11) {
						indexm4 -= (yDelta * 20);
					}
					if (indexm4 % 20 < 0 || indexm4 % 20 > 19) {
						indexm4 -= xDelta;
					}
					if (map[(indexm4 - (indexm4 % 20)) / 20][indexm4 % 20] == 'N') {
						lock.lock();
						try {
							map[(indexm4 - (indexm4 % 20)) / 20][indexm4 % 20] = 'L';
							map[(indm4 - (indm4 % 20)) / 20][indm4 % 20] = 'N';
							setComponentZOrder(getComponent(indexm4), indm4);
							setComponentZOrder(m4, indexm4);
						} finally {
							lock.unlock();
						}
						revalidate();
						repaint();
						try {
							TimeUnit.MILLISECONDS.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else if (map[(indexm4 - (indexm4 % 20)) / 20][indexm4 % 20] == 'A') {
						lock.lock();
						try {
							move = false;
							move1 = false;
							move2 = false;
							move3 = false;
							move4 = false;
							br = true;
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							l.setIcon(new ImageIcon("sprite/crane.png"));
							revalidate();
							repaint();
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							removeAll();
							frame.setContentPane(new printMap(level));
						} finally {
							lock.unlock();
						}
						revalidate();
						repaint();
					} else if (map[(indexm4 - (indexm4 % 20)) / 20][indexm4 % 20] == 'B') {
						JLabel empt = new JLabel();
						empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64,
								64, Image.SCALE_DEFAULT)));
						lock.lock();
						try {
							map[(indm4 - (indm4 % 20)) / 20][indm4 % 20] = 'N';
							remove(indm4);
							add(empt, indm4);
						} finally {
							lock.unlock();
						}
						revalidate();
						repaint();
					}
				}
			}
		}

		/**
		 * This class allows the fireball to move on the panel
		 * @author chris
		 *
		 */
		public class RunImplball implements Runnable {

			public void run() {

				f1.setIcon(new ImageIcon(new ImageIcon("sprite/Fireball.gif").getImage().getScaledInstance(64, 64,
						Image.SCALE_DEFAULT)));
				int index = getComponentZOrder(l), index2 = getComponentZOrder(l);
				index2 -= oldxDelta;
				index2 -= (oldyDelta * 20);
				lock.lock();
				try {
					remove(index2);
					add(f1, index2);
				} finally {
					lock.unlock();
				}
				boolean rb = false;
				while (!br) {

					index -= oldxDelta;
					index -= (oldyDelta * 20);
					try {
						if (map[(index - (index % 20)) / 20][index % 20] == 'N' && !rb) {
							lock.lock();
							try {
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								map[(index - (index % 20)) / 20][index % 20] = 'B';
								setComponentZOrder(getComponent(index), index2);
								setComponentZOrder(f1, index);
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(200);
						} else if (map[(index - (index % 20)) / 20][index % 20] == 'A'
								|| map[(((index + oldxDelta * 2) + (oldyDelta * 20) * 2)
										- (((index + oldxDelta * 2) + (oldyDelta * 20) * 2) % 20))
										/ 20][((index + oldxDelta * 2) + (oldyDelta * 20) * 2) % 20] == 'A') {
							JLabel empt = new JLabel();
							empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage()
									.getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
							lock.lock();
							try {
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								remove(index2);
								add(empt, index2);
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							br = true;
						} else if (map[(((index + oldxDelta * 2) + (oldyDelta * 20) * 2)
								- (((index + oldxDelta * 2) + (oldyDelta * 20) * 2) % 20))
								/ 20][((index + oldxDelta * 2) + (oldyDelta * 20) * 2) % 20] == 'N') {
							rb = true;
							index += oldxDelta * 2;
							index += (oldyDelta * 20) * 2;
							lock.lock();
							try {
								map[(index - (index % 20)) / 20][index % 20] = 'B';
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								setComponentZOrder(getComponent(index), index2);
								setComponentZOrder(f1, index);
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(200);
						} else if (map[(index - (index % 20)) / 20][index % 20] == 'I' && !rb) {
							JLabel empt = new JLabel();
							empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage()
									.getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
							move1 = false;
							lock.lock();
							try {
								map[(index - (index % 20)) / 20][index % 20] = 'B';
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								remove(index2);
								add(empt, index2);
								remove(index);
								add(f1, index);
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(200);
						} else if (map[(((index + oldxDelta * 2) + (oldyDelta * 20) * 2)
								- (((index + oldxDelta * 2) + (oldyDelta * 20) * 2) % 20))
								/ 20][((index + oldxDelta * 2) + (oldyDelta * 20) * 2) % 20] == 'I') {
							JLabel empt = new JLabel();
							empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage()
									.getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
							move1 = false;
							rb = true;
							index += oldxDelta * 2;
							index += (oldyDelta * 20) * 2;
							lock.lock();
							try {
								map[(index - (index % 20)) / 20][index % 20] = 'B';
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								remove(index2);
								add(empt, index2);
								remove(index);
								add(f1, index);
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(200);
						} else if (map[(index - (index % 20)) / 20][index % 20] == 'J' && !rb) {
							JLabel empt = new JLabel();
							empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage()
									.getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
							move2 = false;
							lock.lock();
							try {
								map[(index - (index % 20)) / 20][index % 20] = 'B';
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								remove(index2);
								add(empt, index2);
								remove(index);
								add(f1, index);
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(200);
						} else if (map[(((index + oldxDelta * 2) + (oldyDelta * 20) * 2)
								- (((index + oldxDelta * 2) + (oldyDelta * 20) * 2) % 20))
								/ 20][((index + oldxDelta * 2) + (oldyDelta * 20) * 2) % 20] == 'J') {
							JLabel empt = new JLabel();
							empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage()
									.getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
							move2 = false;
							rb = true;
							index += oldxDelta * 2;
							index += (oldyDelta * 20) * 2;
							lock.lock();
							try {
								map[(index - (index % 20)) / 20][index % 20] = 'B';
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								remove(index2);
								add(empt, index2);
								remove(index);
								add(f1, index);
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(200);
						} else if (map[(index - (index % 20)) / 20][index % 20] == 'K' && !rb) {
							JLabel empt = new JLabel();
							empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage()
									.getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
							move3 = false;
							lock.lock();
							try {
								map[(index - (index % 20)) / 20][index % 20] = 'B';
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								remove(index2);
								add(empt, index2);
								remove(index);
								add(f1, index);
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(200);
						} else if (map[(((index + oldxDelta * 2) + (oldyDelta * 20) * 2)
								- (((index + oldxDelta * 2) + (oldyDelta * 20) * 2) % 20))
								/ 20][((index + oldxDelta * 2) + (oldyDelta * 20) * 2) % 20] == 'K') {
							JLabel empt = new JLabel();
							empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage()
									.getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
							move3 = false;
							rb = true;
							index += oldxDelta * 2;
							index += (oldyDelta * 20) * 2;
							lock.lock();
							try {
								map[(index - (index % 20)) / 20][index % 20] = 'B';
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								remove(index2);
								add(empt, index2);
								remove(index);
								add(f1, index);
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(200);
						} else if (map[(index - (index % 20)) / 20][index % 20] == 'L' && !rb) {
							JLabel empt = new JLabel();
							empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage()
									.getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
							move4 = false;
							lock.lock();
							try {
								map[(index - (index % 20)) / 20][index % 20] = 'B';
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								remove(index2);
								add(empt, index2);
								remove(index);
								add(f1, index);
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(200);
						} else if (map[(((index + oldxDelta * 2) + (oldyDelta * 20) * 2)
								- (((index + oldxDelta * 2) + (oldyDelta * 20) * 2) % 20))
								/ 20][((index + oldxDelta * 2) + (oldyDelta * 20) * 2) % 20] == 'L') {
							JLabel empt = new JLabel();
							empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage()
									.getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
							move4 = false;
							rb = true;
							index += oldxDelta * 2;
							index += (oldyDelta * 20) * 2;
							lock.lock();
							try {
								map[(index - (index % 20)) / 20][index % 20] = 'B';
								map[(index2 - (index2 % 20)) / 20][index2 % 20] = 'N';
								remove(index2);
								add(empt, index2);
								remove(index);
								add(f1, index);
							} finally {
								lock.unlock();
							}
							revalidate();
							repaint();
							TimeUnit.MILLISECONDS.sleep(200);
						} else {
							index += oldxDelta;
							index += (oldyDelta * 20);
							rb = false;
						}
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					index2 = index;
				}
			}
		}
	}
}
