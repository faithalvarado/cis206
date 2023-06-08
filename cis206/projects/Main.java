/*
 * File: Main.java
 * Description: Final project Exam program
 * Created: Tuesday. Jun 6, 2022, 11:30
 * Author: Faith Alvarado
 * email: faitha2011@student.edu
 */

public class Main {
    public static Mountain minElevation(Mountain mountains[]) {
        
        int minindex = 0;
        int i;

        for (i = 0; i < mountains.length; i++) {
            if (mountains[i].getelevation() < mountains[minindex].getelevation()){
                minindex = 1;
            }
        }
        return mountains[minindex];
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
            System.out.printf("%-30s %-20s %8.0f %20.2f\n",

            mountain.getname(), mountain.getcountry(), mountain.getelevation(),

            Mountain.toMeters(mountain.getelevation())); // prints the Mountain data that is assigned
        }

        Mountain smallest = minElevation(mountains);
        System.out.println("The Smallest Mountain is... " + smallest.getname() + " located in " + 
                            smallest.getcountry() + " with the elevation of " + smallest.getelevation()
                             + "ft."); //tells the coder what mountain has the smallest elevation
    }
}
