import java.util.ArrayList;
import java.util.List;

public class CadastroFuncionarios {
    
    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar(Funcionario func){
        listaFuncionarios.add(func);
    }

    public static List<Funcionario> getListaFuncionarios(){
        return listaFuncionarios;
    }

    public static List<Funcionario> getDesenvolvedor() {
        List<Funcionario> tempList = new ArrayList<>();

        for(Funcionario tempFunc: listaFuncionarios) {
            if (tempFunc instanceof Desenvolvedor) {
                tempList.add(tempFunc);
            }
        }

        return tempList;
    }
    public static List<Funcionario> getGerente() {
        List<Funcionario> tempList = new ArrayList<>();

        for(Funcionario tempFunc: listaFuncionarios) {
            if (tempFunc instanceof Gerente) {
                tempList.add(tempFunc);
            }
        }

        return tempList;
    }
    public static List<Funcionario> getEstagiario() {
        List<Funcionario> tempList = new ArrayList<>();

        for(Funcionario tempFunc: listaFuncionarios) {
            if (tempFunc instanceof Estagiario) {
                tempList.add(tempFunc);
            }
        }

        return tempList;
    }

    public static boolean excluir(int matricula) {

        for (Funcionario tempFuncionario : listaFuncionarios){
            if (tempFuncionario.getMatricula() == matricula) {
                listaFuncionarios.remove(tempFuncionario);
                return true;
            }
        }

        return false;

    }

}
