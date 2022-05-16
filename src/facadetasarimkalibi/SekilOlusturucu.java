package facadetasarimkalibi;

public class SekilOlusturucu {
   private Sekil daire;
   private Sekil dikdortgen;
   private Sekil kare;

   public SekilOlusturucu() {
      daire = new Daire();
      dikdortgen = new Dikdortgen();
      kare = new Kare();
   }

   public void DaireCiz(){
      daire.Ciz();
   }
   public void DikdortgenCiz(){
      dikdortgen.Ciz();
   }
   public void KareCiz(){
      kare.Ciz();
   }
}
