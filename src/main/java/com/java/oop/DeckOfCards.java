package com.java.oop;

import java.security.SecureRandom;

public class DeckOfCards {

	private static Card[] deck;
	
	private static final SecureRandom randomNumber = new SecureRandom();
	
	private static int currentcard;
	
	private static final int NUMBER_OF_CARDS = 52;

	public DeckOfCards() {
		
		String face[] = {"Ace","Two","Three","Four","Five","Six",
				"Seven","Eight","Nine","Ten","Jack","Queen","King"};
		String suit[] = {"Clubs","Diamonds","Hearts","Spades"};
		
		deck = new Card[NUMBER_OF_CARDS];
		
		for(int i=0;i<NUMBER_OF_CARDS;i++) {
			deck[i] = new Card(face[i%13],suit[i/13]);
		}
		
	}
	
	public static void Shuffle() {
		
		currentcard = 0;
		
		int second = randomNumber.nextInt(NUMBER_OF_CARDS);
		
		for(int first=0;first<NUMBER_OF_CARDS;first++) {
			Card temp = deck[first];
			deck[second] = deck[first];
			deck[first] = temp;
		}
		
	}
	

}
