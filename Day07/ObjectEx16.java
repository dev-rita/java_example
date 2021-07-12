import java.util.Scanner;
class GuDan{
	void printDan(int k) {
		for(int i=1;i<=9;i++) {
			System.out.println(k+"*"+i+"="+(k*i));
		}
	}
}
public class ObjectEx16 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		GuDan g=new GuDan();//객체주소가 저장된 참조변수 g01
		System.out.println("단을 입력하세요>>");
		
		int num=Integer.parseInt(scan.nextLine());
		
		g.printDan(num);//g객체의 printDan메소드에 인자값으로 num을 넣음. 
	}
}
//별도의 GuDan클래스를 정의하고 리턴타입이 없는 printDan(int K){}을 작성한다. main()메소드 {}블록내에서
//스캐너로 입력받은 정수 숫자를 활용해 GuDan클래스의 객체명 g를 생성한 다음 printDan()메소드를 호출해 구구단을 실행.