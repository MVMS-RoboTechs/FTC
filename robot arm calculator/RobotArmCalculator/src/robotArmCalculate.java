
public class robotArmCalculate {
	public static Point getEndPoint(double B, double C, double D,
			double theta1, double theta2, double theta3) {
		double x1 = Math.cos(theta1 - 90) * B;
		double x2 = x1 + (Math.cos((theta2 - 90) - (90 - theta1)) * C);
		double x3 = x2
				+ (Math.sin(theta3 - (90 - (theta2 - 90) - (90 - theta1))) * D);
		double y1 = Math.sin(theta1 - 90) * B;
		double y2 = y1 + (Math.sin((theta2 - 90) - (90 - theta1)) * C);
		double y3 = y2
				+ (Math.cos(theta3 - (90 - (theta2 - 90) - (90 - theta1))) * D);
		return new Point(x3, y3);
	}

	/*
	 * public static Point getEndPoint(double a,double b,double A,double
	 * B,double theta3,double c){ double leftA=90-B; double rightA=A-leftA;
	 * double
	 * upPer=(b*Math.sin(Math.toRadians(rightA)))/Math.sin(Math.toRadians(90));
	 * double
	 * per=(a*Math.sin(Math.toRadians(leftA)))/Math.sin(Math.toRadians(90));
	 * double
	 * rightX=(b*Math.sin(Math.toRadians(90-rightA)))/Math.sin(Math.toRadians
	 * (90)); double leftX=Math.sqrt((a*a)-(per*per)); double
	 * righttheta3=theta3-(90-rightA); if(righttheta3>90){
	 * righttheta3=180-righttheta3; } double
	 * x=(c*Math.sin(Math.toRadians(90-righttheta3
	 * )))/Math.sin(Math.toRadians(theta3))+rightX+leftX; double
	 * y=(per-upPer)-(c
	 * *Math.sin(Math.toRadians(90)))/Math.sin(Math.toRadians(theta3)); return
	 * new Point(x,y); }
	 */
	public static Torque getTorque(double B, double C, double D, double theta1,
			double theta2, double theta3, double w1, double w2, double w3,
			double w4, double w5, double w6) {
		double t1;// torque for motor theta1
		double t2;// torque for motor theta2
		double t3;// torque for motor theta3
		double x1 = Math.cos(theta1 - 90) * B;
		double x2 = x1 + (Math.cos((theta2 - 90) - (90 - theta1)) * C);
		double x3 = x2
				+ (Math.sin(theta3 - (90 - (theta2 - 90) - (90 - theta1))) * D);
		t3 = (((x3 - x2) / 2) * w5) + ((x3 - x2) * w6);
		t2 = (((x2 - x1) / 2) * w3) + ((x2 - x1) * w4)
				+ ((x2 - x1) + (((x3 - x2) / 2)) * w5) + ((x3 - x1) * w6);
		t1 = ((x1 / 2) * w1) + (x1 * w2) + ((x1 + ((x2 - x1) / 2)) * w3)
				+ (x2 * w2) + ((x2 + ((x3 - x2) / 2)) * w5) + (x3 * w6);
		return new Torque(t1, t2, t3);
	}
}