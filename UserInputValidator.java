import java.util.Scanner;

public class UserInputValidator{
    
    public int validator(Scanner input, int menu){
        while(true){
            try{
                int conta = Integer.parseInt(input.nextLine());
                if(conta > 0 && conta <= menu){
                    return conta;
                }
                System.out.println("[ESCOLHA UMA OPÇÃO VÁLIDA: 1 OU 2]");
            }catch(NumberFormatException e){
                System.out.println("[ESCOLHA UMA OPÇÃO QUE EXISTE NO MENU]");
            }
        }
    }

    public String validatorText(Scanner input, String msg){
        while(true){
            String nome = input.nextLine();
            if(nome.matches("[a-zA-ZÀ-ÿ0-9 ]+")){
                return nome;
            }
            System.out.println("[DIGITE APENAS LETRAS]");
            System.out.print(msg);
        }
    }

    public String validatorDate(Scanner input, String msg){
        while(true){
            String data = input.nextLine();
            if(data.matches("\\d+(\\/\\d+)*")){
                return data;
            }
            System.out.println("[DIGITE UMA DATA VALIDA]");
            System.out.print(msg);
        }
    }

    public String validatorCep(Scanner input, String msg){
        while(true){
            String cep = input.nextLine();
            if(cep.matches("\\d*")){
                if(cep.length() >= 8){
                    return cep.substring(0,5)+ "-" +cep.substring(5);
                }else{
                    return cep;
                }
            }
            System.out.println("[DIGITE UM CEP VALIDO]");
            System.out.print(msg);
        }
    }
}