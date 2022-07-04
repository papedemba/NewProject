package services;

import modeles.Etudiant;
import modeles.Pavillon;
import modeles.Rp;

import java.util.Scanner;

import javax.swing.event.ChangeEvent;

import modeles.Chambre;


public class ServiceTableau implements IService{

    public final int NOMBRE = 10;

    private Chambre chambres[] = new Chambre[NOMBRE];
    private Pavillon pavillons[] = new Pavillon[NOMBRE];


    private int indexChambre = 0;
    private int indexPavillon = 0;

    @Override
    public void ajouterEtudiant(Etudiant etudiant) {
        
        
    }

    @Override
    public void ajouterPavillon(Pavillon pavillon) {
        
       if(indexChambre < NOMBRE){
        pavillons[indexPavillon] = pavillon;
        indexPavillon++;
   }
   else{
        System.out.println("Le tableau est rempli");
   }
   Scanner sc = new Scanner(System.in);
   int choix=0;
   System.out.println("donner le numero d'etage");

   choix =sc.nextInt();
   pavillon.setNbrEtages(choix);
   pavillon.setId(indexPavillon);
   pavillon.setNumero(genered());
   indexPavillon++;



        
    }

    @Override
    public int getPositionPavillon(int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void supprimerPavillon(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ajouterChambre(Chambre chambre) {

       if(indexChambre < NOMBRE){
            chambres[indexChambre] = chambre;
            indexChambre++;
       }
       else{
            System.out.println("Le tableau est rempli");
       }
       Scanner sc = new Scanner(System.in);
        int choix =0;
    System.out.println("donner le numero de Chambre");
            choix=sc.nextInt();
            chambre.setEtage(choix);
            chambre.setId(indexChambre);
            Rp resp = new Rp();
            resp.setNom("Coul");
            resp.setPrenom("Karim");
            chambre.setResp(resp);
            chambre.setNumero(genered());
            indexChambre++;
        
    }
    public String genered() {
        int id = indexPavillon;
        String numero="chOO"+id;
        return numero;
    }

    @Override
    public void listerChambre() {
        
        for (Chambre chambre : chambres) {
            if(chambre != null){
                System.out.println(chambre);
            }
        }
        
    }
    @Override
    public void listerPavillon() {
        
        for (Pavillon pavillon : pavillons) {
            if(pavillon != null){
                System.out.println(pavillon);
            }
        }
        
    }
    
}
