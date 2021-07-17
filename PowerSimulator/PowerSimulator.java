
package PowerSimulator;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

import org.apache.commons.math3.distribution.NormalDistribution;


public class PowerSimulator implements ActionListener {

	private static final int CENTER = 0;
	private static JFrame frame;
	private static JTabbedPane tabby;
	
	//9 Panels for possible configs
	private static JPanel home;
	private static JPanel z1pow;
	private static JPanel z1sam;
	private static JPanel z2pow;
	private static JPanel z2sam;
	private static JPanel t1pow;
	private static JPanel t1sam;
	private static JPanel t2pow;
	private static JPanel t2sam;
	
	//labels
	private static JLabel TONE1;
	private static JLabel TTWO1;
	private static JLabel POWER1;
	
	private static JLabel TONE2;
	private static JLabel TTWO2;
	private static JLabel Sam2;
	
	private static JLabel TONE3;
	private static JLabel TTWO3;
	private static JLabel POWER3;
	
	private static JLabel TONE4;
	private static JLabel TTWO4;
	private static JLabel Sam4;
	
	private static JLabel TONE5;
	private static JLabel TTWO5;
	private static JLabel POWER5;
	
	private static JLabel TONE6;
	private static JLabel TTWO6;
	private static JLabel Sam6;
	
	private static JLabel TONE7;
	private static JLabel TTWO7;
	private static JLabel POWER7;
	
	private static JLabel TONE8;
	private static JLabel TTWO8;
	private static JLabel Sam8;
	
	//BUTTONS
	
	//Combobox
	private static String[] dir= { "≠","<",">"};
	private static String[] dir33= { "pA≠pB","pA>pB","pA<pB"};
	private static String[] dir77= { "μA≠μB","μA>μB","μA<μB"};
	
	private static JComboBox<String> dir1;
	private static JComboBox<String> dir2;
	private static JComboBox<String> dir3;
	private static JComboBox<String> dir4;
	private static JComboBox<String> dir5;
	private static JComboBox<String> dir6;
	private static JComboBox<String> dir7;
	private static JComboBox<String> dir8;
	
	//table of contents buttons 
	
	private static KButton z1powa;
	private static KButton z1sama;
	private static KButton z2powa;
	private static KButton z2sama;
	private static KButton t1powa;
	private static KButton t1sama;
	private static KButton t2powa;
	private static KButton t2sama;
	
	//back buttons
	private static KButton back1;
	private static KButton back2;
	private static KButton back3;
	private static KButton back4;
	private static KButton back5;
	private static KButton back6;
	private static KButton back7;
	private static KButton back8;	
	
	//calculate buttons
	private static KButton calc1;
	private static KButton calc2;
	private static KButton calc3;
	private static KButton calc4;
	private static KButton calc5;
	private static KButton calc6;
	private static KButton calc7;
	private static KButton calc8;	
	
	//text fields
	private static JTextField talpha1;
	private static JTextField talpha2;
	private static JTextField talpha3;
	private static JTextField talpha4;
	private static JTextField talpha5;
	private static JTextField talpha6;
	private static JTextField talpha7;
	private static JTextField talpha8;
	
	//Z1pow Fields
	private static JTextField prF1;
	private static JTextField phF1;
	private static JTextField nF1;
	
	//Z1sam Fields
	private static JTextField p2;
	private static JTextField p02;
	private static JTextField pow2;
	
	//z2pow Fields
	private static JTextField pA3;
	private static JTextField pB3;
	private static JTextField nF3A;
	private static JTextField nF3B;
	//z2sam fields
	private static JTextField pA4;
	private static JTextField pB4;
	private static JTextField pow4;
	
	//t1pow
	private static JTextField prF5;
	private static JTextField phF5;
	private static JTextField nF5;
	private static JTextField sigg5;
	
	//t1sam
	
	private static JTextField p6;
	private static JTextField p06;
	private static JTextField pow6;
	private static JTextField sigg6;
	
	//t2pow
	
	private static JTextField sigg7A;
	private static JTextField sigg7B;
	private static JTextField pA7;
	private static JTextField pB7;
	private static JTextField nF7A;
	private static JTextField nF7B;
	
