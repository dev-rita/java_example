package net.abc.model2;

import net.abc.model.IShapeClass;

public class Tria implements IShapeClass {
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다.");
	}
}
