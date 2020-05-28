package exo1;

/**
 * Produit_Derive
 */
public class Produit_Derive {

    private String reference;
    private String type;

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    Produit_Derive(String reference, String type) {
        this.reference = reference;
        this.type = type;
    }

    @Override
    public String toString() {
        return "---------------------- Produit_Derive ----------------------\n    reference: " + reference + "\n    type: " + type;
    }

    public void display() {
        System.out.println(toString());
    }
}