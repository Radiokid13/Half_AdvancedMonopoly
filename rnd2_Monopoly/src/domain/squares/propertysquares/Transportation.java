package domain.squares.propertysquares;

import domain.Player;

public abstract class Transportation extends PropertySquare {
	
	
	public Transportation(String name) {
		super();
		this.name = name;
	}
	
	public abstract void performPurchase(Player p, PropertySquare s);
	
	public abstract Player getOwner();
	
	public abstract void setOwner(Player owner);

	public abstract int getPrice();

	public abstract double calculateRent();
	
	public abstract String getName();

	public abstract void setName(String name);


}
