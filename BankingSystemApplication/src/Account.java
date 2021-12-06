import java.util.Date;

public class Account implements  Comparable {

    static int nextAcctNumb = 359;
    int accNumb;
    String owner;
    City city;
    char gender;
    double balance;
    Date openDate;

    // Building the constructor

    public Account () {

    }

    public Account(String owner, City city, char gender){
        accNumb = nextAcctNumb;
        nextAcctNumb += 359;
        this.owner = owner;
        this.city = city;
        this.gender = gender;

        balance = 0.0;
        openDate = null;
    }





    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
