
public class IFTest09 {

	public static void main(String[] args) {
		int a=5, b=10;
		int max=0;//최대값
		int min=0;//최소값
		
		if(a>b) {
			max=a;
			min=b;
		}else {
			max=b;
			min=a;
		}
		System.out.println("최대값="+max+", 최소값="+min);
		
/* if else if 다중 조건문 형식)
 * if(조건식1){
 * 	조건식 1이 참일때 실행;
 * }else if(조건식2){
 * 	조건식 2가 참일때 실행;
 * }else{
 * 	조건식 1, 2 모두 거짓일 때 실행;
 * }
 */
		a=7;
		if(a>0) {
			System.out.println(a+"는 양수");
		}else if(a<0) {
			System.out.println(a+"는 음수");
		}else {
			System.out.println("0입니다.");
		}
		}

}
