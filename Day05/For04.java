import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		int sum=0, i=0;//누적합
		
		for(i=1;i<=5;i++){
			sum+=i;
		}
		System.out.println("1부터"+(i-1)+"까지의 누적합="+sum);//여기서 i가 6이나오기 때문에 i-1을 해준다.
		
		/*Scanner scan=new Scanner(System.in);
		String text=scan.nextLine();
		char[] arr=text.toCharArray();
		
		String rev=" ";
		for(char j:arr) {
			rev=j+rev;//rev+j이면 그대로나옴.
			
		}System.out.println(rev);
		*/
	}

}
