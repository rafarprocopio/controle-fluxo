public class ExemploForArray {

    public static void main(String[] args) {

        //em Arrays, o indice de elementos inicia em zero
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
            } 

        //exemplo for each - forma abreviada
        for(String aluno : alunos) {
            System.out.println(alunos);
          }
    }
}