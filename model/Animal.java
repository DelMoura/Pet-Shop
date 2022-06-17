package model;

public class Animal {
    private String name;
    private String sexo;
    private String raca;
    private String descricao;
    private boolean vacinado;
    private Cliente dono;
    private String codDoAnimal;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isVacinado() {
        return vacinado;
    }
    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }
    public Cliente getDono() {
        return dono;
    }
    public void setDono(Cliente dono) {
        this.dono = dono;
    }
    public String getCodDoAnimal() {
        return codDoAnimal;
    }
    public void setCodDoAnimal(String codDoAnimal) {
        this.codDoAnimal = codDoAnimal;
    }

    //public void cadastroAnimal(){}
    
    //public Animal animaisCadastrados(){}

    

    
}
