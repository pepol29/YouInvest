package br.com.fiap.YouInvest.models;

public class Usuario{
    private String nome;
    private String email;
    private float saldo;
    private float objetivo;

    public Usuario(){}

    public Usuario(String nome, String email,Float saldo, Float objetivo){
        this.nome = nome;
        this.email = email;
        this.saldo = saldo;
        this.objetivo = objetivo;
    }

    public String getNome() {
		return nome;
	}
    public void setNome(String nome) {
		this.nome = nome;
	}

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Float getSaldo(){
        return saldo;
    }

    public void setSaldo(Float saldo){
        this.saldo = saldo;
    }

    public Float getObjetivo(){
        return objetivo;
    }

    public void setObjetivo(Float objetivo){
        this.objetivo = objetivo;
    }

}