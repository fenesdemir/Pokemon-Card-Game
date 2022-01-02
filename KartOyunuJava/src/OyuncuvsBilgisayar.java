import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class OyuncuvsBilgisayar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int el = 0;
	private JTextField textField_oyuncuSkor;
	private JTextField textField_bilgiSkor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OyuncuvsBilgisayar frame = new OyuncuvsBilgisayar();
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
	public OyuncuvsBilgisayar() {
		
		
		InsanOyuncusu oyuncu = new InsanOyuncusu(1,"oyuncu",0);
		BilgisayarOyuncusu bilgisayar = new BilgisayarOyuncusu(2,"bilgisayar",0);

		
		Stack<Pokemon> stack = new Stack<Pokemon>();
		ArrayList<Integer> bilgisayarElde = new ArrayList<Integer>();
		
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
			oyuncu.kartListesi.add(stack.pop());
		}		
		for(int i = 0; i<3; i++) {
			bilgisayar.kartListesi.add(stack.pop());
			bilgisayarElde.add(i);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		JLabel lblNewLabel_1 = new JLabel(" ");	
		JLabel lblNewLabel_2 = new JLabel(" ");
	    JLabel lblNewLabel_3 = new JLabel(" ");
		JLabel lblNewLabel_4 = new JLabel(" ");
		JLabel lblNewLabel_5 = new JLabel(" ");
		JLabel lblNewLabel_6 = new JLabel(" ");
		JLabel lblNewLabel_7 = new JLabel(" ");	
		JLabel lblNewLabel_8 = new JLabel(" ");
		JLabel lblNewLabel_9 = new JLabel(" ");		
		
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				oyuncu.kartListesi.get(0).setKartKullanildiMi(true);
				int bilSec = bilgisayar.kartSec(bilgisayarElde);
				while(bilgisayar.kartListesi.get(bilSec).getKartKullanildiMi() != false) {
					bilSec = bilgisayar.kartSec(bilgisayarElde);
				}
				bilgisayar.kartListesi.get(bilSec).setKartKullanildiMi(true);
				if(bilSec == 0) {
					lblNewLabel_5.setVisible(false);
				}else if(bilSec == 1 ) {
					lblNewLabel_6.setVisible(false);
				}else if(bilSec == 2) {
					lblNewLabel_7.setVisible(false);
				}
				lblNewLabel.setVisible(false);
				if(oyuncu.kartListesi.get(0).getHasarPuani() > bilgisayar.kartListesi.get(bilSec).getHasarPuani()) {
					oyuncu.setSkor(oyuncu.getSkor()+5);
					textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
					textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
				}else if(oyuncu.kartListesi.get(0).getHasarPuani() == bilgisayar.kartListesi.get(bilSec).getHasarPuani()) {
					oyuncu.setSkor(oyuncu.getSkor());
					bilgisayar.setSkor(bilgisayar.getSkor());
					textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
					textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
				}else {
					bilgisayar.setSkor(bilgisayar.getSkor()+5);
					textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
					textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
				}
				el++;
				if(el >= 3) {
					for(int i = 0; i<2; i++) {
						oyuncu.kartListesi.add(stack.pop());
					}		
					for(int i = 0; i<2; i++) {
						bilgisayar.kartListesi.add(stack.pop());
						bilgisayarElde.add(i+3);
					}
					String path3 = "/"+oyuncu.kartListesi.get(3).getPokemonAdi()+".png";
					Image img3 = new ImageIcon(this.getClass().getResource(path3)).getImage();
					lblNewLabel_3.setIcon(new ImageIcon(img3));
					lblNewLabel_3.setVisible(true);
					
					String path4 = "/"+oyuncu.kartListesi.get(4).getPokemonAdi()+".png";
					Image img4 = new ImageIcon(this.getClass().getResource(path4)).getImage();
					lblNewLabel_4.setIcon(new ImageIcon(img4));
					lblNewLabel_4.setVisible(true);
					
					String path8 = "/"+bilgisayar.kartListesi.get(3).getPokemonAdi()+".png";
					Image img8 = new ImageIcon(this.getClass().getResource(path8)).getImage();
					lblNewLabel_8.setIcon(new ImageIcon(img8));
					lblNewLabel_8.setVisible(true);
					
					String path9 = "/"+bilgisayar.kartListesi.get(4).getPokemonAdi()+".png";
					Image img9 = new ImageIcon(this.getClass().getResource(path9)).getImage();
					lblNewLabel_9.setIcon(new ImageIcon(img9));
					lblNewLabel_9.setVisible(true);
				}
			}
		});
		String path = "/"+oyuncu.kartListesi.get(0).getPokemonAdi()+".png";
		Image img = new ImageIcon(this.getClass().getResource(path)).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(40, 43, 80, 100);
		contentPane.add(lblNewLabel);
		

		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				oyuncu.kartListesi.get(1).setKartKullanildiMi(true);
				int bilSec = bilgisayar.kartSec(bilgisayarElde);
				
				while(bilgisayar.kartListesi.get(bilSec).getKartKullanildiMi() != false) {
					bilSec = bilgisayar.kartSec(bilgisayarElde);
				}
				bilgisayar.kartListesi.get(bilSec).setKartKullanildiMi(true);
				if(bilSec == 0) {
					lblNewLabel_5.setVisible(false);
				}else if(bilSec == 1 ) {
					lblNewLabel_6.setVisible(false);
				}else if(bilSec == 2) {
					lblNewLabel_7.setVisible(false);
				}
				lblNewLabel_1.setVisible(false);
				if(oyuncu.kartListesi.get(0).getHasarPuani() > bilgisayar.kartListesi.get(bilSec).getHasarPuani()) {
					oyuncu.setSkor(oyuncu.getSkor()+5);
					textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
					textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
				}else if(oyuncu.kartListesi.get(0).getHasarPuani() == bilgisayar.kartListesi.get(bilSec).getHasarPuani()) {
					oyuncu.setSkor(oyuncu.getSkor());
					bilgisayar.setSkor(bilgisayar.getSkor());
					textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
					textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
				}else {
					bilgisayar.setSkor(bilgisayar.getSkor()+5);
					textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
					textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
				}
				el++;
				if(el >= 3) {
					for(int i = 0; i<2; i++) {
						oyuncu.kartListesi.add(stack.pop());
					}		
					for(int i = 0; i<2; i++) {
						bilgisayar.kartListesi.add(stack.pop());
						bilgisayarElde.add(i+3);
					}
					String path3 = "/"+oyuncu.kartListesi.get(3).getPokemonAdi()+".png";
					Image img3 = new ImageIcon(this.getClass().getResource(path3)).getImage();
					lblNewLabel_3.setIcon(new ImageIcon(img3));
					lblNewLabel_3.setVisible(true);
					
					String path4 = "/"+oyuncu.kartListesi.get(4).getPokemonAdi()+".png";
					Image img4 = new ImageIcon(this.getClass().getResource(path4)).getImage();
					lblNewLabel_4.setIcon(new ImageIcon(img4));
					lblNewLabel_4.setVisible(true);
					
					String path8 = "/"+bilgisayar.kartListesi.get(3).getPokemonAdi()+".png";
					Image img8 = new ImageIcon(this.getClass().getResource(path8)).getImage();
					lblNewLabel_8.setIcon(new ImageIcon(img8));
					lblNewLabel_8.setVisible(true);
					
					String path9 = "/"+bilgisayar.kartListesi.get(4).getPokemonAdi()+".png";
					Image img9 = new ImageIcon(this.getClass().getResource(path9)).getImage();
					lblNewLabel_9.setIcon(new ImageIcon(img9));
					lblNewLabel_9.setVisible(true);
				}
			}
		});
		String path1 = "/"+oyuncu.kartListesi.get(1).getPokemonAdi()+".png";
		Image img1 = new ImageIcon(this.getClass().getResource(path1)).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(140, 43, 80, 100);
		contentPane.add(lblNewLabel_1);
		
	
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				oyuncu.kartListesi.get(2).setKartKullanildiMi(true);
				int bilSec = bilgisayar.kartSec(bilgisayarElde);
				
				while(bilgisayar.kartListesi.get(bilSec).getKartKullanildiMi() != false) {
					bilSec = bilgisayar.kartSec(bilgisayarElde);
				}
				bilgisayar.kartListesi.get(bilSec).setKartKullanildiMi(true);
				if(bilSec == 0) {
					lblNewLabel_5.setVisible(false);
				}else if(bilSec == 1 ) {
					lblNewLabel_6.setVisible(false);
				}else if(bilSec == 2) {
					lblNewLabel_7.setVisible(false);
				}
				lblNewLabel_2.setVisible(false);
				if(oyuncu.kartListesi.get(0).getHasarPuani() > bilgisayar.kartListesi.get(bilSec).getHasarPuani()) {
					oyuncu.setSkor(oyuncu.getSkor()+5);
					textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
					textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
				}else if(oyuncu.kartListesi.get(0).getHasarPuani() == bilgisayar.kartListesi.get(bilSec).getHasarPuani()) {
					oyuncu.setSkor(oyuncu.getSkor());
					bilgisayar.setSkor(bilgisayar.getSkor());
					textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
					textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
				}else {
					bilgisayar.setSkor(bilgisayar.getSkor()+5);
					textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
					textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
				}
				el++;
				if(el >= 3) {
					for(int i = 0; i<2; i++) {
						oyuncu.kartListesi.add(stack.pop());
					}		
					for(int i = 0; i<2; i++) {
						bilgisayar.kartListesi.add(stack.pop());
						bilgisayarElde.add(i+3);
					}
					String path3 = "/"+oyuncu.kartListesi.get(3).getPokemonAdi()+".png";
					Image img3 = new ImageIcon(this.getClass().getResource(path3)).getImage();
					lblNewLabel_3.setIcon(new ImageIcon(img3));
					lblNewLabel_3.setVisible(true);
					
					String path4 = "/"+oyuncu.kartListesi.get(4).getPokemonAdi()+".png";
					Image img4 = new ImageIcon(this.getClass().getResource(path4)).getImage();
					lblNewLabel_4.setIcon(new ImageIcon(img4));
					lblNewLabel_4.setVisible(true);
					
					String path8 = "/"+bilgisayar.kartListesi.get(3).getPokemonAdi()+".png";
					Image img8 = new ImageIcon(this.getClass().getResource(path8)).getImage();
					lblNewLabel_8.setIcon(new ImageIcon(img8));
					lblNewLabel_8.setVisible(true);
					
					String path9 = "/"+bilgisayar.kartListesi.get(4).getPokemonAdi()+".png";
					Image img9 = new ImageIcon(this.getClass().getResource(path9)).getImage();
					lblNewLabel_9.setIcon(new ImageIcon(img9));
					lblNewLabel_9.setVisible(true);
				}
			}
		});
		String path2 = "/"+oyuncu.kartListesi.get(2).getPokemonAdi()+".png";
		Image img2 = new ImageIcon(this.getClass().getResource(path2)).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		lblNewLabel_2.setBounds(240, 43, 80, 100);
		contentPane.add(lblNewLabel_2);
		
			
		String path5 = "/"+bilgisayar.kartListesi.get(0).getPokemonAdi()+".png";
		Image img5 = new ImageIcon(this.getClass().getResource(path5)).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img5));
		lblNewLabel_5.setBounds(40, 400, 80, 100);
		contentPane.add(lblNewLabel_5);
		
		
		String path6 = "/"+bilgisayar.kartListesi.get(1).getPokemonAdi()+".png";
		Image img6 = new ImageIcon(this.getClass().getResource(path6)).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img6));
		lblNewLabel_6.setBounds(140, 400, 80, 100);
		contentPane.add(lblNewLabel_6);
		
		
		String path7 = "/"+bilgisayar.kartListesi.get(2).getPokemonAdi()+".png";
		Image img7 = new ImageIcon(this.getClass().getResource(path7)).getImage();
		lblNewLabel_7.setIcon(new ImageIcon(img7));
		lblNewLabel_7.setBounds(240, 400, 80, 100);
		contentPane.add(lblNewLabel_7);
		
		
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					oyuncu.kartListesi.get(3).setKartKullanildiMi(true);
					int bilSec = bilgisayar.kartSec(bilgisayarElde);
				
					while(bilgisayar.kartListesi.get(bilSec).getKartKullanildiMi() != false) {
						bilSec = bilgisayar.kartSec(bilgisayarElde);
					}
					bilgisayar.kartListesi.get(bilSec).setKartKullanildiMi(true);
					if(bilSec == 3) {
					lblNewLabel_8.setVisible(false);
					}else {
					lblNewLabel_9.setVisible(false);
					}
					lblNewLabel_3.setVisible(false);
					if(oyuncu.kartListesi.get(0).getHasarPuani() > bilgisayar.kartListesi.get(bilSec).getHasarPuani()) {
						oyuncu.setSkor(oyuncu.getSkor()+5);
						textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
						textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
					}else if(oyuncu.kartListesi.get(0).getHasarPuani() == bilgisayar.kartListesi.get(bilSec).getHasarPuani()) {
						oyuncu.setSkor(oyuncu.getSkor());
						bilgisayar.setSkor(bilgisayar.getSkor());
						textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
						textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
					}else {
						bilgisayar.setSkor(bilgisayar.getSkor()+5);
						textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
						textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
					}
					el++;
					if(el == 5) {
						if(oyuncu.getSkor() > bilgisayar.getSkor()) {
							JOptionPane.showMessageDialog(null, "Tebrikler! Kazandiniz.");
						}else if(oyuncu.getSkor() == bilgisayar.getSkor()) {
							JOptionPane.showMessageDialog(null, "Berabere.");
						}else {
							JOptionPane.showMessageDialog(null, "Kaybettiniz.");
						}
						System.exit(0);
					}
				}
			});
			
			lblNewLabel_3.setBounds(340, 43, 80, 100);
			contentPane.add(lblNewLabel_3);
			lblNewLabel_3.setVisible(false);
		
	     lblNewLabel_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					oyuncu.kartListesi.get(4).setKartKullanildiMi(true);
					int bilSec = bilgisayar.kartSec(bilgisayarElde);
				
					while(bilgisayar.kartListesi.get(bilSec).getKartKullanildiMi() != false) {
					bilSec = bilgisayar.kartSec(bilgisayarElde);
					}
					bilgisayar.kartListesi.get(bilSec).setKartKullanildiMi(true);
					if(bilSec == 3) {
					lblNewLabel_8.setVisible(false);
					}else {
					lblNewLabel_9.setVisible(false);
					}
					lblNewLabel_4.setVisible(false);
					if(oyuncu.kartListesi.get(0).getHasarPuani() > bilgisayar.kartListesi.get(bilSec).getHasarPuani()) {
						oyuncu.setSkor(oyuncu.getSkor()+5);
						textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
						textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
					}else if(oyuncu.kartListesi.get(0).getHasarPuani() == bilgisayar.kartListesi.get(bilSec).getHasarPuani()) {
						oyuncu.setSkor(oyuncu.getSkor());
						bilgisayar.setSkor(bilgisayar.getSkor());
						textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
						textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
					}else {
						bilgisayar.setSkor(bilgisayar.getSkor()+5);
						textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
						textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
					}
					el++;
					if(el == 5) {
						if(oyuncu.getSkor() > bilgisayar.getSkor()) {
							JOptionPane.showMessageDialog(null, "Tebrikler! Kazandiniz.");
						}else if(oyuncu.getSkor() == bilgisayar.getSkor()) {
							JOptionPane.showMessageDialog(null, "Berabere.");
						}else {
							JOptionPane.showMessageDialog(null, "Kaybettiniz.");
						}
						System.exit(0);
					}
				}
			});			
			lblNewLabel_4.setBounds(440, 43, 80, 100);
			contentPane.add(lblNewLabel_4);
			lblNewLabel_4.setVisible(false);
		   			
			lblNewLabel_8.setBounds(340, 400, 80, 100);
			contentPane.add(lblNewLabel_8);
			lblNewLabel_8.setVisible(false);
					
			lblNewLabel_9.setBounds(440, 400, 80, 100);
			contentPane.add(lblNewLabel_9);
			lblNewLabel_9.setVisible(false);
			
			textField_oyuncuSkor = new JTextField();
			textField_oyuncuSkor.setHorizontalAlignment(SwingConstants.CENTER);
			textField_oyuncuSkor.setBounds(613, 83, 90, 30);
			contentPane.add(textField_oyuncuSkor);
			textField_oyuncuSkor.setColumns(10);
			textField_oyuncuSkor.setText(Integer.toString(oyuncu.getSkor()));
			
			textField_bilgiSkor = new JTextField();
			textField_bilgiSkor.setHorizontalAlignment(SwingConstants.CENTER);
			textField_bilgiSkor.setBounds(613, 440, 90, 30);
			contentPane.add(textField_bilgiSkor);
			textField_bilgiSkor.setColumns(10);
			textField_bilgiSkor.setText(Integer.toString(bilgisayar.getSkor()));
			
			JLabel lblNewLabel_10 = new JLabel("Oyuncu Skoru");
			lblNewLabel_10.setForeground(new Color(0, 0, 0));
			lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_10.setBounds(613, 58, 90, 14);
			contentPane.add(lblNewLabel_10);
			
			JLabel lblNewLabel_11 = new JLabel("Bilgisayar Skoru");
			lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_11.setBounds(613, 415, 90, 14);
			contentPane.add(lblNewLabel_11);
			
	}
}