	//t2sam
	private static JTextField pA8;
	private static JTextField pB8;
	private static JTextField pow8;
	private static JTextField sigg8A;
	private static JTextField sigg8B;
	
	
	public PowerSimulator() {
		
		tabby= new JTabbedPane();
		frame=new JFrame();
		
		//Different Tabs
		home = new JPanel();
		tabby.addTab("Home",null, home, "Home Screen" );
		
		z1pow = new JPanel();
		tabby.addTab("Power - One Sample Z-Test",null, z1pow, "Calculate Power of a One Sample Z-Test." );
		
		z1sam = new JPanel();
		tabby.addTab("Sample Size - One Sample Z Test",null, z1sam, "Calculate Sample Size for a One Sample Z-Test." );
		
		z2pow = new JPanel();
		tabby.addTab("Power - Two Sample Z Test",null, z2pow, "Calculate Power of a Two Sample Z-Test." );

		z2sam = new JPanel();
		tabby.addTab("Sample Size - Two Sample Z Test",null, z2sam, "Calculate Sample Size for a Two Sample Z-Test." );

		t1pow = new JPanel();
		tabby.addTab("Power - One Sample T Test",null, t1pow, "Calculate Power of a One Sample T-Test." );

		t1sam = new JPanel();
		tabby.addTab("Sample Size - One Sample T Test",null, t1sam, "Calculate Sample Size for a One Sample T-Test." );

		t2pow = new JPanel();
		tabby.addTab("Power - Two Sample T Test",null, t2pow, "Calculate Power of a Two Sample T-Test." );

		t2sam = new JPanel();
		tabby.addTab("Sample Size - Two Sample T Test",null, t2sam, "Calculate Sample Size for a Two Sample T-Test." );
		
		
		//home screen set up
		home.setBorder(BorderFactory.createEmptyBorder());
		home.setLayout(new GridLayout(11,1));
		
		Font aGaramond = new Font("Garamond",Font.BOLD,45);
		Font panTIT = new Font("Garamond",Font.BOLD,25);
		Font small = new Font("Garamond",Font.PLAIN,15);
		Font med = new Font("Garamond",Font.PLAIN,18);
		Font subTIT = new Font("Garamond",Font.BOLD,20);

		JLabel homeL = new JLabel("Home");
		homeL.setFont(aGaramond);
		home.add(homeL,0);
		homeL.setHorizontalTextPosition(CENTER);
		homeL.setHorizontalAlignment(CENTER);
		
		
		JLabel instruct = new JLabel("<html>"+"Instructions:Welcome to the Power Calulator.Here you will find calculators to solve for power and sample size of z and t tests."+"<html>");
		instruct.setFont(small);
		home.add(instruct,1);
		Border greenline = BorderFactory.createLineBorder(Color.green);
		Border blueline = BorderFactory.createLineBorder(Color.blue);
		Border outline = BorderFactory.createCompoundBorder(BorderFactory.createLoweredBevelBorder(), BorderFactory.createRaisedBevelBorder());
		outline = BorderFactory.createCompoundBorder(greenline, outline);
		instruct.setBorder(outline);
		
		
		
		JLabel table = new JLabel("Table of Contents");
		table.setFont(subTIT);
		home.add(table,2);
		table.setHorizontalTextPosition(CENTER);
		table.setHorizontalAlignment(CENTER);
		
		z1powa = new KButton("Power - One Sample Z-Test");
		home.add(z1powa,3);
		z1powa.setNum(1);
		z1powa.addActionListener(this);
		
		z1sama = new KButton("Sample Size - One Sample Z-Test");
		home.add(z1sama,4);
		z1sama.setNum(2);
		z1sama.addActionListener(this);
		
		z2powa = new KButton("Power - Two Sample Z-Test");
		home.add(z2powa,5);
		z2powa.setNum(3);
		z2powa.addActionListener(this);
		
		z2sama = new KButton("Sample Size - Two Sample Z-Test");
		home.add(z2sama,6);
		z2sama.setNum(4);
		z2sama.addActionListener(this);
		
		t1powa = new KButton("Power - One Sample T-Test");
		home.add(t1powa,7);
		t1powa.setNum(5);
		t1powa.addActionListener(this);
		
		t1sama = new KButton("Sample Size - One Sample T-Test");
		home.add(t1sama,8);
		t1sama.setNum(6);
		t1sama.addActionListener(this);
		
		t2powa = new KButton("Power - Two Sample T-Test");
		home.add(t2powa,9);
		t2powa.setNum(7);
		t2powa.addActionListener(this);
		
		t2sama = new KButton("Sample Size - Two Sample T-Test");
		home.add(t2sama,10);
		t2sama.setNum(8);
		t2sama.addActionListener(this);
		
		
		//One Sample Z Test Power Set up
		
		z1pow.setBorder(BorderFactory.createEmptyBorder());
		z1pow.setLayout(new GridBagLayout());
		z1pow.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		GridBagConstraints b = new GridBagConstraints();
		
		b.fill=GridBagConstraints.HORIZONTAL;

	
		
		JLabel z1p = new JLabel("Power - One Sample Z-Test");
		z1p.setBorder(blueline);
		z1p.setFont(panTIT);
		z1p.setHorizontalAlignment(CENTER);
	
		b.weightx=0.5;
		b.fill=GridBagConstraints.HORIZONTAL;
		b.gridx=0;
		b.gridy=0;
		z1pow.add(z1p,b);
		
		back1 = new KButton("← Home");
		back1.setNum(0);
		back1.addActionListener(this);
		
		b.weightx=0.1;
		b.gridx=4;
		b.gridwidth = 1;
		b.gridy=0;	
		z1pow.add(back1,b);	
		
		JLabel des1 = new JLabel("<html>"+"Calculate power for a test where the population proportion p is equal to p0."+ "<html>");
		des1.setFont(small);
		des1.setHorizontalAlignment(CENTER);
		b.gridwidth=3;
		b.weightx=1;
		b.gridx=0;
		b.gridy=1;	
		z1pow.add(des1,b);	
		
		JLabel hyp1 = new JLabel("Select Direction of Test");
		hyp1.setFont(subTIT);
		hyp1.setHorizontalAlignment(CENTER);
		b.gridwidth=2;
		b.weightx=0.5;
		b.gridx=0;
		b.gridy=2;	
		z1pow.add(hyp1,b);	
		
		JLabel hypN1 = new JLabel("H\u2080: ");
		hypN1.setFont(med);
		hypN1.setHorizontalAlignment(CENTER);
		b.gridwidth=1;
		b.weightx=0.3;
		b.gridx=0;
		b.gridy=3;	
		z1pow.add(hypN1,b);	
		
		JLabel hypRN1 = new JLabel("p = p\u2080 ");
		hypRN1.setFont(med);
		hypRN1.setHorizontalAlignment(CENTER);
		b.gridwidth=1;
		b.weightx=0.3;
		b.gridx=1;
		b.gridy=3;	
		z1pow.add(hypRN1,b);	
		
		JLabel hypA1 = new JLabel("H\u2090: ");
		hypA1.setFont(med);
		hypA1.setHorizontalAlignment(CENTER);
		b.weightx=0.5;
		b.gridx=0;
		b.gridy=4;	
		z1pow.add(hypA1,b);	
		
		JLabel hypRA1 = new JLabel("p");
		hypRA1.setFont(med);
		hypRA1.setHorizontalAlignment(CENTER);
		b.gridwidth=1;
		b.weightx=0.1;
		b.gridx=1;
		b.gridy=4;	
		z1pow.add(hypRA1,b);	
		
		
		dir1 = new JComboBox<String>(dir);
		
		
		b.weightx=0.2;
		b.gridx=2;
		b.gridy=4;	
		z1pow.add(dir1,b);	
		
		JLabel pN = new JLabel("p\u2080");
		pN.setFont(med);
		pN.setHorizontalAlignment(CENTER);
		b.weightx=0.5;
		b.gridx=3;
		b.gridy=4;	
		z1pow.add(pN,b);	
		
		
		JLabel alpha1 = new JLabel("α: ");
		alpha1.setFont(med);
		alpha1.setHorizontalAlignment(CENTER);
		b.weightx=0.5;
		b.gridx=0;
		b.gridy=5;	
		z1pow.add(alpha1,b);	
		
		talpha1 = new JTextField("0.05");
		talpha1.setFont(med);
		talpha1.setHorizontalAlignment(CENTER);
		b.weightx=0.5;
		b.gridx=1;
		b.gridy=5;	
		z1pow.add(talpha1,b);			
		
		JLabel pr1 = new JLabel("Population proportion p: ");
		pr1.setFont(med);
		pr1.setHorizontalAlignment(CENTER);
		b.weightx=0.5;
		b.gridx=0;
		b.gridy=6;	
		z1pow.add(pr1,b);	
		
		prF1 = new JTextField("0.5");
		prF1.setFont(med);
		prF1.setHorizontalAlignment(CENTER);
		b.weightx=0.5;
		b.gridx=1;
		b.gridy=6;	
		z1pow.add(prF1,b);
		
		JLabel ph1 = new JLabel("Comparison proportion p\u2080: ");
		ph1.setFont(med);
		ph1.setHorizontalAlignment(CENTER);
		b.weightx=0.5;
		b.gridx=0;
		b.gridy=7;	
		z1pow.add(ph1,b);	
		
		phF1 = new JTextField("0.55");
		phF1.setFont(med);
		phF1.setHorizontalAlignment(CENTER);
		b.weightx=0.5;
		b.gridx=1;
		b.gridy=7;	
		z1pow.add(phF1,b);
		
		
		JLabel n1 = new JLabel("Sample Size n: ");
		n1.setFont(med);
		n1.setHorizontalAlignment(CENTER);
		b.weightx=0.5;
		b.gridx=0;
		b.gridy=8;	
		z1pow.add(n1,b);	
		
		nF1 = new JTextField("10");
		nF1.setFont(med);
		nF1.setHorizontalAlignment(CENTER);
		b.weightx=0.5;
		b.gridx=1;
		b.gridy=8;	
		z1pow.add(nF1,b);
		
		calc1 = new KButton("Calculate");
		calc1.setFont(panTIT);
		calc1.setNum(-1);
		calc1.addActionListener(this);
		b.gridwidth = 5;
		b.weightx=0.5;
		b.gridx=0;
		b.gridy=9;	
		z1pow.add(calc1,b);
		
		TONE1 = new JLabel("Type I Error: ");
		TONE1.setFont(med);
		TONE1.setHorizontalAlignment(CENTER);
		b.gridwidth = 5;
		b.weightx=0.5;
		b.gridheight=1;
		b.gridx=0;
		b.gridy=10;	
		z1pow.add(TONE1,b);
		
		TTWO1 = new JLabel("Type II Error: ");
		TTWO1.setFont(med);
		TTWO1.setHorizontalAlignment(CENTER);
		b.weightx=0.5;
		b.gridx=0;
		b.gridy=11;	
		z1pow.add(TTWO1,b);
		
		POWER1 = new JLabel("Power: ");
		POWER1.setFont(med);
		POWER1.setHorizontalAlignment(CENTER);
		b.weightx=0.5;
		b.gridx=0;
		b.gridy=12;	
		z1pow.add(POWER1,b);
		
		b.gridx=0;
		b.gridy=13;
		b.weightx=1;
		b.weighty=1;
		z1pow.add(new JLabel(""),b);
		
		//One Sample Z Test Sample Size Set up
		GridBagConstraints c = new GridBagConstraints();
		
		z1sam.setBorder(BorderFactory.createEmptyBorder());
		z1sam.setLayout(new GridBagLayout());
		z1sam.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		
		c.fill=GridBagConstraints.HORIZONTAL;
		c.fill = GridBagConstraints.VERTICAL;
	
		
		JLabel z1s = new JLabel("Sample Size - One Sample Z-Test");
		z1s.setBorder(blueline);
		z1s.setFont(panTIT);
		z1s.setHorizontalAlignment(CENTER);
	
		c.weightx=0.5;
		c.fill=GridBagConstraints.HORIZONTAL;
		c.anchor =GridBagConstraints.NORTHWEST;
		c.gridwidth=4;
		c.gridx=0;
		c.gridy=0;
		z1sam.add(z1s,c);
		
		back2 = new KButton("← Home");
		back2.setNum(0);
		back2.addActionListener(this);
		
		c.weightx=0.1;
		c.gridx=4;
		c.gridwidth = 1;
		c.gridy=0;	
		z1sam.add(back2,c);	
		
		JLabel des2 = new JLabel("<html>"+"Calculate sample size for a test where the population proportion p is equal to p0."+ "<html>");
		des2.setFont(small);
		des2.setHorizontalAlignment(CENTER);
		c.gridwidth=3;
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=1;	
		z1sam.add(des2,c);	
		
		JLabel hyp2 = new JLabel("Select Direction of Test");
		hyp2.setFont(subTIT);
		hyp2.setHorizontalAlignment(CENTER);
		c.gridwidth=2;
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=2;	
		z1sam.add(hyp2,c);
		
		JLabel hypN2 = new JLabel("H\u2080: ");
		hypN2.setFont(med);
		hypN2.setHorizontalAlignment(CENTER);
		c.gridwidth=1;
		c.weightx=0.3;
		c.gridx=0;
		c.gridy=3;	
		z1sam.add(hypN2,c);	
		
		JLabel hypRN2 = new JLabel("p = p\u2080 ");
		hypRN2.setFont(med);
		hypRN2.setHorizontalAlignment(CENTER);
		c.gridwidth=1;
		c.weightx=0.3;
		c.gridx=1;
		c.gridy=3;	
		z1sam.add(hypRN2,c);	
		
		JLabel hypA2 = new JLabel("H\u2090: ");
		hypA2.setFont(med);
		hypA2.setHorizontalAlignment(CENTER);
		c.gridwidth=1;
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=4;	
		z1sam.add(hypA2,c);	
		
		JLabel hypRA2 = new JLabel("p");
		hypRA2.setFont(med);
		hypRA2.setHorizontalAlignment(CENTER);
		c.gridwidth=1;
		c.weightx=0.1;
		c.gridx=1;
		c.gridy=4;	
		z1sam.add(hypRA2,c);	
		
		
		dir2 = new JComboBox<String>(dir);
		
		
		c.weightx=0.2;
		c.gridx=2;
		c.gridy=4;	
		z1sam.add(dir2,c);	
		
		JLabel pN2 = new JLabel("p\u2080");
		pN2.setFont(med);
		pN2.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=3;
		c.gridy=4;	
		z1sam.add(pN2,c);	
		
		
		JLabel alpha2 = new JLabel("α: ");
		alpha2.setFont(med);
		alpha2.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=5;	
		z1sam.add(alpha2,c);	
		
		talpha2 = new JTextField("0.05");
		talpha2.setFont(med);
		talpha2.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=1;
		c.gridy=5;	
		z1sam.add(talpha2,c);			
		
		JLabel pr2 = new JLabel("Population proportion p: ");
		pr2.setFont(med);
		pr2.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=6;	
		z1sam.add(pr2,c);	
		
		p2 = new JTextField("0.5");
		p2.setFont(med);
		p2.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=1;
		c.gridy=6;	
		z1sam.add(p2,c);
		
		JLabel ph2 = new JLabel("Comparison proportion p\u2080: ");
		ph2.setFont(med);
		ph2.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=7;	
		z1sam.add(ph2,c);	
		
		p02 = new JTextField("0.55");
		p02.setFont(med);
		p02.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=1;
		c.gridy=7;	
		z1sam.add(p02,c);
		
		
		JLabel power2 = new JLabel("Desired Power: ");
		power2.setFont(med);
		power2.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=8;	
		z1sam.add(power2,c);	
		
		pow2 = new JTextField("0.8");
		pow2.setFont(med);
		pow2.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=1;
		c.gridy=8;	
		z1sam.add(pow2,c);
		
		calc2 = new KButton("Calculate");
		calc2.setFont(panTIT);
		calc2.setNum(-2);
		calc2.addActionListener(this);
		c.gridwidth =5; 
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=9;	
		z1sam.add(calc2,c);
		
		TONE2 = new JLabel("Type I Error: ");
		TONE2.setFont(med);
		TONE2.setHorizontalAlignment(CENTER);
		c.gridwidth =5;
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=10;	
		z1sam.add(TONE2,c);
		
		TTWO2 = new JLabel("Type II Error: ");
		TTWO2.setFont(med);
		TTWO2.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=11;	
		z1sam.add(TTWO2,c);
		
		Sam2 = new JLabel("Required Sample Size: ");
		Sam2.setFont(med);
		Sam2.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=12;	
		z1sam.add(Sam2,c);
		
		c.weightx=1;
		c.weighty=1;
		z1sam.add(new JLabel(""),c);
		
		
		//Two Sample Z Test Power Set up
		
		z2pow.setBorder(BorderFactory.createEmptyBorder());
		z2pow.setLayout(new GridBagLayout());
		z2pow.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		GridBagConstraints d =new GridBagConstraints();
		d.fill=GridBagConstraints.HORIZONTAL;
		d.fill = GridBagConstraints.VERTICAL;
	
		
		JLabel z2p = new JLabel("Power - Two Sample Z-Test");
		z2p.setBorder(blueline);
		z2p.setFont(panTIT);
		z2p.setHorizontalAlignment(CENTER);
	
		d.weightx=0.5;
		d.fill=GridBagConstraints.HORIZONTAL;
		d.anchor =GridBagConstraints.NORTHWEST;
		d.gridwidth=4;
		d.gridx=0;
		d.gridy=0;
		z2pow.add(z2p,d);
		
		back3 = new KButton("← Home");
		back3.setNum(0);
		back3.addActionListener(this);
		d.gridwidth = 1;
		d.weightx=0.1;
		d.gridx=4;
		d.gridy=0;	
		z2pow.add(back3,d);	
		
		JLabel des3 = new JLabel("<html>"+"Calculate power for a test about the difference between two sample proportions pA and pB."+ "<html>");
		des3.setFont(small);
		des3.setHorizontalAlignment(CENTER);
		d.gridwidth=5;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=1;	
		z2pow.add(des3,d);	
		
		JLabel hyp3 = new JLabel("Select Direction of Test");
		hyp3.setFont(subTIT);
		hyp3.setHorizontalAlignment(CENTER);
		d.fill = GridBagConstraints.HORIZONTAL;
		d.gridwidth=5;
		d.weightx= 1;
		d.gridx=0;
		d.gridy=2;	
		z2pow.add(hyp3,d);	
		
		JLabel hypN3 = new JLabel("H\u2080: ");
		hypN3.setFont(med);
		hypN3.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.3;
		d.gridx=0;
		d.gridy=3;	
		z2pow.add(hypN3,d);	
		
		JLabel hypRN3 = new JLabel("pA = pB ");
		hypRN3.setFont(med);
		hypRN3.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.3;
		d.gridx=1;
		d.gridy=3;	
		z2pow.add(hypRN3,d);	
		
		JLabel hypA3 = new JLabel("H\u2090: ");
		hypA3.setFont(med);
		hypA3.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=4;	
		z2pow.add(hypA3,d);	
		
		
		
		dir3 = new JComboBox<String>(dir33);
		
		
		d.weightx=0.5;
		d.gridx=2;
		d.gridy=4;	
		z2pow.add(dir3,d);	
		
		
		
		JLabel alpha3 = new JLabel("α: ");
		alpha3.setFont(med);
		alpha3.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=5;	
		z2pow.add(alpha3,d);	
		
		talpha3 = new JTextField("0.05");
		talpha3.setFont(med);
		talpha3.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=1;
		d.gridy=5;	
		z2pow.add(talpha3,d);			
		
		JLabel pr3 = new JLabel("pA: ");
		pr3.setFont(med);
		pr3.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=6;	
		z2pow.add(pr3,d);	
		
		pA3 = new JTextField("0.5");
		pA3.setFont(med);
		pA3.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=1;
		d.gridy=6;	
		z2pow.add(pA3,d);
		
		JLabel pB1 = new JLabel("pB:  ");
		pB1.setFont(med);
		pB1.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=7;	
		z2pow.add(pB1,d);	
		
		pB3 = new JTextField("0.55");
		pB3.setFont(med);
		pB3.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=1;
		d.gridy=7;	
		z2pow.add(pB3,d);
		
		
		JLabel n3A = new JLabel("Sample Size of Group A: ");
		n3A.setFont(med);
		n3A.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=8;	
		z2pow.add(n3A,d);	
		
		nF3A = new JTextField("10");
		nF3A.setFont(med);
		nF3A.setHorizontalAlignment(CENTER);
		d.weightx=0.2;
		d.gridx=1;
		d.gridy=8;	
		z2pow.add(nF3A,d);
		
		JLabel n3B = new JLabel("Sample Size of Group B: ");
		n3B.setFont(med);
		n3B.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=2;
		d.gridy=8;	
		z2pow.add(n3B,d);	
		
		nF3B = new JTextField("10");
		nF3B.setFont(med);
		nF3B.setHorizontalAlignment(CENTER);
		d.gridwidth=2;
		d.weightx=0.2;
		d.gridx=3;
		d.gridy=8;	
		z2pow.add(nF3B,d);
		
		calc3 = new KButton("Calculate");
		calc3.setFont(panTIT);
		calc3.setNum(-3);
		calc3.addActionListener(this);
		d.gridwidth=5;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=9;	
		z2pow.add(calc3,d);
		
		TONE3 = new JLabel("Type I Error: ");
		TONE3.setFont(med);
		TONE3.setHorizontalAlignment(CENTER);
		d.gridwidth=5;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=10;	
		z2pow.add(TONE3,d);
		
		TTWO3 = new JLabel("Type II Error: ");
		TTWO3.setFont(med);
		TTWO3.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=11;	
		z2pow.add(TTWO3,d);
		
		POWER3 = new JLabel("Power: ");
		POWER3.setFont(med);
		POWER3.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=12;	
		z2pow.add(POWER3,d);
		
		d.weightx=1;
		d.weighty=1;
		z2pow.add(new JLabel(""),d);
		
		//Two Sample Z Test Sample Size Set up
		
		z2sam.setBorder(BorderFactory.createEmptyBorder());
		z2sam.setLayout(new GridBagLayout());
		z2sam.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		
		d.fill=GridBagConstraints.HORIZONTAL;
		d.fill = GridBagConstraints.VERTICAL;
	
		
		JLabel z2s = new JLabel("Sample Size - Two Sample Z-Test");
		z2s.setBorder(blueline);
		z2s.setFont(panTIT);
		z2s.setHorizontalAlignment(CENTER);
	
		d.weightx=0.5;
		d.fill=GridBagConstraints.HORIZONTAL;
		d.anchor =GridBagConstraints.NORTHWEST;
		d.gridwidth=4;
		d.gridx=0;
		d.gridy=0;
		z2sam.add(z2s,d);
		
		back4 = new KButton("← Home");
		back4.setNum(0);
		back4.addActionListener(this);
		d.gridwidth = 1;
		d.weightx=0.1;
		d.gridx=4;
		d.gridy=0;	
		z2sam.add(back4,d);	
		
		JLabel des4 = new JLabel("<html>"+"Calculate sample size for a test about the difference between two sample proportions pA and pB."+ "<html>");
		des4.setFont(small);
		des4.setHorizontalAlignment(CENTER);
		d.gridwidth=5;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=1;	
		z2sam.add(des4,d);	
		
		JLabel hyp4 = new JLabel("Select Direction of Test");
		hyp4.setFont(subTIT);
		hyp4.setHorizontalAlignment(CENTER);
		d.fill = GridBagConstraints.HORIZONTAL;
		d.gridwidth=5;
		d.weightx= 1;
		d.gridx=0;
		d.gridy=2;	
		z2sam.add(hyp4,d);	
		
		JLabel hypN4 = new JLabel("H\u2080: ");
		hypN4.setFont(med);
		hypN4.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.3;
		d.gridx=0;
		d.gridy=3;	
		z2sam.add(hypN4,d);	
		
		JLabel hypRN4 = new JLabel("pA  = pB ");
		hypRN4.setFont(med);
		hypRN4.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.3;
		d.gridx=1;
		d.gridy=3;	
		z2sam.add(hypRN4,d);	
		
		JLabel hypA4 = new JLabel("H\u2090: ");
		hypA4.setFont(med);
		hypA4.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=4;	
		z2sam.add(hypA4,d);	
		
		
		
		dir4 = new JComboBox<String>(dir33);
		
		
		d.weightx=0.5;
		d.gridx=2;
		d.gridy=4;	
		z2sam.add(dir4,d);	
		
		
		
		JLabel alpha4 = new JLabel("α: ");
		alpha4.setFont(med);
		alpha4.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=5;	
		z2sam.add(alpha4,d);	
		
		talpha4 = new JTextField("0.05");
		talpha4.setFont(med);
		talpha4.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=1;
		d.gridy=5;	
		z2sam.add(talpha4,d);			
		
		JLabel pr4 = new JLabel("pA: ");
		pr4.setFont(med);
		pr4.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=6;	
		z2sam.add(pr4,d);	
		
		pA4 = new JTextField("0.5");
		pA4.setFont(med);
		pA4.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=1;
		d.gridy=6;	
		z2sam.add(pA4,d);
		
		JLabel pB2 = new JLabel("pB:  ");
		pB2.setFont(med);
		pB2.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=7;	
		z2sam.add(pB2,d);	
		
		pB4 = new JTextField("0.55");
		pB4.setFont(med);
		pB4.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=1;
		d.gridy=7;	
		z2sam.add(pB4,d);
		
		
		JLabel n4A = new JLabel("Desired Power: ");
		n4A.setFont(med);
		n4A.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=8;	
		z2sam.add(n4A,d);	
		
		pow4 = new JTextField("0.8");
		pow4.setFont(med);
		pow4.setHorizontalAlignment(CENTER);
		d.weightx=0.1;
		d.gridx=1;
		d.gridy=8;	
		z2sam.add(pow4,d);
		
		
		calc4 = new KButton("Calculate");
		calc4.setFont(panTIT);
		calc4.setNum(-4);
		calc4.addActionListener(this);
		d.gridwidth=5;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=9;	
		z2sam.add(calc4,d);
		
		TONE4 = new JLabel("Type I Error: ");
		TONE4.setFont(med);
		TONE4.setHorizontalAlignment(CENTER);
		d.gridwidth=5;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=10;	
		z2sam.add(TONE4,d);
		
		TTWO4 = new JLabel("Type II Error: ");
		TTWO4.setFont(med);
		TTWO4.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=11;	
		z2sam.add(TTWO4,d);
		
		Sam4 = new JLabel("Required Sample Size: ");
		Sam4.setFont(med);
		Sam4.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=12;	
		z2sam.add(Sam4,d);
		
		d.weightx=1;
		d.weighty=1;
		z2sam.add(new JLabel(""),d);
		
		//One Sample T Test Power Set up
		
		t1pow.setBorder(BorderFactory.createEmptyBorder());
		t1pow.setLayout(new GridBagLayout());
		t1pow.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		GridBagConstraints e= new GridBagConstraints();
		
		e.fill=GridBagConstraints.HORIZONTAL;

	
		
		JLabel t1p = new JLabel("Power - One Sample T-Test");
		t1p.setBorder(blueline);
		t1p.setFont(panTIT);
		t1p.setHorizontalAlignment(CENTER);
	
		e.weightx=0.5;
		e.fill=GridBagConstraints.HORIZONTAL;
		e.gridx=0;
		e.gridy=0;
		t1pow.add(t1p,e);
		
		back5 = new KButton("← Home");
		back5.setNum(0);
		back5.addActionListener(this);
		
		e.weightx=0.1;
		e.gridx=4;
		e.gridwidth = 1;
		e.gridy=0;	
		t1pow.add(back5,e);	
		
		JLabel des5 = new JLabel("<html>"+"Calculate power for a test where the population mean μ is equal to μ\u2080."+ "<html>");
		des5.setFont(small);
		des5.setHorizontalAlignment(CENTER);
		e.gridwidth=3;
		e.weightx=1;
		e.gridx=0;
		e.gridy=1;	
		t1pow.add(des5,e);	
		
		JLabel hyp5 = new JLabel("Select Direction of Test");
		hyp5.setFont(subTIT);
		hyp5.setHorizontalAlignment(CENTER);
		e.gridwidth=2;
		e.weightx=0.5;
		e.gridx=0;
		e.gridy=2;	
		t1pow.add(hyp5,e);	
		
		JLabel hypN5 = new JLabel("H\u2080: ");
		hypN5.setFont(med);
		hypN5.setHorizontalAlignment(CENTER);
		e.gridwidth=1;
		e.weightx=0.3;
		e.gridx=0;
		e.gridy=3;	
		t1pow.add(hypN5,e);	
		
		JLabel hypRN5 = new JLabel("μ = μ\u2080 ");
		hypRN5.setFont(med);
		hypRN5.setHorizontalAlignment(CENTER);
		e.gridwidth=1;
		e.weightx=0.3;
		e.gridx=1;
		e.gridy=3;	
		t1pow.add(hypRN5,e);	
		
		JLabel hypA5 = new JLabel("H\u2090: ");
		hypA5.setFont(med);
		hypA5.setHorizontalAlignment(CENTER);
		e.weightx=0.5;
		e.gridx=0;
		e.gridy=4;	
		t1pow.add(hypA5,e);	
		
		JLabel hypRA5 = new JLabel("μ");
		hypRA5.setFont(med);
		hypRA5.setHorizontalAlignment(CENTER);
		e.gridwidth=1;
		e.weightx=0.1;
		e.gridx=1;
		e.gridy=4;	
		t1pow.add(hypRA5,e);	
		
		
		dir5 = new JComboBox<String>(dir);
		
		
		e.weightx=0.2;
		e.gridx=2;
		e.gridy=4;	
		t1pow.add(dir5,e);	
		
		JLabel pN5 = new JLabel("μ\u2080");
		pN5.setFont(med);
		pN5.setHorizontalAlignment(CENTER);
		e.weightx=0.5;
		e.gridx=3;
		e.gridy=4;	
		t1pow.add(pN5,e);	
		
		
		JLabel alpha5 = new JLabel("α: ");
		alpha5.setFont(med);
		alpha5.setHorizontalAlignment(CENTER);
		e.weightx=0.5;
		e.gridx=0;
		e.gridy=5;	
		t1pow.add(alpha5,e);	
		
		talpha5 = new JTextField("0.05");
		talpha5.setFont(med);
		talpha5.setHorizontalAlignment(CENTER);
		e.weightx=0.5;
		e.gridx=1;
		e.gridy=5;	
		t1pow.add(talpha5,e);			
		
		JLabel pr5 = new JLabel("Population mean μ: ");
		pr5.setFont(med);
		pr5.setHorizontalAlignment(CENTER);
		e.weightx=0.5;
		e.gridx=0;
		e.gridy=6;	
		t1pow.add(pr5,e);	
		
		prF5 = new JTextField("5.0"); //double
		prF5.setFont(med);
		prF5.setHorizontalAlignment(CENTER);
		e.weightx=0.5;
		e.gridx=1;
		e.gridy=6;	
		t1pow.add(prF5,e);
		
		JLabel ph5 = new JLabel("Comparison mean μ\u2080: ");
		ph5.setFont(med);
		ph5.setHorizontalAlignment(CENTER);
		e.weightx=0.5;
		e.gridx=0;
		e.gridy=7;	
		t1pow.add(ph5,e);	
		
		phF5 = new JTextField("5.1");
		phF5.setFont(med);
		phF5.setHorizontalAlignment(CENTER);
		e.weightx=0.5;
		e.gridx=1;
		e.gridy=7;	
		t1pow.add(phF5,e);
		
		
		JLabel n5 = new JLabel("Sample Size n: ");
		n5.setFont(med);
		n5.setHorizontalAlignment(CENTER);
		e.weightx=0.5;
		e.gridx=0;
		e.gridy=8;	
		t1pow.add(n5,e);	
		
		nF5 = new JTextField("10");
		nF5.setFont(med);
		nF5.setHorizontalAlignment(CENTER);
		e.weightx=0.5;
		e.gridx=1;
		e.gridy=8;	
		t1pow.add(nF5,e);
		
		JLabel sig5 = new JLabel("Population Standard Deviation σ:");
		sig5.setFont(med);
		sig5.setHorizontalAlignment(CENTER);
		e.weightx=0.5;
		e.gridx=0;
		e.gridy=9;	
		t1pow.add(sig5,e);	
		
		sigg5 = new JTextField("1");
		sigg5.setFont(med);
		sigg5.setHorizontalAlignment(CENTER);
		e.weightx=0.5;
		e.gridx=1;
		e.gridy=9;	
		t1pow.add(sigg5,e);
		
		
		
		calc5 = new KButton("Calculate");
		calc5.setFont(panTIT);
		calc5.setNum(-5);
		calc5.addActionListener(this);
		e.gridwidth = 5;
		e.weightx=0.5;
		e.gridx=0;
		e.gridy=10;	
		t1pow.add(calc5,e);
		
		TONE5 = new JLabel("Type I Error: ");
		TONE5.setFont(med);
		TONE5.setHorizontalAlignment(CENTER);
		e.gridwidth = 5;
		e.weightx=0.5;
		e.gridheight=1;
		e.gridx=0;
		e.gridy=11;	
		t1pow.add(TONE5,e);
		
		TTWO5 = new JLabel("Type II Error: ");
		TTWO5.setFont(med);
		TTWO5.setHorizontalAlignment(CENTER);
		e.weightx=0.5;
		e.gridx=0;
		e.gridy=12;	
		t1pow.add(TTWO5,e);
		
		POWER5 = new JLabel("Power: ");
		POWER5.setFont(med);
		POWER5.setHorizontalAlignment(CENTER);
		e.weightx=0.5;
		e.gridx=0;
		e.gridy=13;	
		t1pow.add(POWER5,e);
		
		e.gridx=0;
		e.gridy=14;
		e.weightx=1;
		e.weighty=1;
		t1pow.add(new JLabel(""),e);
		
		//One Sample T Test Sample Size Set up
		

		
		t1sam.setBorder(BorderFactory.createEmptyBorder());
		t1sam.setLayout(new GridBagLayout());
		t1sam.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		
		c.fill=GridBagConstraints.HORIZONTAL;
		c.fill = GridBagConstraints.VERTICAL;
		
		
		JLabel t1s = new JLabel("Sample Size - One Sample T-Test");
		t1s.setBorder(blueline);
		t1s.setFont(panTIT);
		t1s.setHorizontalAlignment(CENTER);
	
		c.weightx=0.5;
		c.fill=GridBagConstraints.HORIZONTAL;
		c.anchor =GridBagConstraints.NORTHWEST;
		c.gridwidth=4;
		c.gridx=0;
		c.gridy=0;
		t1sam.add(t1s,c);
		
		back6 = new KButton("← Home");
		back6.setNum(0);
		back6.addActionListener(this);
		
		c.weightx=0.1;
		c.gridx=4;
		c.gridwidth = 1;
		c.gridy=0;	
		t1sam.add(back6,c);	
		
		JLabel des6 = new JLabel("<html>"+"Calculate sample size for a test where the population mean μ is equal to μ\u2080."+ "<html>");
		des6.setFont(small);
		des6.setHorizontalAlignment(CENTER);
		c.gridwidth=3;
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=1;	
		t1sam.add(des6,c);	
		
		JLabel hyp6 = new JLabel("Select Direction of Test");
		hyp6.setFont(subTIT);
		hyp6.setHorizontalAlignment(CENTER);
		c.gridwidth=2;
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=2;	
		t1sam.add(hyp6,c);
		
		JLabel hypN6 = new JLabel("H\u2080: ");
		hypN6.setFont(med);
		hypN6.setHorizontalAlignment(CENTER);
		c.gridwidth=1;
		c.weightx=0.3;
		c.gridx=0;
		c.gridy=3;	
		t1sam.add(hypN6,c);	
		
		JLabel hypRN6 = new JLabel("μ = μ\u2080 ");
		hypRN6.setFont(med);
		hypRN6.setHorizontalAlignment(CENTER);
		c.gridwidth=1;
		c.weightx=0.3;
		c.gridx=1;
		c.gridy=3;	
		t1sam.add(hypRN6,c);	
		
		JLabel hypA6 = new JLabel("H\u2090: ");
		hypA6.setFont(med);
		hypA6.setHorizontalAlignment(CENTER);
		c.gridwidth=1;
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=4;	
		t1sam.add(hypA6,c);	
		
		JLabel hypRA6 = new JLabel("μ");
		hypRA6.setFont(med);
		hypRA6.setHorizontalAlignment(CENTER);
		c.gridwidth=1;
		c.weightx=0.1;
		c.gridx=1;
		c.gridy=4;	
		t1sam.add(hypRA6,c);	
		
		
		dir6 = new JComboBox<String>(dir);
		
		
		c.weightx=0.2;
		c.gridx=2;
		c.gridy=4;	
		t1sam.add(dir6,c);	
		
		JLabel pN6 = new JLabel("μ\u2080");
		pN6.setFont(med);
		pN6.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=3;
		c.gridy=4;	
		t1sam.add(pN6,c);	
		
		
		JLabel alpha6 = new JLabel("α: ");
		alpha6.setFont(med);
		alpha6.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=5;	
		t1sam.add(alpha6,c);	
		
		talpha6 = new JTextField("0.05");
		talpha6.setFont(med);
		talpha6.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=1;
		c.gridy=5;	
		t1sam.add(talpha6,c);			
		
		JLabel pr6 = new JLabel("Population mean μ: ");
		pr6.setFont(med);
		pr6.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=6;	
		t1sam.add(pr6,c);	
		
		p6 = new JTextField("5.0");
		p6.setFont(med);
		p6.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=1;
		c.gridy=6;	
		t1sam.add(p6,c);
		
		JLabel ph6 = new JLabel("Comparison mean μ\u2080: ");
		ph6.setFont(med);
		ph6.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=7;	
		t1sam.add(ph6,c);	
		
		p06 = new JTextField("5.1");
		p06.setFont(med);
		p06.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=1;
		c.gridy=7;	
		t1sam.add(p06,c);
		
		JLabel sig6 = new JLabel("Population Standard Deviation σ:");
		sig6.setFont(med);
		sig6.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=8;	
		t1sam.add(sig6,c);	
		
		sigg6 = new JTextField("10");
		sigg6.setFont(med);
		sigg6.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=1;
		c.gridy=8;	
		t1sam.add(sigg6,c);
		
		JLabel power6 = new JLabel("Desired Power: ");
		power6.setFont(med);
		power6.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=9;	
		t1sam.add(power6,c);	
		
		pow6 = new JTextField("0.8");
		pow6.setFont(med);
		pow6.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=1;
		c.gridy=9;	
		t1sam.add(pow6,c);
		
		calc6 = new KButton("Calculate");
		calc6.setFont(panTIT);
		calc6.setNum(-6);
		calc6.addActionListener(this);
		c.gridwidth =5; 
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=10;	
		t1sam.add(calc6,c);
		
		TONE6 = new JLabel("Type I Error: ");
		TONE6.setFont(med);
		TONE6.setHorizontalAlignment(CENTER);
		c.gridwidth =5;
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=11;	
		t1sam.add(TONE6,c);
		
		TTWO6 = new JLabel("Type II Error: ");
		TTWO6.setFont(med);
		TTWO6.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=12;	
		t1sam.add(TTWO6,c);
		
		Sam6 = new JLabel("Required Sample Size: ");
		Sam6.setFont(med);
		Sam6.setHorizontalAlignment(CENTER);
		c.weightx=0.5;
		c.gridx=0;
		c.gridy=13;	
		t1sam.add(Sam6,c);
		
		c.weightx=1;
		c.weighty=1;
		t1sam.add(new JLabel(""),c);
		
		//Two Sample T Test Power Set up
		
		t2pow.setBorder(BorderFactory.createEmptyBorder());
		t2pow.setLayout(new GridBagLayout());
		t2pow.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		
		d.fill=GridBagConstraints.HORIZONTAL;
		d.fill = GridBagConstraints.VERTICAL;
	
		
		JLabel t2p = new JLabel("Power - Two Sample T-Test");
		t2p.setBorder(blueline);
		t2p.setFont(panTIT);
		t2p.setHorizontalAlignment(CENTER);
	
		d.weightx=0.5;
		d.fill=GridBagConstraints.HORIZONTAL;
		d.anchor =GridBagConstraints.NORTHWEST;
		d.gridwidth=4;
		d.gridx=0;
		d.gridy=0;
		t2pow.add(t2p,d);
		
		back7 = new KButton("← Home");
		back7.setNum(0);
		back7.addActionListener(this);
		d.gridwidth = 1;
		d.weightx=0.1;
		d.gridx=4;
		d.gridy=0;	
		t2pow.add(back7,d);	
		
		JLabel des7 = new JLabel("<html>"+"Calculate power for a test about the difference between two sample means μA and μB."+ "<html>");
		des7.setFont(small);
		des7.setHorizontalAlignment(CENTER);
		d.gridwidth=5;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=1;	
		t2pow.add(des7,d);	
		
		JLabel hyp7 = new JLabel("Select Direction of Test");
		hyp7.setFont(subTIT);
		hyp7.setHorizontalAlignment(CENTER);
		d.fill = GridBagConstraints.HORIZONTAL;
		d.gridwidth=5;
		d.weightx= 1;
		d.gridx=0;
		d.gridy=2;	
		t2pow.add(hyp7,d);	
		
		JLabel hypN7 = new JLabel("H\u2080: ");
		hypN7.setFont(med);
		hypN7.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.3;
		d.gridx=0;
		d.gridy=3;	
		t2pow.add(hypN7,d);	
		
		JLabel hypRN7 = new JLabel("μA = μB ");
		hypRN7.setFont(med);
		hypRN7.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.3;
		d.gridx=1;
		d.gridy=3;	
		t2pow.add(hypRN7,d);	
		
		JLabel hypA7 = new JLabel("H\u2090: ");
		hypA7.setFont(med);
		hypA7.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=4;	
		t2pow.add(hypA7,d);	
		
		
		
		dir7 = new JComboBox<String>(dir77);
		
		
		d.weightx=0.5;
		d.gridx=2;
		d.gridy=4;	
		t2pow.add(dir7,d);	
		
		
		
		JLabel alpha7 = new JLabel("α: ");
		alpha7.setFont(med);
		alpha7.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=5;	
		t2pow.add(alpha7,d);	
		
		talpha7 = new JTextField("0.05");
		talpha7.setFont(med);
		talpha7.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=1;
		d.gridy=5;	
		t2pow.add(talpha7,d);			
		
		JLabel pr7 = new JLabel("μA: ");
		pr7.setFont(med);
		pr7.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=6;	
		t2pow.add(pr7,d);	
		
		pA7 = new JTextField("5.0");
		pA7.setFont(med);
		pA7.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=1;
		d.gridy=6;	
		t2pow.add(pA7,d);
		
		JLabel pB77 = new JLabel("μB:  ");
		pB77.setFont(med);
		pB77.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=7;	
		t2pow.add(pB77,d);	
		
		pB7 = new JTextField("5.1");
		pB7.setFont(med);
		pB7.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=1;
		d.gridy=7;	
		t2pow.add(pB7,d);
		
		
		JLabel n7A = new JLabel("Sample Size of Group A: ");
		n7A.setFont(med);
		n7A.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=8;	
		t2pow.add(n7A,d);	
		
		nF7A = new JTextField("10");
		nF7A.setFont(med);
		nF7A.setHorizontalAlignment(CENTER);
		d.weightx=0.2;
		d.gridx=1;
		d.gridy=8;	
		t2pow.add(nF7A,d);
		
		JLabel n7B = new JLabel("Sample Size of Group B: ");
		n7B.setFont(med);
		n7B.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=2;
		d.gridy=8;	
		t2pow.add(n7B,d);	
		
		nF7B = new JTextField("10");
		nF7B.setFont(med);
		nF7B.setHorizontalAlignment(CENTER);
		d.gridwidth=2;
		d.weightx=0.2;
		d.gridx=3;
		d.gridy=8;	
		t2pow.add(nF7B,d);
		
		JLabel sig7A = new JLabel("Standard Deviation Group A σA:");
		d.gridwidth=2;
		sig7A.setFont(med);
		sig7A.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=9;	
		t2pow.add(sig7A,d);	
		
		sigg7A = new JTextField("1");
		sigg7A.setFont(med);
		sigg7A.setHorizontalAlignment(CENTER);
		d.gridwidth=2;
		d.weightx=0.5;
		d.gridx=2;
		d.gridy=9;	
		t2pow.add(sigg7A,d);
		
		JLabel sig7B = new JLabel("Standard Deviation Group B σB:");
		d.gridwidth=2;
		sig7B.setFont(med);
		sig7B.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=10;	
		t2pow.add(sig7B,d);	
		
		sigg7B = new JTextField("1");
		sigg7B.setFont(med);
		sigg7B.setHorizontalAlignment(CENTER);
		d.gridwidth=2;
		d.weightx=0.5;
		d.gridx=2;
		d.gridy=10;	
		t2pow.add(sigg7B,d);
		
		calc7 = new KButton("Calculate");
		calc7.setFont(panTIT);
		calc7.setNum(-7);
		calc7.addActionListener(this);
		d.gridwidth=5;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=11;	
		t2pow.add(calc7,d);
		
		TONE7 = new JLabel("Type I Error: ");
		TONE7.setFont(med);
		TONE7.setHorizontalAlignment(CENTER);
		d.gridwidth=5;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=12;	
		t2pow.add(TONE7,d);
		
		TTWO7 = new JLabel("Type II Error: ");
		TTWO7.setFont(med);
		TTWO7.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=13;	
		t2pow.add(TTWO7,d);
		
		POWER7 = new JLabel("Power: ");
		POWER7.setFont(med);
		POWER7.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=14;	
		t2pow.add(POWER7,d);
		
		d.weightx=1;
		d.weighty=1;
		t2pow.add(new JLabel(""),d);
		
		//Two Sample T Test Sample Size Set up
		
		t2sam.setBorder(BorderFactory.createEmptyBorder());
		t2sam.setLayout(new GridBagLayout());
		t2sam.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		
		d.fill=GridBagConstraints.HORIZONTAL;
		d.fill = GridBagConstraints.VERTICAL;
	
		
		JLabel t2s = new JLabel("Sample Size - Two Sample T-Test");
		t2s.setBorder(blueline);
		t2s.setFont(panTIT);
		t2s.setHorizontalAlignment(CENTER);
	
		d.weightx=0.5;
		d.fill=GridBagConstraints.HORIZONTAL;
		d.anchor =GridBagConstraints.NORTHWEST;
		d.gridwidth=4;
		d.gridx=0;
		d.gridy=0;
		t2sam.add(t2s,d);
		
		back8 = new KButton("← Home");
		back8.setNum(0);
		back8.addActionListener(this);
		d.gridwidth = 1;
		d.weightx=0.1;
		d.gridx=4;
		d.gridy=0;	
		t2sam.add(back8,d);	
		
		JLabel des8 = new JLabel("<html>"+"Calculate sample size for a test about the difference between two sample means μA and μB."+ "<html>");
		des8.setFont(small);
		des8.setHorizontalAlignment(CENTER);
		d.gridwidth=5;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=1;	
		t2sam.add(des8,d);	
		
		JLabel hyp8 = new JLabel("Select Direction of Test");
		hyp8.setFont(subTIT);
		hyp8.setHorizontalAlignment(CENTER);
		d.fill = GridBagConstraints.HORIZONTAL;
		d.gridwidth=5;
		d.weightx= 1;
		d.gridx=0;
		d.gridy=2;	
		t2sam.add(hyp8,d);	
		
		JLabel hypN8 = new JLabel("H\u2080: ");
		hypN8.setFont(med);
		hypN8.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.3;
		d.gridx=0;
		d.gridy=3;	
		t2sam.add(hypN8,d);	
		
		JLabel hypRN8 = new JLabel("μA  = μB ");
		hypRN8.setFont(med);
		hypRN8.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.3;
		d.gridx=1;
		d.gridy=3;	
		t2sam.add(hypRN8,d);	
		
		JLabel hypA8 = new JLabel("H\u2090: ");
		hypA8.setFont(med);
		hypA8.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=4;	
		t2sam.add(hypA8,d);	
		
		dir8 = new JComboBox<String>(dir77);
		
		d.weightx=0.5;
		d.gridx=2;
		d.gridy=4;	
		t2sam.add(dir8,d);	
			
		
		JLabel alpha8 = new JLabel("α: ");
		alpha8.setFont(med);
		alpha8.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=5;	
		t2sam.add(alpha8,d);	
		
		talpha8 = new JTextField("0.05");
		talpha8.setFont(med);
		talpha8.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=1;
		d.gridy=5;	
		t2sam.add(talpha8,d);			
		
		JLabel pr8 = new JLabel("μA: ");
		pr8.setFont(med);
		pr8.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=6;	
		t2sam.add(pr8,d);	
		
		pA8 = new JTextField("0.5");
		pA8.setFont(med);
		pA8.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=1;
		d.gridy=6;	
		t2sam.add(pA8,d);
		
		JLabel pB88 = new JLabel("μB:  ");
		pB88.setFont(med);
		pB88.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=7;	
		t2sam.add(pB88,d);	
		
		pB8 = new JTextField("0.55");
		pB8.setFont(med);
		pB8.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=1;
		d.gridy=7;	
		t2sam.add(pB8,d);
		
		JLabel sig8A = new JLabel("Standard Deviation Group A σA:");
		sig8A.setFont(med);
		sig8A.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=8;	
		t2sam.add(sig8A,d);	
		
		sigg8A = new JTextField("1");
		sigg8A.setFont(med);
		sigg8A.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=1;
		d.gridy=8;	
		t2sam.add(sigg8A,d);
		
		JLabel sig8B = new JLabel("Standard Deviation Group B σB:");
		sig8B.setFont(med);
		sig8B.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=9;	
		t2sam.add(sig8B,d);	
		
		sigg8B = new JTextField("1");
		sigg8B.setFont(med);
		sigg8B.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=1;
		d.gridy=9;	
		t2sam.add(sigg8B,d);
		
		JLabel n8A = new JLabel("Desired Power: ");
		n8A.setFont(med);
		n8A.setHorizontalAlignment(CENTER);
		d.gridwidth=1;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=10;	
		t2sam.add(n8A,d);	
		
		
		pow8 = new JTextField("0.8");
		pow8.setFont(med);
		pow8.setHorizontalAlignment(CENTER);
		d.weightx=0.1;
		d.gridx=1;
		d.gridy=10;	
		t2sam.add(pow8,d);
		
		
		calc8 = new KButton("Calculate");
		calc8.setFont(panTIT);
		calc8.setNum(-8);
		calc8.addActionListener(this);
		d.gridwidth=5;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=11;	
		t2sam.add(calc8,d);
		
		TONE8 = new JLabel("Type I Error: ");
		TONE8.setFont(med);
		TONE8.setHorizontalAlignment(CENTER);
		d.gridwidth=5;
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=12;	
		t2sam.add(TONE8,d);
		
		TTWO8 = new JLabel("Type II Error: ");
		TTWO8.setFont(med);
		TTWO8.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=13;	
		t2sam.add(TTWO8,d);
		
		Sam8 = new JLabel("Required Sample Size: ");
		Sam8.setFont(med);
		Sam8.setHorizontalAlignment(CENTER);
		d.weightx=0.5;
		d.gridx=0;
		d.gridy=14;	
		t2sam.add(Sam8,d);
		
		d.weightx=1;
		d.weighty=1;
		t2sam.add(new JLabel(""),d);
		
		//standard GUI stuff
		frame.add(tabby, BorderLayout.CENTER);
		frame.setPreferredSize(new Dimension(625,675));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Power Simulator Calculator");
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
			
			KButton clicked = (KButton) e.getSource();
			
						
			if(clicked.getNum() == 0) {
				tabby.setSelectedIndex(0);
			} else if(clicked.getNum() == 1) {
				tabby.setSelectedIndex(1);
			} else if(clicked.getNum() == 2) {
				tabby.setSelectedIndex(2);
			} else if(clicked.getNum() == 3) {
				tabby.setSelectedIndex(3);
			} else if(clicked.getNum() == 4) {
				tabby.setSelectedIndex(4);
			} else if(clicked.getNum() == 5) {
				tabby.setSelectedIndex(5);
			} else if(clicked.getNum() == 6) {
				tabby.setSelectedIndex(6);
			} else if(clicked.getNum() == 7) {
				tabby.setSelectedIndex(7);
			} else if(clicked.getNum() == 8) {
				tabby.setSelectedIndex(8);
			} else if(clicked.getNum() == -1) {
				z1pow();
			} else if(clicked.getNum() == -2) {
				z1sam();
			} else if(clicked.getNum() == -3) {
				z2pow();
			} else if(clicked.getNum() == -4) {
				z2sam();
			} else if(clicked.getNum() == -5) {
				t1pow();
			} else if(clicked.getNum() == -6) {
				t1sam();
			} else if(clicked.getNum() == -7) {
				t2pow();
			} else if(clicked.getNum() == -8) {
				t2sam();
			}
	
	
		
	}
	
