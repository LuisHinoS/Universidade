public class Universidade {
    private String nome;
    private String endereco;
    private String cidade;
    private Unidade unidade;
    
    public Universidade(String nome, String endereco, String cidade, Unidade unidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.unidade = unidade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public Unidade getUnidade() {
        return unidade;
    }
    
    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
}
