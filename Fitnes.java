import java.util.Scanner;

public class Fitnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double proteina = 0;
        double carbo = 0;
        double gordura = 0;
        double calorias = 0;
        double creatina = 0;
        double agua = 0;
        double imc = 0;

        int opcao = 1;
        while(opcao != 0){
            System.out.println("    |===============MENU================|");
            System.out.println("1 - | Calcular IMC                      |");
            System.out.println("2 - | Calcular o consumo de creatina    |");
            System.out.println("3 - | Vamos fazer um calculo de consumo |");
            System.out.println("4 - | Consumo de água por dia           |");
            System.out.println("5 - |        Dados completos            |");
            System.out.println("0 - |      Encerrar atividades          |");
            System.out.println("     ===================================");
            System.out.print("Escolha: \n");
            opcao = sc.nextInt();

            if(opcao == 1){
                System.out.println("\n(kg)| Digite o seu peso:\n");
                double peso = sc.nextDouble();

                System.out.println("\n(m)| Digite a sua altura: \n");
                double altura = sc.nextDouble();

                imc = peso / (altura * altura);
                System.out.printf("\nSeu IMC é: %.2f%n\n", imc);

                if(imc < 18.5){
                    System.out.println(" \nVocê está Abaixo do peso\n");
                }else if(imc < 25){
                    System.out.println("\n Você está no Peso normal\n");
                }else{
                    System.out.println("\nVocê está em Sobrepeso\n");
                }

            }else if(opcao == 2){
                System.out.println("\nDigite seu peso(kg): \n");
                double peso = sc.nextDouble();

                creatina = peso * 0.03;

                System.out.printf("\nDose diaria de creatina:%.1f g%n \n", creatina);

            }else if(opcao == 3){
                int num = 1;

                while(num != 0){
                    System.out.println("\n  ====FAIXAS POR KG DE PROTEÍNA===");
                    System.out.println("1 -|      Básico saúdavel           |");
                    System.out.println("2 -|    Consumo para hipertrofia    | ");
                    System.out.println("3 -|    Consumo para atleta         |\n");
                    System.out.println("    ====FAIXAS POR KG DE GORDURA====");
                    System.out.println("4 -|    Calcular consumo de gordura |\n");
                    System.out.println("   ===FAIXAS POR KG DE CARBOIDRATO==");
                    System.out.println("5 -| Calcular consumo de carboidrato|");
                    System.out.println("0 -|           Finalizar            |");
                    System.out.println("    ================================");
                    System.out.print("     Escolha: \n");
                    num = sc.nextInt();

                    if(num == 1){
                        System.out.println("\n(kg)| Digite seu peso: \n");
                        double ps = sc.nextDouble();
                        proteina = ps * 1.6;
                        System.out.println("\nConsumo de proteína para ser saúdavel: \n"+ proteina);

                    }else if(num == 2){
                        System.out.println("\n(kg)| Digite seu peso: \n");
                        double ps = sc.nextDouble();
                        proteina = ps*2.0;
                        System.out.println("\nConsumo de proteína para hipertrofia: \n" + proteina);

                    }else if(num == 3){
                        System.out.println("\n(kg)| Digite seu peso: \n");
                        double ps = sc.nextDouble();
                        proteina = ps*2.2;
                        System.out.println("\nConsumo de proteína para um atleta: \n" + proteina);

                    }else if(num == 0){
                        System.out.println("\nEncerrando...\n");

                    }else if(num == 4){
                        System.out.println("\n(kg) | Digite seu peso:\n");
                        double ps = sc.nextDouble();
                        gordura = ps * 0.8;
                        System.out.println("\nConsumo ideal de gordura: \n" + gordura);

                    }else if(num == 5){
                        System.out.println("\nPrimeiro vamos calcular o consumo diario de calorias\n");
                        System.out.println("(kg) | Digite seu peso:");
                        double ps = sc.nextDouble();
                        System.out.println("\n(m) - | Digite sua altura:\n");
                        double alt = sc.nextDouble();
                        System.out.println("\nDigite sua idade:\n");
                        int idade = sc.nextInt();
                        System.out.println("| 1.2 - Sedentário     |");
                        System.out.println("| 1.55 - Treino normal |");
                        System.out.println("| 1.7 - Treino pesado  |");
                        System.out.println("Digite o número referente a seu nível de atividade:\n");
                        double atividade = sc.nextDouble();

                        calorias = ((10 *ps) + (6.25 * (alt * 100)) - (5 * idade) + 5) * atividade + 300;
                        System.out.println("\nConsumo ideal de calorias: \n" + calorias);

                        int a2 = 1;
                        while(a2 != 0){
                            System.out.println("1 - | Vamos calcular o carbo |");
                            System.out.println("0 - |         Finalizar      |");
                            a2 = sc.nextInt();

                            if(a2 == 1){
                                System.out.println("Digite seu peso: "); 
                                double psk = sc.nextDouble();
                                proteina = psk * 2.0;
                                gordura = psk * 0.8;
                                carbo = (calorias -(proteina * 4 + gordura * 9)) / 4;
                                System.out.printf("\nCarboidrato: %.2f%n\n", carbo);

                            }else if(a2 == 0){
                                System.out.println("\nEncerrando...");

                            }else{
                                System.out.println("\nErro ");
                            }
                        }

                    }else{
                        System.out.println("Opção errada");
                    }
                }

            }else if(opcao == 4){
                System.out.println("\nDigite seu peso: \n");
                double peso = sc.nextDouble();

                agua = ( peso * 35) / 1000;
                System.out.println("\nVocê precisa ter um consumo de água de " + agua);

            }else if(opcao == 5){
                System.out.println("Seus dados:");
                System.out.printf("Proteina: %.1f%n" , proteina );
                System.out.printf("Carboidrato: %.1f%n", carbo);
                System.out.printf("Gordura: %.1f%n", gordura);
                System.out.printf("Calorias: %.1f%n" , calorias );
                System.out.printf("Creatina: %.1f%n", creatina );
                System.out.printf("Água: %.1f%n", agua);
                System.out.printf("Seu IMC: %.1f%n", imc);

            }else{
                System.out.println("Digitação invalida");
            }
        }

        sc.close();
    }
}