class Super{//extends Object
	public int getNumber(int a) {
		return a+1;
	}
}

class CastingEx03 extends Super{

	@Override
	public int getNumber(int a) {
		return super.getNumber(a);
	}
	
}
public class Ex17_02 {

	public static void main(String[] args) {
		Super a=new CastingEx03();//업캐스팅
		System.out.println(a.getNumber(0));
	}

}

//중간 클래스는 다 건너뛰고 object로 올라감 
