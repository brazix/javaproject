import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Arrays;

import javax.swing.*;

public class SignInWE implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel imagePanel = new JPanel();
	JLabel Label = new JLabel("Bonjour les etudiants");
	ImageIcon student = new ImageIcon("/Users/mac/Desktop/javapp/src/assets/student.png");
	
	JPanel authPanel = new JPanel();
	JLabel emailLabel = new JLabel("Email:");
	JLabel passwordLabel = new JLabel("Password:");
	JLabel repeatpassword = new JLabel("Repeat password:");
	JTextField email = new JTextField(20);
	JPasswordField password = new JPasswordField(20);
	JPasswordField password2 = new JPasswordField(20);
	
	JButton signinButton = new JButton("CREATE");
	JButton returnButton = new JButton("RETURN");
	JLabel error = new JLabel("Unmatching passwords!");
	
	SignInWE(){
		
		Label.setForeground(new Color(0x123456));
		imagePanel.setBackground(new Color(0x1f9162));
		imagePanel.setBounds(0,0,450,500);
		Label.setHorizontalTextPosition(JLabel.CENTER);
		Label.setVerticalTextPosition(JLabel.TOP);
		Label.setFont(new Font("MV Boli",Font.PLAIN,24));
		Label.setIconTextGap(40);
		Label.setIcon(student);
		imagePanel.add(Label);
		
		
		authPanel.setLayout(null);
		
		emailLabel.setForeground(new Color(0x1f9162));
		passwordLabel.setForeground(new Color(0x1f9162));
		repeatpassword.setForeground(new Color(0x1f9162));
		emailLabel.setFont(new Font("Monospaced",Font.PLAIN,20));
		passwordLabel.setFont(new Font("Monospaced",Font.PLAIN,20));
		repeatpassword.setFont(new Font("Monospaced",Font.PLAIN,20));
		
		error.setFont(new Font("Monospaced",Font.PLAIN,20));
		error.setForeground(new Color(0xd41515));
		
		returnButton.addActionListener(this);
		signinButton.addActionListener(this);
		

		signinButton.setBackground(new Color(0x1f9162));
		signinButton.setOpaque(true);
		signinButton.setBorderPainted(false);
		signinButton.setFocusable(false);
		
		returnButton.setBackground(new Color(0x1f9162));
		returnButton.setOpaque(true);
		returnButton.setBorderPainted(false);
		returnButton.setFocusable(false);
		
		authPanel.setBackground(new Color(0x123456));
		authPanel.setBounds(453,0,550,500);
		
		email.setBounds(180,100,300,30);
		emailLabel.setBounds(100,100,300,30);
		
		password.setBounds(200,180,277,30);
		password2.setBounds(200,250,277,30);
		passwordLabel.setBounds(90,180,300,30);
		repeatpassword.setBounds(10,250,300,30);
		signinButton.setBounds(150,350,300,30);
		returnButton.setBounds(150,400,300,30);
		
		error.setBounds(150,300,300,30);
		
		
		error.setVisible(false);
		
		authPanel.add(emailLabel);
		authPanel.add(email);
		authPanel.add(passwordLabel);
		authPanel.add(password);
		authPanel.add(signinButton);
		authPanel.add(repeatpassword);
		authPanel.add(password2);
		authPanel.add(returnButton);
		authPanel.add(error);
		
		
		frame.setTitle("ETUDIANTS");
		frame.setSize(1000,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(0x123456));
		frame.setLayout(null);
		frame.add(imagePanel);
		frame.add(authPanel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==returnButton) {
			frame.dispose();
			MainPageE mainpage = new MainPageE();
		}
		if(e.getSource()==signinButton) {
			
	//			System.out.println("pass1: "+ String.valueOf(password.getPassword())+"\npass2: "+String.valueOf(password.getPassword()));
				
			if(Arrays.equals(password.getPassword(), password2.getPassword())) {
				error.setVisible(false);
				DataBase db = new DataBase();
				Connection conn = db.connect_to_db("JDBC","postgres", "paontri");
				db.register1(conn, "etudiants", email.getText(), String.valueOf(password.getPassword()));
			}
			else {
				error.setVisible(true);
				signinButton.addActionListener(this);
			}
			
		}
	}
	
}