package Model;

public class Promoter {
    private Long id;
    private String nome;
    private String telefone;

   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Promoter id(Long id) {
        setId(id);
        return this;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Promoter nome(String nome) {
        setNome(nome);
        return this;
    }

    public String getTelefone() {
        return this.telefone;
    }
   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Promoter telefone(String telefone) {
        setTelefone(telefone);
        return this;
    }

}
