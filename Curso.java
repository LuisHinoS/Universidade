public class Curso {
    private String nome;
    private String coordenador;
    private Disciplina disciplina;
   

    public Curso(String coordenador, String nome, Disciplina disciplina) {
        this.coordenador = coordenador;
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
}
