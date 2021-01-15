package FactoryGame;

import java.io.IOException;

public class CharacterGenerator { 
	public CharacterGenerator() {
		
	}
	
	public void createCharacter() {
		Character character = new Character(new CharacterSpritesheet("humand.png"));
	}
}
