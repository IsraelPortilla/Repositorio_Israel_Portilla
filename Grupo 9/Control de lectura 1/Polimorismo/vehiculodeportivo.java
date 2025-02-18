public class vehiculodeportivo extends vehiculo{
  public int cilindrada ;
    public vehiculodeportivo(int cilindrada, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
    public int getcilindrada(){
        return cilindrada;
    }
    @Override
    public String mostrardatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCilindrada: "+cilindrada;
    }
    
}