/*
 * File: Main.java
 * Description: Final project Exam program
 * Created: Tuesday. Jun 7, 2022, 1:30 am
 * Author: Faith Alvarado
 * email: faitha2011@student.edu
 */

public class Main {
    public static Mountain minElevation(Mountain mountains[]) {
        
        int minElevation = 0;

        for (int i = 0; i < mountains.length; i++) {
            if (mountains[i].getelevation() < mountains[minElevation].getelevation()){
                minElevation = 1;
            }
        }
        return mountains[minElevation];
    }

    public static void main(String[] args) {
    Mountain mountains[] = new Mountain[7]; 
    
    mountains[0] = new Mountain("Chimborazo", "Ecuador", 20549);
    mountains[1] = new Mountain("Matterhorn", "Switzerland", 14692);
    mountains[2] = new Mountain("Olympus", "Greece (Macedonia)", 9573);
    mountains[3] = new Mountain("Everest", "Nepal", 29029);
    mountains[4] = new Mountain("Mount Marcy-adirondacks", "United States", 5344);
    mountains[5] = new Mountain("Mount Mitchell-Blue Bridge", "United States", 6684);
    mountains[6] = new Mountain("Zugspitze", "Switzerland", 9719);

    System.out.printf("%-30s %-20s %5s %20s\n\n", "Mountain Name"
                        ,"Country","Elevation(ft)","Elevation(meters)"); //prints out the labels on top
    
        for (Mountain mountain : mountains) {
            System.out.printf("%-30s %-20s %8.0f %18.0f\n",

            mountain.getname(), mountain.getcountry(), mountain.getelevation(),

            Mountain.toMeters(mountain.getelevation())); // prints the Mountain data that is assigned
        }

        Mountain shortest = minElevation(mountains);
        System.out.println("\nThe Shortest Mountain is " + shortest.getname() + " located in " + 
                            shortest.getcountry() + " with the elevation of " + shortest.getelevation()
                             + "ft.\n"); //tells the coder what mountain has the shortest elevation
    }
}
