/*
 * Copyright (C) 2024 Kayque de Freitas <kayquefreitas08@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package heranca.kayquedefreitas;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 17/03/2024
 * @brief Class Principal
 */
import java.util.*;
public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // Cria um objeto Scanner para entrada do usuário
        
        // Declaração das variáveis
        int ano, assentos, eixos, cavalos, portas, cilindradas, opcao=0 ;
        String placa;
        
        // Loop principal que continua até que o usuário escolha a opção 5 para sair
        while (opcao != 5){ 
            
            // Exibe o menu de opções para o usuário
            System.out.println("Escolha um Veioculo: \n1 Onibus \n2 Carro \n3 Motocicleta \n4 Caminhão \n5 Sair");
           
             // Lê a opção escolhida pelo usuário
            opcao = ler.nextInt();
            
            // Verifica qual opção foi escolhida pelo usuário e executa a ação correspondente
           if (opcao == 1){
               
                System.out.println("Informe a Placa do do Veiculo: ");
                placa = ler.next();
                
                System.out.println("Informe a quantos Assentos: ");
                assentos = ler.nextInt();

                System.out.println("Informe o Ano do Veiculo: ");
                ano = ler.nextInt();
                
                // Cria uma instância de ônibus com os dados fornecidos e exibe as informações
               Onibus onibus = new Onibus(placa, ano, assentos);
               System.out.println(onibus);
               
           }else if(opcao == 2){
               System.out.println("Qual e a Placa do Carro?");
               placa = ler.next();
               
               System.out.println("Informe o ano do carro:");
               ano = ler.nextInt();
               
               System.out.println("Informe quantas portas o Carro tem?");
               portas = ler.nextInt();
               
               System.out.println("Quantos cavalos o carro tem?");
               cavalos = ler.nextInt();
               
               // Cria uma instância de carro com os dados fornecidos e exibe as informações
               Carro carro = new Carro (placa, ano, cavalos, portas);
               System.out.println(carro);
               
            }else if (opcao == 3) {
                System.out.println("Informe a Placa do Veiculo: ");
                placa = ler.next();
                
                System.out.println("Informe o Ano do Veiculo: ");
                ano = ler.nextInt();
                
                System.out.println("Informe as cilindradas da motocicleta: ");
                cilindradas = ler.nextInt();
                
                // Cria uma instância de Motocicleta com os dados fornecidos e exibe as informações
                Motocicleta moto = new Motocicleta(placa, ano, cilindradas);
                System.out.println(moto);
                
            }else if (opcao == 4) {
                System.out.println("Informe a Placa do Veiculo: ");
                placa = ler.next();
                
                System.out.println("Informe o Ano do Veiculo: ");
                ano = ler.nextInt();
                
                System.out.println("Informe a quantidade de eixos do caminhão: ");
                eixos = ler.nextInt();
                
                // Cria uma instância de Caminhao com os dados fornecidos e exibe as informações
                Caminhao caminhao = new Caminhao(placa, ano, eixos);
                System.out.println(caminhao);
                
            }else if (opcao == 5) {
                //mensagem para saida do programa
                System.out.println("Saindo do programa...");
            } else {
                //caso nem uma das opcoes forem atendidads
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
    }
}
