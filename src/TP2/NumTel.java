package TP2;
public class NumTel {
    private String numero;
    private String code; // Exemples: "portable", "fixe pro", "fixe domicile", "fax"

    public NumTel(String numero, String code) {
        this.numero = numero;
        this.code = code;
    }

    public String getNumero() {
        return numero;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + ": " + numero;
    }
}
