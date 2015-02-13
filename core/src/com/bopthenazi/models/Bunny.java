package com.bopthenazi.models;

import com.badlogic.gdx.graphics.Texture;
import com.bopthenazi.views.screens.BTNGameScreen;

public class Bunny extends BTNContainedActor {

	public Bunny(float x, float y, BTNGameScreen gameScreen) {
	
		super(new Texture("bunny.png"), x, y, gameScreen);
	}
}