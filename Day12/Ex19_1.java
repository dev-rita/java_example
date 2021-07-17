import com.naver.model.IShapeClass;
import com.naver.model2.Circ;
import com.naver.model2.Rect;
import com.naver.model2.Tria;

public class Ex19_1 {

	static void pr(IShapeClass ic) {
		ic.draw();
	}
	public static void main(String[] args) {
		IShapeClass ref;
		
		ref=new Circ();
		ref.draw();
		
		ref=new Rect();
		ref.draw();
		
		ref=new Tria();
		ref.draw();
		
		System.out.println("============================");
		
		IShapeClass[] arr=new IShapeClass[3];
		arr[0]=new Circ();
		arr[1]=new Rect();
		arr[2]=new Tria();
		
		for(int i=0;i<arr.length;i++) {
			arr[i].draw();
		}
		
		System.out.println("============================");
		
		pr(new Circ());
		pr(new Rect());
		pr(new Tria());
		
	}

}
