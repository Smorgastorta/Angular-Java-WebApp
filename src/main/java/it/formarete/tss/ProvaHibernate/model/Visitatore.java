package it.formarete.tss.ProvaHibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Visitatori")
public class Visitatore {
	@Id
	private String cod_visitatore;
	
	@Column(name="cognome")
	private String cognome;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="email")
	private String email;
	
	@Column(name="login")
	private String login;
	
	@Column(name="psw")
	private String psw;

	public Visitatore() {
	}

	public String getCod_visitatore() {
		return cod_visitatore;
	}

	public void setCod_visitatore(String cod_visitatore) {
		this.cod_visitatore = cod_visitatore;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}
}
