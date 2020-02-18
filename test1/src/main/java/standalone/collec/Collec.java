package standalone.collec;

import java.util.List;

public class Collec {
	private List<String> name;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Collec [name=" + name + "]";
	}
	

}
