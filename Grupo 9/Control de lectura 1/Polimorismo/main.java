public class main {
    public static void main(String[]args){
    vehiculo misvehiculos[] = new vehiculo [4];
    misvehiculos[0] = new vehiculo("RCH","BMW","X-Trail");
    misvehiculos[1] = new vehiculoturismo(6,"DHG","Ferrari","Avalon");
    misvehiculos[2] = new vehiculodeportivo(500,"JHF","Mercedes Benz","Yaris");
    misvehiculos[3] = new vehiculofurgoneta(200,"CDA","Chevrolet","Jolion");
  
    for(vehiculo vehiculos: misvehiculos){
        System.out.println(vehiculos.mostrardatos());
        System.out.println("");
    }
}
}
