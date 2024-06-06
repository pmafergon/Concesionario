package objetos.concesionario;

import java.util.Random;

public class Motorbike extends vehicle {


    private Integer engineDisplacement;
    private Boolean hasSidecar;
    private Boolean helmet = false;

    //Creamos la clase moto con los atibutos necesarios
    public Motorbike(String brand, String model, Integer year, Integer engineDisplacement, Boolean hasSidecar) {
        this.setBrand(brand); //utilizamos setters porque es un campo de su clase padre vehicle
        this.setModel(model);
        this.setYear(year);
        this.engineDisplacement = engineDisplacement;
        this.hasSidecar = hasSidecar;
    }

    public void wheelie() { //método para hacer un caballito
        Random rand = new Random();
        int randomNumber;
        randomNumber = rand.nextInt(15); //funcionalidad aleatoria que genera los metros del caballito

        System.out.println(" *La moto ha hecho un caballito de " + randomNumber + " metros");

        randomNumber = rand.nextInt(2); //Si el conductor decide hacer un caballito, podría tener consecuencias con la policía
        if (randomNumber == 1) {
            System.out.println("* Suenan sirenas *");
            System.out.println("* La policia te persigue *");
        } else {
            System.out.println(" * El caballito no tuvo consecuencias *");
        }
    }

    public void putHelmet() {
        if (helmet) {
            System.out.println("El motorista procede a quitarse el casco.");
            helmet = false;
        } else {
            System.out.println("El motorista procede a ponerse el casco.");
            helmet = true;
        }
    }

    public Integer getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(Integer engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public Boolean getHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(Boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

}
