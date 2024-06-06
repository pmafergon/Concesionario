
//Clase padre vehículo, crea los atributos u objetos: marca, modelo y año y crea algunos métodos como startEngine o accelerate

package objetos.concesionario;

public class vehicle {

    private String brand; //atributo de vehículo
    private String model; //atributo de vehículo
    private Integer year; //atributo de vehículo

    public void startEngine() { //Método para arrancar el motor
        System.out.println("Brrrumm * El motor ha sido arrancado *");
    }

    public void accelerate(Integer speed) { //Método para acelerar
        System.out.println("La velocidad es ahora de :" + speed);
    }

    public void brake(Integer speed) { //Método para frenar
        System.out.println("La velocidad es ahora de :" + speed);
    }

    //getters y setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
