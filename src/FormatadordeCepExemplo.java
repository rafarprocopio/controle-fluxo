public class FormatadordeCepExemplo {
    public static void main(String[] args) {
        String cepFormatado = formatarCep("29102912")
        System.out.println(cepFormatado);
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}