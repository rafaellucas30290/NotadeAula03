
public class Animal{
   protected  String nome, raca;

   public Animal(String nome, String raca){
    this.nome = nome;
    this.raca = raca;
   }
   public void caminha(){
      System.out.println(nome + " está caminhando...");
   }
   public String getNome(){
      return nome;
   }
   public String getRaca(){
      return raca;
      
   }


}