public class App {
    public static void main(String[] args) throws Exception {
        
        Persona p = new Persona("Giorgio", "La Pira");

        Persona p2 = new Persona("Alessandro", "Volta", "+39345628399");

        Rubrica rubrica = new Rubrica();

        rubrica.addContatto(p);
        rubrica.addContatto(p2);

        Persona personaCercata = rubrica.cercaContattoPerCognome("la pira");

        if (personaCercata != null)  {
            System.out.println("Nome: " + personaCercata.nome);
            System.out.println("Cognome: " + personaCercata.cognome);
            System.out.println("Telefono: " + personaCercata.telefono);
        } else {
            System.out.println("nessun elemento in rubrica");
        }
    }
}
