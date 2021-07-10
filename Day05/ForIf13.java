
public class ForIf13 {

	public static void main(String[] args) {
		int i;//반복문 제어변수
		int odd_total;//홀수들의 누적합
		int even_total;//짝수들의 누적합
		
		for(odd_total=0,i=1;i<=10;i+=2) {
			odd_total+=i;
		}//for
		System.out.println("홀수들의 누적합="+odd_total);
		
		for(even_total=0,i=2;i<=10;i+=2) {
			even_total+=i;
		}
		System.out.println("짝수들의 누적합="+even_total+"\n=====================");
		
		for(odd_total=0,even_total=0,i=1;i<=10;i++) {
			if(i%2==1) {
				odd_total+=i;
			}else {
				even_total+=i;
			}
		}
		System.out.println("홀수들의 누적합="+odd_total);
		System.out.println("짝수들의 누적합="+even_total);
	}

}
