package SamplePackage;


class Animal{
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal{
	String birdName;
	boolean fly;
	boolean swim;
	String sound;
//	boolean sing;
	public Bird() {
		// TODO Auto-generated constructor stub
	}
	public Bird(boolean fly, boolean swim, String sound, String birdName) {
		
		this.fly = fly;
		this.swim = swim;
		this.sound = sound;
		this.birdName = birdName;
	}
	void sing() {
		System.out.println(" I am singing");
	}
	void sound() {
		System.out.println("A " + birdName + "says: " + sound);
	}
	void swim() {
		if(swim) {
		System.out.println("A " + birdName + "can swim " );
		}else {
			System.out.println("A " + birdName + "cannot swim " );
		}
	}
	void fly() {
		if(fly) {
		System.out.println("A " + birdName + "can fly " );
		}else {
			System.out.println("A " + birdName + "cannot fly " );
		}
	}
	public boolean isFly() {
		return fly;
	}
	public boolean isSwim() {
		return swim;
	}
	public String getSound() {
		return sound;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}
	public void setSwim(boolean swim) {
		this.swim = swim;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getBirdName() {
		return birdName;
	}
	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}
}



class Duck extends Bird{
	public Duck() {
		super(false, true, "Quack Quack", "Duck");
		
	}	
}




class Chicken extends Bird{
//	String sound;
//	String bird;
	public Chicken() {
		super(false, false, "Cluck Cluck", "Chicken");	
	}
}

class Rooster {
	Chicken chicken;
	public Rooster() {
		this.chicken = new Chicken();
		chicken.setSound("Cock-a-doodle-doo");
	}
	public String getSound() {
		return chicken.getSound();
	}
}

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		
		bird.sing();
		
		Bird duck = new Duck();
		duck.sound();
		duck.swim();
		
		Bird chicken= new Chicken();
		chicken.sound();
		chicken.fly();
		
		Rooster rooster= new Rooster();
		rooster.getSound();
		System.out.println("A Rooster says:" +rooster.getSound());
		
		
		
		
	}
}
