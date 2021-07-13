class Mp3{
	private String comp;
	private int size;
	
	void setComp(String new_comp){
		comp=new_comp;
	}
	void setSize(int new_size) {
		size=new_size;
	}
	String getComp() {
		return comp;
	}
	int getSize() {
		return size;
	}
}
public class Ex12_02 {

	public static void main(String[] args) {
		Mp3 m=new Mp3();
		m.setComp("갑을회사");
		m.setSize(8);
		System.out.println("회사명:"+m.getComp());
		System.out.println("메모리용량:"+m.getSize()+"G");
	}

}