	public void z1pow() {
		NormalDistribution a = new NormalDistribution();
		double p = Double.parseDouble(prF1.getText());
		double p0= Double.parseDouble(phF1.getText());
		double alpha = Double.parseDouble(talpha1.getText());
		double power = 0;
		int n = Integer.parseInt(nF1.getText());
		
		double z1=((p-p0)/Math.sqrt((p0*(1-p0))/n));
		double z2=((p-p0)/Math.sqrt((p*(1-p))/n));
		
		String direct =(String) dir1.getSelectedItem();
		
		if (direct.equals(">")||direct.contentEquals("<")) { //onesided calc
			power = a.cumulativeProbability(Math.sqrt( (p0*(1-p0)) / (p*(1-p)) )*(Math.abs(z1)-a.inverseCumulativeProbability(1-alpha)));
		}
		else { //two sided calc
			power = a.cumulativeProbability(z2-a.inverseCumulativeProbability(1-(alpha/2)))+a.cumulativeProbability(-z2-a.inverseCumulativeProbability(1-(alpha/2)));
		}
		double t2=1-power;
		TONE1.setText("Type I Error: "+ talpha1.getText());
		TTWO1.setText("Type II Error: "+ Double.toString(t2));
		POWER1.setText("Power: " + Double.toString(power));
	}
	
