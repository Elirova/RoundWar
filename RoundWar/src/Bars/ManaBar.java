/*******************************************************************************
 * Copyright (c) 2014
 *
 * @author Elisabet Romero Vaquero
 *******************************************************************************/
package Bars;

import screenControl.AbstractScreen;
import Entities.MainCharacter;

import com.badlogic.gdx.Gdx;

public class ManaBar extends Bar {

	/**
	 * Constructor.
	 * @param mainpj
	 */
	public ManaBar (MainCharacter mainpj) {
		super(Gdx.graphics.getWidth()*0.4f, Gdx.graphics.getHeight()*0.03f, mainpj.maxMp, mainpj.getMp());
		empty = AbstractScreen.getSkin().getPatch("bg-bar-short");
		full = AbstractScreen.getSkin().getPatch("bar-mp");
	}
	
	/**
	 * Redimensiona la barra.
	 * @param width
	 * @param height
	 */
	public void resize(int width, int height) {
		super.resize(width*0.4f, height*0.03f);
    }
}
