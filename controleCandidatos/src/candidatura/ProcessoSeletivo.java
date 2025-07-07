package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        selecaoDeCandidatos();

//        analisarCandidato(1900.0);
//        analisarCandidato(2200.0);
//        analisarCandidato(2000.0);
    }
    static void selecaoDeCandidatos(){

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        String candidatos[] = {"FELIPE", "MARCIA", "JÚLIA", "PAULO", "AUGUSTO", "MONICA", "FABRÍCIO", "MIRELA", "JORGE"};

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Soliciotou  este valor de salário: "+ salarioPretendido);
            if (salarioBase >= salarioPretendido){

                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
                System.out.println("-------------------------------------------------------");
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
