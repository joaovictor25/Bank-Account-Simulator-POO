public class UserInterface{
    
    public void showWelcomeScreen(){
        System.out.println("--------------------------------");
        System.out.println("Seja bem-vindo ao banco Abstrato");
        System.out.println("--------------------------------");
        System.out.println("Escolha o tiipo de conta que deseja abrir:");
        System.out.println("[1] - Conta Física");
        System.out.println("[2] - Conta Juridica");
    }

    public void showAccountPersonal(){
        System.out.println("------------------------------------");
        System.out.println("Cadastro da conta para Pessoa Fisica");
        System.out.println("------------------------------------");
        System.out.println("Por favor, digite as informações corretamente.");
    }

    public void showStatusAccount(String nome, Double saldo, boolean status){
        System.out.println("--------------------");
        System.out.println("Seja bem-vindo "+nome);
        System.out.println("--------------------");
        System.out.println("Saldo: "+saldo);
        String situacao = (status == true) ? "Ativa" : "Desativada";
        System.out.print("Status: "+situacao);
    }

    public void showUserMenu(){
        System.out.println("---------------------");
        System.out.println("Serviços da sua conta");
        System.out.println("---------------------");
        System.out.println("[1] - Depositar");
        System.out.println("[2] - Atualizar saldo");
        System.out.println("[3] - Sacar");
    }

    public void showLabel(String msg){
        System.out.print(msg);
    }


}