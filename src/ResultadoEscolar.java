public class ResultadoEscolar {
/**
 * @param args
 */
public static void main(String[] args) {
      int nota = 6;
       
    if(nota >= 7){
     System.out.println("Aprovado");

    }else if (nota >= 5 && nota < 7){
     System.out.println("Prova de Recuperação");
     
    }else{
     System.out.println("Reprovado");
    }
    //nova forma melhorada de escrever
    String resultado = nota >=7 ? "Aprovado" : "Reprovado";
    System.out.println(resultado);

    //nova segunda forma melhorada de escrever
    String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
    System.out.println(resultado);
        }    
}