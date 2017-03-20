
public class Player extends Players {
	
	/* The basic gist of this class is for storing player data, like
	 * gold count, weapon, health, and of course, time alive. This 
	 * allows for setting records for game kills, gold amounts, etc.
	 */
	
	private boolean dead = false;
	private int health = 100;
	private int gold = 0;
	private int weapon = 0;
	
	//Constructor
	
	public void player(boolean ded, int hlth, int gld, int wpn) {
		dead = ded;
		health = hlth;
		gold = gld;
		weapon = wpn;
	}
	
	//Gets and Sets for each variable
	
	public boolean getDead() {
		
		return dead;
		
	}
	
	public void setDead(boolean ded) {
		
		dead = ded;
		
	}
	
	public int getGold() {
		
		return gold;
		
	}
	
	public void setGold(int gld) {
		
		gold = gld;
		
	}
	
	public int getWeapon() {
		
		return weapon;
		
	}
	
	public void setWeapon(int wpn) {
		
		weapon = wpn;
		
	}
	
	public int getHealth() {
		
		return health;
		
	}
	
	public void setHealth(int hlth) {
		
		health = hlth;
		
	}
	
 }
