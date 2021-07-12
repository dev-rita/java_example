import java.util.Scanner;

public class Ex10_01 {

static void name() {
	System.out.println("이름은 OOO 입니다.");
}

static void dan(int num) {
	for(int i=1;i<=9;i++) {
		System.out.println(num+"x"+i+"="+(num*i));
	}
}
	public static void main(String[] args) {
		name();
		Scanner scan=new Scanner(System.in);
		System.out.println("단을 입력하세요>>");
		int num=Integer.parseInt(scan.nextLine());
		dan(num);	
	}

}
