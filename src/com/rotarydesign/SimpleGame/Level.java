package com.rotarydesign.SimpleGame;

import java.util.ArrayList;

import org.newdawn.slick.SlickException;

public class Level {
	int level = 1;
	String area = "space";
	public Level(int levelInit) throws SlickException{
	level = levelInit;
	
	
	}
	
	public void update(int levelUpdate){
	level = levelUpdate;
	if(level == 1){
		area = "space";
		level = 1;
	}
	if(level == 2){
		area = "stars";
		level = 2;
	}
	else{
		area = "stars";
		level = 1;
	}
	
	}
	public void level1(){
	level = 1;
	area = "space";
	}
	public void level2(){
	level = 2;
	area = "stars";
	
	}
	public void level3(){
	level = 3;
	ArrayList<Background> backgrounds = GameplayState.backgrounds;
	
	}
}
