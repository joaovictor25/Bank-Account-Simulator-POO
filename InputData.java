import java.util.Scanner;


public class InputData{
    Scanner input = new Scanner(System.in);
    UserInputValidator Validator = new UserInputValidator();

    public int chooseAccount(){
        return Validator.validator(input, 2);
    }

    public String readUserName(){
        return Validator.validatorText(input, "Primeiro nome: ");
    }

    public String readUserLastName(){
        return Validator.validatorText(input, "Sobrenome: ");
    }

    public String readUserDate(){
        return Validator.validatorDate(input, "Data: ");
    }

    public String readUserCep(){
        return Validator.validatorCep(input, "CEP: ");
    } 

    public String readUserAddress(){
        return Validator.validatorText(input, "Endereço: ");
    }

    public String readUserCity(){
        return Validator.validatorText(input, "Cidade: ");
    }

    public String readUserState(){
        return Validator.validatorText(input, "Estado: ");
    }

    public int readMenuOption() {
        return Validator.validator(input, 3);
    }

    public String readDepositAmount(){
        return input.nextLine();
    }

    public String readWithdrawal(){
        return input.nextLine();
    }
}