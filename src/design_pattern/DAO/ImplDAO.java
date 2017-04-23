package design_pattern.DAO;

import java.util.ArrayList;
import java.util.List;

public class ImplDAO implements DAO {

	List<ModelDAO> md_list;

	public ImplDAO() {
		this.md_list = new ArrayList<ModelDAO>();

		ModelDAO mdao1 = new ModelDAO(1, "Model: MDAO1");
		ModelDAO mdao2 = new ModelDAO(2, "Model: MDAO2");
		ModelDAO mdao3 = new ModelDAO(3, "Model: MDAO3");
		ModelDAO mdao4 = new ModelDAO(4, "Model: MDAO4");

		md_list.add(mdao1);
		md_list.add(mdao2);
		md_list.add(mdao3);
		md_list.add(mdao4);
	}

	@Override
	public ModelDAO findById(int id) {
		return md_list.get(id);
	}

	@Override
	public List<ModelDAO> findAll() {
		return md_list;
	}

	@Override
	public void deleteModel(ModelDAO m) {
		md_list.remove(m.getId());
	}

	@Override
	public void updateModel(ModelDAO m) {
		md_list.set(m.getId(), m);
	}

}
