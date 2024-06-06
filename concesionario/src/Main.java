import objetos.concesionario.Car;
import objetos.concesionario.Motorbike;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static List<Car> carList = new ArrayList<>(); //almacena la lista coches en el array
    static List<Motorbike> motorbikeList = new ArrayList<>(); //almacena la lista motos en el array
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("-----------------------------");
        System.out.println("-Bienvenido al concesionario-");
        System.out.println("-----------------------------");

        while (true) { //Bucle de control del programa, solamente finaliza si pulsamos 3
            System.out.println("  ---¿Qué desea realizar?---");
            System.out.println("    -1. Añadir vehículos.");
            System.out.println("    -2. Mostrar vehículos.");
            System.out.println("    -3. Salir. ");
            System.out.println("-----------------------------");
            System.out.println("Escriba aquí: ");
            String selection = scanner.nextLine();
            if (selection.equals("1")) {
                añadirvehiculo(); //Llamamiento a la función para añadir vehículos
            } else if (selection.equals("2")) {
                mostrarvehiculos(); // Llamamiento a la función para mostrar vehículos
            } else if (selection.equals("3")) {
                scanner.close();
                System.out.println("El programa ha finalizado");
                break;
            }
            else{
                System.out.println("El caracter introducido no corresponde con ninguna opción.");
            }
        }
    }


    private static void mostrarvehiculos() { //Función para mostrar vehículos
        System.out.println("-------------------------------------");
        System.out.println("   -1. Mostrar todos.");
        System.out.println("   -2. Mostrar por tipo de vehículo.");
        System.out.println("   -3. Mostrar por marca.");
        System.out.println("-------------------------------------");
        System.out.println("Escriba aquí: ");
        String thirdSelection = scanner.nextLine();
        if (thirdSelection.equals("1")) { //Muestra todos los vehículos disponibles
            System.out.println("-------------------------------------");
            System.out.println("Coches disponibles: ");
            carList.forEach(car -> {
                System.out.println(
                        "Marca: " + car.getBrand() +
                                " Modelo: " + car.getModel() +
                                " Año matriculación: " + car.getYear() +
                                " Número de puertas: " + car.getNumberOfDoors() +
                                " Descapotable: " + car.getConvertible()
                );
                System.out.println("-------------------------------------");
            });
            System.out.println("Motos disponibles: ");
            motorbikeList.forEach(motorbike -> {
                System.out.println(
                        "Marca: " + motorbike.getBrand() +
                                " Modelo: " + motorbike.getModel() +
                                " Año matriculación: " + motorbike.getYear() +
                                " Cilindrada: " + motorbike.getEngineDisplacement() +
                                " Sidecar: " + motorbike.getHasSidecar()
                );
                System.out.println("-------------------------------------");
            });
        } else if (thirdSelection.equals("2")) { //Muestra los vehículos según el tipo
            System.out.println("-------------------------------------");
            System.out.println("   -1. Mostrar coches");
            System.out.println("   -2. Mostrar motos.");
            System.out.println("-------------------------------------");
            System.out.println("Escriba aquí: ");
            String fourthSelection = scanner.nextLine();
            if (fourthSelection.equals("1")) {
                System.out.println("Coches disponibles: ");
                carList.forEach(car ->{
                        System.out.println(
                                "Marca: " + car.getBrand() +
                                        " Modelo: " + car.getModel() +
                                        " Año matriculación: " + car.getYear() +
                                        " Número de puertas: " + car.getNumberOfDoors() +
                                        " Descapotable: " + car.getConvertible()
                        );
                    System.out.println("-------------------------------------");
                });
            } else if (fourthSelection.equals("2")) {
                System.out.println("Motos disponibles: ");
                motorbikeList.forEach(motorbike ->{
                        System.out.println(
                                "Marca: " + motorbike.getBrand() +
                                        " Modelo: " + motorbike.getModel() +
                                        " Año matriculación: " + motorbike.getYear() +
                                        " Cilindrada: " + motorbike.getEngineDisplacement() +
                                        " Sidecar: " + motorbike.getHasSidecar()
                        );
                    System.out.println("-------------------------------------");
                });
            }else {
                System.out.println("El caracter introducido no corresponde con ninguna opción.");
            }
        } else if (thirdSelection.equals("3")) { //Muestra los vehículos de la marca que escribas
            System.out.println("-------------------------------------");
            System.out.println("-Escriba la marca que desea mostrar: ");
            String fifthSelection = scanner.nextLine().toUpperCase();
            System.out.println("Los vehículos de la marca " + fifthSelection + " son:");
            carList.stream().filter(car -> Objects.equals(car.getBrand(), fifthSelection))
                    .forEach(car -> {
                                System.out.println(
                                        "Marca: " + car.getBrand() +
                                                " Modelo: " + car.getModel() +
                                                " Año matriculación: " + car.getYear() +
                                                " Número de puertas: " + car.getNumberOfDoors() +
                                                " Descapotable: " + car.getConvertible()
                                );
                                System.out.println("-------------------------------------");
                            }
                    );
            motorbikeList.stream().filter(moto -> Objects.equals(moto.getBrand(), fifthSelection))
                    .forEach(moto -> {
                                System.out.println(
                                        "Marca: " + moto.getBrand() +
                                                " Modelo: " + moto.getModel() +
                                                " Año matriculación: " + moto.getYear() +
                                                " Cilindrada: " + moto.getEngineDisplacement() +
                                                " Sidecar: " + moto.getHasSidecar()
                                );
                                System.out.println("-------------------------------------");
                            }
                    );
        } else {
            System.out.println("El caracter introducido no corresponde con ninguna opción.");
        }
    }


    private static void añadirvehiculo() { //Función para añadir vehículos
        System.out.println("-----------------------------");
        System.out.println("-¿Qué vehículo desea añadir?-");
        System.out.println("    -1. Añadir coche.");
        System.out.println("    -2. Añadir moto.");
        System.out.println("-----------------------------");
        System.out.println("Escriba aquí: ");
        String secondSelection = scanner.nextLine();
        if (secondSelection.equals("1")) { //Añades coches con los atributos establecidos
            System.out.println("Escriba los siguientes datos del coche separados por comas:");
            System.out.println("Marca, Modelo, Año, Número de puertas, ¿Es descapotable? (si o no)");
            String objects = scanner.nextLine();
            String[] splitobject = objects.split(","); //convertimos las palabras separadas por comas en elementos de una lista
            try{
                if (splitobject[4].trim().equalsIgnoreCase("si")) { //Cambia el si o no por un valor booleano
                    splitobject[4] = String.valueOf(true);
                } else {
                    splitobject[4] = String.valueOf(false);
                }
                Car car = new Car( //Crea el nuevo coche que va a ser almacenado en el array principal de coches
                        splitobject[0].trim().toUpperCase(),
                        splitobject[1].trim().toUpperCase(),
                        Integer.valueOf(splitobject[2].trim()),
                        Integer.valueOf(splitobject[3].trim()),
                        Boolean.valueOf(splitobject[4]));
                carList.add(car);
            } catch (Exception e) { //manejo de excepciones por si se añade mal algún dato
                System.out.println("-------------------------------------");
                System.out.println("Hubo algún error al añadir el vehículo");
                System.out.println("-------------------------------------");
            }
        } else if (secondSelection.equals("2")) { //Añades motos con los atributos establecidos

            System.out.println("Escriba los siguientes datos de la moto separados por comas:");
            System.out.println("Marca, Modelo, Año, Cilindrada, ¿Tiene sidecar? (si o no)");
            String objects = scanner.nextLine();
            String[] splitObjects = objects.split(",");

            try {
                if (splitObjects[4].trim().equalsIgnoreCase("si")) {
                    splitObjects[4] = String.valueOf(true);
                } else {
                    splitObjects[4] = String.valueOf(false);
                }
                Motorbike moto = new Motorbike(
                        splitObjects[0].trim().toUpperCase(),
                        splitObjects[1].trim().toUpperCase(),
                        Integer.valueOf(splitObjects[2].trim()),
                        Integer.valueOf(splitObjects[3].trim()),
                        Boolean.valueOf(splitObjects[4]));
                motorbikeList.add(moto);
            } catch (Exception e){
                System.out.println("-------------------------------------");
                System.out.println("Hubo algún error al añadir el vehículo");
                System.out.println("-------------------------------------");
            }
        } else {

            System.out.println("El caracter introducido no corresponde con ninguna opción.");
        }
    }
}
