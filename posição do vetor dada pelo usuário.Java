public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 //6) Faça um programa que LEIA um vetor de 10 elementos e em seguida ache a posição do elemento m
        // (dado pelo usuário) no vetor. Caso o elemento não exista no vetor informe ao usuário.
        int [] vetor = new int [10];
        for (int i = 0; i < 10; i++){
            vetor[i] = i;
            System.out.println("vetor: [" +vetor[i]+ "]");

//            System.out.println("insira um valor no vetor "+i+ " :");
//            vetor[i] = scan.nextInt();
        }
        for (int f = 0; f < 10; f++){
            System.out.println("digite a posição do vetor: ");
            f = scan.nextInt();
            System.out.println("na posição "+f+" tem o vetor " +vetor[f-1]);
            if (f > 10){
                System.out.println("vetor inválido!");
            }
        }