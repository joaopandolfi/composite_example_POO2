package com.composite;

public class Part extends Item{

	public Part(String description, int cost){
		super(description,cost);
	}
	
	//Realmente n tem implementacao
	@Override
	public void addItem(Item item) {}

	@Override
	public void removeItem(Item item) {}

	@Override
	public Item[] getItens() {
		return new Item[0];
	}
}
