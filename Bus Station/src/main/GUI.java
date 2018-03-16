package main;
import user.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame {

	public static void main (String [] args)
	{
		MyClass act = new MyClass();
		JFrame frame1 = new JFrame ( "temp");
		frame1.setVisible(true);
		frame1.setSize(1000, 800);
		frame1.setResizable(false);
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel p=new JPanel ();
		frame1.add(p);
		p.setLayout(null);
		JButton b1= new JButton ("Admin");
		JButton b2= new JButton ("Employee");
		p.add(b1);
		p.add(b2);
		b1.setBounds(0,0, 500, 800);
		b2.setBounds(500,0, 500, 800);
		b1.addActionListener(act);
		b2.addActionListener(act);
		
	}
	

}
 class MyClass implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String test = arg0.getActionCommand();
			System.out.print("!");

			if(test=="Admin")
			{
				System.out.print("!");
				Employee e=new Employee();
				e.welcome();
				
				
			}

			
		} 
		
		
	}