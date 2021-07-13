
public class MethodTest15 {
	int add(int a, int b) {
		return a+b;
	}
	void add(int a, int b, int[] result) {
		result[0]=a+b;//8로 배열 원소값 변경.
	}
	public static void main(String[] args) {
		MethodTest15 mt=new MethodTest15();
		
		int result=mt.add(3, 5);
		System.out.println("3+5="+result);
		
		int[] result2= {0};//첫 번째 배열원소값 초기화
		System.out.println("변경되기 전 배열원소값="+result2[0]);
		mt.add(3,5,result2);
		System.out.println("변경된 후 배열원소값="+result2[0]);
	}

}