	public void z1sam() {
		NormalDistribution b = new NormalDistribution();
		double p = Double.parseDouble(p2.getText());
		double p0= Double.parseDouble(p02.getText());
		double alpha = Double.parseDouble(talpha2.getText());
		double power = Double.parseDouble(pow2.getText());
		
		int n=0;
		
		
		String direct =(String) dir2.getSelectedItem();
		
		if (direct.equals(">")||direct.contentEquals("<")) { //one sided calc
			
			n= (int) Math.ceil(  (p0*(1-p0))*( Math.pow(((b.inverseCumulativeProbability(1-alpha)+b.inverseCumulativeProbability(power)*Math.sqrt( (p*(1-p)) / (p0*(1-p0)) ) )/ (p-p0) ),2  )));
		}
		else { // two sided calc
			n= (int) Math.ceil( (p*(1-p)) * Math.pow((( (b.inverseCumulativeProbability (1-(alpha/2) ) )+ (b.inverseCumulativeProbability(power) ) )) /(p-p0),2 )  );
		}
		
		double t2 = 1-power;
		TONE2.setText("Type I Error: "+ talpha2.getText());
		TTWO2.setText("Type II Error: "+ Double.toString(t2));
		Sam2.setText("Required Sample Size: " + Integer.toString(n));
	}
	
