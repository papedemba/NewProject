import java.util.Scanner;

import modeles.Chambre;
import modeles.Pavillon;
import modeles.TypeChambre;
import services.IService;
import services.ServiceTableau;

public class App {
    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);
        IService service= new ServiceTableau();
        int choix=0;
         
         
        System.out.println("entrer un nombre");
        System.out.println("Entrer 1 pour ajouter chambre");
        System.out.println("Entrer 2 pour lister chambre");
        System.out.println("Entrer 3 pour ajouter pavillon");
        System.out.println("Entrer 4 pour afficher les pavillon");
        // Scanner sc = new Scanner(System.in);

        do{
            choix = sc.nextInt();



        if(choix==3){
            Pavillon pavillon = new Pavillon();

            service.ajouterPavillon(pavillon);


        } else if(choix==4){

            service.listerPavillon();

        }
        else if(choix==1){
            Chambre chambre = new Chambre();

            service.ajouterChambre(chambre);

        }
        else if(choix==2){
           

            service.listerChambre();

        }
    }
    while(choix!=5);

    


        //     IService service = new ServiceTableau();
        //  Chambre chambre = new Chambre();
 
        //  Pavillon pavillon = new Pavillon();
        //  pavillon.setId(1);
 
        //  chambre.setId(1);
        //  chambre.setNumero("ch001");
        //  chambre.setEtage("2");
        //  chambre.setType(TypeChambre.DOUBLE);
        //  chambre.setPavillon(pavillon);
 
        //  service.ajouterChambre(chambre);
        //   nombre=sc.nextInt();

        //  service.listerChambre();
        //  System.out.println(chambre);
                
          
         // System.out.println("Hello, World!");
         
        
         
        
        

        // System.out.println("vous avez entrer " + nombre );
        // 

         
 
     }

        
    }

