import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.awt.event.ActionEvent;

public class MenuEkrani {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuEkrani window = new MenuEkrani();
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
	public MenuEkrani() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Oyuncu vs Bilgisayar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				OyuncuvsBilgisayar oyvsbil = new OyuncuvsBilgisayar();
				oyvsbil.setVisible(true);
			}
		});
		btnNewButton.setBounds(300, 120, 177, 70);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Bilgisayar vs Bilgisayar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				BilgisayarvsBilgisayar bilvsbil = new BilgisayarvsBilgisayar();
				bilvsbil.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(300, 237, 177, 70);
		frame.getContentPane().add(btnNewButton_1);
	}
	
    
	
}
