package view;

import javax.swing.JOptionPane;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void printMap(String level) {
    	JFrame window = new JFrame();
        window.setSize(640, 416);
        window.setTitle("Lorann");
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();
        pan.setBackground(Color.BLACK);
        
        for (int i = 0; i != 240; i++)
        {
            char caracter = level.charAt(i);
            switch (caracter)
            {
                case 'A': 
                    Icon laurann = new ImageIcon("/sprite/Laurann.gif");
                    JLabel l = new JLabel();
                    l.setIcon(laurann); 
                    pan.add(l);
                    break;
                case 'B': 
                    Icon fireball = new ImageIcon("/sprite/fireball.gif");
                    JLabel f1 = new JLabel();
                    f1.setIcon(fireball); 
                    pan.add(f1);
                    break;
                case 'C': 
                    Icon crystall_ball = new ImageIcon("/sprite/crystal_ball.png");
                    JLabel c = new JLabel();
                    c.setIcon(crystall_ball); 
                    pan.add(c);
                    break;
                case 'D': 
                    Icon gate_closed = new ImageIcon("/sprite/gate_closed.png");
                    JLabel gc = new JLabel();
                    gc.setIcon(gate_closed); 
                    pan.add(gc);
                    break;
                case 'E': 
                    Icon gate_open = new ImageIcon("/sprite/gate_open.png");
                    JLabel go = new JLabel();
                    go.setIcon(gate_open); 
                    pan.add(go);
                    break;
                case 'F':
                    Icon bone = new ImageIcon("/sprite/bone.png");
                    JLabel bo = new JLabel();
                    bo.setIcon(bone); 
                    pan.add(bo);
                    break;
                case 'G': 
                    Icon bone_horizontal = new ImageIcon("/sprite/horizontal_bone.png");
                    JLabel bh = new JLabel();
                    bh.setIcon(bone_horizontal); 
                    pan.add(bh); 
                    break;
                case 'H': 
                    Icon vertical_bone = new ImageIcon("/sprite/vertical_bone.png");
                    JLabel vb = new JLabel();
                    vb.setIcon(vertical_bone); 
                    pan.add(vb); 
                    break;
                case 'I':          
                    Icon monster_1 = new ImageIcon("/sprite/monster_1.png");
                    JLabel m1 = new JLabel();
                    m1.setIcon(monster_1); 
                    pan.add(m1); 
                    break;
                case 'J':          
                    Icon monster_2 = new ImageIcon("/sprite/monster_2.png");
                    JLabel m2 = new JLabel();
                    m2.setIcon(monster_2); 
                    pan.add(m2); 
                    break;
                case 'K':          
                    Icon monster_3 = new ImageIcon("/sprite/monster_3.png");
                    JLabel m3 = new JLabel();
                    m3.setIcon(monster_3); 
                    pan.add(m3); 
                    break;
                case 'L':          
                    Icon monster_4 = new ImageIcon("/sprite/monster_4.png");
                    JLabel m4 = new JLabel();
                    m4.setIcon(monster_4); 
                    pan.add(m4); 
                    break;
                case 'M': 
                    Icon purse = new ImageIcon("/sprite/purse.png");
                    JLabel p = new JLabel();
                    p.setIcon(purse); 
                    pan.add(p);
                    break;
                case 'N':
                    Icon empty = new ImageIcon("/sprite/empty.png");
                    JLabel empt = new JLabel();
                    empt.setIcon(empty); 
                    pan.add(empt);
                    break;
            } 
        }
    }
}
