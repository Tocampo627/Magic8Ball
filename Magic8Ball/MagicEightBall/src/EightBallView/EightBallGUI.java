
package EightBallView;
import magiceightball.EightBallOptions;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTabbedPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class EightBallGUI extends JFrame {
    
    //Sizing 
    public static final int width=400;
    public static final int height= 500;
    
    //Panel Items
    
    private JPanel panel;
    private JLabel lblQuestion; // title of the app
    private JLabel lblWelcomeUsr;//Welcome the User text 
    private JLabel lblFortune;
    String x;
    //Buttons 
    private JButton btnGetAnswer;
    private JButton btnAgain;
    
    
    public EightBallOptions m8ball = new EightBallOptions();
    public EightBallGUI(){
        super();
        createPanel();
        setFrame();
        
    }
    private void createPanel(){
        super.setLayout(null);
        panel= new JPanel(null); 
        
        panel.setBounds(0, 0, 400, 470);
        //labels
        lblWelcomeUsr = new JLabel("Welcome");
        lblWelcomeUsr.setFont(new Font("Veranda", Font.BOLD,20));
        lblWelcomeUsr.setHorizontalAlignment(JLabel.CENTER);
        lblWelcomeUsr.setForeground(Color.pink);
        lblWelcomeUsr.setBounds(100,100,220,30);
        panel.add(lblWelcomeUsr);
        
        lblQuestion = new JLabel("Ask A Question...");
        lblQuestion.setFont(new Font("Veranda", Font.BOLD,20));
        lblQuestion.setHorizontalAlignment(JLabel.CENTER);
        lblQuestion.setForeground(Color.BLUE);
        lblQuestion.setBounds(100,150,220,30);
        panel.add(lblQuestion);
       
        
        //lblFortune = new JLabel("");
        lblFortune = new JLabel( String.valueOf( m8ball.FortuneSelection()));

        lblFortune.setFont(new Font("Veranda", Font.BOLD,20));
        lblFortune.setHorizontalAlignment(JLabel.CENTER);
        lblFortune.setForeground(Color.BLUE);
        lblFortune.setBounds(100,300,220,30);    
        lblFortune.setVisible(false);
        panel.add(lblFortune);
        
        
        //Buttons
        btnGetAnswer = new JButton("Get My Answer");
        btnGetAnswer.addActionListener(new GetAnswer1());
        btnGetAnswer.setBounds(100,200,200,60);
        panel.add(btnGetAnswer);
        
        btnAgain = new JButton("Again");
        btnAgain.addActionListener(new Again());
        btnAgain.setBounds(300,400,60,60);
        btnAgain.setVisible(false);    
        panel.add(btnAgain);
       //btnGetAnswer.setBounds(x,y,W,H);
        
       
       
       
      this.add(panel);
    }
    private void setFrame(){
        super.setTitle("Magic 8 Ball");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocation(200,100);
        super.setResizable(false);
        super.setSize(width,height);
        super.setVisible(true);
    }
    
    private class GetAnswer1 implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            lblFortune.setVisible(true);
           
            btnGetAnswer.setEnabled(false);
            btnAgain.setEnabled(true);
            btnAgain.setVisible(true);
            lblFortune.setVisible(true);
            m8ball.FortuneSelection();
        }
        
    }
    private class Again implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            btnAgain.setEnabled(false);
            btnGetAnswer.setEnabled(true);
            lblFortune.setVisible(false);
            //m8ball.FortuneSelection();
            
            
        }
        
    }
    
    
}
