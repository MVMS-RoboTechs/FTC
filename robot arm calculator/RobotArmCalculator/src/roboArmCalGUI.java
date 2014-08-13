
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.net.URL;
import java.util.Arrays;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

public class roboArmCalGUI {

	private JFrame frmForwardKinematicsCalculator;
	private JTextField B;
	private JTextField C;
	private JTextField D;
	private JLabel lblInMm;
	private JTextField minTheta1;
	private JLabel lblMinimumRangeOf;
	private JLabel lblMinimumRangeOf_1;
	private JTextField minTheta2;
	private JTextField minTheta3;
	private JLabel lblMaximumRangeOf;
	private JLabel lblMaximumRangeOf_1;
	private JLabel lblMaximumRangeOf_2;
	private JTextField maxTheta1;
	private JTextField maxTheta2;
	private JTextField maxTheta3;
	private JMenuBar menuBar;
	private JLabel lblDInMm;
	private JTextField E;
	private JLabel lblEInMm;
	private JTextField F;
	private JLabel lblFInMm;
	private JTextField H;
	private JTextField A;
	private JLabel lblGInMm;
	private JLabel lblAInMm;
	private JTextField G;
	private JLabel lblWInMm;
	private JTextField W1;
	private JLabel lblWInMm_1;
	private JTextField W2;
	private JLabel lblWInMm_2;
	private JTextField W3;
	private JLabel lblWInMm_3;
	private JTextField W4;
	private JLabel lblWInMm_4;
	private JTextField W5;
	private JLabel lblWInMm_5;
	private JTextField W6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					roboArmCalGUI window = new roboArmCalGUI();
					window.frmForwardKinematicsCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public roboArmCalGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmForwardKinematicsCalculator = new JFrame("Robot Arm Calculate");
		frmForwardKinematicsCalculator.setTitle("Forward Kinematics and Torque Calculator");
		frmForwardKinematicsCalculator.setResizable(false);
		frmForwardKinematicsCalculator.setAlwaysOnTop(true);
		frmForwardKinematicsCalculator.getContentPane().setBackground(Color.WHITE);
		frmForwardKinematicsCalculator.setBounds(100, 100, 817, 735);
		frmForwardKinematicsCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmForwardKinematicsCalculator.getContentPane().setLayout(null);
		Image burstIcon = null;
		try {
			URL imagePath = roboArmCalGUI.class
					.getResource("robo_arm.png");
			burstIcon = Toolkit.getDefaultToolkit().getImage(imagePath);
		} catch (Exception e) {

		}
		ImageIcon icon = new ImageIcon(burstIcon);
		try {
			URL imagePath = roboArmCalGUI.class
					.getResource("mvftc.png");
			burstIcon = Toolkit.getDefaultToolkit().getImage(imagePath);
		} catch (Exception e) {

		}
		frmForwardKinematicsCalculator.setIconImage(burstIcon);
		JLabel exampleImage = new JLabel();
		exampleImage.setIcon(icon);
		exampleImage.setBounds(35, 11, 738, 511);
		frmForwardKinematicsCalculator.getContentPane().add(exampleImage);

