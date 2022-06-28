public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//5) Faça um programa que carregue um vetor com sete números inteiros, calcule e mostre:
        //a. Os números múltiplos de 2
        //b. Os números múltiplos de 3;
        //c. Os números múltiplos de 2 e de 3.
        //Obs: Informar para o usuário caso não tenha números múltiplos em questão.
        int [] vetor = new int[7];
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i;
            if (vetor[i] % 2 == 0){
                System.out.println("multiplos de 2: " +vetor[i]);
            }
            if (vetor[i] % 3 == 0){
                System.out.println("multiplos de 3: " +vetor[i]);
            }
            if (vetor[i] % 2 == 0 && vetor[i] % 3 == 0){
                System.out.println("multiplos de 2 e 3: " +vetor[i]);
            }
        }