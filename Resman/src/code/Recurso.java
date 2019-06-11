package code;

import javax.persistence.*;

@Entity

public class Recurso {
	@Id
	private String id;
	@Column
	private String desc;
	@Column
	private String tipo;
	@Column
	private String categoria;
	@Column
	private String estado;
	@Column
	private int TMA;
	@Column
	private int TMR;
	@Column
	private int TMAP;
	@Column
	private String MDI;
	
	// construtor completo da classe Recurso
	public Recurso(String desc, String tipo, String categoria, int TMA, int TMR, int TMAP) {
		this.id = null;
		this.desc = desc;
		this.tipo = tipo;
		this.categoria = categoria;
		this.estado = "Disponivel";		// valor default
		this.TMA = TMA;
		this.TMR = TMR;
		this.TMAP = TMAP;
		this.MDI = null;
	}
	
	// construtor vazio da classe Recurso
	public Recurso() {
		this.id = null;
		this.estado = "eDisponivel";		// valor default
		this.MDI = null;
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEstado() {
		return estado;
	}

	private void setEstado(String estado) {
		this.estado = estado;
	}

	public int getTMA() {
		return TMA;
	}

	public void setTMA(int tMA) {
		TMA = tMA;
	}

	public int getTMR() {
		return TMR;
	}

	public void setTMR(int tMR) {
		TMR = tMR;
	}

	public int getTMAP() {
		return TMAP;
	}

	public void setTMAP(int tMAP) {
		TMAP = tMAP;
	}

	public String getMDI() {
		return MDI;
	}

	public void setMDI(String mDI) {
		MDI = mDI;
	}
	
	
	
	

}
