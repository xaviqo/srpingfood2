package xavi.tech.springfood.model;

public enum Role {

	CLIENT(1),
	WORKER(2),
	ADMIN(3);
	
	private int code;

	Role(int i) {
		this.code = i;
	}

	public int getCode() {
		return this.code;
	}
	
}
