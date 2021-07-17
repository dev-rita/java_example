package net.abc.model2;

import net.abc.model.IShapeClass;

public class Circ implements IShapeClass {
	@Override
	public void draw() {
		System.out.println("원을 그린다.");
	}
}
