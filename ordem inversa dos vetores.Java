public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//3) Faça um programa que leia 10 valores e os armazene em um vetor.
        // Depois, imprima o vetor na ordem inversa.
        int [] valores = new int[10];
        for (int i = valores.length-1; i >= 0; i--){
            valores[i] = (i + 1);
            System.out.println(i);
        }