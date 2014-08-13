

import java.awt.image.BufferedImage;

public class ImageManager {
	public BufferedImage red,yellow,green;
	public ImageManager(SpriteSheet ss){
		red=ss.crop(1, 0, 16, 16);
		green=ss.crop(0, 0, 16, 16);
		yellow=ss.crop(2, 0, 16, 16);
	}
}