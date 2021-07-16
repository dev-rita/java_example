import net.abc.model.ShapeClass;
import net.abc.model2.Circ;
import net.abc.model2.Rect;
import net.abc.model2.Tria;

public class AbsEx16 {
	static void dr(ShapeClass ref) {//자손은 다 받을 수 있는 매개변수 다형성>>상속과 업캐스팅(참조타입간의 형변환)
		ref.draw();
	}
	public static void main(String[] args) {
		dr(new Circ());//업캐스팅 ShapeClass ref=new Circ()
		dr(new Rect());
		dr(new Tria());
	}

}
