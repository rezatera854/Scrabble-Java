package View;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Model.Grille;

import java.awt.*;

public class JeuView extends JFrame {
    public Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public int width = (int)screenSize.getWidth();
    public int height = (int)screenSize.getHeight();
    private ImageIcon imgBack = new ImageIcon(this.getClass().getResource("/images/back.png"));
    Grille grille;
    private JLabel back, titreScores, tourDe, tourDuJoueur,lettresRestantesFond, lettresRestantes, boutonSoumettreMot, imgJoueur, boutonSauvegarder;
    private JLabel J1, J2, J3, J4, scoreJ1, scoreJ2, scoreJ3, scoreJ4;
    private JPanel ongletLettresRestantes,ongletSoumettreMot, lettres,ongletTour;
    private JLabel lettre1, lettre2, lettre3, lettre4, lettre5, lettre6, lettre7;
    
    public JeuView(){
    	this.setSize(1000, 800);
		this.setUndecorated(true);
		setLocation(width/2 - this.getSize().width/2, height/2 - this.getSize().height/2);
        getContentPane().setLayout(null);
        this.setVisible(true);
        getContentPane().setBackground(new Color(254,211,7));
 
        
        back = new JLabel();
		back.setIcon(imgBack);
		back.setBounds(20, 11, 70, 54);
		getContentPane().add(back);
		
		boutonSauvegarder = new JLabel("");
        boutonSauvegarder.setIcon(new ImageIcon(Test.class.getResource("/images/sauvegarder.png")));
        boutonSauvegarder.setBounds(86, 25, 182, 42);
        getContentPane().add(boutonSauvegarder);
		

        JPanel ongletScore = new JPanel();
        ongletScore.setBackground(new Color(254, 211, 7));
        ongletScore.setBounds(0, 76, 282, 191);
        getContentPane().add(ongletScore);
		ongletScore.setLayout(null);
        
		titreScores = new JLabel("Scores :");
		titreScores.setFont(new Font("Lato", Font.BOLD, 18));
        titreScores.setForeground(Color.WHITE);
        titreScores.setBounds(38, 22, 63, 22);
        ongletScore.add(titreScores);
		
        
        JPanel scores = new JPanel();
        scores.setBounds(38, 56, 206, 124);
        scores.setBackground(new Color(137, 80, 160));
        ongletScore.add(scores);
        
        JLabel fondScore = new JLabel("");
        fondScore.setHorizontalAlignment(SwingConstants.CENTER);
        fondScore.setIcon(new ImageIcon(Test.class.getResource("/images/fond_score.png")));
        fondScore.setBounds(0, 5, 278, 186);
        ongletScore.add(fondScore);
        
        GridBagLayout gbl_scores = new GridBagLayout();
        gbl_scores.columnWidths = new int[]{170, 14, 0};
        gbl_scores.rowHeights = new int[]{31, 31, 31, 31, 0};
        gbl_scores.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
        gbl_scores.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        scores.setLayout(gbl_scores);
        
        J1 = new JLabel("J1 - Quentin");
        J1.setFont(new Font("Lato", Font.BOLD, 16));
        J1.setForeground(Color.WHITE);
        J1.setBackground(Color.GREEN);
        GridBagConstraints gbc_J1 = new GridBagConstraints();
        gbc_J1.fill = GridBagConstraints.BOTH;
        gbc_J1.insets = new Insets(0, 0, 5, 5);
        gbc_J1.gridx = 0;
        gbc_J1.gridy = 0;
        scores.add(J1, gbc_J1);
        
        scoreJ1 = new JLabel("2010");
        scoreJ1.setHorizontalAlignment(SwingConstants.TRAILING);
        scoreJ1.setForeground(Color.WHITE);
        scoreJ1.setFont(new Font("Lato", Font.BOLD, 16));
        GridBagConstraints gbc_scoreJ1 = new GridBagConstraints();
        gbc_scoreJ1.anchor = GridBagConstraints.EAST;
        gbc_scoreJ1.fill = GridBagConstraints.VERTICAL;
        gbc_scoreJ1.insets = new Insets(0, 0, 5, 0);
        gbc_scoreJ1.gridx = 1;
        gbc_scoreJ1.gridy = 0;
        scores.add(scoreJ1, gbc_scoreJ1);
        
        J2 = new JLabel("J2 - Mathieu");
        J2.setFont(new Font("Lato", Font.BOLD, 16));
        J2.setForeground(Color.WHITE);
        GridBagConstraints gbc_J2 = new GridBagConstraints();
        gbc_J2.fill = GridBagConstraints.BOTH;
        gbc_J2.insets = new Insets(0, 0, 5, 5);
        gbc_J2.gridx = 0;
        gbc_J2.gridy = 1;
        scores.add(J2, gbc_J2);
        
        scoreJ2 = new JLabel("1220");
        scoreJ2.setHorizontalAlignment(SwingConstants.TRAILING);
        scoreJ2.setFont(new Font("Lato", Font.BOLD, 16));
        scoreJ2.setForeground(Color.WHITE);
        scoreJ2.setBackground(Color.RED);
        GridBagConstraints gbc_scoreJ2 = new GridBagConstraints();
        gbc_scoreJ2.fill = GridBagConstraints.BOTH;
        gbc_scoreJ2.insets = new Insets(0, 0, 5, 0);
        gbc_scoreJ2.gridx = 1;
        gbc_scoreJ2.gridy = 1;
        scores.add(scoreJ2, gbc_scoreJ2);
        
        J3 = new JLabel("J3 - Mathieu 2");
        J3.setForeground(Color.WHITE);
        J3.setFont(new Font("Lato", Font.BOLD, 16));
        GridBagConstraints gbc_J3 = new GridBagConstraints();
        gbc_J3.fill = GridBagConstraints.BOTH;
        gbc_J3.insets = new Insets(0, 0, 5, 5);
        gbc_J3.gridx = 0;
        gbc_J3.gridy = 2;
        scores.add(J3, gbc_J3);
        
        scoreJ3 = new JLabel("24");
        scoreJ3.setHorizontalAlignment(SwingConstants.TRAILING);
        scoreJ3.setForeground(Color.WHITE);
        scoreJ3.setFont(new Font("Lato", Font.BOLD, 16));
        GridBagConstraints gbc_scoreJ3 = new GridBagConstraints();
        gbc_scoreJ3.fill = GridBagConstraints.BOTH;
        gbc_scoreJ3.insets = new Insets(0, 0, 5, 0);
        gbc_scoreJ3.gridx = 1;
        gbc_scoreJ3.gridy = 2;
        scores.add(scoreJ3, gbc_scoreJ3);
        
        J4 = new JLabel("");
        J4.setFont(new Font("Lato", Font.BOLD, 16));
        J4.setForeground(Color.WHITE);
        GridBagConstraints gbc_J4 = new GridBagConstraints();
        gbc_J4.fill = GridBagConstraints.BOTH;
        gbc_J4.insets = new Insets(0, 0, 0, 5);
        gbc_J4.gridx = 0;
        gbc_J4.gridy = 3;
        scores.add(J4, gbc_J4);
        
        scoreJ4 = new JLabel("");
        scoreJ4.setHorizontalAlignment(SwingConstants.TRAILING);
        scoreJ4.setForeground(Color.WHITE);
        scoreJ4.setFont(new Font("Lato", Font.BOLD, 16));
        GridBagConstraints gbc_scoreJ4 = new GridBagConstraints();
        gbc_scoreJ4.fill = GridBagConstraints.BOTH;
        gbc_scoreJ4.gridx = 1;
        gbc_scoreJ4.gridy = 3;
        scores.add(scoreJ4, gbc_scoreJ4);

        ongletLettresRestantes = new JPanel();
        ongletLettresRestantes.setBounds(49, 524, 180, 186);
        ongletLettresRestantes.setBackground(new Color(254, 211, 7));
        getContentPane().add(ongletLettresRestantes);
        ongletLettresRestantes.setLayout(new BorderLayout(0, 0));
        
        
        lettresRestantes = new JLabel("102");
        lettresRestantes.setHorizontalAlignment(SwingConstants.CENTER);
        lettresRestantes.setFont(new Font("Lato", Font.BOLD, 70));
        lettresRestantes.setForeground(Color.WHITE);
        lettresRestantes.setBounds(0, 70, 175, 85);
        ongletLettresRestantes.add(lettresRestantes);
        
        lettresRestantesFond = new JLabel("");
        lettresRestantesFond.setHorizontalAlignment(SwingConstants.CENTER);
        lettresRestantesFond.setIcon(new ImageIcon(Test.class.getResource("/images/lettres_restantes.png")));
        lettresRestantesFond.setBounds(0, 0, 175, 186);
        ongletLettresRestantes.add(lettresRestantesFond);

        
        ongletTour = new JPanel();
        ongletTour.setBounds(62, 290, 167, 200);
        ongletTour.setBackground(new Color(254, 211, 7));
        getContentPane().add(ongletTour);
        
        GridBagLayout gbl_panel_1 = new GridBagLayout();
        gbl_panel_1.columnWidths = new int[]{200, 0};
        gbl_panel_1.rowHeights = new int[]{30, 134, 20, 0};
        gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
        gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
        ongletTour.setLayout(gbl_panel_1);
        
        tourDe = new JLabel("Au tour de :");
        tourDe.setHorizontalAlignment(SwingConstants.CENTER);
        tourDe.setFont(new Font("Lato", Font.BOLD, 24));
        GridBagConstraints gbc_tourDe = new GridBagConstraints();
        gbc_tourDe.anchor = GridBagConstraints.NORTH;
        gbc_tourDe.insets = new Insets(0, 0, 5, 0);
        gbc_tourDe.gridx = 0;
        gbc_tourDe.gridy = 0;
        ongletTour.add(tourDe, gbc_tourDe);
        
        imgJoueur = new JLabel("");
        imgJoueur.setIcon(new ImageIcon(Test.class.getResource("/images/12_clicked.png")));
        GridBagConstraints gbc_imgJoueur = new GridBagConstraints();
        gbc_imgJoueur.insets = new Insets(0, 0, 5, 0);
        gbc_imgJoueur.gridx = 0;
        gbc_imgJoueur.gridy = 1;
        ongletTour.add(imgJoueur, gbc_imgJoueur);
        
        tourDuJoueur = new JLabel("J2 - Mathieu");
        tourDuJoueur.setFont(new Font("Lato", Font.BOLD, 16));
        tourDuJoueur.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_tourDuJoueur = new GridBagConstraints();
        gbc_tourDuJoueur.anchor = GridBagConstraints.NORTH;
        gbc_tourDuJoueur.gridx = 0;
        gbc_tourDuJoueur.gridy = 2;
        ongletTour.add(tourDuJoueur, gbc_tourDuJoueur);
        
        ongletSoumettreMot = new JPanel();
        ongletSoumettreMot.setBounds(20, 727, 274, 62);
        ongletSoumettreMot.setBackground(new Color(254, 211, 7));
        getContentPane().add(ongletSoumettreMot);
        
        boutonSoumettreMot = new JLabel("");
        boutonSoumettreMot.setIcon(new ImageIcon(Test.class.getResource("/images/soumettre_mot.png")));
        ongletSoumettreMot.add(boutonSoumettreMot);
        
        grille = new Grille();
        grille.setBounds(278,11, 700, 710);
        getContentPane().add(grille);
        
        lettres = new JPanel();
        lettres.setBounds(340, 727, 585, 62);
        lettres.setBackground(new Color(31, 63, 28));
        getContentPane().add(lettres);
        lettres.setLayout(new GridLayout(1, 0, 0, 0));
        
        lettre1 = new JLabel("");
        lettre1.setIcon(new ImageIcon(Test.class.getResource("/images/u.png")));
        lettre1.setHorizontalAlignment(SwingConstants.CENTER);
        lettres.add(lettre1);
        
        lettre2 = new JLabel("");
        lettre2.setIcon(new ImageIcon(Test.class.getResource("/images/u.png")));
        lettre2.setHorizontalAlignment(SwingConstants.CENTER);
        lettres.add(lettre2);
        
        lettre3 = new JLabel("");
        lettre3.setIcon(new ImageIcon(Test.class.getResource("/images/u.png")));
        lettre3.setHorizontalAlignment(SwingConstants.CENTER);
        lettres.add(lettre3);
        
        lettre4 = new JLabel("");
        lettre4.setIcon(new ImageIcon(Test.class.getResource("/images/u.png")));
        lettre4.setHorizontalAlignment(SwingConstants.CENTER);
        lettres.add(lettre4);
        
        lettre5 = new JLabel("");
        lettre5.setIcon(new ImageIcon(Test.class.getResource("/images/u.png")));
        lettre5.setHorizontalAlignment(SwingConstants.CENTER);
        lettres.add(lettre5);
        
        lettre6 = new JLabel("");
        lettre6.setIcon(new ImageIcon(Test.class.getResource("/images/u.png")));
        lettre6.setHorizontalAlignment(SwingConstants.CENTER);
        lettres.add(lettre6);
        
        lettre7 = new JLabel("");
        lettre7.setIcon(new ImageIcon(Test.class.getResource("/images/u.png")));
        lettre7.setHorizontalAlignment(SwingConstants.CENTER);
        lettres.add(lettre7);
        
        grille.revalidate();
    }
    
    public Grille getGrille() {
    	return grille;
    }
    
    public JLabel getBack() {
    	return back;
    }
}