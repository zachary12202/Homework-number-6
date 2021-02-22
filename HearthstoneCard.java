import org.json.simple.JSONObject;

public class HearthstoneCard {
	private int cost;
	private int attack;
	private int defense;
	private String name;
	
	theMinions[] = {(cardData.get("name"), cardData.get("cost"), (cardData.get("attack"), (cardData.get("health") );
	public HearthstoneCard(String name, int cost, int attack, int defense)
	{
		this.cost = cost;
		this.attack = attack;
		this.defense = defense;
		this.name = name;
		
		
	}
	
	//setters allow us to conditionally change the value of a private member
	public void setName(String name)
	{
		if(name.length() >= 5)
		{
			this.name = name;
		}
	}
	
	void display()
	{
		//System.out.println("Name: " + this.name + "\nCost" + this.cost + "\nAttack: " + this.attack + " Defense: " + this.defense);
		System.out.format("Name: %s \nCost: %d \nAttack: %d Defense: %d\n", this.name, this.cost, this.attack,this.defense);
	}

	



}
