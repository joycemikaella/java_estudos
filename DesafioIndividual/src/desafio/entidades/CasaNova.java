package desafio.entidades;

public class CasaNova {
	private int id;
	private String descricao;
	private String dimensao;
	private String comodo;
	
	
	public CasaNova() {
	}
	
	public CasaNova(String descricao, String dimensao, String comodo) {
	
		this.descricao = descricao;
		this.dimensao = dimensao;
		this.comodo = comodo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDimensao() {
		return dimensao;
	}
	public void setDimensao(String dimensao) {
		this.dimensao = dimensao;
	}
	public String getComodo() {
		return comodo;
	}
	public void setComodo(String comodo) {
		this.comodo = comodo;
	}

	@Override
	public String toString() {
		return "\nItem "+ id + " - Descricao : " + descricao + "| Dimensao : " + dimensao + "| Comodo : " + comodo;
	}
}
	
	