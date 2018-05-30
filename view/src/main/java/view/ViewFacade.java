package view;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade extends JFrame implements IView {

    /**
     * Instantiates a new view facade.
     */

    public ViewFacade() {
        super();
        this.setSize(1290, 840);
        this.setTitle("Lorann");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();
        this.setLayout(null);
        this.getContentPane().setBackground(Color.black);
        //addKeyListener(this);
    }

    public void printMap(String level) {
        
        for (int i = 0; i < 240; i++)
        {
            char caracter = level.charAt(i);
            switch (caracter)
            {
                case 'A': 
                    ImageIcon lorann = new ImageIcon(new ImageIcon("sprite/Lorann.gif").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel l = new JLabel();
                    l.setIcon(lorann);
                    l.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    this.add(l);
                    break;
                case 'B': 
                    ImageIcon fireball = new ImageIcon(new ImageIcon("sprite/Fireball.gif").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel f1 = new JLabel();
                    f1.setIcon(fireball);
                    f1.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    this.add(f1);
                    break;
                case 'C': 
                    ImageIcon crystall_ball = new ImageIcon(new ImageIcon("sprite/crystal_ball.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel c = new JLabel();
                    c.setIcon(crystall_ball);
                    c.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    this.add(c);
                    break;
                case 'D': 
                    ImageIcon gate_closed = new ImageIcon(new ImageIcon("sprite/gate_closed.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel gc = new JLabel();
                    gc.setIcon(gate_closed);
                    gc.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    this.add(gc);
                    break;
                case 'E': 
                    ImageIcon gate_open = new ImageIcon(new ImageIcon("sprite/gate_open.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel go = new JLabel();
                    go.setIcon(gate_open);
                    go.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    this.add(go);
                    break;
                case 'F':
                    ImageIcon bone = new ImageIcon(new ImageIcon("sprite/bone.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel bo = new JLabel();
                    bo.setIcon(bone);
                    bo.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    this.add(bo);
                    break;
                case 'G': 
                    ImageIcon bone_horizontal = new ImageIcon(new ImageIcon("sprite/horizontal_bone.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel bh = new JLabel();
                    bh.setIcon(bone_horizontal);
                    bh.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    this.add(bh); 
                    break;
                case 'H': 
                    ImageIcon vertical_bone = new ImageIcon(new ImageIcon("sprite/vertical_bone.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel vb = new JLabel();
                    vb.setIcon(vertical_bone);
                    vb.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    this.add(vb); 
                    break;
                case 'I':          
                    ImageIcon monster_1 = new ImageIcon(new ImageIcon("sprite/monster_1.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel m1 = new JLabel();
                    m1.setIcon(monster_1);
                    m1.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    this.add(m1); 
                    break;
                case 'J':          
                    ImageIcon monster_2 = new ImageIcon(new ImageIcon("sprite/monster_2.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel m2 = new JLabel();
                    m2.setIcon(monster_2);
                    m2.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    this.add(m2); 
                    break;
                case 'K':
                    ImageIcon monster_3 = new ImageIcon(new ImageIcon("sprite/monster_3.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel m3 = new JLabel();
                    m3.setIcon(monster_3);
                    m3.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    this.add(m3); 
                    break;
                case 'L':
                    ImageIcon monster_4 = new ImageIcon(new ImageIcon("sprite/monster_4.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel m4 = new JLabel();
                    m4.setIcon(monster_4);
                    m4.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    this.add(m4); 
                    break;
                case 'M':
                    ImageIcon purse = new ImageIcon(new ImageIcon("sprite/purse.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel p = new JLabel();
                    p.setIcon(purse);
                    p.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    this.add(p);
                    break;
                case 'N':
                    ImageIcon empty = new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel empt = new JLabel();
                    empt.setIcon(empty); 
                    empt.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    this.add(empt);
                    break;
            }
            
        }

        this.setVisible(true);
    }
    
    /*@Override
	public void keyPressed(KeyEvent key) {
		
		int touche = key.getKeyCode();
		
		switch (touche)
		{
        case KeyEvent.VK_Z: // si la touche enfoncée est celle du haut
        	System.out.println("z");
            //fonctionPourAvancer();
            break;
        case KeyEvent.VK_Q: // si la touche enfoncée est celle de gauche
        	System.out.println("q");
            //fonctionPourAllerAGauche();
            break;
        case KeyEvent.VK_S: // si la touche enfoncée est celle de droite
        	System.out.println("s");
            //fonctionPourAllerADroite();
            break;
        case KeyEvent.VK_D: // si la touche enfoncée est celle du bas
        	System.out.println("d");
            //fonctionPourReculer();
            break;
		}
    }*/
    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
/*    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}*/

}
