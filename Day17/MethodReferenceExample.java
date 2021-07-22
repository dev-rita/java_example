import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		 operator=(x,y)->Calculator.staticMethod(x, y);
		 System.out.println("결과 1:"+operator.applyAsInt(10, 3));
		 
		//코드라인을 더 줄인 정적메소드 참조
		 operator=Calculator :: staticMethod;
		 System.out.println("결과 2:"+operator.applyAsInt(5, 5));
		 
		 Calculator obj=new Calculator();
		 operator=(x,y)->obj.instancemethod(x, y);
		 System.out.println("결과3:"+operator.applyAsInt(10, 3));
		 
		 //인스턴스 메소드 참조
		 operator=obj :: instancemethod;
		 System.out.println("결과4:"+operator.applyAsInt(7, 8));
	}
}
