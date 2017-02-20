package com.zencherry.zcrypt;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ZCrypt {
    public static void main(String[] args) {
		JFrame frame1 = new JFrame("zCrypt.1.0 - By ZenCherry.com");
		frame1.setSize(400, 300);
		frame1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}        
		});
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel label4 = new JLabel("CTRL + A to Select all.");
		JLabel label5 = new JLabel("CTRL + C to Copy.");
		JLabel label6 = new JLabel("CTRL + V to Paste.");
		
		JLabel label7 = new JLabel("Password:");
		JLabel label8 = new JLabel("Text:");
		JLabel label9 = new JLabel("Result:");
		
		
		JButton buttonencrypt = new JButton("Encrypt");
		JButton buttondecrypt = new JButton("Decrypt");
		JButton buttonclean = new JButton("Clean");
		
		JTextField tpassword=new JTextField();
		JTextArea textarea = new JTextArea();
		JTextArea resultarea = new JTextArea();
		panel1.setLayout(new GridLayout(10, 1));
		panel2.setLayout(new GridLayout(1, 3));
		panel1.add(label7);
		panel1.add(tpassword);
		panel1.add(label8);
		panel1.add(textarea);
		panel1.add(label9);
		panel1.add(resultarea);
		panel2.add(buttonencrypt);
		panel2.add(buttondecrypt);
		panel2.add(buttonclean);		
		
		panel1.add(panel2);
		
		panel1.add(label4);
		panel1.add(label5);
		panel1.add(label6);
		
		frame1.add(panel1);
		
		buttonencrypt.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 Encrypt encrypt = new Encrypt();
	        	 resultarea.setText(encrypt.getString(textarea.getText(), tpassword.getText()));
	          }
	       });
		buttondecrypt.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 Decrypt decrypt = new Decrypt();
	        	 resultarea.setText(decrypt.getString(textarea.getText(), tpassword.getText()));
	        	 
	          }
	       });
		buttonclean.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 textarea.setText("");
	        	 tpassword.setText("");
	        	 resultarea.setText("");
	          }
	       });
		
		
		frame1.setVisible(true);
		
    }
}