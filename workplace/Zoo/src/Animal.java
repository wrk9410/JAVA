import java.util.Arrays;

public class Animal {
	private String species;
	private int age;
	private double weight;
	private String taste;
	private boolean zookeeper;
	
	public Animal(String species, int age, double weight, String taste) {
		super();
		this.species = species;
		this.age = age;
		this.weight = weight;
		this.taste = taste;
		this.zookeeper = zookeeper;
	}
	

	public void printArr(Animal[][] a) {
		System.out.println("[초식]");
		for (int i = 0; i < a[0].length; i++) {
			System.out.println(a[0][i]);
		}
		System.out.println("[육식]");
		for (int i = 0; i < a[0].length; i++) {
			System.out.println(a[1][i]);
		}
		System.out.println("[그 외]");
		for (int i = 0; i < a[0].length; i++) {
			System.out.println(a[2][i]);
		}
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public boolean isZookeeper() {
		return zookeeper;
	}

	public void setZookeeper(boolean zookeeper) {
		this.zookeeper = zookeeper;
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + ", age=" + age + ", weight=" + weight + ", taste=" + taste
				+ ", zookeeper=" + zookeeper + "]";
	}
	
}
