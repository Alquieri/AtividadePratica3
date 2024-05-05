public class Estagiario extends Funcionario  implements Trabalhavel{


    String supervisor;
    int horasTrabalho;

    public Estagiario(){

    }


    public Estagiario(String nome, int matricula, String supervisor, int horasTrabalho) {
        super(nome, matricula);
        this.supervisor = supervisor;
        this.horasTrabalho = horasTrabalho;
    }


    public Estagiario(String supervisor, int horasTrabalho) {
        this.supervisor = supervisor;
        this.horasTrabalho = horasTrabalho;
    }


    @Override
    public int CalcularSalario() {
        
        return 1320 ;

    }


    @Override
    public void Trabalhar() {
    System.out.println("O estagiario está trabalhando");

    }



    @Override
    public void RelatarProgresso() {
        System.out.println("Progresso Estagiario");
    }



}
