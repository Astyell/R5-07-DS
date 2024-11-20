public class Q5 {
    public static void main(String[] args) 
    {
        int nombre = 0;
        String chaine = "";
      
        // Vérification du nombre d'arguments
    		if (args.length != 1) 
    		{
    			System.err.println("Erreur, utilisez le format suivant : java Q3 3");
    			System.exit(0);
    		}
  
        try 
  			{
  				nombre = Integer.parseInt(args[0]);
  			}
  			catch (Exception e) 
  			{
  				System.err.println("L'argument doit être un nombre");
  				System. exit(0);
  			}
      
        for (int i = 0; i < nombre; i++)
        {
            for (int j = i; j < nombre; j++)
            {
                chaine +="x"; 
            }
            chaine += "\n";
        }

        System.out.println(chaine);     
    }
}
