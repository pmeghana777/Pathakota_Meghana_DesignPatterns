
package com.design.test;

import com.design.bridge.GreenColor;
import com.design.bridge.Pentagon;
import com.design.bridge.RedColor;
import com.design.bridge.Shape;
import com.design.bridge.Triangle;

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}
