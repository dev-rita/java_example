//UML 다이어그램 >> '-':private / '+' : public / '#' : protected / '~' : default
class Animal{
	protected String kind;//동물 종을 저장할 변수.
	protected int leg;//다리 개수.

	public Animal(){};
	public Animal(String kind, int leg){
		this.kind=kind;
		this.leg=leg;
	}//생성자 오버로딩

	public void getKind() {
		if(kind.equals("소녀"))	System.out.println(kind+" 사람이다.");
		else if(kind=="강아지") System.out.println(kind+" 동물이다.");
	}
	public void walk() {
		System.out.println(kind+"는 "+leg+"발로 걷는다.");
	}
}
class Dog extends Animal{
	public Dog(){};
	public Dog(String kind, int leg){
		//super.kind=kind;
		//super.leg=leg;
		super(kind,leg);
	}
}
class Human extends Animal{
	public Human(){};
	public Human(String kind, int leg){
		//super.kind=kind;
		//super.leg=leg;
		super(kind,leg);
	}
}

public class Ex16_4 {
	public static void main(String[] args) {
		Dog d=new Dog("강아지",4);
		Human h=new Human("소녀",2);

		d.getKind();
		d.walk();
		h.getKind();
		h.walk();
	}
}
