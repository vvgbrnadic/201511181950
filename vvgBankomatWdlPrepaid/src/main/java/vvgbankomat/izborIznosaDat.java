package vvgbankomat;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("izborIznosaDat")
public class izborIznosaDat implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Sto")
   private java.lang.Boolean sto;
   @org.kie.api.definition.type.Label("dvijesto")
   private java.lang.Boolean dvijesto;
   @org.kie.api.definition.type.Label("Tristo")
   private java.lang.Boolean tristo;
   @org.kie.api.definition.type.Label("Petsto")
   private java.lang.Boolean petsto;
   @org.kie.api.definition.type.Label("Tisucu")
   private java.lang.Boolean tisucu;
   @org.kie.api.definition.type.Label("PetTisuca")
   private java.lang.Boolean pettisuca;

   public izborIznosaDat()
   {
   }

   public java.lang.Boolean getSto()
   {
      return this.sto;
   }

   public void setSto(java.lang.Boolean sto)
   {
      this.sto = sto;
   }

   public java.lang.Boolean getDvijesto()
   {
      return this.dvijesto;
   }

   public void setDvijesto(java.lang.Boolean dvijesto)
   {
      this.dvijesto = dvijesto;
   }

   public java.lang.Boolean getTristo()
   {
      return this.tristo;
   }

   public void setTristo(java.lang.Boolean tristo)
   {
      this.tristo = tristo;
   }

   public java.lang.Boolean getPetsto()
   {
      return this.petsto;
   }

   public void setPetsto(java.lang.Boolean petsto)
   {
      this.petsto = petsto;
   }

   public java.lang.Boolean getTisucu()
   {
      return this.tisucu;
   }

   public void setTisucu(java.lang.Boolean tisucu)
   {
      this.tisucu = tisucu;
   }

   public java.lang.Boolean getPettisuca()
   {
      return this.pettisuca;
   }

   public void setPettisuca(java.lang.Boolean pettisuca)
   {
      this.pettisuca = pettisuca;
   }

   public izborIznosaDat(java.lang.Boolean sto, java.lang.Boolean dvijesto,
         java.lang.Boolean tristo, java.lang.Boolean petsto,
         java.lang.Boolean tisucu, java.lang.Boolean pettisuca)
   {
      this.sto = sto;
      this.dvijesto = dvijesto;
      this.tristo = tristo;
      this.petsto = petsto;
      this.tisucu = tisucu;
      this.pettisuca = pettisuca;
   }

}