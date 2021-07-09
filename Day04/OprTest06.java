
public class OprTest06 {

	public static void main(String[] args) {
		int x,y,z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x=10;
		y=-5;
		z=0;
		
		absX = x>=0 ? x:-x;
		absY = y>=0 ? y:-y; // -5가  -(-5)로 부호가 상쇄.
		absZ = z>=0 ? z:-z;
		
		signX = x>0 ? '+' : (x==0? ' ' : '-');
		signY = y>0 ? '+' : (y==0? ' ' : '-');
		signZ = z>0 ? '+' : (z==0? ' ' : '-');
		
		System.out.printf("x=%c%d",signX,absX);
		System.out.printf("y=%c%d",signY,absY);
		System.out.printf("z=%c%d",signZ,absZ);
	}

}
