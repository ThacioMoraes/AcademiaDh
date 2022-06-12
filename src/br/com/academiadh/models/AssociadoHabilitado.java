package br.com.academiadh.models;

public class AssociadoHabilitado extends Associado{
    private double custoPiscina;
    private boolean habilitado;

    public AssociadoHabilitado(String nome, String numero, String atividade, double valor, double custoPiscina){
        super(numero, nome, atividade, valor);
        this.custoPiscina = custoPiscina;
        this.habilitado = false;
    }

    public AssociadoHabilitado(String nome, String numero, String atividade, double valor, double custoPiscina, boolean habilitado){
        super(numero, nome, atividade, valor);
        this.custoPiscina = custoPiscina;
        this.habilitado = habilitado;
    }

    public void fazExame(boolean aprovado){
        this.habilitado = aprovado;
    }

    @Override
    public double custoMensal(){
        if(this.habilitado){
            return super.custoMensal() + this.custoPiscina;
        } else {
            return super.custoMensal();
        }
    }
}
