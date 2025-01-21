package ma.emsi;

public class Rtableau {
    private Object[] elements;
    private int taille;
    private int capacite;

    public Rtableau(int maxTaille) {
        if (maxTaille <= 0) throw new IllegalArgumentException("La capacité doit être positive.");
        this.elements = new Object[maxTaille];
        this.capacite = maxTaille;
        this.taille = 0;
    }

    public void ajouter(Object element) {
        if (taille == capacite) throw new IllegalStateException("Tableau plein.");
        elements[taille++] = element;
    }

    public boolean supprimer(Object element) {
        for (int i = 0; i < taille; i++) {
            if (elements[i].equals(element)) {
                elements[i] = elements[--taille];
                elements[taille] = null;
                return true;
            }
        }
        return false;
    }

    public boolean contenir(Object element) {
        for (int i = 0; i < taille; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int taille() {
        return taille;
    }

    public void vider() {

    }
}
