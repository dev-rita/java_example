class SubClass{
	int i=3;
	
	void print() {
		System.out.print("i="+i);
	}
}
public class Ex17_01 {
	public static void main(String[] args) {
	//if조건식과 형변환 유무 판단 연산자 키워드를 사용해서 다운 캐스팅을하고 Subclass에서 print(){}메소드를 정의해서 
	//다운캐스팅한 객체로메소드를 호출하시오
		
		Object o=new SubClass(); //업캐스팅
		
		if(o instanceof SubClass) {//참
			SubClass foo=(SubClass)o;//다운캐스팅
			foo.print();
		}
	}
}
