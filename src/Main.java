import ru.mirea.krekova2.Employer;
import ru.mirea.krekova2.Manager;

import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Employer[] arrE = new Employer[3];
        arrE[0]=new Employer("Nick","White", 1000);
        arrE[1]=new Employer("Dari","True", 12000);
        arrE[2]=new Manager("Terry","Gui", 1000, 1200);
        System.out.println(arrE[2].getIncome());
        for (int i=0;i<3;i++){
            System.out.println(arrE[i].getIncome());
        }
    }
}