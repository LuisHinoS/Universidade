    public class Disciplina {
        private String nome;
        private String professor;
        private int cargaHoraria;
       
    
        public Disciplina(String professor, String nome, int cargaHoraria) {
            this.professor = professor;
            this.nome = nome;
            this.cargaHoraria = cargaHoraria;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getProfessor() {
            return professor;
        }

        public void setProfessor(String professor) {
            this.professor = professor;
        }

       public int getCargaHoraria() {
        return cargaHoraria;
       } 

       public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
       }

    }