package design_pattern.DAO;

import java.util.List;

public interface DAO {

	List<ModelDAO> findAll();

	ModelDAO findById(int id);
	
	void deleteModel(ModelDAO m);
	
	void updateModel(ModelDAO m);
}
