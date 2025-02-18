public class vehiculofurgoneta extends vehiculo{
  public int carga ;
    public vehiculofurgoneta(int carga, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.carga = carga;
    }
    public int getcarga(){
        return carga;
    }
    @Override
    public String mostrardatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCarga en Kg: "+carga;
    }
    
}