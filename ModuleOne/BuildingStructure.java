package ModuleOne;

import java.util.Scanner;
 
// Structure interface for the buildings.
interface Structure {
    void planStructure();
    void startConstruction();
}
 
//
abstract class Building {
    int numberOfFloors;
    String typeOfBuilding;
 
    Building(int numberOfFloors, String typeOfBuilding) {
        this.numberOfFloors = numberOfFloors;
        this.typeOfBuilding = typeOfBuilding;
    }
 
    void showTypeOfBuilding() {
        System.out.println("The type of building is : " + typeOfBuilding);
    }
 
    abstract int showNumberOfFloors();
}
 
class OfficeBuilding extends Building implements Structure {
    
    public OfficeBuilding(int numberOfFloors) {
        super(numberOfFloors, "Office Building");
        makeBuilding();
    }
 
    @Override
    public void planStructure() {
        super.showTypeOfBuilding();
        System.out.println("Planning of the office building is started.....");
    }
 
    @Override
    public void startConstruction() {
        System.out.println("Started the construction of " + showNumberOfFloors() + " office building");
    }
 
    @Override
    int showNumberOfFloors() {
        return numberOfFloors;
    }
 
    public void makeBuilding() {
        System.out.println("Saving the configuration of office and starting with planning.....");
        planStructure();
        System.out.println("Planning of building is done...");
        startConstruction();
        System.out.println("Construction done");
    }
}
 
class ResidentialBuilding extends Building implements Structure {
 
    public ResidentialBuilding(int numberOfFloors) {
        super(numberOfFloors, "Residential");
    }
 
    @Override
    public void planStructure() {
        super.showTypeOfBuilding();
        System.out.println("Planning of the office building is started.....");
    }
 
    @Override
    public void startConstruction() {
        System.out.println("Started the construction of " + showNumberOfFloors() + " office building");
    }
 
    @Override
    int showNumberOfFloors() {
        return numberOfFloors;
    }
 
}
 
class FourStoryBuilding extends ResidentialBuilding {
    
    public FourStoryBuilding(int numberOfFloors) {
        super(numberOfFloors);
        makeBuilding();
    }
 
    public void makeBuilding() {
        System.out.println("Saving the configuration four story and starting with planning.....");
        super.planStructure();
        System.out.println("Planning of building is done...");
        super.startConstruction();
        System.out.println("Construction done");
    }
 
}
 
class FourPlusStoryBuilding extends ResidentialBuilding {
 
    public FourPlusStoryBuilding(int numberOfFloors) {
        super(numberOfFloors);
        makeBuilding();
    }
 
    public void makeBuilding() {
        System.out.println("Saving the configuration of Four plus story and starting with planning.....");
        super.planStructure();
        System.out.println("Planning of building is done...");
        super.startConstruction();
        System.out.println("Construction done");
    }
}
 
public class BuildingStructure {
 
    public static void main(String[] args) {
        Scanner inputScannerObject = new Scanner(System.in);
 
        System.out.println("Started the program....");
        boolean keepRunning = true;
 
        while (keepRunning) {
            int option = 0;
            System.out.println("Check the following options for building construction: ");
            System.out.println("Press 1: To construct a office building \nPress 2: To construct a residential building");
 
            option = inputScannerObject.nextInt();
 
            switch (option) {
                case 1 -> {
                    System.out.println("Enter the number of floors for office Building");
                    int numberOfFloors = inputScannerObject.nextInt();
                    OfficeBuilding Zeta = new OfficeBuilding(numberOfFloors);
                }
                case 2 -> {
                    System.out.println("Enter the number of floors for residential Building");
                    int numberOfFloors = inputScannerObject.nextInt();
                    if (numberOfFloors == 4) {
                        FourStoryBuilding Home = new FourStoryBuilding(numberOfFloors);
                    } else {
                        FourPlusStoryBuilding Society = new FourPlusStoryBuilding(numberOfFloors);
                    }
                }
                case 3 -> {
                    System.out.println("Exiting the program....");
                    keepRunning = false;
                }
                default -> System.out.println("Wrong Option!! Enter the correct option again");
            }
        }
    }
}