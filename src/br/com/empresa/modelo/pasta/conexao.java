package br.com.empresa.modelo.pasta;

public class conexao implements AutoCloseable{

    /**
    *
    * Teste de conexão - Curso Java Alura
    *
    *
    *@autor Evandro
    *@version 0.1
     */
    public conexao(){
        System.out.println("Abrindo Conexão.");
        //throw new IllegalStateException();
    }
    /**
    *
    *
    * Método ler dados - illegalStateException
    */
    public void lerDados(){
        System.out.println("Receebendo Dados.");
        throw new IllegalStateException();
    }
    /**
    *
    *
    * Método - close para fechar a conexão
    *
     */

    @Override
    public void close(){
        System.out.println("Fechando a Conexão.");
    }
}
