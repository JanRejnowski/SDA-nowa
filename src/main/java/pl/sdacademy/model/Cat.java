package pl.sdacademy.model;

public class Cat {

	private String name;

    public Cat() {
	// TODO Auto-generated constructor stub
    }

    public Cat(String name) {
	this.name = name;
    }

    public void voice() {
	System.out.println("Meow");
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
}
