package pattern.test;

import design_pattern.DAO.*;

public class TestDAO {

	public static void main(String[] args) {
		
		ImplDAO impl = new ImplDAO();
		ModelDAO m = new ModelDAO();
		
		System.out.println("Uvrsteni Modeli u listi:");
		for ( ModelDAO mdao : impl.findAll() ) {
			System.out.println(mdao.getName());
		}
		
		m = impl.findById(0);
		
		System.out.println(String.format("Pronadjeni model u listi je: %s", m.getName()));
		
		m.setId(0);
		impl.deleteModel(m);
		
		System.out.println(String.format("Obrisani model iz liste je:  %s", m.getName()));
		
		System.out.println("Preostali Modeli nakon brisanja su:");
		
		for ( ModelDAO mdao : impl.findAll() ) {
			System.out.println(mdao.getName());
		}
		
		System.out.println(String.format("Obrisani model iz liste je:  %s", m.getName()));
		m.setName("Model: izmenjeni MDAO2");
		impl.updateModel(m);
		
		System.out.println("Lista Modela nakon izmene:");
		
		for ( ModelDAO mdao : impl.findAll() ) {
			System.out.println(mdao.getName());
		}

	}

}
