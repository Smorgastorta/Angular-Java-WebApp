package it.formarete.tss.ProvaHibernate.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.formarete.tss.ProvaHibernate.database.VisitatoreService;
import it.formarete.tss.ProvaHibernate.model.Visitatore;

@RestController
@RequestMapping(path = "/api/visitatori")
public class VisitatoreController {
	private static VisitatoreService service = new VisitatoreService();

	@GetMapping
	public List<Visitatore> getVisitatori() {
		try {
			return service.getVisitatori();
		} catch (Exception e) {
			return null;
		}
	}

	@GetMapping(path = "{cod}")
	public Visitatore getVisitatore(@PathVariable(name = "cod") String cod) {
		try {
			return service.getVisitatore(cod);
		} catch (Exception e) {
			return null;
		}
	}

	@PostMapping
	public String postVisitatore(@RequestBody Visitatore v) {
		try {
			return service.postVisitatore(v);
		} catch (Exception e) {
			return null;
		}

	}

}
