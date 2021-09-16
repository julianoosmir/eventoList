package Model;

import java.math.BigDecimal;

public class Bebida {
  
    private String nome;
    private float teorAlcoolico;
    private BigDecimal valorUnitario;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Bebida nome(String nome) {
        setNome(nome);
        return this;
    }
    public float getTeorAlcoolico() {
        return this.teorAlcoolico;
    }
    public void setTeorAlcoolico(float teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }
    public Bebida teorAlcoolico(float teorAlcoolico) {
        setTeorAlcoolico(teorAlcoolico);
        return this;
    }
    public BigDecimal getValorUnitario() {
        return this.valorUnitario;
    }
    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public Bebida valorUnitario(BigDecimal valorUnitario) {
        setValorUnitario(valorUnitario);
        return this;
    }

}
