package view;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
	private static final long serialVersionUID = 1L;
	/**
     * Instantiates a new view facade.
     */
	
	private JPanel pan = new JPanel();
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
    
	public ViewFacade() {
        super();
        
        setSize(1390, 940);
        setTitle("Lorann");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gl = new GridLayout(20, 13);
        setLayout(gl);
        pan.setBackground(Color.black);
        setContentPane(pan);
    }

	public void printMap(String level) {
        
        for (int y = 0; y < 12; y++)
        {
            for (int x = 0; x < 20; x++) {
            	char caracter = level.charAt(x+y*20);
                switch (caracter)
                {
                    case 'A':
                        JLabel l = new JLabel();
                        l.setIcon(new ImageIcon(new ImageIcon("sprite/Lorann.gif").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                        //l.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                        pan.add(l);
                        map[y][x] = caracter;
                        break;
                    case 'B':
                        JLabel f1 = new JLabel();
                        f1.setIcon(new ImageIcon(new ImageIcon("sprite/Fireball.gif").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                        //f1.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                        pan.add(f1);
                        map[y][x] = caracter;
                        break;
                    case 'C':
                        JLabel c = new JLabel();
                        c.setIcon(new ImageIcon(new ImageIcon("sprite/crystal_ball.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                        //c.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                        pan.add(c);
                        map[y][x] = caracter;
                        break;
                    case 'D':
                        JLabel gc = new JLabel();
                        gc.setIcon(new ImageIcon(new ImageIcon("sprite/gate_closed.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                        //gc.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                        pan.add(gc);
                        map[y][x] = caracter;
                        break;
                    case 'E':
                        JLabel go = new JLabel();
                        go.setIcon(new ImageIcon(new ImageIcon("sprite/gate_open.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                        //go.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                        pan.add(go);
                        map[y][x] = caracter;
                        break;
                    case 'F':
                        JLabel bo = new JLabel();
                        bo.setIcon(new ImageIcon(new ImageIcon("sprite/bone.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                        //bo.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                        pan.add(bo);
                        map[y][x] = caracter;
                        break;
                    case 'G':
                        JLabel hb = new JLabel();
                        hb.setIcon(new ImageIcon(new ImageIcon("sprite/horizontal_bone.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                        //bh.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                        pan.add(hb);
                        map[y][x] = caracter;
                        break;
                    case 'H':
                        JLabel vb = new JLabel();
                        vb.setIcon(new ImageIcon(new ImageIcon("sprite/vertical_bone.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                        //vb.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                        pan.add(vb);
                        map[y][x] = caracter;
                        break;
                    case 'I':
                        JLabel m1 = new JLabel();
                        m1.setIcon(new ImageIcon(new ImageIcon("sprite/monster_1.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                        //m1.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                        pan.add(m1);
                        map[y][x] = caracter;
                        break;
                    case 'J':
                        JLabel m2 = new JLabel();
                        m2.setIcon(new ImageIcon(new ImageIcon("sprite/monster_2.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                        //m2.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                        pan.add(m2);
                        map[y][x] = caracter;
                        break;
                    case 'K':
                        JLabel m3 = new JLabel();
                        m3.setIcon(new ImageIcon(new ImageIcon("sprite/monster_3.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                        //m3.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                        pan.add(m3);
                        map[y][x] = caracter;
                        break;
                    case 'L':
                        JLabel m4 = new JLabel();
                        m4.setIcon(new ImageIcon(new ImageIcon("sprite/monster_4.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                        //m4.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                        pan.add(m4);
                        map[y][x] = caracter;
                        break;
                    case 'M':
                        JLabel p = new JLabel();
                        p.setIcon(new ImageIcon(new ImageIcon("sprite/purse.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
                        //p.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                        pan.add(p);
                        map[y][x] = caracter;
                        break;
                    case 'N':
                        JLabel empt = new JLabel();
                        empt.setIcon(new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT))); 
                        //empt.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                        pan.add(empt);
                        map[y][x] = caracter;
                        break;
                }
            }
            /*int score = 0;
            JLabel textArea = new JLabel("Votre score est :" + score);
            textArea.setBounds(432, 50, 10, 10);
            textArea.setSelectedTextColor(Color.white);*/
        }
        this.setVisible(true);
    }
	
	public char getTypeBlock(int x, int y) {
		return map[y][x];
	}
	
	public int getLorannPosx() {
		for (int y = 0; y < 12; y++)
        {
            for (int x = 0; x < 20; x++) {
            	if (map[y][x] == 'A') {
            		return x;
            	}
            }
        }
		return 0;
	}
	
	public int getLorannPosy() {
		for (int y = 0; y < 12; y++)
        {
            for (int x = 0; x < 20; x++) {
            	if (map[y][x] == 'A') {
            		return y;
            	}
            }
        }
		return 0;
	}
	
	public void setLorannPos(int x, int y) {
		repaint();
	}
	
    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
