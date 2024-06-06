package objetos.concesionario;

import java.util.Random;

public class Car extends vehicle {

    private Integer numberOfDoors; //Atributo de coche
    private Boolean isConvertible; //Atributo de coche
    private Boolean seatbelt = false; //Atributo de coche, esta variable se crea para que funcione el método: Seatbelt

    //Creamos la clase coche con los atributos necesarios
    public Car(String brand, String model, Integer year, Integer numberOfDoors, Boolean isConvertible) {
        this.setBrand(brand); //utilizamos setters porque es un campo de su clase padre vehicle
        this.setModel(model);
        this.setYear(year);
        this.numberOfDoors = numberOfDoors; //al ser una variable creada en la clase coche, no es necesario usar setters
        this.isConvertible = isConvertible;
    }

    public void honk() { //método de vehículo
        System.out.println("Beeep Beeeep");
    }

    public void putSeatBelt() { //Método de vehículo para poner el cinturón de seguridad

        if (seatbelt) {
            System.out.println("El cinturón ha sido desabrochado");
            seatbelt = false;
        } else {
            System.out.println("El cinturón ha sido abrochado");
            seatbelt = true;
        }
    }

    public void drift() { //Método de vehículo: derrapar

        System.out.println(" *El coche ha derrapado* ");

        Random rand = new Random();

        int randomNumber = rand.nextInt(2); //incluida funcionalidad aleatoria en caso de que el conductor decida derrapar
        if (randomNumber == 1) {
            System.out.println("* Suenan sirenas *");
            System.out.println("* La policia te persigue *");
        } else {
            System.out.println("* El derrape no tuvo consecuencias *");
        }

    }

    //getters y setters


    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Boolean getConvertible() {
        return isConvertible;
    }

    public void setConvertible(Boolean convertible) {
        isConvertible = convertible;
    }

    public Boolean getSeatbelt() {
        return seatbelt;
    }

    public void setSeatbelt(Boolean seatbelt) {
        this.seatbelt = seatbelt;
    }
}
