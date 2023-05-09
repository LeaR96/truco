package Model;

public class Carta  {
    private Integer numero;
    private Integer valor;
    private String palo;
    private Integer valorEnvido;

    public Carta(Integer numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return numero + " " + palo + ", valor = " + valor;
    }

    public Integer getValorEnvido() {
        return valorEnvido;
    }
    public void setValorEnvido(Integer valorEnvido) {
        this.valorEnvido = valorEnvido;
    }
}
