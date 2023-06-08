/*
 * File: Mountain.java
 * Description: Final project Exam program
 * Created: Tuesday. Jun 6, 2022, 11:30 pm
 * Author: Faith Alvarado
 * email: faitha2011@student.edu
 */

public class Mountain {

    //members
    private String name;
    private String country;
    private int elevation;

    public Mountain() {
        this.name = "";
        this.country = "";
        this.elevation = 0;
    }

    //setter part
    public Mountain(String name, String country, int elevation) {
        this.name = name;
        this.country = country;
        this.elevation = elevation;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setcountry(String country) {
        this.country = country;
    }
    public void setelevation(int elevation) {
        this.elevation = elevation;
    }

    //returns the information to the coder aka getter part

    public String getname() {
        return name;
    }
    public String getcountry() {
        return country;
    }
    public double getelevation() {
        return elevation;
    }

    //feetTometers equation
    public static double toMeters(double elevationInFeet) {
        final double feet_to_meters = 1 / 3.2808;
        return elevationInFeet * feet_to_meters;
    }
}