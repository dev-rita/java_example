
public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunInterface fi;
		
		fi=()->{
			String str="method call 1";
			System.out.println(str);
		};//람다식
		
		fi.method();
		
		fi=()->{System.out.println("method call 2");};
		fi.method();
		
		fi=()-> System.out.println("method call 2");
		fi.method();
	}
}
