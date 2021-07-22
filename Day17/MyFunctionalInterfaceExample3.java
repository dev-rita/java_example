
public class MyFunctionalInterfaceExample3 {
	public static void main(String[] args) {
		MyFunInterface3 fi;
		
		fi=(a,b)->{
			int result=a+b;
			return result;
		};
		System.out.println(fi.method(2,5));
		System.out.println(fi.method(3, 5));
		
		fi=(x,y)->{return x*y;};
		System.out.println(fi.method(10,5));
		System.out.println(fi.method(3, 5));
		
		fi=(x,y)->x+y;
		System.out.println(fi.method(4, 3));
		
		fi=(x,y)->sum(x,y);
		System.out.println(fi.method(2,5));
	}
	public static int sum(int x, int y) {
		return (x+y);
	}
}
