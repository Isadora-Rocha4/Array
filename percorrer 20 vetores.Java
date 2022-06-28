public static void main(String[] args) {
        //o length é para o vetor usar o seu próprio
        //tamanho, ao invés de determinar

     Scanner scan = new Scanner(System.in);
//   1) Escreva um programa que leia 20 valores inteiros e os armazene em um vetor.
//    Depois de ler os 20 valores, o programa deve percorrer o vetor
//    e mostrar na tela apenas os números pares que foram armazenados.
    int[] vetor = new int[20];
    for (int i = 0; i < vetor.length; i++) {
        vetor[i] = (i);
        if (i % 2 == 0) {
            System.out.println("numeross pares: " + i);
        }
        