	public void z2pow() {
		NormalDistribution a = new NormalDistribution();
		double pA = Double.parseDouble(pA3.getText());
		double pB= Double.parseDouble(pB3.getText());
		double alpha = Double.parseDouble(talpha3.getText());
		double power = 0;
		
		int nA = Integer.parseInt(nF3A.getText());
		int nB = Integer.parseInt(nF3B.getText());
		
		
		double z = ((pA-pB) / Math.sqrt( (pA*(1-pA))/nA +(pB*(1-pB))/nB));
		
		String direct =(String) dir3.getSelectedItem();
		
		if (direct.substring(2,3).equals(">")||direct.substring(2,3).equals("<")) { // one sided calc
			power = a.cumulativeProbability(Math.abs(z)-a.inverseCumulativeProbability(1-alpha));
		}
		else { // two sided calc
			power = a.cumulativeProbability(z-a.inverseCumulativeProbability(1-(alpha/2)))+a.cumulativeProbability(-z-a.inverseCumulativeProbability(1-(alpha/2)));
		}
		double t2=1-power;
		TONE3.setText("Type I Error: "+ talpha3.getText());
		TTWO3.setText("Type II Error: "+ Double.toString(t2));
		POWER3.setText("Power: " + Double.toString(power));
		
	}
	
