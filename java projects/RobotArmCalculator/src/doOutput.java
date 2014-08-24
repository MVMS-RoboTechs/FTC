
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

// Adding some comments for experiment1

public class doOutput extends JPanel {
	private static final long serialVersionUID = 1L;
	private int output[][];
public doOutput(int[][] out) {
	this.output=out;
	JFrame frame=new JFrame("Results");
	Image burstIcon=null;
	try {
		URL imagePath = roboArmCalGUI.class
				.getResource("mvftc.png");
		burstIcon = Toolkit.getDefaultToolkit().getImage(imagePath);
	} catch (Exception e) {

	}
	frame.setResizable(true);
	frame.setIconImage(burstIcon);
	frame.setAlwaysOnTop(true);
    frame.setSize(new Dimension(900,400));
    frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    frame.add(this);
    frame.setVisible(true);
}

public void paint(Graphics g) {
	ImageLoader loader= new ImageLoader();
	BufferedImage ssImage=loader.load("/Robot Arm SS.png");
	SpriteSheet ss=new SpriteSheet(ssImage);
	ImageManager im=new ImageManager(ss);
	final int xCenterConstant=40;
	final int yCenterConstant=50;
	int i1,j2;
	for(int i=0;i<output.length;i++){
		for(int j=0;j<output[i].length;j++){
			if(output[i][j]==2){
				g.drawImage(im.green, (j*16)+xCenterConstant, (i*16)+yCenterConstant, 16,
						16 , null);
			}
				if(output[i][j]==1){
				g.drawImage(im.yellow, (j*16)+xCenterConstant, (i*16)+yCenterConstant, 16,
						16 , null);
				}
				if(output[i][j]==0){
				g.drawImage(im.red,(j*16)+xCenterConstant, (i*16)+yCenterConstant, 16,
						16 , null);
				}
			}
		}
	}
public static BufferedImage toBufferedImage(Image im) {
    BufferedImage bi = new BufferedImage
       (im.getWidth(null),im.getHeight(null),BufferedImage.TYPE_INT_RGB);
    Graphics bg = bi.getGraphics();
    bg.drawImage(im, 0, 0, null);
    bg.dispose();
    return bi;
 }
}