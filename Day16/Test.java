import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int[] arr=new int[10];
		char tmp=' ';
		
		Scanner scan= new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 :");
		String input=scan.nextLine();
		
		for(int i=0;i<input.length();i++) {//입력받은 문자열의 길이만큼 
			tmp=input.charAt(i);//문자열을 한글자씩 떼어내서 char형 변수인 tmp에 저장
			
			for(int j=0; j<arr.length; j++) {//0~9까지
				if((tmp-'0')==j) {//tmp를 숫자로 변환한 결과가 j와 같으면
					arr[j]+=1;
				}
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(i+"->"+arr[i]+"번");
			
			for(int j=0; j<arr[i];j++) {
				System.out.println("#");
			}
			System.out.println();
		}
	}
}
