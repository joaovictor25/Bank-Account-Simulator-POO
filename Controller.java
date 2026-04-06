public class Controller{
    private InputData input;
    private UserInterface view;
    private ServiceAccount business;
    private User User;

    private double depositoAtual;
    private double valorAtual;

    private int opcao = 0 ;

    public Controller(){
        input = new InputData();
        view = new UserInterface();
        business = new ServiceAccount();
        User = new User();
    }

    public void start(){
        view.showWelcomeScreen();
        view.showLabel("Escolha uma opção: ");
        opcao = input.chooseAccount();
        if(opcao == 1){
            runPersonalAccount();
        }else{
            System.out.println("Não foi");
        }
    }

    private void runPersonalAccount(){
        view.showAccountPersonal();

        view.showLabel("Primeiro nome: ");
        User.setName(input.readUserName());
        view.showLabel("Digite o sobrenome: ");
        User.setLastName(input.readUserLastName());
        view.showLabel("Data de nascimento: ");
        User.setDate(input.readUserDate());
        view.showLabel("Digite seu cep: ");
        User.setCep(input.readUserCep());
        view.showLabel("Digite seu endereço: ");
        User.setAddress(input.readUserAddress());
        view.showLabel("Digite seu cidade: ");
        User.setCity(input.readUserCity());
        view.showLabel("Digite seu estado: ");
        User.setEstate(input.readUserState());

        view.showStatusAccount(User.getName(), 0.0, true);
        view.showUserMenu();

        view.showLabel("Escolha uma operação: ");
        opcao = input.readMenuOption();

        switch(opcao){
            case 1:
                view.showLabel("Valor para depositar: ");
                User.setDeposit(input.readDepositAmount());
                depositoAtual = business.calcularDeposito(Double.parseDouble(User.getDeposit()));
                view.showStatusAccount(User.getName(), depositoAtual, true);
                break;
            case 2:
                view.showStatusAccount(User.getName(), depositoAtual, true);
                break;
            case 3:
                view.showLabel("Quanto deseja sacar? R$ ");
                User.setCash(input.readWithdrawal());
                valorAtual = business.sacar(Double.parseDouble(User.getCash()));
                view.showStatusAccount(User.getName(), valorAtual, true);
                break;
            default:
                System.out.println("Erro: Escolha uma opção valida");
        }

    }   
}