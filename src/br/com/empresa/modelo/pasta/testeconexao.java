package br.com.empresa.modelo.pasta;

public class testeconexao {
    public static void main(String[] args) {
    /**
    *Try catch para o teste da conexão
    *
     */
        try( conexao novaConexao = new conexao()){
            novaConexao.lerDados();
        }catch(IllegalStateException exception){
            System.out.println("Deu ruim na conexao.");
        }


        //--------------------------------------------------------------------------

//        conexao conexao = null;
//
//        try{
//            conexao = new conexao();
//            conexao.lerDados();
//        }catch (IllegalStateException exception){
//            System.out.println("Deu ruim na Conexão.");
//        }finally {
//            System.out.println("Finally");
//            if( conexao != null){
//                conexao.close();
//            }
//        }
    }
}
