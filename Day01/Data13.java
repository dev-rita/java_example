/*증가/감소(증감) 연산자 종류)
 * 1. 1씩증가 : i++ (후행증가로서 나중에 1증가), ++i(선행증가로 먼저 1을 증가)
 * 2. 1씩감소 : i-- (후행감소로서 나중에 1감소), --i(선행감소로 먼저 1을 감소)
 * 3. i++은 복합대입연산자인 i=i+1과 같다. i+=1이 된다.
 *    2씩 감소하려면 i=i-2 또는 i-=2로 작성하면 된다.
 */

public class Data13 {
	public static void main(String[] args) {
		int x = 10;
		x+=10;
		System.out.println(x);//20
		
		x=10;
		int y;
		y=x++; //먼저 10 값을 c변수에 저장하고 나중에 1증가
		System.out.println("x:"+x+"y:"+y);
		System.out.println("y:"+y);
		
		x=10;
		y=++x; //먼저 1값을 증가한 11을 저장
		System.out.println("x:"+x+"y:"+y);
		System.out.println("y:"+y);
		}
}
