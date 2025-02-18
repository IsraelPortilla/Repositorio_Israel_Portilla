public class vehiculo{
    public String matricula;
    public String marca;
    public String modelo;
    
    public vehiculo(String matricula,String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getmatricula(){
        return matricula;
    }
     public String getmarca(){
        return marca;
     }
     public String getmodelo(){
        return modelo;
     }
     public String mostrardatos(){
         return ("Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo);
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}