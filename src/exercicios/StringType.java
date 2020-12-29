package exercicios;

public class StringType {
  public static void main(String[] args) {

    System.out.println("Olá Pessoal".charAt(2));

    String s = "Boa Tarde";
    System.out.println(s.concat("!!!"));
    System.out.println(s+"!!!");
    System.out.println(s.startsWith("Boa"));
    System.out.println(s.toLowerCase().startsWith("boa"));
    System.out.println(s.length());
    System.out.println(s.endsWith("Tarde"));
    System.out.println(s.toLowerCase().endsWith("tarde"));
    System.out.println(s.equalsIgnoreCase("BOA TARDE"));
    System.out.println(s.equals("Boa tarde"));

    String nome = "Pedro";
    String sobrenome = "Oliveira";
    int idade = 21;
    double salario = 12345.67;

    System.out.println("Nome: " + nome
            + "\nSobrenome: " + sobrenome
            + "\nIdade: " + idade
            + "\n\n"
    );

    System.out.printf("O usuário %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);

    String frase = String.format("\nO usuário %s %s tem %d anos e ganha R$%.2f",
            nome, sobrenome, idade, salario);

    System.out.println(frase);

    System.out.println("Frase qualquer".contains("qual"));

    System.out.println("Frase qualquer".substring(6, 10));
    System.out.println("Frase qualquer".substring(6));
  }
}
