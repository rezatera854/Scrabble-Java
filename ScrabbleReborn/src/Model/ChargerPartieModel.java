package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;

public class ChargerPartieModel {
	private ImageIcon imgFondActive = new ImageIcon(this.getClass().getResource("/images/fond_charger_partie_active.png"));
	private ImageIcon imgFondClicked = new ImageIcon(this.getClass().getResource("/images/fond_charger_partie_clicked.png"));
	private ImageIcon imgLancerPartie = new ImageIcon(this.getClass().getResource("/images/bouton_lancer_partie.png"));
	private ImageIcon imgLancerPartieActive = new ImageIcon(this.getClass().getResource("/images/bouton_lancer_partie_active.png"));
	public static String[] listejoueurs, infosParties, listeResultats, plateau;
	public static int length;
	public static int[] scores;
	
	public ChargerPartieModel() {
		listeResultats = new String[80];
		try {
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFile() throws IOException {
		//On ouvre le buffer...
		BufferedReader buffer = new BufferedReader(new FileReader("parties.txt"));
		
		//...et on initialise le nombre de lignes a 0.
		length = 0;
		
		//Chaque ligne sera stockee dans cette variable, a tour de role.
	    String line;
	    
	    //Tant que la ligne n'est pas vide, on la met dans line et on incremente la taille.
	    while ((line = buffer.readLine()) != null) {
	        length += 1;
	        listeResultats[length] = line;
	        
	    }

	    setTabInfosParties();
	    setListeJoueur();
	    setListeScores();
	    setBoard();
	}
	
	public void setBoard() {
		plateau = new String[getNbParties()];
	    int compteur = 0;
	    int j = 14;
		for(int i = 0; i < getNbParties(); i ++) {
			
			plateau[i] = listeResultats[j];
			j+=13;
		}
	}
	
	public void setListeJoueur() {
		listejoueurs = new String[getNbParties() * 4];
	    int compteur = 0;
	    int j = 6;
		for(int i = 0; i < getNbParties()*4; i ++) {
			
			listejoueurs[i] = listeResultats[j];
			j+=2;
			
			if(compteur !=3) {
				compteur++;
			}
			else {	
				j += 5;
				compteur = 0;
			}		
		}
	}
	
	public void setListeScores() {
		scores = new int[getNbParties() * 4];
	    int compteur = 0;
	    int j = 7;
		for(int i = 0; i < getNbParties()*4; i ++) {
			
			scores[i] = Integer.parseInt(listeResultats[j]);
			j+=2;
			
			if(compteur !=3) {
				compteur++;
			}
			else {	
				j += 5;
				compteur = 0;
			}		
		}
	}
	
	public void setTabInfosParties() {
		 infosParties = new String[getNbParties() * 4];
		    int compteur = 0;
		    int j = 1;
			for(int i = 0; i < getNbParties()*4; i ++) {
				
				j++;
				infosParties[i] = listeResultats[j];
			
				if(compteur !=3) {
					compteur++;
				}
				else {	
					j += 9;
					compteur = 0;
				}		
			}
	}
	
	public int getNbParties() {
		switch (length) {
			case 1:
				return 0;
			case 14:
				return 1;
			case 27:
				return 2;
			case 40:
				return 3;
			case 53:
				return 4;
			case 66:
				return 5;
			case 79:
				return 6;
		}
		return -1;
	}
	
	
	public ImageIcon getImgFondActive() {
		return imgFondActive;
	}
	
	public ImageIcon getImgFondClicked() {
		return imgFondClicked;
	}
	
	public ImageIcon getLancerPartie() {
		return imgLancerPartie;
	}
	
	public ImageIcon getLancerPartieActive() {
		return imgLancerPartieActive;
	}
	
}
