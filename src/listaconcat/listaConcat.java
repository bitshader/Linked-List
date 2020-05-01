package listaconcat;

import java.io.*;





public class listaConcat {

    
    public static void main(final String[] args) throws Exception {
        
        final lista n = new lista();
        final InputStreamReader in = new InputStreamReader(System.in);
        final BufferedReader tastiera = new BufferedReader(in);
        int scelta = 0;

        //inserire elementi
 
        Rubrica Persona = new Rubrica();
        scelta = inserimento();

        for (int i = 0; i < 3; i++){
            
            System.out.println("INSERISCI NOME");
            try {
                
                Persona.Nome = tastiera.readLine();
                
                
    
            } catch (final Exception e){
                System.out.println("errore");
            } 
            
            

            System.out.println("INSERISCI COGNOME");
            try {
                
                Persona.Cognome = tastiera.readLine();
                
                
    
            } catch (final Exception e){
                System.out.println("errore");
            } 

            System.out.println("INSERISCI COLORE PREFERITO");
            try {
                
                Persona.colorePreferito = tastiera.readLine();
                
                
    
            } catch (final Exception e){
                System.out.println("errore");
            } 

            System.out.println("INSERISCI NUMERO TELEFONO");
            try {
                
                Persona.numeroTelefono = tastiera.readLine();
                
                
    
            } catch (final Exception e){
                System.out.println("errore");
            } 

            
            //switch case 
            

            switch(scelta){
                case 1: Persona.persona = Persona.Nome + "\t" +  Persona.Cognome+ "\t" +  Persona.numeroTelefono + "\t" +  Persona.colorePreferito;  
                case 2: Persona.persona = Persona.Cognome + "\t" +  Persona.Nome+ "\t" +  Persona.numeroTelefono + "\t" +  Persona.colorePreferito;  
                case 3: Persona.persona = Persona.Nome + "\t" +  Persona.Cognome+ "\t" +  Persona.colorePreferito + "\t" +  Persona.numeroTelefono;  
                case 4: Persona.persona = Persona.Cognome + "\t" +  Persona.Nome+ "\t" +  Persona.colorePreferito + "\t" +  Persona.numeroTelefono;  
                default:Persona.persona = Persona.Nome + "\t" +  Persona.Cognome+ "\t" +  Persona.numeroTelefono + "\t" +  Persona.colorePreferito;  
            }
            
            
            n.inserisci(Persona.persona);

        }    
        //eliminare un elemento 
        n.stampa(scelta);
        n.elimina(scelta);
        n.stampa(scelta); 
        
    }

    private static int inserimento() {

        int scelta = 0;
        final InputStreamReader in = new InputStreamReader(System.in);
        final BufferedReader tastiera = new BufferedReader(in);

        System.out.println("IN che ordine si vogliono inserire le persone in rubrica?");
        System.out.println("1 NOME/COGNOME/NUMERO/colore Preferito");
        System.out.println("2 COGNOME/NOME/NUMERO/colore Preferito");
        System.out.println("3 NOME/COGNOME/colore Preferito/NUMERO");
        System.out.println("4 COGNOME/NOME colore Preferito/NUMERO");
        
        try {
                
            scelta = tastiera.read();
            
            

        } catch (final Exception e){
            System.out.println("errore");
        } 

        return scelta;
    }
    
    
}
      


