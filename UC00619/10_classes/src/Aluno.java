public class Aluno {

    private final String nome;
    private String turma;
    private double media;
    private int horasFalta;

    public Aluno(String nome, String turma, double media) {
        this.nome = nome;
        this.turma = turma;
        this.media = media;
        this.horasFalta = 0;
    }


    void addFalta(int horasFalta) { // func 1
        // criar um log com as alterações
        this.horasFalta += horasFalta;
    }


    void addFalta() { // func 2
        // this.horasFalta += horasFalta;
        addFalta(4);
    }




    public int getHorasFalta() {
        return horasFalta;
    }


    public String getNome() {
        return nome;
    }

    // public void setNome(String nome) {this.nome = nome; } // sendo o nome final não pode ser mudado


    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }


    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }


    @Override
    public String toString() {
        return "Aluno{nome=" + nome + ", Media: " + this.media + '}';
    }
}
