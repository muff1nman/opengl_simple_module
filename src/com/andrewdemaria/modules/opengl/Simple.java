package com.andrewdemaria.modules.opengl;

import edu.mines.acmX.exhibit.module_management.modules.ProcessingModule;

public class Simple extends ProcessingModule {
	public void setup() {
		size(width,height, OPENGL);
	}
	
	public void draw() {
		pushMatrix();
		translate(130, height/2, 0);
		rotateY((float) 1.25);
		rotateX((float) -0.4);
		noStroke();
		box(100);
		popMatrix();

		pushMatrix();
		translate(500, (float) (height*0.35), -200);
		noFill();
		stroke(255);
		sphere(280);
		popMatrix();
	}
}
