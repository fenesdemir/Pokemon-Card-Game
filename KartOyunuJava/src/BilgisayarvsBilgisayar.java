import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;

public class BilgisayarvsBilgisayar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int el = 0;
	private JTextField textField_bil1Skor;
	private JTextField textField_bil2Skor;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BilgisayarvsBilgisayar frame = new BilgisayarvsBilgisayar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
	}

	/**
	 * Create the frame.
	 */
public BilgisayarvsBilgisayar() {
			
		
		BilgisayarOyuncusu bilgisayar1 = new BilgisayarOyuncusu(3,"bilgisayar1",0);
	    BilgisayarOyuncusu bilgisayar2 = new BilgisayarOyuncusu(4,"bilgisayar2",0);
		
		Stack<Pokemon> stack = new Stack<Pokemon>();
		ArrayList<Integer> bilgisayarElde1 = new ArrayList<Integer>();
		ArrayList<Integer> bilgisayarElde2 = new ArrayList<Integer>();
		
		Pikachu pikachu = new Pikachu("pikachu", "elektrik");
		Bulbasaur bulbasaur = new Bulbasaur("bulbasaur", "cim");
		Charmander charmander = new Charmander("charmander", "ates");
		Squirtle squirtle = new Squirtle("squirtle","su");
		Zubat zubat = new Zubat("zubat","hava");
		Psyduck psyduck = new Psyduck("psyduck", "su");
		Snorlax snorlax = new Snorlax("snorlax","normal");
		Butterfree butterfree = new Butterfree("butterfree", "hava");
		Jigglypuff jigglypuff = new Jigglypuff("jigglypuff","ses");
		Meowth meowth = new Meowth("meowth", "normal");
		
		stack.push(pikachu);
		stack.push(bulbasaur);
		stack.push(charmander);
		stack.push(squirtle);
		stack.push(zubat);
		stack.push(psyduck);
		stack.push(snorlax);
		stack.push(butterfree);
		stack.push(jigglypuff);
		stack.push(meowth);
		
		Collections.shuffle(stack);
		
		for(int i = 0; i<3; i++) {
			bilgisayar1.kartListesi.add(stack.pop());
			bilgisayarElde1.add(i);
		}		
		for(int i = 0; i<3; i++) {
			bilgisayar2.kartListesi.add(stack.pop());
			bilgisayarElde2.add(i);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		 JLabel lblNewLabel = new JLabel("");
		 JLabel lblNewLabel_1 = new JLabel("");
		 JLabel lblNewLabel_2 = new JLabel("");
		 JLabel lblNewLabel_3 = new JLabel("");
		 JLabel lblNewLabel_4 = new JLabel("");
		 JLabel lblNewLabel_5 = new JLabel("");
		 JLabel lblNewLabel_6 = new JLabel("");
		 JLabel lblNewLabel_7 = new JLabel("");
		 JLabel lblNewLabel_8 = new JLabel("");
		 JLabel lblNewLabel_9 = new JLabel("");
		
		textField_bil1Skor = new JTextField();
		textField_bil2Skor = new JTextField();
		
		String path = "/"+bilgisayar1.kartListesi.get(0).getPokemonAdi()+".png";
		Image img = new ImageIcon(this.getClass().getResource(path)).getImage();
		contentPane.setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(40, 43, 80, 100);
		contentPane.add(lblNewLabel);
		

		String path1 = "/"+bilgisayar1.kartListesi.get(1).getPokemonAdi()+".png";
		Image img1 = new ImageIcon(this.getClass().getResource(path1)).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(140, 43, 80, 100);
		contentPane.add(lblNewLabel_1);	
		

		String path2 = "/"+bilgisayar1.kartListesi.get(2).getPokemonAdi()+".png";
		Image img2 = new ImageIcon(this.getClass().getResource(path2)).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		lblNewLabel_2.setBounds(240, 43, 80, 100);
		contentPane.add(lblNewLabel_2);	
		

		String path5 = "/"+bilgisayar2.kartListesi.get(0).getPokemonAdi()+".png";
		Image img5 = new ImageIcon(this.getClass().getResource(path5)).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img5));
		lblNewLabel_5.setBounds(40, 400, 80, 100);
		contentPane.add(lblNewLabel_5);	
		

		String path6 = "/"+bilgisayar2.kartListesi.get(1).getPokemonAdi()+".png";
		Image img6 = new ImageIcon(this.getClass().getResource(path6)).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img6));
		lblNewLabel_6.setBounds(140, 400, 80, 100);
		contentPane.add(lblNewLabel_6);	
		

		String path7 = "/"+bilgisayar2.kartListesi.get(2).getPokemonAdi()+".png";
		Image img7 = new ImageIcon(this.getClass().getResource(path7)).getImage();
		lblNewLabel_7.setIcon(new ImageIcon(img7));
		lblNewLabel_7.setBounds(240, 400, 80, 100);
		contentPane.add(lblNewLabel_7);
			
		lblNewLabel_3.setBounds(340, 43, 80, 100);
		contentPane.add(lblNewLabel_3);	
		lblNewLabel_3.setVisible(false);
		

		lblNewLabel_4.setBounds(440, 43, 80, 100);
		contentPane.add(lblNewLabel_4);	
		lblNewLabel_4.setVisible(false);
		

		lblNewLabel_8.setBounds(340, 400, 80, 100);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setVisible(false);
		
	
		lblNewLabel_9.setBounds(440, 400, 80, 100);
		contentPane.add(lblNewLabel_9);
		lblNewLabel_9.setVisible(false);
		
		textField_bil1Skor = new JTextField();
		textField_bil1Skor.setBounds(613, 83, 90, 30);
		textField_bil1Skor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_bil1Skor.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(textField_bil1Skor);
		textField_bil1Skor.setColumns(10);
		textField_bil1Skor.setText(Integer.toString(bilgisayar1.getSkor()));
		
		textField_bil2Skor = new JTextField();
		textField_bil2Skor.setBounds(613, 440, 90, 30);
		textField_bil2Skor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_bil2Skor.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(textField_bil2Skor);
		textField_bil2Skor.setColumns(10);
		textField_bil2Skor.setText(Integer.toString(bilgisayar2.getSkor()));
		
		JLabel lblNewLabel_10 = new JLabel("Bilgisayar1 Skor");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(613, 58, 90, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Bilgisayar2 Skor");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(613, 415, 90, 14);
		contentPane.add(lblNewLabel_11);
			
		
			while(el<3) {
			int sec1 = bilgisayar1.kartSec(bilgisayarElde1);
			while(bilgisayar1.kartListesi.get(sec1).getKartKullanildiMi() != false) {
				sec1 = bilgisayar1.kartSec(bilgisayarElde1);
			}
			bilgisayar1.kartListesi.get(sec1).setKartKullanildiMi(true);
			if(sec1 == 0) {
				lblNewLabel.setVisible(false);
			}else if(sec1 == 1 ) {
				lblNewLabel_1.setVisible(false);
			}else if(sec1 == 2) {
				lblNewLabel_2.setVisible(false);
			}
	
			int sec2 = bilgisayar2.kartSec(bilgisayarElde2);
			while(bilgisayar2.kartListesi.get(sec2).getKartKullanildiMi() != false) {
				sec2 = bilgisayar2.kartSec(bilgisayarElde2);
			}
			bilgisayar2.kartListesi.get(sec2).setKartKullanildiMi(true);
			
			if(sec2 == 0) {
				lblNewLabel_5.setVisible(false);
			}else if(sec2 == 1 ) {
				lblNewLabel_6.setVisible(false);
			}else if(sec2 == 2) {
				lblNewLabel_7.setVisible(false);
			}

			if(bilgisayar1.kartListesi.get(sec1).getHasarPuani() > bilgisayar2.kartListesi.get(sec2).getHasarPuani()) {
				bilgisayar1.setSkor(bilgisayar1.getSkor()+5);
				textField_bil1Skor.setText(Integer.toString(bilgisayar1.getSkor()));
				textField_bil2Skor.setText(Integer.toString(bilgisayar2.getSkor()));
				System.out.println("Bilgisayar1 "+bilgisayar1.kartListesi.get(sec1).getPokemonAdi()+" adli, "+bilgisayar1.kartListesi.get(sec1).getHasarPuani()+" hasar puanli pokemonu Bilgisyar 2 ise "+bilgisayar2.kartListesi.get(sec2).getPokemonAdi()+" adli, "+bilgisayar2.kartListesi.get(sec2).getHasarPuani()+" hasar puanli pokemonu secti. Bu el Bilgisayar1 kazandi.");
			}else if(bilgisayar1.kartListesi.get(sec1).getHasarPuani() == bilgisayar2.kartListesi.get(sec2).getHasarPuani()) {
				bilgisayar1.setSkor(bilgisayar1.getSkor());
				bilgisayar2.setSkor(bilgisayar2.getSkor());
				textField_bil1Skor.setText(Integer.toString(bilgisayar1.getSkor()));
				textField_bil2Skor.setText(Integer.toString(bilgisayar2.getSkor()));
				System.out.println("Bilgisayar1 "+bilgisayar1.kartListesi.get(sec1).getPokemonAdi()+" adli, "+bilgisayar1.kartListesi.get(sec1).getHasarPuani()+" hasar puanli pokemonu Bilgisyar 2 ise "+bilgisayar2.kartListesi.get(sec2).getPokemonAdi()+" adli, "+bilgisayar2.kartListesi.get(sec2).getHasarPuani()+" hasar puanli pokemonu secti. Bu el berabere.");
			}else {
				bilgisayar2.setSkor(bilgisayar2.getSkor()+5);
				textField_bil1Skor.setText(Integer.toString(bilgisayar1.getSkor()));
				textField_bil2Skor.setText(Integer.toString(bilgisayar2.getSkor()));
				System.out.println("Bilgisayar1 "+bilgisayar1.kartListesi.get(sec1).getPokemonAdi()+" adli, "+bilgisayar1.kartListesi.get(sec1).getHasarPuani()+" hasar puanli pokemonu Bilgisyar 2 ise "+bilgisayar2.kartListesi.get(sec2).getPokemonAdi()+" adli, "+bilgisayar2.kartListesi.get(sec2).getHasarPuani()+" hasar puanli pokemonu secti. Bu el Bilgisayar2 kazandi.");
			}
			el++;		
		}
		if(el == 3) {
			for(int i = 0; i<2; i++) {
				bilgisayar1.kartListesi.add(stack.pop());
				bilgisayarElde1.add(i+3);
			}		
			for(int i = 0; i<2; i++) {
				bilgisayar2.kartListesi.add(stack.pop());
				bilgisayarElde2.add(i+3);
			}
			String path3 = "/"+bilgisayar1.kartListesi.get(3).getPokemonAdi()+".png";
			Image img3 = new ImageIcon(this.getClass().getResource(path3)).getImage();
			lblNewLabel_3.setIcon(new ImageIcon(img3));
			lblNewLabel_3.setVisible(true);
			
			String path4 = "/"+bilgisayar1.kartListesi.get(4).getPokemonAdi()+".png";
			Image img4 = new ImageIcon(this.getClass().getResource(path4)).getImage();
			lblNewLabel_4.setIcon(new ImageIcon(img4));
			lblNewLabel_4.setVisible(true);
			
			String path8 = "/"+bilgisayar2.kartListesi.get(3).getPokemonAdi()+".png";
			Image img8 = new ImageIcon(this.getClass().getResource(path8)).getImage();
			lblNewLabel_8.setIcon(new ImageIcon(img8));
			lblNewLabel_8.setVisible(true);
			
			String path9 = "/"+bilgisayar2.kartListesi.get(4).getPokemonAdi()+".png";
			Image img9 = new ImageIcon(this.getClass().getResource(path9)).getImage();
			lblNewLabel_9.setIcon(new ImageIcon(img9));
			lblNewLabel_9.setVisible(true);
		}
		
			while(el <= 5){
				int sec1 = bilgisayar1.kartSec(bilgisayarElde1);
				while(bilgisayar1.kartListesi.get(sec1).getKartKullanildiMi() != false) {
					sec1 = bilgisayar1.kartSec(bilgisayarElde1);
				}
				bilgisayar1.kartListesi.get(sec1).setKartKullanildiMi(true);
				if(sec1 == 3) {
					lblNewLabel_3.setVisible(false);
				}else if(sec1 == 4) {
					lblNewLabel_4.setVisible(false);
				}
				bilgisayar1.kartListesi.get(sec1).setKartKullanildiMi(true);
				
				int sec2 = bilgisayar2.kartSec(bilgisayarElde2);
				while(bilgisayar2.kartListesi.get(sec2).getKartKullanildiMi() != false) {
					sec2 = bilgisayar2.kartSec(bilgisayarElde2);
				}
				bilgisayar2.kartListesi.get(sec2).setKartKullanildiMi(true);
				if(sec1 == 3) {
					lblNewLabel_8.setVisible(false);
				}else if(sec1 == 4) {
					lblNewLabel_9.setVisible(false);
				}
				bilgisayar2.kartListesi.get(sec2).setKartKullanildiMi(true);
				
				if(bilgisayar1.kartListesi.get(sec1).getHasarPuani() > bilgisayar2.kartListesi.get(sec2).getHasarPuani()) {
					bilgisayar1.setSkor(bilgisayar1.getSkor()+5);
					textField_bil1Skor.setText(Integer.toString(bilgisayar1.getSkor()));
					textField_bil2Skor.setText(Integer.toString(bilgisayar2.getSkor()));
					System.out.println("Bilgisayar1 "+bilgisayar1.kartListesi.get(sec1).getPokemonAdi()+" adli, "+bilgisayar1.kartListesi.get(sec1).getHasarPuani()+" hasar puanli pokemonu Bilgisyar 2 ise "+bilgisayar2.kartListesi.get(sec2).getPokemonAdi()+" adli, "+bilgisayar2.kartListesi.get(sec2).getHasarPuani()+" hasar puanli pokemonu secti. Bu el Bilgisayar1 kazandi.");
				}else if(bilgisayar1.kartListesi.get(sec1).getHasarPuani() == bilgisayar2.kartListesi.get(sec2).getHasarPuani()) {
					bilgisayar1.setSkor(bilgisayar1.getSkor());
					bilgisayar2.setSkor(bilgisayar2.getSkor());
					textField_bil1Skor.setText(Integer.toString(bilgisayar1.getSkor()));
					textField_bil2Skor.setText(Integer.toString(bilgisayar2.getSkor()));
					System.out.println("Bilgisayar1 "+bilgisayar1.kartListesi.get(sec1).getPokemonAdi()+" adli, "+bilgisayar1.kartListesi.get(sec1).getHasarPuani()+" hasar puanli pokemonu Bilgisyar 2 ise "+bilgisayar2.kartListesi.get(sec2).getPokemonAdi()+" adli, "+bilgisayar2.kartListesi.get(sec2).getHasarPuani()+" hasar puanli pokemonu secti. Bu el berabere.");
				}else {
					bilgisayar2.setSkor(bilgisayar2.getSkor()+5);
					textField_bil1Skor.setText(Integer.toString(bilgisayar1.getSkor()));
					textField_bil2Skor.setText(Integer.toString(bilgisayar2.getSkor()));
					System.out.println("Bilgisayar1 "+bilgisayar1.kartListesi.get(sec1).getPokemonAdi()+" adli, "+bilgisayar1.kartListesi.get(sec1).getHasarPuani()+" hasar puanli pokemonu Bilgisyar 2 ise "+bilgisayar2.kartListesi.get(sec2).getPokemonAdi()+" adli, "+bilgisayar2.kartListesi.get(sec2).getHasarPuani()+" hasar puanli pokemonu secti. Bu el Bilgisayar2 kazandi.");
				}
				el++;
				if(el == 5) {
					if(bilgisayar1.getSkor() > bilgisayar2.getSkor()) {
						JOptionPane.showMessageDialog(null, "Bilgisayar1 kazandi.");
					}else if(bilgisayar1.getSkor() == bilgisayar2.getSkor()) {
						JOptionPane.showMessageDialog(null, "Berabere.");
					}else {
						JOptionPane.showMessageDialog(null, "Bilgisayar2 kazandi.");
					}
					System.exit(0);
				}
			}
			
		}	
	}