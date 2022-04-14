class Employees {

    String name;
    int balance;

    Employees (String N, int B) {

        name = N;
        balance = B;
    }
    public String getInitials() {
        String initials ="";
        for(int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            if (currentChar >= 'A' && currentChar <='Z')
            initials = initials + currentChar +'.';
        }
        return initials;
    }
    
}

public class InitialsBal {

    public static void main (String []args) {

        Employees[] a = new Employees[16];
        a[0] = new Employees("Antonio Janelly", 278);
        a[1] = new Employees("Daniel Conroy", 329);
        a[2] = new Employees("Wenhao Jin", 445);
        a[3] = new Employees("Nathaniel Jones",402);
        a[4] = new Employees("Sean Kirchner", 388);
        a[5] = new Employees("Sabrina Lin", 275);
        a[6] = new Employees("Eric Luna", 243);
        a[7] = new Employees("Kevin Luna", 334);
        a[8] = new Employees("Zayad Maanane", 412);
        a[9] = new Employees("Hanne Nicolaisen", 393);
        a[10] = new Employees("Jackson Nogles", 299);
        a[11] = new Employees("Emily Parvar", 343);
        a[12] = new Employees("Athena Stebe Glorius", 265);
        a[13] = new Employees("Melanie Taylor", 354);
        a[14] = new Employees("Jaspreet Singh", 317);
        a[15] = new Employees("Tankeh Appolo", 234);

        for(int i = 0; i < a.length; i++) {
            System.out.println("Initials: " + a[i].getInitials() + " Balances: " + a[i].balance);
        }
    }
}