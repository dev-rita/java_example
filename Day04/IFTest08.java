
public class IFTest08 {
/* if(조건식){
 * 조건식이 참일동안만 반복실행;
 * }
 */
	public static void main(String[] args) {
		int num = -5;
		if (num<0) {//num이 음수일 때 실행됨.
			num=-num;
		}
		System.out.println("-5의 절댓값"+num);
		
		num = 7;
		if (num<0) {
			num=-num;
		}
		System.out.println("num="+num);
	

/* if(조건식){
* 조건식이 참일동안만 반복실행;
* }else{
*  조건식이 거짓일동안만 반복실행;
* }
*/
		num = 9;
		String result="";
		
		if (num%2==0) {
			result="짝수";
		}else {
			result="홀수";
		}
		System.out.println("num="+num+"는 "+result+"입니다.");
}
}
