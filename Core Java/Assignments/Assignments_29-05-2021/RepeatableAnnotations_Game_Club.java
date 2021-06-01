package com.onebill.java_basics.assignments;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


public class RepeatableAnnotations_Game_Club {
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Clubs { // clubs playing Multiple games

		Game[] value() default {};
	}

	@Game("Playing Cards")
	@Game("Snake and Ladder")
	@Game("Chess")
	@Game("Carrom")
	public @interface Club {
		String value();

	}

	@Repeatable(value = Clubs.class)
	public @interface Game {
		String value();

	}

	public static void main(String[] args) {

		Game[] g = Club.class.getAnnotationsByType(Game.class);
		Clubs club = Club.class.getAnnotation(Clubs.class);
		for (Game games : club.value()) {
			System.out.println(games.value());
		}
		
	
	}

}
