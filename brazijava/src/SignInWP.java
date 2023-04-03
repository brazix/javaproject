import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SignInWP implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel imagePanel = new JPanel();
	JLabel Label = new JLabel("Bonjour les professeurs");
	ImageIcon student = new ImageIcon("/Users/mac/Desktop/javapp/src/assets/prof.png");
	
	JPanel authPanel = new JPanel();
	JLabel emailLabel = new JLabel("Email:");
	JLabel passwordLabel = new JLabel("Password:");
	JLabel repeatpassword = new JLabel("Repeat password:");
	JTextField email = new JTextField(20);
	JPasswordField password = new JPasswordField(20);
	JPasswordField password2 = new JPasswordField(20);
	
	JButton signinButton = new JButton("CREATE");
	JButton returnButton = new JButton("RETURN");
	
	SignInWP(){
		
		Label.setForeground(new Color(0xc71c1c));
		imagePanel.setBackground(new Color(0xc98318));
		imagePanel.setBounds(0,0,450,500);
		Label.setHorizontalTextPosition(JLabel.CENTER);
		Label.setVerticalTextPosition(JLabel.TOP);
		Label.setFont(new Font("MV Boli",Font.PLAIN,24));
		Label.setIconTextGap(40);
		Label.setIcon(student);
		imagePanel.add(Label);
		
		
		authPanel.setLayout(null);
		
		emailLabel.setForeground(new Color(0xc98318));
		passwordLabel.setForeground(new Color(0xc98318));
		repeatpassword.setForeground(new Color(0xc98318));
		emailLabel.setFont(new Font("Monospaced",Font.PLAIN,20));
		passwordLabel.setFont(new Font("Monospaced",Font.PLAIN,20));
		repeatpassword.setFont(new Font("Monospaced",Font.PLAIN,20));
		
		returnButton.addActionListener(this);
		

		signinButton.setBackground(new Color(0xc98318));
		signinButton.setOpaque(true);
		signinButton.setBorderPainted(false);
		signinButton.setFocusable(false);
		
		returnButton.setBackground(new Color(0xc98318));
		returnButton.setOpaque(true);
		returnButton.setBorderPainted(false);
		returnButton.setFocusable(false);
		
		authPanel.setBackground(new Color(0xc71c1c));
		authPanel.setBounds(453,0,550,500);
		
		email.setBounds(180,100,300,30);
		emailLabel.setBounds(100,100,300,30);
		
		password.setBounds(200,180,277,30);
		password2.setBounds(200,250,277,30);
		passwordLabel.setBounds(90,180,300,30);
		repeatpassword.setBounds(10,250,300,30);
		signinButton.setBounds(150,350,300,30);
		returnButton.setBounds(150,400,300,30);
		
		authPanel.add(emailLabel);
		authPanel.add(email);
		authPanel.add(passwordLabel);
		authPanel.add(password);
		authPanel.add(signinButton);
		authPanel.add(repeatpassword);
		authPanel.add(password2);
		authPanel.add(returnButton);
		
		
		frame.setTitle("ETUDIANTS");
		frame.setSize(1000,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(0xc71c1c));
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
			MainPageP mainpage = new MainPageP();
		}
		
	}
	
}