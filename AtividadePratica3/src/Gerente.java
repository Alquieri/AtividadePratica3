public class Gerente extends Funcionario implements Trabalhavel {

    String equipe;
    int bonus = 1500;
    

    public Gerente(String nome, int matricula, String equipe, int bonus) {
        super(nome, matricula);
        this.equipe = equipe;
        this.bonus = bonus;
    }

    public Gerente(String equipe, int bonus) {
        this.equipe = equipe;
        this.bonus = bonus;
    }

    public Gerente(String nome, int matricula, String nomeProjeto) {
        
    }


    @Override
    public void Trabalhar() {
        System.out.println("O gerente está trabalhando");

        
    }

    @Override
    public void RelatarProgresso() {
        System.out.println("Progresso Gerente");
       
    }

   

    @Override
    public int CalcularSalario() {
        
        return 7000 + 1500 ;
        
    }
    }


