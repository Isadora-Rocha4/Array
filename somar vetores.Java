public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// 2) Faça um programa que leia 10 valores e os armazene em um vetor. Depois, o programa deve somar todos os
      // valores do vetor e apresentar o resultado.
        int [] valores = new int[10];
        int soma = 0;
        for (int i = 0; i < valores.length; i++){
            valores[i] = (i);
            soma += valores[i];
            System.out.println("valores: " +i);
        }
        System.out.println("a soma dos valores são: "+soma);