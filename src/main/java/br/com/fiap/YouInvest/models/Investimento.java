package br.com.fiap.YouInvest.models;


public class Investimento{
    private int idInvestimento;
    private String[] titulos = {"CDB", "LCI", "LCA"};
    private String[] tipoTaxa = {"IPCA", "CDI"};
    private float juros;
    private int DiasSaque;
    private int anos;
    private boolean sobPercentual;
    private int quantidade;
    
    public Investimento() {}
    
    
	public Investimento(int idInvestimento, String[] titulos, String[] tipoTaxa, float juros, int diasSaque, int anos,
			boolean sobPercentual, int quantidade) {
        this.idInvestimento = idInvestimento
		this.titulos = titulos;
		this.tipoTaxa = tipoTaxa;
		this.juros = juros;
		this.DiasSaque = diasSaque;
		this.anos = anos;
		this.sobPercentual = sobPercentual;
		this.quantidade = quantidade;
	}
    public int getidInvestimento() {
		return idInvestimento;
	}
	public void setidInvestimento(int idInvestimento) {
		this.idInvestimento = idInvestimento;
	}
	public String[] getTitulos() {
		return titulos;
	}
	public void setTitulos(String[] titulos) {
		this.titulos = titulos;
	}
	public String[] getTipoTaxa() {
		return tipoTaxa;
	}
	public void setTipoTaxa(String[] tipoTaxa) {
		this.tipoTaxa = tipoTaxa;
	}
	public float getJuros() {
		return juros;
	}
	public void setJuros(float juros) {
		this.juros = juros;
	}
	public int getDiasSaque() {
		return DiasSaque;
	}
	public void setDiasSaque(int diasSaque) {
		this.DiasSaque = diasSaque;
	}
	public int getAnos() {
		return anos;
	}
	public void setAnos(int anos) {
		this.anos = anos;
	}
	public boolean isSobPercentual() {
		return sobPercentual;
	}
	public void setSobPercentual(boolean sobPercentual) {
		this.sobPercentual = sobPercentual;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

    public void salva() {
		quantidade ++;
	}
}