public class Unidade {
    private String nome;
    private String gestor;
    private Curso curso;
    
    public Unidade(String nome, String gestor, Curso curso) {
        this.nome = nome;
        this.gestor = gestor;
        this.curso = curso;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getGestor() {
        return gestor;
    }
    
    public void setGestor(String gestor) {
        this.gestor = gestor;
    }
    
    public Curso getCurso() {
        return curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}

