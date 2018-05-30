package view;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

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
        window.setSize(1290, 840);
        window.setTitle("Lorann");
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();
        window.setLayout(null);
        window.getContentPane().setBackground(Color.black);
        
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
                    window.add(l);
                    break;
                case 'B': 
                    ImageIcon fireball = new ImageIcon(new ImageIcon("sprite/Fireball.gif").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel f1 = new JLabel();
                    f1.setIcon(fireball);
                    f1.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    window.add(f1);
                    break;
                case 'C': 
                    ImageIcon crystall_ball = new ImageIcon(new ImageIcon("sprite/crystal_ball.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel c = new JLabel();
                    c.setIcon(crystall_ball);
                    c.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    window.add(c);
                    break;
                case 'D': 
                    ImageIcon gate_closed = new ImageIcon(new ImageIcon("sprite/gate_closed.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel gc = new JLabel();
                    gc.setIcon(gate_closed);
                    gc.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    window.add(gc);
                    break;
                case 'E': 
                    ImageIcon gate_open = new ImageIcon(new ImageIcon("sprite/gate_open.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel go = new JLabel();
                    go.setIcon(gate_open);
                    go.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    window.add(go);
                    break;
                case 'F':
                    ImageIcon bone = new ImageIcon(new ImageIcon("sprite/bone.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel bo = new JLabel();
                    bo.setIcon(bone);
                    bo.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    window.add(bo);
                    break;
                case 'G': 
                    ImageIcon bone_horizontal = new ImageIcon(new ImageIcon("sprite/horizontal_bone.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel bh = new JLabel();
                    bh.setIcon(bone_horizontal);
                    bh.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    window.add(bh); 
                    break;
                case 'H': 
                    ImageIcon vertical_bone = new ImageIcon(new ImageIcon("sprite/vertical_bone.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel vb = new JLabel();
                    vb.setIcon(vertical_bone);
                    vb.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    window.add(vb); 
                    break;
                case 'I':          
                    ImageIcon monster_1 = new ImageIcon(new ImageIcon("sprite/monster_1.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel m1 = new JLabel();
                    m1.setIcon(monster_1);
                    m1.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    window.add(m1); 
                    break;
                case 'J':          
                    ImageIcon monster_2 = new ImageIcon(new ImageIcon("sprite/monster_2.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel m2 = new JLabel();
                    m2.setIcon(monster_2);
                    m2.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    window.add(m2); 
                    break;
                case 'K':
                    ImageIcon monster_3 = new ImageIcon(new ImageIcon("sprite/monster_3.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel m3 = new JLabel();
                    m3.setIcon(monster_3);
                    m3.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    window.add(m3); 
                    break;
                case 'L':
                    ImageIcon monster_4 = new ImageIcon(new ImageIcon("sprite/monster_4.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel m4 = new JLabel();
                    m4.setIcon(monster_4);
                    m4.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    window.add(m4); 
                    break;
                case 'M':
                    ImageIcon purse = new ImageIcon(new ImageIcon("sprite/purse.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel p = new JLabel();
                    p.setIcon(purse);
                    p.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    window.add(p);
                    break;
                case 'N':
                    ImageIcon empty = new ImageIcon(new ImageIcon("sprite/empty.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                    JLabel empt = new JLabel();
                    empt.setIcon(empty); 
                    empt.setBounds((i%20)*64, ((i-(i%20))/20)*42, (i%20)*64+64, ((i-(i%20))/20)*42+64);
                    window.add(empt);
                    break;
            }
            //Graphics g;
            //pan.paint(g);
            int score = 0;
            JTextArea textArea = new JTextArea("Votre score est :" + score, 432, 50);
            textArea.setSelectedTextColor(Color.white);
        }
        window.setVisible(true);
    }
}
