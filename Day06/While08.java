import java.util.Scanner;

public class While08 {

	public static void main(String[] args) {
		int menu=0;
		int num=0;
		Scanner scan=new Scanner(System.in);
		
		outer://레이블명
			while(true) {
				System.out.println("1-비빔냉면");
				System.out.println("2-비빔밥");
				System.out.println("3-물냉면");
				System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)>>");
				
				menu=Integer.parseInt(scan.nextLine());
				
				if(menu==0) {
					System.out.println("프로그램 종료");
					break;//while무한루프문 종료
				}else if(!(1<= menu&&menu<=3)){
					System.out.println("메뉴를 잘못 선택했습니다.(종료:0)");
					continue;//아래문장을 실행 안함.
				}
				for(;;) {
					System.out.print("계산할 값을 입력.(계산종료:0,전체 종료:99)>>");
					num=Integer.parseInt(scan.nextLine());
					
					if(num==0) {
						break;//for반복문을 중단. while반복문으로 돌아감.
					}
					if(num==99) {
						System.out.println("프로그램 종료");
						break outer;//for, while 전체 반복문 중단
					}
					
					switch(menu) {
					case 1: System.out.println("비빔냉면 값= "+(num+500)+"원");
					break outer;
					case 2: System.out.println("비빔밥 값= "+(num+600)+"원");
					break outer;
					case 3: System.out.println("물냉면 값= "+(num+700)+"원");
					break outer;
					}
				}
			}
	}

}
