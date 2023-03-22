package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import comp_decomp.compressor;
import comp_decomp.deCompressor;


public  class appFrame extends JFrame implements ActionListener {
	
	JButton compressButton;
	JButton deCompressButton;
	
	
	public appFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		compressButton = new JButton("Select file tocompress");
		compressButton.setBounds(20, 100, 200, 30);
		compressButton.addActionListener(this);
		
		deCompressButton = new JButton("Select file de_compress");
		deCompressButton.setBounds(250, 100, 200, 30);
		deCompressButton.addActionListener(this);
		
		this.add(compressButton);
		this.add(deCompressButton);
		this.setSize(1000,500);
		this.getContentPane().setBackground(Color.RED);
		this.setVisible(true);
		
		
		
	}
	
	public void ActionPerformed(ActionEvent e) {
		if(e.getSource()==compressButton) {
			JFileChooser fileChooser=new JFileChooser();
			int response=fileChooser.showSaveDialog(null);
			if(response==JFileChooser.APPROVE_OPTION) {
				File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.print(file);
				try {
					compressor.method(file);
				}
				catch(Exception ee) {
					JOptionPane.showMessageDialog(null,e.toString());
					
				}
			}
		}
		
		if(e.getSource()==deCompressButton) {
			JFileChooser fileChooser=new JFileChooser();
			int response=fileChooser.showSaveDialog(null);
			if(response==JFileChooser.APPROVE_OPTION) {
				File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.print(file);
				try {
					deCompressor.method(file);
				}
				catch(Exception ee) {
					JOptionPane.showMessageDialog(null, e.toString());
					
				}
			}
		}
	}
	

}
