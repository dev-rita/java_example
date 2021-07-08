
public class Opr15 {

	public static void main(String[] args) {
		int i=5;
		i++;
		System.out.println(i);
		
		int j=0;
		i=5;
		j=i++;//먼저 5를 저장하고 나중에 1증가
		System.out.println("j="+j+", i="+i);//i=5,i=6
		
		i=5;
		j=0;
		j=++i;//먼저 1증가한 6을 저장
		System.out.println("j="+j+", i="+i);//i=5,i=6
		
		i=5;
		j=5;
		System.out.println(i++);//i=5
		System.out.println(++j);//i=6
		
	}

}
