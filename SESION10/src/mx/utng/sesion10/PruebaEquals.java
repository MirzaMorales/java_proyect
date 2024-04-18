package mx.utng.sesion10;

public class PruebaEquals {
    public static void main(String[] args) {
       
        Llanta llanta1 = new Llanta(205, 16, 35);
        Llanta llanta2 = new Llanta(205, 16, 35);
        Llanta llanta3 = new Llanta(205, 16, 35);
        Llanta llanta4 = new Llanta(205, 16, 35);

        Combustible combustible1 = new Combustible((short)40, (short)0);

        Automovil automovil = new Automovil("Kia", "2023", 2024, 25000);
        automovil.setCombustible(combustible1);
        automovil.colocaLlantas(llanta1, llanta2, llanta3, llanta4);
        automovil.llenarTanque();

        Llanta llanta5 = new Llanta(205, 16, 35);
        Llanta llanta6 = new Llanta(205, 16, 35);
        Llanta llanta7 = new Llanta(205, 16, 35);
        Llanta llanta8 = new Llanta(205, 16, 35);

        Combustible combustible2 = new Combustible((short)40, (short)0);

        Automovil automovi2 = new Automovil("Ford", "2019", 2019, 25000);
        automovil.setCombustible(combustible2);
        automovil.colocaLlantas(llanta5, llanta6, llanta7, llanta8);
        automovil.llenarTanque();

        System.out.println(automovil.equals(automovi2));




    }
}
