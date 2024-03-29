package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reparto")
public class Reparto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_reparto;
	
	@Column(name="nome")
	private String nome_reparto;
	
	@Column(name="n_posti_tot")
	private int numeri_posti_tot;
	
	@Column(name="n_post_disp")
	private int numeri_posti_disp;
	
	public Reparto() {
		super();
	}
	
	public Reparto(int id_reparto, String nome_reparto, int numeri_postiT, int numeri_postiD) {
		super();
		this.nome_reparto = nome_reparto;
		this.numeri_posti_tot = numeri_postiT;
		this.numeri_posti_disp = numeri_postiD;
	}
	
	public int getId_reparto() {
		return id_reparto;
	}
	public void setId_reparto(int id_reparto) {
		this.id_reparto = id_reparto;
	}
	public String getNome_reparto() {
		return nome_reparto;
	}
	public void setNome_reparto(String nome_reparto) {
		this.nome_reparto = nome_reparto;
	}
	public int getNumeri_posti_tot() {
		return numeri_posti_tot;
	}
	public void setNumeri_posti_tot(int numeri_posti_tot) {
		this.numeri_posti_tot = numeri_posti_tot;
	}
	public int getNumeri_posti_disp() {
		return numeri_posti_disp;
	}
	public void setNumeri_posti_disp(int numeri_posti_disp) {
		this.numeri_posti_disp = numeri_posti_disp;
	}
	
}