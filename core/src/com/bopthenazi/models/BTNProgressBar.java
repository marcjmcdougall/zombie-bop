package com.bopthenazi.models;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class BTNProgressBar extends Actor {

	private static final float PROGRESS_WIDTH = 400.0f;
	
	private TextureRegion backgroundTexture;
	private TextureRegion backgroundTextureDone;
	private TextureRegion dashes;
	private TextureRegion progressTexture;
	
	private float percentDraw;
	private float effectiveWidth;
	
	public BTNProgressBar(TextureRegion bgTexture, TextureRegion progressTexture, TextureRegion backgroundTextureDone, TextureRegion dashes, float x, float y, float width, float height){
		
		this.setBackGroundTexture(bgTexture);
		this.setProgressTexture(progressTexture);
		this.backgroundTextureDone = backgroundTextureDone; 
		this.dashes = dashes;
		
		this.setWidth(width);
		this.setHeight(height);
		
		this.setX(x - this.getWidth() / 2.0f);
		this.setY(y - this.getHeight() / 2.0f);
		
		this.setPercentDraw(0.0f);
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		
		batch.setColor(this.getColor().a, this.getColor().g, this.getColor().b, this.getColor().a * parentAlpha);
		
		if(percentDraw >= 1.0f){
			
			batch.draw(backgroundTextureDone, this.getX(), this.getY(), this.getWidth(), this.getHeight());
		}
		else{
			
			batch.draw(backgroundTexture, this.getX(), this.getY(), this.getWidth(), this.getHeight());
		}
		
//		batch.draw(progressTexture, this.getX() - this.getWidth() / 2.0f, this.getY() - this.getHeight() / 2.0f, this.getEffectiveWidth(), this.getHeight(), Math.round(this.getX()), Math.round(this.getY()), Math.round(this.getWidth()), Math.round(this.getHeight()), false, false);
		batch.draw(progressTexture, this.getX() + 340.0f, this.getY(), this.getEffectiveWidth(), this.getHeight());
//		batch.draw(progressTexture.getTexture(), this.getX(), this.getY(), this.getWidth(), this.getHeight(), Math.round(this.getX()), Math.round(this.getY()), Math.round(this.getEffectiveWidth()), Math.round(this.getHeight()), false, false);
		batch.draw(dashes, this.getX(), this.getY(), this.getWidth(), this.getHeight());
//		batch.draw(progressTexture, this.getX(), this.getY(), this.getWidth(), this.getHeight(), 0.0f, 1.0f, this.getPercentDraw(), 0.0f);
	}	
	
	public TextureRegion getBackgroundTexture() {
		
		return backgroundTexture;
	}

	public void setBackGroundTexture(TextureRegion backGroundTexture) {
		
		this.backgroundTexture = backGroundTexture;
	}

	public float getPercentDraw() {
		
		return percentDraw;
	}

	public void setPercentDraw(float percentDraw) {
		
		this.percentDraw = percentDraw;
		this.setEffectiveWidth(PROGRESS_WIDTH * percentDraw);
	}
	
	public TextureRegion getProgressTexture(){
		
		return progressTexture;
	}
	
	public void setProgressTexture(TextureRegion progressTexture2) {
		
		this.progressTexture = progressTexture2;
	}

	public float getEffectiveWidth() {
		
		return effectiveWidth;
	}

	public void setEffectiveWidth(float effectiveWidth) {
		
		this.effectiveWidth = effectiveWidth;
	}
}
