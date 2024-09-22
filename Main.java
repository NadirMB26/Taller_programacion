//1.Clases Abstractas y Metodos Abstractos
abstract class Vehiculo{
    protected String marca;
    
    public abstract void encender();

    public void mostrarMarca(){
        System.out.println("Marca: "+ marca);
    }
}
class Carro extends Vehiculo{
public Carro(String marca){
    this.marca=marca;
}

public void encender(){
    System.out.println("El carro esta encendido.");
}
}

//Ejercicio1
abstract class Animal{
    protected String animal;
    
    public abstract void hacerSonido();

}
class Perro extends Animal{
    public Perro(String animal){
        this.animal=animal;
    }
    
    public void hacerSonido(){
        System.out.println("Guau.");
    }
    }






//2.Interfaces y implements
interface Volable{
    void volar();
}
class Pajaro implements Volable{
    public void volar(){
        System.out.println("El pajaro esta volando.");
    }
}
//Ejercicio2
interface Nadador{
    void Nadar();
}
class Pez implements Nadador{
    public void Nadar(){
        System.out.println("El pez esta nadando.");
    }
}





//3.Uso de extends y implements
abstract class SerVivo{
    public abstract void respirar();
}
interface Caminante{
    void caminar();
}
class Humano extends SerVivo implements Caminante{
    public void respirar(){
        System.out.println("El humano respira");
    }
    public void caminar(){
        System.out.println("El humano camina");
    }
}
//Ejercicio3
abstract class Instrumento{
    public abstract void tocar();
}
interface Afinable{
    void afinar();
}
class Guitarra extends Instrumento implements Afinable{
    public void tocar(){
    }
    public void afinar(){
    }
}





//4.Uso super y @Override
class Animal2{
    protected String sonido="Sonido de animal";
    public void hacerSonido(){
        System.out.println(sonido);
    }
}
class perro extends Animal2{
    public perro(){
        super.sonido="Guau";
    }
public void hacerSonido(){
    super.hacerSonido();
    System.out.println("El perro esta ladrando");
}
}
//Ejercicio4
class gato extends Animal2{
    public gato(){
        super.sonido="Guau";
    }
public void hacerSonido(){
    super.hacerSonido();
    System.out.println("El gato maulla");
}
}






//5.Uso de final y protected
final class Constante {
public final int valor=42;
    public final void mostrarValor(){
    System.out.println("Valor: "+valor);
    }
}
//Ejercicio5
final class ClasePadre {
    public final int p=42;
        public final void protegido(){
        System.out.println("Valor: "+p);
        }
    }




//6.Polimorfismo y Sobreescritura de Metodos
class Vehiculo2 {
    public void mover() {
        System.out.println("El vehículo se mueve.");
    }
}

class Moto extends Vehiculo2 {
    @Override
    public void mover() {
        System.out.println("La moto se mueve rápido.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo2 v = new Moto();
        v.mover();
    }
}
//Ejercicio6
class Avion{
public void mover(){
    System.out.println("El avion vuela");
}
public static void main(String[]args){
    Vehiculo2 A= new Avion();
    A.mover();
}
}