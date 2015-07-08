package com.composite;

import java.util.ArrayList;

public class Assembly extends Item{
	private ArrayList<Item> items;
	
	public Assembly(String description){
		super(description, 0);
		items = new ArrayList<Item>();
	}

	@Override
	public void addItem(Item item) {
		items.add(item);
	}

	@Override
	public void removeItem(Item item) {
		items.remove(item);
	}

	@Override
	public Item[] getItens() {
		return items.toArray(new Item[items.size()]);
	}
	
	
	public int getCost(){
		int total = 0;
		for(Item item: items){
			total+= item.getCost();
		}
		return total;
	}
}