	public void z2sam() {
		NormalDistribution a = new NormalDistribution();
		double pA = Double.parseDouble(pA4.getText());
		double pB= Double.parseDouble(pB4.getText());
		double alpha = Double.parseDouble(talpha4.getText());
		double power = Double.parseDouble(pow4.getText());;
		int sam4 = 0 ;
	
		
		String direct =(String) dir4.getSelectedItem();
		
		if (direct.substring(2,3).equals(">")||direct.substring(2,3).equals("<")) { //onesided calc
			sam4 = (int) Math.ceil(  ((pA*(1-pA))+(pB*(1-pB))) * Math.pow( (a.inverseCumulativeProbability(1-(alpha))+a.inverseCumulativeProbability(power) ) / (pA-pB), 2)   );
		}
		else { // two sided calc
			sam4 = (int) Math.ceil(  ((pA*(1-pA))+(pB*(1-pB))) * Math.pow( (a.inverseCumulativeProbability(1-(alpha/2))+a.inverseCumulativeProbability(power) ) / (pA-pB), 2)   );
		}
		double t2=1-power;
		
		TONE4.setText("Type I Error: "+ talpha4.getText());
		TTWO4.setText("Type II Error: "+ Double.toString(t2));
		Sam4.setText("Required Sample Size for each: " + Integer.toString(sam4));
		
	}
	
