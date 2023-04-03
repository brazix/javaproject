import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainPageE implements ActionListener{
	JButton signinButton = new JButton("CREATE ACCOUNT");
	JButton submitButton = new JButton("LOGIN");
	JFrame frame = new JFrame();
	JPanel imagePanel = new JPanel();
	JLabel Label = new JLabel("Bonjour les etudiants");
	ImageIcon student = new ImageIcon("/Users/mac/Desktop/javapp/src/assets/student.png");
	JPanel authPanel = new JPanel();
	JLabel emailLabel = new JLabel("Email:");
	JLabel passwordLabel = new JLabel("Password:");
	JLabel signinLabel = new JLabel("Vous n'avez pas un compte??");
	JTextField email = new JTextField(20);
	JPasswordField password = new JPasswordField(20);
	JButton returnButton = new JButton("RETURN");
		MainPageE(){
			
			
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
			
//			JButton signinButton = new JButton("CREATE ACCOUNT");
//			JButton submitButton = new JButton("LOGIN");
			signinButton.addActionListener(this);
			returnButton.addActionListener(this);
			submitButton.addActionListener(this);
			
			returnButton.setBackground(new Color(0x1f9162));
			returnButton.setOpaque(true);
			returnButton.setBorderPainted(false);
			returnButton.setFocusable(false);
			returnButton.setBounds(150,400,300,30);
			
			
			
			//authPanel.setLayout(new BorderLayout());
			
			emailLabel.setForeground(new Color(0x1f9162));
			passwordLabel.setForeground(new Color(0x1f9162));
			signinLabel.setForeground(new Color(0x1f9162));
			emailLabel.setFont(new Font("Monospaced",Font.PLAIN,20));
			passwordLabel.setFont(new Font("Monospaced",Font.PLAIN,20));
			signinLabel.setFont(new Font("Monospaced",Font.PLAIN,20));
			
			submitButton.setBackground(new Color(0x1f9162));
			submitButton.setOpaque(true);
			submitButton.setBorderPainted(false);
			submitButton.setFocusable(false);
			
			signinButton.setBackground(new Color(0x1f9162));
			signinButton.setOpaque(true);
			signinButton.setBorderPainted(false);
			signinButton.setFocusable(false);
			
			authPanel.setBackground(new Color(0x123456));
			authPanel.setBounds(453,0,550,500);
			
			
			//emailLabel.setLabelFor(email);
			
			email.setBounds(180,100,300,30);
			emailLabel.setBounds(100,100,300,30);
			
			password.setBounds(200,180,277,30);
			passwordLabel.setBounds(90,180,300,30);
			
			signinLabel.setBounds(140,300,400,30);
			
			submitButton.setBounds(150,250,300,30);
			signinButton.setBounds(150,350,300,30);
			
			
			authPanel.add(emailLabel);
			authPanel.add(email);
			authPanel.add(passwordLabel);
			authPanel.add(password);
			authPanel.add(signinLabel);
			authPanel.add(submitButton);
			authPanel.add(signinButton);
			authPanel.add(returnButton);
			
			
			
		
			
			
			
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
			if(e.getSource()==signinButton) {
				frame.dispose();
				SignInWE signinwindow = new SignInWE();
			}
			if(e.getSource()==returnButton) {
				frame.dispose();
				choiceW choicepage = new choiceW();
			}
			
            if(e.getSource()==submitButton) {
            	JOptionPane.showMessageDialog(null, "Login successful!");
                frame.dispose();
			}
		}


		}