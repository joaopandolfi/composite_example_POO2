package com.composite;

public class App 
{
    public static void main( String[] args )
    {
    	Item jaca = new Part("Jaca",1);
    	Item melancia = new Part("Melancia",2);
    	Item tapioca = new Part("Tapioca",3);
    	
    	Item balaio = new Assembly("Balaio");
    	balaio.addItem(jaca);
    	balaio.addItem(melancia);
    	balaio.addItem(tapioca);
    	
    	Item aeromoca = new Assembly("Aeromoça");
    	aeromoca.addItem(balaio);
    	
    	
    	System.out.println(balaio);
    	
    	System.out.println(aeromoca);
    }
}