	public void t1pow() {
		
		NormalDistribution a = new NormalDistribution();
		double mu = Double.parseDouble(prF5.getText());
		double mu0= Double.parseDouble(phF5.getText());
		double alpha = Double.parseDouble(talpha5.getText());
		double power = 0;
		double sd = Double.parseDouble(sigg5.getText());
		int n = Integer.parseInt(nF5.getText());
		
	
		double z2= ((mu-mu0)/(sd/Math.sqrt(n)));
		
		String direct =(String) dir5.getSelectedItem();
		
		if (direct.equals(">")||direct.contentEquals("<")) { // one sided calc
			power = a.cumulativeProbability(Math.abs(z2)-a.inverseCumulativeProbability(1-alpha));
		}
		else { //two sided calc
			power = a.cumulativeProbability(z2-a.inverseCumulativeProbability(1-(alpha/2)))+a.cumulativeProbability(-z2-a.inverseCumulativeProbability(1-(alpha/2)));
		}
		double t2=1-power;
		TONE5.setText("Type I Error: "+ talpha5.getText());
		TTWO5.setText("Type II Error: "+ Double.toString(t2));
		POWER5.setText("Power: " + Double.toString(power));
	}
	
	public void t1sam() {
		NormalDistribution b = new NormalDistribution();
		double mu = Double.parseDouble(p6.getText());
		double mu0= Double.parseDouble(p06.getText());
		double alpha = Double.parseDouble(talpha6.getText());
		double power = Double.parseDouble(pow6.getText());
		double sd = Double.parseDouble(sigg6.getText());
		int n=0;
		
		
		String direct =(String) dir6.getSelectedItem();
		
		if (direct.equals(">")||direct.contentEquals("<")) { // one sided calc
			
			n= (int) Math.ceil(Math.pow(( sd *((b.inverseCumulativeProbability(1-alpha))+ (b.inverseCumulativeProbability(power)))/ (mu-mu0)),2 ) );
		}
		else { // two sided calc
			n= (int) Math.ceil(Math.pow(( sd *((b.inverseCumulativeProbability(1-alpha/2))+ (b.inverseCumulativeProbability(power)))/ (mu-mu0)),2 ) );
		}
		
		double t2 = 1-power;
		TONE6.setText("Type I Error: "+ talpha6.getText());
		TTWO6.setText("Type II Error: "+ Double.toString(t2));
		Sam6.setText("Required Sample Size: " + Integer.toString(n));
	}
	
