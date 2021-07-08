
public class OprEx13 {

	public static void main(String[] args) {
		int a=10;
		a=a+5;//5증가
		System.out.println("a="+a);
		
		a+=3;//3증가
		System.out.println("a="+a);
		
		/* 증감연산자 종류)
		 * i++(후행증가:나중에 1증가), ++i(선행증가:먼저 1증가)
		 * i--(후행감소: 나중에 감소), --i(선행감소:먼저 1감소)
		 */
		
		int i=5, j=5;

		++i;
		System.out.println("i="+i);//6
		j++;
		System.out.printf("j++=%d %n",j);//6
		
		i=10;
		j=10;
		System.out.println(++i);//먼저 1을 증가하고 11이 출력
		System.out.println(i);//11
		
		System.out.println(j++);//먼저 j변수값 10을 출력하고 나중에 1증가
		System.out.println(j);//11
		
		i=10;
		j=10;
		
		int c=++i;
		System.out.println("c="+c);//11
		
		c=j++;//먼저 j변수값 10을 c변수에 저장하고 나중에 1증가.
		System.out.printf("c=%d \n",c);
		System.out.println("j="+j);//11
		
	}

}
