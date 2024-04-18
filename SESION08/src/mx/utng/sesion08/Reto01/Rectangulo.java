package mx.utng.sesion08.Reto01;

public class Rectangulo {
  private double alto;
  private double ancho;
  
  //Primero sin parametros
  public Rectangulo(){
    this.alto = 0.0;
    this.ancho = 0.0;
  }

  //Segundo mismo valor
  public Rectangulo(double numero){
    this.alto = numero;
    this.ancho = numero;
  }

  //tercero dos parametros
  public Rectangulo(double alto, double ancho){
    this.alto = alto;
    this.ancho = ancho;
  }

public double calcularArea() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
}
}
