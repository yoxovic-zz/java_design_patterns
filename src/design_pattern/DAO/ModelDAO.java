package design_pattern.DAO;

public class ModelDAO {
	int id;
	String name;
	
	public ModelDAO(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public ModelDAO() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
