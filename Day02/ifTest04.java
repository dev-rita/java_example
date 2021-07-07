
public class ifTest04 {

	public static void main(String[] args) {
		//for 반복문과 if else조건문 하나를 활용해서 1부터 10까지 10번 반복하는 for반복문안에서
		//if else를 잘 활용하여 홀수와 짝수 누적합을 구하는 프로그램을 완성하자.
		int total1=0,total2 =0;

		for(int i=1;i<=10;i++)
		{
			if((i%2)==0) //짝수는 2로 나눈 나머지가 0
			{	total1+=i;
			}

			else // else if((i%2)==1) 홀수는 2로 나눈 나머지가 1
			{	total2+=i;
			}			
		}
		System.out.println("짝수합 누적:"+total1+"\n홀수합 누적:"+total2);
	}

}
