package listaconcat;

import java.io.*;





public class listaConcat {
    public static void main(final String[] args) throws Exception {
        
        final lista n = new lista();
        final InputStreamReader in = new InputStreamReader(System.in);
        final BufferedReader tastiera = new BufferedReader(in);

        //inserire elementi
        
        
        
        Rubrica Persona = new Rubrica();

     

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
            
            Persona.persona = Persona.Nome + "\t" +  Persona.Cognome;
        
            n.inserisci(Persona.persona);

        }    
        //eliminare un elemento 
        n.stampa();
        n.elimina();
        n.stampa(); 
        
    }
    

}
      


