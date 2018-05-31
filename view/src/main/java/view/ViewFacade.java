package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade extends JFrame implements IView {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5606686993021480646L;

	/**
	 * ViewFacade.
	 * 
	 * @param level.
	 * 
	 */
	public void ViewFacade(String level) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                JFrame frame = new JFrame("Lorann");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new printMap(level));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setResizable(true);
                frame.setVisible(true);
            }
        });
    }

    public class printMap extends JPanel {

		private static final long serialVersionUID = 1L;
		private JLabel l = new JLabel();
		private int points = 0;
		private char map[][] = { {'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
								 {'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
								 {'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
								 {'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
								 {'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
								 {'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
								 {'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
								 {'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
								 {'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
								 {'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
								 {'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
								 {'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'} };

        public printMap(String level) {
        	setBackground(Color.black);
            setLayout(new GridLayout(13, 20));
            
            for (int y = 0; y < 12; y++)
            {
                for (int x = 0; x < 20; x++) {
                	char caracter = level.charAt(x+y*20);
                    switch (caracter)
                    {
                        case 'A':
                            //JLabel l = new JLabel();
                            l.setIcon(new ImageIcon(new ImageIcon("sprite/Lorann.gif").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                            //l.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                            add(l);
                            map[y][x] = caracter;
                            break;
                        case 'B':
                            JLabel f1 = new JLabel();
                            f1.setIcon(new ImageIcon(new ImageIcon("sprite/Fireball.gif").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                            //f1.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                            add(f1);
                            map[y][x] = caracter;
                            break;
                        case 'C':
                            JLabel c = new JLabel();
                            c.setIcon(new ImageIcon(new ImageIcon("sprite/crystal_ball.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                            //c.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                            add(c);
                            map[y][x] = caracter;
                            break;
                        case 'D':
                            JLabel gc = new JLabel();
                            gc.setIcon(new ImageIcon(new ImageIcon("sprite/gate_closed.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                            //gc.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                            add(gc);
                            map[y][x] = caracter;
                            break;
                        case 'E':
                            JLabel go = new JLabel();
                            go.setIcon(new ImageIcon(new ImageIcon("sprite/gate_open.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                            //go.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                            add(go);
                            map[y][x] = caracter;
                            break;
                        case 'F':
                            JLabel bo = new JLabel();
                            bo.setIcon(new ImageIcon(new ImageIcon("sprite/bone.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                            //bo.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                            add(bo);
                            map[y][x] = caracter;
                            break;
                        case 'G':
                            JLabel hb = new JLabel();
                            hb.setIcon(new ImageIcon(new ImageIcon("sprite/horizontal_bone.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                            //bh.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                            add(hb);
                            map[y][x] = caracter;
                            break;
                        case 'H':
                            JLabel vb = new JLabel();
                            vb.setIcon(new ImageIcon(new ImageIcon("sprite/vertical_bone.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                            //vb.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                            add(vb);
                            map[y][x] = caracter;
                            break;
                        case 'I':
                            JLabel m1 = new JLabel();
                            m1.setIcon(new ImageIcon(new ImageIcon("sprite/monster_1.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                            //m1.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                            add(m1);
                            map[y][x] = caracter;
                            break;
                        case 'J':
                            JLabel m2 = new JLabel();
                            m2.setIcon(new ImageIcon(new ImageIcon("sprite/monster_2.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                            //m2.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                            add(m2);
                            map[y][x] = caracter;
                            break;
                        case 'K':
                            JLabel m3 = new JLabel();
                            m3.setIcon(new ImageIcon(new ImageIcon("sprite/monster_3.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                            //m3.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                            add(m3);
                            map[y][x] = caracter;
                            break;
                        case 'L':
                            JLabel m4 = new JLabel();
                            m4.setIcon(new ImageIcon(new ImageIcon("sprite/monster_4.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                            //m4.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                            add(m4);
                            map[y][x] = caracter;
                            break;
                        case 'M':
                            JLabel p = new JLabel();
                            p.setIcon(new ImageIcon(new ImageIcon("sprite/purse.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                            //p.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                            add(p);
                            map[y][x] = caracter;
                            break;
                        case 'N':
                            JLabel empt = new JLabel();
                            empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT))); 
                            //empt.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                            add(empt);
                            map[y][x] = caracter;
                            break;
                    }
                }
            }
            for (int i = 0; i < 20; i++) {
            	if (i == 8) {
            		JLabel t = new JLabel("Poin");
            		Font font = new Font("Arial",Font.BOLD,30);
            		t.setForeground(Color.red);
            		t.setFont(font);
                    add(t);
                    continue;
            	}
            	else if (i == 9) {
            		JLabel t = new JLabel("ts : ");
            		Font font = new Font("Arial",Font.BOLD,30);
            		t.setForeground(Color.red);
            		t.setFont(font);
                    add(t);
                    continue;
            	}
            	else if (i == 10) {
            		JLabel t = new JLabel(Integer.toString(points));
            		Font font = new Font("Arial",Font.BOLD,30);
            		t.setForeground(Color.red);
            		t.setFont(font);
                    add(t);
                    continue;
            	}
            	JLabel empt = new JLabel();
                empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                add(empt);
            }

            addKeyBinding("left", KeyEvent.VK_Q, new MoveAction(-1, 0, level));
            addKeyBinding("right", KeyEvent.VK_D, new MoveAction(1, 0, level));
            addKeyBinding("up", KeyEvent.VK_Z, new MoveAction(0, -1, level));
            addKeyBinding("down", KeyEvent.VK_S, new MoveAction(0, 1, level));
        }

        /**
         * add keyBinding.
         * @param name
         * 
         * @param keyCode
         * 
         * @param action
         */
        protected void addKeyBinding(String name, int keyCode, Action action) {
            InputMap inputMap = getInputMap(WHEN_IN_FOCUSED_WINDOW);
            ActionMap actionMap = getActionMap();

            inputMap.put(KeyStroke.getKeyStroke(keyCode, 0), name);
            actionMap.put(name, action);
        }

        public class MoveAction extends AbstractAction {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private final int xDelta, yDelta;
			private final String level;
			
            public MoveAction(int xDelta, int yDelta, String level) {
                this.xDelta = xDelta;
                this.yDelta = yDelta;
                this.level = level;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
            	
                int index = getComponentZOrder(l), index2 = getComponentZOrder(l);
                index += xDelta;
                index += (yDelta * 20);
                if (index < 0) {
                    index = 0;
                } else if (index >= getComponentCount()) {
                    index = getComponentCount() - 1;
                }
                if (map[(index-(index%20))/20][index%20] == 'N') {
	                setComponentZOrder(getComponent(index), index2);
	                map[(index2 -(index2%20))/20][index2%20] = 'N';
	                setComponentZOrder(l, index);
	                map[(index-(index%20))/20][index%20] = 'A';
                }
                else if (map[(index-(index%20))/20][index%20] == 'C') {
                	JLabel empt = new JLabel();
                    empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
	                remove(index);
	                add(empt, index2);
	                JLabel go = new JLabel();
                    go.setIcon(new ImageIcon(new ImageIcon("sprite/gate_open.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
	                for (int y = 0; y < 12; y++) {
	                	for (int x = 0; x < 20; x++) {
	                		if (level.charAt(x+y*20) == 'D') {
	                			remove(x+y*20);
	                			add(go, (x+y*20));
	                		}
	                	}
	                }
	                map[(index2 -(index2%20))/20][index2%20] = 'N';
	                setComponentZOrder(l, index);
	                map[(index-(index%20))/20][index%20] = 'A';
                }
                else if (map[(index-(index%20))/20][index%20] == 'M') {
                	points += 65;
                	JLabel t = new JLabel(Integer.toString(points));
            		Font font = new Font("Arial",Font.BOLD,30);
            		t.setForeground(Color.red);
            		t.setFont(font);
                	remove(250);
                	add(t, 250);
                	JLabel empt = new JLabel();
                    empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
	                remove(index);
	                add(empt, index2);
	                map[(index2 -(index2%20))/20][index2%20] = 'N';
	                setComponentZOrder(l, index);
	                map[(index-(index%20))/20][index%20] = 'A';
                }
                
                revalidate();
                repaint();
            }

        }

    }
}
