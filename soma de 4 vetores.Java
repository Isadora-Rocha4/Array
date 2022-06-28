public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 //7) Faça um programa que calcule a soma dos vetores, elemento a elemento, em um terceiro vetor.
        // O tamanho do vetor deverá ser 4.
        int[] vetor = new int[4];
        for (int i = 0; i < 4; i++){
            System.out.println("digite 3 valores");
            vetor[0] = scan.nextInt();
            vetor[1] = scan.nextInt();
            vetor[2] = scan.nextInt();
            System.out.println("digitados: "+vetor[0]+" + "+vetor[1]+" + "+vetor[2]);
            vetor[3] = vetor[0]+vetor[1]+vetor[2];
            System.out.println(vetor[3]);
        }
        int[] vetor2 = {0,1,2,3};
        int soma = 0;
        for (int i = 0; i < 4; i++){
            System.out.println(vetor2[i]);
            soma += vetor2[i]; // soma = vetor2[i]+soma;
        }
        System.out.println("soma: "+soma);