		B = new JTextField();
		B.setHorizontalAlignment(SwingConstants.CENTER);
		B.setText("130");
		B.setBounds(89, 568, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(B);
		B.setColumns(10);

		JLabel lblBInMm = new JLabel("L1 in mm");
		lblBInMm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBInMm.setBounds(20, 564, 63, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblBInMm);

		C = new JTextField();
		C.setHorizontalAlignment(SwingConstants.CENTER);
		C.setText("130");
		C.setBounds(89, 600, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(C);
		C.setColumns(10);

		JLabel lblCInMm = new JLabel("L2 in mm:");
		lblCInMm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCInMm.setBounds(20, 596, 63, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblCInMm);

		D = new JTextField();
		D.setHorizontalAlignment(SwingConstants.CENTER);
		D.setText("60");
		D.setBounds(89, 631, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(D);
		D.setColumns(10);

		lblInMm = new JLabel("Min \u03981:");
		lblInMm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInMm.setBounds(502, 599, 55, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblInMm);

		minTheta1 = new JTextField();
		minTheta1.setHorizontalAlignment(SwingConstants.CENTER);
		minTheta1.setText("0");
		minTheta1.setColumns(10);
		minTheta1.setBounds(562, 600, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(minTheta1);

		lblMinimumRangeOf = new JLabel("Min \u03982:");
		lblMinimumRangeOf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMinimumRangeOf.setBounds(656, 537, 55, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblMinimumRangeOf);

		lblMinimumRangeOf_1 = new JLabel("Min \u03983:");
		lblMinimumRangeOf_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMinimumRangeOf_1.setBounds(656, 600, 55, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblMinimumRangeOf_1);

		minTheta2 = new JTextField();
		minTheta2.setHorizontalAlignment(SwingConstants.CENTER);
		minTheta2.setText("0");
		minTheta2.setColumns(10);
		minTheta2.setBounds(706, 540, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(minTheta2);

		minTheta3 = new JTextField();
		minTheta3.setHorizontalAlignment(SwingConstants.CENTER);
		minTheta3.setText("0");
		minTheta3.setColumns(10);
		minTheta3.setBounds(706, 603, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(minTheta3);

		lblMaximumRangeOf = new JLabel("Max \u03981:");
		lblMaximumRangeOf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMaximumRangeOf.setBounds(502, 627, 48, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblMaximumRangeOf);

		lblMaximumRangeOf_1 = new JLabel("Max \u03982:");
		lblMaximumRangeOf_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMaximumRangeOf_1.setBounds(656, 568, 55, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblMaximumRangeOf_1);

		lblMaximumRangeOf_2 = new JLabel("Max \u03983:");
		lblMaximumRangeOf_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMaximumRangeOf_2.setBounds(656, 631, 48, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblMaximumRangeOf_2);

		maxTheta1 = new JTextField();
		maxTheta1.setHorizontalAlignment(SwingConstants.CENTER);
		maxTheta1.setText("120");
		maxTheta1.setColumns(10);
		maxTheta1.setBounds(562, 631, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(maxTheta1);

		maxTheta2 = new JTextField();
		maxTheta2.setHorizontalAlignment(SwingConstants.CENTER);
		maxTheta2.setText("120");
		maxTheta2.setColumns(10);
		maxTheta2.setBounds(706, 571, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(maxTheta2);

		maxTheta3 = new JTextField();
		maxTheta3.setHorizontalAlignment(SwingConstants.CENTER);
		maxTheta3.setText("120");
		maxTheta3.setColumns(10);
		maxTheta3.setBounds(706, 634, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(maxTheta3);

		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				double b = Double.parseDouble(B.getText());
				double c = Double.parseDouble(C.getText());
				double d = Double.parseDouble(D.getText());
				double e = Double.parseDouble(E.getText());
				double f = Double.parseDouble(F.getText());
				double g = Double.parseDouble(G.getText());
				double mint1 = Double.parseDouble(minTheta1.getText());
				double mint2 = Double.parseDouble(minTheta2.getText());
				double mint3 = Double.parseDouble(minTheta1.getText());
				double maxt1 = Double.parseDouble(maxTheta1.getText()) + 1; 
				double maxt2 = Double.parseDouble(maxTheta2.getText()) + 1;
				double maxt3 = Double.parseDouble(maxTheta3.getText()) + 1;
				double w1=getNewtons(Double.parseDouble(W1.getText()));
				double w2=getNewtons(Double.parseDouble(W2.getText()));
				double w3=getNewtons(Double.parseDouble(W3.getText()));
				double w4=getNewtons(Double.parseDouble(W4.getText()));
				double w5=getNewtons(Double.parseDouble(W5.getText()));
				double w6=getNewtons(Double.parseDouble(W6.getText()));
				double a=Double.parseDouble(A.getText());
				double h = Double.parseDouble(H.getText());
				boolean whatIsWorking[][] = new boolean[(int) (f)][(int) (e+h)];// whatIsWorking[x][y]
				double maxT1=0;
				double maxT2=0;
				double maxT3=0;
				
				for (boolean row[]: whatIsWorking)
					Arrays.fill(row, false);
				for (double theta1 = mint1; theta1 < maxt1; theta1++) {
					for (double theta2 = mint2; theta2 < maxt2; theta2++) {
						for (double theta3 = mint3; theta3 < maxt3; theta3++) {
							Torque t=robotArmCalculate.getTorque(b, c, d, theta1, theta2, theta3, w1, w2, w3, w4, w5, w6);
							if(t.t1>maxT1)
								maxT1=t.t1;
							if(t.t2>maxT2)
								maxT2=t.t2;
							if(t.t3>maxT3)
								maxT3=t.t3;
							Point endPoint = robotArmCalculate.getEndPoint(b,
									c, d, theta1, theta2, theta3);
							endPoint.x = Math.round(endPoint.x);
							endPoint.y=Math.round(endPoint.y)+a;
							if(endPoint.x<g||endPoint.y<0||endPoint.x-g>whatIsWorking[0].length-1||endPoint.y>(whatIsWorking.length)-1)
								continue;
							whatIsWorking[(int)endPoint.y][(int) ((int) endPoint.x - g)]=true;
						}
					}
				}
				final boolean output[][]=whatIsWorking;
				SwingUtilities.invokeLater(new Runnable() {
			        public void run() {
			        	int [][] out=ScaleDown.boolToInt(output);
			        	out=ScaleDown.scale(out);
			           new doOutput(out);
			        }
			    });
				int max1=(int) maxT1;
				int max2=(int) maxT2;
				int max3=(int) maxT3;
				JOptionPane.showMessageDialog(frmForwardKinematicsCalculator,"Max Torque Per Motor(Newton Meter)\nM1: "+max1+"\nM2: "+max2+"\nM3: "+max3,"Max Torque Report",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setBounds(0, 661, 811, 23);
		frmForwardKinematicsCalculator.getContentPane().add(btnNewButton);

		lblDInMm = new JLabel("L3 in mm:");
		lblDInMm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDInMm.setBounds(20, 627, 63, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblDInMm);

		E = new JTextField();
		E.setHorizontalAlignment(SwingConstants.CENTER);
		E.setText("152");
		E.setColumns(10);
		E.setBounds(255, 537, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(E);

		lblEInMm = new JLabel("L4 in mm:");
		lblEInMm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEInMm.setBounds(185, 534, 63, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblEInMm);

		F = new JTextField();
		F.setHorizontalAlignment(SwingConstants.CENTER);
		F.setText("50");
		F.setColumns(10);
		F.setBounds(255, 568, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(F);

		lblFInMm = new JLabel("L5 in mm:");
		lblFInMm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFInMm.setBounds(185, 565, 63, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblFInMm);

		H = new JTextField();
		H.setHorizontalAlignment(SwingConstants.CENTER);
		H.setText("0");
		H.setColumns(10);
		H.setBounds(255, 600, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(H);
		
		A = new JTextField();
		A.setHorizontalAlignment(SwingConstants.CENTER);
		A.setText("0");
		A.setColumns(10);
		A.setBounds(89, 537, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(A);
		
		lblGInMm = new JLabel("L6 in mm:");
		lblGInMm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGInMm.setBounds(185, 597, 63, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblGInMm);
		
		lblAInMm = new JLabel("L0 in mm:");
		lblAInMm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAInMm.setBounds(20, 533, 63, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblAInMm);
		
		JLabel lblLInMm = new JLabel("L7 in mm:");
		lblLInMm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLInMm.setBounds(185, 628, 63, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblLInMm);
		
		G = new JTextField();
		G.setText("25");
		G.setHorizontalAlignment(SwingConstants.CENTER);
		G.setColumns(10);
		G.setBounds(255, 631, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(G);
		
		lblWInMm = new JLabel("W1 in g:");
		lblWInMm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWInMm.setBounds(351, 536, 69, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblWInMm);
		
		W1 = new JTextField();
		W1.setText("130");
		W1.setHorizontalAlignment(SwingConstants.CENTER);
		W1.setColumns(10);
		W1.setBounds(405, 539, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(W1);
		
		lblWInMm_1 = new JLabel("W2 in g:");
		lblWInMm_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWInMm_1.setBounds(351, 568, 69, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblWInMm_1);
		
		W2 = new JTextField();
		W2.setText("130");
		W2.setHorizontalAlignment(SwingConstants.CENTER);
		W2.setColumns(10);
		W2.setBounds(405, 574, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(W2);
		
		lblWInMm_2 = new JLabel("W3 in g:");
		lblWInMm_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWInMm_2.setBounds(351, 596, 69, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblWInMm_2);
		
		W3 = new JTextField();
		W3.setText("60");
		W3.setHorizontalAlignment(SwingConstants.CENTER);
		W3.setColumns(10);
		W3.setBounds(405, 601, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(W3);
		
		lblWInMm_3 = new JLabel("W4 in g:");
		lblWInMm_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWInMm_3.setBounds(351, 627, 69, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblWInMm_3);
		
		W4 = new JTextField();
		W4.setText("152");
		W4.setHorizontalAlignment(SwingConstants.CENTER);
		W4.setColumns(10);
		W4.setBounds(406, 631, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(W4);
		
		lblWInMm_4 = new JLabel("W5 in g:");
		lblWInMm_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWInMm_4.setBounds(502, 536, 75, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblWInMm_4);
		
		W5 = new JTextField();
		W5.setText("50");
		W5.setHorizontalAlignment(SwingConstants.CENTER);
		W5.setColumns(10);
		W5.setBounds(562, 540, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(W5);
		
		lblWInMm_5 = new JLabel("W6 in g:");
		lblWInMm_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWInMm_5.setBounds(502, 567, 75, 24);
		frmForwardKinematicsCalculator.getContentPane().add(lblWInMm_5);
		
		W6 = new JTextField();
		W6.setText("25");
		W6.setHorizontalAlignment(SwingConstants.CENTER);
		W6.setColumns(10);
		W6.setBounds(562, 571, 86, 20);
		frmForwardKinematicsCalculator.getContentPane().add(W6);

		menuBar = new JMenuBar();
		frmForwardKinematicsCalculator.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		});
		mnFile.add(mntmExit);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
	}
	public static double getNewtons(double grams){
		return grams*0.00980665002;
	}
}
