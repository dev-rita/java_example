class Ex12{
	int p(int a, int b) {
		if(a>b) return a;
		else return b;
	}
	double p(double a, double b) {
		if(a>b) return a;
		else return b;
	}
}
public class Ex12_01 {

	public static void main(String[] args) {
		Ex12 ex=new Ex12();
		int a=3, b=5;
		double c=8.32, d=5.24;
		System.out.println(a+"와"+b+"중 최대값="+ex.p(a,b));
		System.out.println(c+"와"+d+"중 최대값="+ex.p(c,d));
	}
}
