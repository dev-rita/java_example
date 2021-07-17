package net.abc.model2;

import net.abc.model.IShapeClass;

public class Rect implements IShapeClass {
	@Override
	public void draw() {
		System.out.println("사각형을 그린다.");
	}
}
