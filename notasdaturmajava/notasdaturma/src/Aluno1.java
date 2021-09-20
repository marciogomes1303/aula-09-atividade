public class Aluno1 {
    private String nomealunoum;
    private Double notaalunoum;

    public void setNomealunoum(String nomealunoum) {
        this.nomealunoum = nomealunoum;
    }

    public void setNotaalunoum(double notaalunoum) {
        this.notaalunoum = notaalunoum;
    }

    public String getNomealunoum() {
        return this.nomealunoum;
    }

    public Double getNotaalunoum() {
        return this.notaalunoum;
    }

    public String toString() {
        return this.notaalunoum + "e" + this.notaalunoum + "São esses";
    }

}
