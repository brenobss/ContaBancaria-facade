package entities;

public class Cliente {
    private String nome;
    private String naturalidade;
    private String estado;
    private String municipio;
    
    public Cliente() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
	return "Cliente [nome=" + nome + ", naturalidade=" + naturalidade + ", estado=" + estado + ", municipio="
		+ municipio + "]";
    }
    
    
    
}
