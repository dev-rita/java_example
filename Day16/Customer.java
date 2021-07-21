import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Customer implements Externalizable {
	int id;
	String name;
	int age;
	double height;
	
	public Customer() {}
	
	public Customer(int id, String name, int age, double height) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.height=height;
	}
	@Override
	public void readExternal(ObjectInput ois) throws IOException, ClassNotFoundException {
		id=(Integer)ois.readObject();//다운캐스팅+오토언박싱
		name=(String)ois.readObject();//다운캐스팅
		age=(Integer)ois.readObject();
		height=(Double)ois.readObject();
	}//객체단위로 읽어오기

	@Override
	public void writeExternal(ObjectOutput oos) throws IOException {
		oos.writeObject(new Integer(id));//기본타입을 참조 레퍼타입으로 자동형변환 즉 오토박싱되면서 업캐스팅해서 저장시킴.
		oos.writeObject(name);//업캐스팅 하면서 저장(string>>object)
		oos.writeObject(age);//오토박싱 업캐스팅
		oos.writeObject(height);//오토박싱 업캐스팅
	}//객체 단위로 기록

	@Override
	public String toString() {
		return "id="+id+", name="+name+", age="+age+", height="+height;
	}
}
