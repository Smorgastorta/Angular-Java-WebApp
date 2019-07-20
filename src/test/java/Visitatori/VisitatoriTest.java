package Visitatori;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.formarete.tss.ProvaHibernate.database.VisitatoreService;
import it.formarete.tss.ProvaHibernate.model.Visitatore;

public class VisitatoriTest {
	static VisitatoreService service = new VisitatoreService();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	@Before
	public void setUpBefore(){
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Test
	public void main() {
		Visitatore v = test();
		delete(v);
	}

	public static Visitatore test() {
		Visitatore v = new Visitatore();
		v.setCod_visitatore("VIS1");
		v.setNome("test");
		v.setCognome("testone");
		v.setEmail("emailtest@gmail.com");
		v.setLogin("test");
		v.setPsw("test");
		v.setTelefono("222");
		String cod = service.postVisitatore(v);
		assertNotNull(service.getVisitatore(cod));
		return v;
	}
	private static String delete(Visitatore v) {
		String ret = service.deleteVisitatore(v);
		assertNull(service.getVisitatore(v.getCod_visitatore()));
		return ret;
	}

}
