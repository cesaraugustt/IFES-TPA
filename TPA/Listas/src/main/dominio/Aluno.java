package main.dominio;

/**
 *
 * @author victoriocarvalho
 */
public class Aluno {

    private String nome;
    private int matricula;
    private int nota;
      
    public Aluno(int matricula ,String nome, int nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }
    
    
    @Override
    public boolean equals(Object a){
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Aluno aluno = (Aluno) a;
        return nome != null && nome.equals(aluno.nome);
    }
    
    @Override
    public String toString(){
        return "Matricula: " + matricula + " | Nome: " + nome + " | Nota: " + nota;
    }


    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }
}