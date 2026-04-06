public class User{
    private String nome;
    private String sobrenome;
    private String data;
    private String cep;
    private String endereco;
    private String cidade;
    private String estado;

    private String deposito;
    private String sacar;

    public void setName(String nome){
        this.nome = nome;
    }
    public String getName(){
        return this.nome;
    }

    public void setLastName(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getLastName(){
        return this.sobrenome;
    }

    public void setDate(String data){
        this.data = data;
    }
    public String getDate(){
        return this.data;
    }

    public void setCep(String cep){
        this.cep = cep;
    }
    public String getCep(){
        return this.cep;
    }

    public void setAddress(String endereco){
        this.endereco = endereco;
    }
    public String getAddress(){
        return this.endereco;
    }

    public void setCity(String cidade){
        this.cidade = cidade;
    }
    public String getCity(){
        return this.cidade;
    }

    public void setEstate(String estado){
        this.estado = estado;
    }
    public String getEstate(){
        return this.estado;
    }

    public void setDeposit(String deposito){
        this.deposito = deposito;
    }
    public String getDeposit(){
        return this.deposito;
    }

    public void setCash(String sacar){
        this.sacar = sacar;
    }
    public String getCash(){
        return this.sacar;
    }
}