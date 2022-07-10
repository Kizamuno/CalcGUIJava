

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tempchange {

	private JFrame frame;
	private JTextField txtdisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tempchange window = new tempchange();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tempchange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 511, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		txtdisplay = new JTextField();
		txtdisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtdisplay.setText("-------");
		txtdisplay.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 47));
		txtdisplay.setBounds(10, 11, 475, 89);
		frame.getContentPane().add(txtdisplay);
		txtdisplay.setColumns(10);
		
		JButton jbnclear = new JButton("AC");
		jbnclear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbnclear.setBounds(10, 111, 90, 90);
		frame.getContentPane().add(jbnclear);
		
		JButton jbtnsign = new JButton("+/-");
		jbtnsign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbtnsign.setBounds(120, 111, 90, 90);
		frame.getContentPane().add(jbtnsign);
		
		JButton jbtnmod = new JButton("%");
		jbtnmod.setBounds(230, 111, 90, 90);
		frame.getContentPane().add(jbtnmod);
		
		JButton jbtn7 = new JButton("7");
		jbtn7.setBounds(10, 212, 90, 90);
		frame.getContentPane().add(jbtn7);
		
		JButton jbtn8 = new JButton("8");
		jbtn8.setBounds(120, 212, 90, 90);
		frame.getContentPane().add(jbtn8);
		
		JButton jbtn9 = new JButton("9");
		jbtn9.setBounds(230, 212, 90, 90);
		frame.getContentPane().add(jbtn9);
		
		JButton jbtn4 = new JButton("4");
		jbtn4.setBounds(10, 313, 90, 90);
		frame.getContentPane().add(jbtn4);
		
		JButton jbtn5 = new JButton("5");
		jbtn5.setBounds(120, 313, 90, 90);
		frame.getContentPane().add(jbtn5);
		
		JButton jbtn6 = new JButton("6");
		jbtn6.setBounds(230, 313, 90, 90);
		frame.getContentPane().add(jbtn6);
		
		JButton jbtn1 = new JButton("1");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtdisplay.getText();
				
				if( Enternumber == "" ) 
				{
					txtdisplay.setText(jbtn1.getText());
				}
				
				else  
				{
					txtdisplay.setText(" ");
					Enternumber = txtdisplay.getText() + jbtn1.getText();
					txtdisplay.setText(Enternumber);
				}
			}
		});
		jbtn1.setBounds(10, 414, 90, 90);
		frame.getContentPane().add(jbtn1);
		
		JButton jbtn2 = new JButton("2");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtdisplay.getText();
				
				if( Enternumber == "" ) 
				{
					txtdisplay.setText(jbtn2.getText());
				}
				
				else  
				{
					txtdisplay.setText(" ");
					Enternumber = txtdisplay.getText() + jbtn2.getText();
					txtdisplay.setText(Enternumber);
				}
			}
		});
		jbtn2.setBounds(120, 414, 90, 90);
		frame.getContentPane().add(jbtn2);
		
		JButton jbtn3 = new JButton("3");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtdisplay.getText();
				
				if( Enternumber == " " ) 
				{
					txtdisplay.setText(jbtn3.getText());
				}
				
				else  
				{
					txtdisplay.setText(" ");
					Enternumber = txtdisplay.getText() + jbtn3.getText();
					txtdisplay.setText(Enternumber);
				}
				
			}
		});
		jbtn3.setBounds(230, 414, 90, 90);
		frame.getContentPane().add(jbtn3);
		
		JButton jbtnplus = new JButton("+");
		jbtnplus.setBounds(330, 414, 155, 90);
		frame.getContentPane().add(jbtnplus);
		
		JButton jbtnminus = new JButton("_");
		jbtnminus.setBounds(330, 313, 155, 90);
		frame.getContentPane().add(jbtnminus);
		
		JButton jbtntime = new JButton("X");
		jbtntime.setBounds(330, 212, 155, 90);
		frame.getContentPane().add(jbtntime);
		
		JButton jbtndevide = new JButton("/");
		jbtndevide.setBounds(330, 111, 155, 90);
		frame.getContentPane().add(jbtndevide);
		
		JButton jbtnequal = new JButton("=");
		jbtnequal.setBounds(330, 515, 155, 90);
		frame.getContentPane().add(jbtnequal);
		
		JButton jbnt0 = new JButton("0");
		jbnt0.setBounds(10, 515, 200, 90);
		frame.getContentPane().add(jbnt0);
		
		JButton jbtndot = new JButton(".");
		jbtndot.setBounds(230, 515, 90, 90);
		frame.getContentPane().add(jbtndot);
	}
}
