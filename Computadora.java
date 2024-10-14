public class Computadora {

  private String tipo; 
  private String marca;
  private String modelo;
  private double precio;

  public Computadora(String tipo, String marca, String modelo, double precio) {
    this.tipo = tipo;
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
  }

  public void encender() {
    System.out.println("Encendiendo la computadora...");
  }

  public void apagar() {
    System.out.println("Apagando la computadora...");
  }

  public void mostrarDatos() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Marca: " + this.marca);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Precio: " + this.precio);
  }

  // getters y setters  

  // ...

}



   
 