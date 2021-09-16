package Model;

import java.math.BigDecimal;


public class Evento {
    private Long id;
    private String descricao;
    private String data;
    private String local;
    private Integer qtdConvidados;
    private BigDecimal valorEntradas;
    private BigDecimal custo;
    private Promoter promoter;

   
    public Long getId() {
        return this.id;
    }

   
    public void setId(Long id) {
        this.id = id;
    }

   
    public Evento id(Long id) {
        setId(id);
        return this;
    }

   
    public String getDescricao() {
        return this.descricao;
    }

   
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
    public Evento descricao(String descricao) {
        setDescricao(descricao);
        return this;
    }

   
    public String getData() {
        return this.data;
    }

   
    public void setData(String data) {
        this.data = data;
    }

   
    public Evento data(String data) {
        setData(data);
        return this;
    }

   
    public String getLocal() {
        return this.local;
    }

   
    public void setLocal(String local) {
        this.local = local;
    }

   
    public Evento local(String local) {
        setLocal(local);
        return this;
    }

   
    public Integer getQtdConvidados() {
        return this.qtdConvidados;
    }

   
    public void setQtdConvidados(Integer qtdConvidados) {
        this.qtdConvidados = qtdConvidados;
    }

   
    public Evento qtdConvidados(Integer qtdConvidados) {
        setQtdConvidados(qtdConvidados);
        return this;
    }

   
    public BigDecimal getValorEntradas() {
        return this.valorEntradas;
    }

   
    public void setValorEntradas(BigDecimal valorEntradas) {
        this.valorEntradas = valorEntradas;
    }

   
    public Evento valorEntradas(BigDecimal valorEntradas) {
        setValorEntradas(valorEntradas);
        return this;
    }

   
    public BigDecimal getCusto() {
        return this.custo;
    }

   
    public void setCusto(BigDecimal custo) {
        this.custo = custo;
    }

   
    public Evento custo(BigDecimal custo) {
        setCusto(custo);
        return this;
    }

   
    public Promoter getPromoter() {
        return this.promoter;
    }

   
    public void setPromoter(Promoter promoter) {
        this.promoter = promoter;
    }

   
    public Evento promoter(Promoter promoter) {
        setPromoter(promoter);
        return this;
    }
    
}