	public void t2pow() {
		NormalDistribution a = new NormalDistribution();
		double muA = Double.parseDouble(pA7.getText());
		double muB= Double.parseDouble(pB7.getText());
		double alpha = Double.parseDouble(talpha7.getText());
		double power = 0; 
		double sd1 = Double.parseDouble(sigg7A.getText());
		double sd2 = Double.parseDouble(sigg7B.getText());
		double sdp = Math.sqrt( (Math.pow(sd1, 2)+Math.pow(sd2, 2))/2 );
		double nA = Integer.parseInt(nF7A.getText());
		double nB = Integer.parseInt(nF7B.getText());
		
		System.out.print((1/nA)+(1/nB));
		double z1 =  (Math.abs(muA-muB)*Math.sqrt(nA))/(Math.sqrt(Math.pow(sd1,2)+Math.pow(sd2,2)));
		double z2= (muA-muB)/ (sdp*Math.sqrt((1/nA)+(1/nB)));
		System.out.print(Math.sqrt( ( (1/nA) + (1/nB)) )  );
		String direct =(String) dir7.getSelectedItem();
		
		if (direct.substring(2,3).equals(">")||direct.substring(2,3).equals("<")) { // one sided calc
			power = a.cumulativeProbability(z1-a.inverseCumulativeProbability(1-alpha));
		}
		else { // two sided calc
			power = a.cumulativeProbability(z2-a.inverseCumulativeProbability(1-(alpha/2)))+a.cumulativeProbability(-z2-a.inverseCumulativeProbability(1-(alpha/2)) );
		}
		double t2=1-power;
		
		TONE7.setText("Type I Error: "+ talpha3.getText());
		TTWO7.setText("Type II Error: "+ Double.toString(t2));
		POWER7.setText("Power: " + Double.toString(power));
	}
	
	public void t2sam() {

		NormalDistribution a = new NormalDistribution();
		double muA = Double.parseDouble(pA8.getText());
		double muB= Double.parseDouble(pB8.getText());
		double alpha = Double.parseDouble(talpha8.getText());
		double power = Double.parseDouble(pow8.getText());;
		double sd1 = Double.parseDouble(sigg8A.getText());
		double sd2 = Double.parseDouble(sigg8B.getText());
		double sdp = Math.sqrt( (Math.pow(sd1, 2)+Math.pow(sd2, 2))/2 );
		int sam8 = 0 ;
	
		
		String direct =(String) dir8.getSelectedItem();
		
		if (direct.substring(2,3).equals(">")||direct.substring(2,3).equals("<")) { // one sided calc
			sam8 = (int) Math.ceil( (Math.pow(sd1, 2) + Math.pow(sd2, 2))*Math.pow(((a.inverseCumulativeProbability(1-alpha)+a.inverseCumulativeProbability(power))/(muA-muB)  ), 2)) ;
		}
		else { // two sided calc
			sam8 = (int) Math.ceil(  2*Math.pow((sdp * ((a.inverseCumulativeProbability(1-(alpha/2))+a.inverseCumulativeProbability(power) )/(muA-muB) ) ),2) );
		}
		double t2=1-power;
		
		TONE8.setText("Type I Error: "+ talpha8.getText());
		TTWO8.setText("Type II Error: "+ Double.toString(t2));
		Sam8.setText("Required Sample Size for each: " + Integer.toString(sam8));
	}
	
	
	public static void main(String args[]) {
		new PowerSimulator();
	}

	
}
