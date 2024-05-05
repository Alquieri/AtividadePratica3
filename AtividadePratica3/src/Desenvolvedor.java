public class Desenvolvedor extends Funcionario implements Trabalhavel {

    String tecnologia;

    public Desenvolvedor(){

    }


    public Desenvolvedor(String nome, int matricula, String tecnologia) {
        super(nome, matricula);
        this.tecnologia = tecnologia;
    }


    public Desenvolvedor(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public int CalcularSalario() {
        return 0;
      
    
    }


    @Override
    public void Trabalhar() {

        System.out.println("O desenvolvesro está trabalhando");
   
    }


    @Override
    public void RelatarProgresso() {
        System.out.println("Progresso Desenvolvedor");
    }



}
