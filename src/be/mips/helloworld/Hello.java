package be.mips.helloworld;

public class Hello {
	private String name;
	
	public Hello(String name) {
		this.name = name;
	}
	public String hello() {
		return "Hello " + name;
	}
	
	public String cool() {
		return name + " is not Cooler then Mercurial ???";
	}

}
