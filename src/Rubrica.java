public class Rubrica {

    Persona[] elenco;
    int ultimoContattoInserito = 0;

    public Rubrica(int maxContatti)  {
        elenco = new Persona[maxContatti];
    }

    public Rubrica()  {
        elenco = new Persona[50];
    }

    public void addContatto(Persona contatto)  {
        elenco[ultimoContattoInserito] = contatto;
        ultimoContattoInserito = ultimoContattoInserito+1;
    }

    public Persona cercaContattoPerCognome(String cognome)  {
        for (int i=0; i < elenco.length; i=i+1)  {
            if (elenco[i] != null && elenco[i].cognome.equalsIgnoreCase(cognome))
                return elenco[i];
        }

        return null;
    }

    public Persona cercaContattoPerNome(String nome)  {
        return null;   
    }

    public Persona[] cercaContattiPerCognome(String cognome)  {
        return null;
    }

    public Persona[] cercaContattiPerNome(String nome)  {
        return null;
    }
}
