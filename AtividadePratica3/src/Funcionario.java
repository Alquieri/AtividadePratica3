import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {

    private String nome;
    private int matricula;

    

    private static List<Funcionario> listaFuncionarios = new ArrayList<>();


    public static void cadastrar(Funcionario func){
        listaFuncionarios.add(func);
    }

    






    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }




    public Funcionario() {
    }


    public String getNome() {
        return nome;
    }




    public void setNome(String nome) {
        this.nome = nome;
    }




    public int getMatricula() {
        return matricula;
    }




    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }



    @Override
    public String toString() {
      
        return "\nNome: " + nome + "\nMatricula: " + matricula ;

    }



    public abstract int CalcularSalario( );


    
}
