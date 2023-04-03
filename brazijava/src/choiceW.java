

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class choiceW implements ActionListener{
	JFrame frame ;
	JPanel panelEtudiant;
	JPanel panelProf;
	JButton buttonEtudiant;
	JButton buttonProf;
	JLabel labelEtudiant;
	JLabel labelProf;

	choiceW(){
		frame = new JFrame();
		panelEtudiant = new JPanel();
		panelProf = new JPanel();
		buttonEtudiant = new JButton("Cliquez ici");
		buttonProf = new JButton("Cliquez ici");
		labelEtudiant = new JLabel("Un etudiant");
		labelProf = new JLabel("Un professeur");
		
		
		
		
		panelEtudiant.setBackground(new Color(0x1f9162));
		panelEtudiant.setBounds(0,0,500,500);
		panelProf.setBackground(new Color(0xc98318));
		panelProf.setBounds(500,0,500,500);
		
		labelEtudiant.setForeground(new Color(0x123456));
		labelProf.setForeground(new Color(0xc71c1c));
		labelEtudiant.setFont(new Font("MV Boli",Font.BOLD,24));
		labelProf.setFont(new Font("MV Boli",Font.BOLD,24));
		labelEtudiant.setBounds(170,70,200,100);
		labelProf.setBounds(170,70,200,100);
		
		buttonEtudiant.setBackground(new Color(0x123456));
		buttonEtudiant.setOpaque(true);
		buttonEtudiant.setBorderPainted(false);
		buttonEtudiant.setFocusable(false);
		
		
		
		buttonProf.setBackground(new Color(0xc71c1c));
		buttonProf.setOpaque(true);
		buttonProf.setBorderPainted(false);
		buttonProf.setFocusable(false);
		
		buttonEtudiant.setFont(new Font("MV Boli",Font.PLAIN,24));
		buttonProf.setFont(new Font("MV Boli",Font.PLAIN,24));
		
		buttonEtudiant.setBounds(150,250,200,100);
		buttonProf.setBounds(150,250,200,100);
		
		buttonEtudiant.addActionListener(this);
		buttonProf.addActionListener(this);
		
		panelProf.add(labelProf);
		panelEtudiant.add(labelEtudiant);
		panelProf.add(buttonProf);
		panelEtudiant.add(buttonEtudiant);
		
		panelEtudiant.setLayout(null);
		panelProf.setLayout(null);
		
		frame.setTitle("ETUDIANTS");
		frame.setSize(1000,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(null);
		
		frame.add(panelEtudiant);
		frame.add(panelProf);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==buttonEtudiant) {
			frame.dispose();
			MainPageE mainpage = new MainPageE();
		
		}
		if(e.getSource()==buttonProf) {
			frame.dispose();
			MainPageP mainpage = new MainPageP();
		}

}
}
