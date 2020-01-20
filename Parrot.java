package SamplePackage;


 enum ParrotCompanion{

	Dog("Woof,woof"),
	Cat("Meow"),
	Roster("Cock-a-doodle-doo");
	 private final String sound;

	 ParrotCompanion(String sound) {
		 this.sound = sound;
	 }

	 public String getSound() {
		 return sound;
	 }


	}
public class Parrot extends Bird{


	void soundCompanion(String companion){
		if(companion.equals(ParrotCompanion.Dog.name()) ||companion.equals(ParrotCompanion.Cat.name()) ){
			System.out.println("A Parrot living with " + companion + " says: " + ParrotCompanion.valueOf(companion).getSound());
		}else if(companion.equals(ParrotCompanion.Roster.name()) ) {
			System.out.println("A Parrot living near " + companion + " says: " + ParrotCompanion.valueOf(companion).getSound());

		}
	}

}


