public class vehiculoturismo extends vehiculo{
  public int puertas; 
    public vehiculoturismo(int puertas, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.puertas = puertas;
    }
    public int getpuertas(){
        return puertas;
    }
    @Override
    public String mostrardatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nNumero de puertas: "+puertas;
    }
    
}
