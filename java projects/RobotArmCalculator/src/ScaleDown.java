import java.util.Arrays;


public class ScaleDown {	
	public static int[][] boolToInt(boolean src[][]){
		int out[][];
		out=new int[src.length][src[0].length];
		for(int i=0;i<src.length;i++){
			for(int j=0;j<src[0].length;j++){
				out[i][j]=0;
				if(src[i][j]){
					out[i][j]=1;
				}
			}
		}
		
		return out;
	}
	public static int[][] scale(int src[][]) {
		/*
		 * src is an input array which is scaled to fit into a 40x40 array
		 * 
		 */
		final int arraySize=40;

		// find size of array
		int srcXmax = src[0].length;
		int srcYmax = src.length;
		
		// if both x and y dimensions are less than 40 then no
		// scaling is needed. Just do mapping of color for reachable
		// nodes
		if ((srcXmax <arraySize)&&(srcYmax<arraySize)) {
			for(int srcX = 0; srcX < srcXmax; srcX++) 
				for(int srcY = 0; srcY < srcYmax; srcY++) 
					//WHY ARE YOU MULTIPLYING BY TWO???
					src[srcY][srcX] = src[srcY][srcX];
			return src;
		}
		
		// Longest edge decides the scale factor
		int scaleFactor =  srcXmax/arraySize;
		if (srcYmax > srcXmax) {
			scaleFactor = srcYmax/arraySize;
		} 

		// Decide destination X & Y range
		int dstXmax = srcXmax / scaleFactor;
		int dstYmax = srcYmax / scaleFactor;

		// Declare the destination array b
		int[][] dst = new int[dstYmax][dstXmax];
		
		// For each destination point there is a [scaleFactor X scaleFactor]
		// source grid. Check if every grid point is reachable (==1) then
		// set the destination point 2 (green), if no point can be reached
		// then red (0) else yellow (1)
		for(int dstX = 0; dstX <dstXmax; dstX++) {
			for(int dstY = 0; dstY <dstYmax; dstY++) {
				boolean zeroSeen = false;
				boolean oneSeen  = false;
				for(int i = 0; i < scaleFactor; i++) {
					for(int j = 0; j < scaleFactor; j++) {
						int srcX = dstX * scaleFactor + i;
						int srcY = dstY * scaleFactor + j;
						if ((srcX < srcXmax) && (srcY < srcYmax)) {
							if (src[srcY][srcX]==1)
								oneSeen = true;
							else
								zeroSeen = true;
						}
					}
				}
				if (oneSeen && !zeroSeen) {
					dst[dstY][dstX] = 2;
				} else if (!oneSeen && zeroSeen) {
					dst[dstY][dstX] = 0;
				} else {
					dst[dstY][dstX] = 1;
				}				
			}
		}
		src=dst.clone();
		return dst.clone();
	}
}