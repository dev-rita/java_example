import java.util.Scanner;

public class WhileBreak07 {

	public static void main(String[] args) {
		
		int menu=0;
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("1-비빔밥");
			System.out.println("2-짜장면");
			System.out.println("3-김밥");
			System.out.println("원하는 메뉴를 1~3사이에서 선택하세요(종료 0)>>");
			
			menu=Integer.parseInt(scan.nextLine());
			
			if(menu==0) {
				System.out.println("메뉴 선택 프로그램을 종료합니다!");
				break;//무한루프 반복문을 종료
			}else if(!(menu>=1&&menu<=3)) {
				System.out.println("메뉴를 잘못 선택했습니다!(종료는 0)");
				continue;//아래문장을 실행 안함.
			}//if ~else if
			
			System.out.println("선택하신 메뉴는 "+menu+" 입니다.");
		}//무한루프 while문
	}

}
