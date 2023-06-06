public class Mountain {

    private string name;
    private string country;
    private int elevation;

    public mountain() {
        this.name = "";

        this.country = "";

        this.elevation = 0;
    }

    public mountain(string name, string country, int elevation) {
        this.name = name;

        this.country = country;

        this.elevation = elevation;
    }


   /*
    * getter?
    public void:
        return name
        return country
        return elevation

        Create: Meter equation
        1 meter = 3.2808 ft

        print out groups with system.out.pringf (10s 10s 10d) + group meters

        array group for mountain data:
        string[] mountaindata = new string[7] <- something like this check whiteboard at home.
        group 1: Chimborazo  | Ecuador        | 20,549 ft | Meters:
        group 2: Matterhorn  | Switzerland    | 14,692 ft | Meters:
        group 3: Olympus     | Greece (Mac.)  | ft        |
        group 4: Everest     | Nepal          | ft        |
        group 5: Mount Marcy adirondacks | United states  | ft
        group 6: Mount- Mitchell Bluebridge | United States | ft
        group 7: Zugspritze | Switzerland | ft

    */
    public static void main(String[] args) {
        System.out.println("Hello from Java!");
    }
}