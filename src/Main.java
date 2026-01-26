import playground.Arrays;
import playground.Casting;
import playground.DataTypes;
import playground.StringMethods;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        DataTypes.datatypes();
        Casting.casting();
        StringMethods.stringMethods();
        Arrays.arrays();


        System.out.println("---------------------------------------------- XXX -----------------------------------------------");


        String[] participantesCampanha = new String[10];
        participantesCampanha[0] = "Fulano de Tal 1";
        System.out.println(participantesCampanha[0]);

        ArrayList <String> validosParaCampanha = new ArrayList<>();
        validosParaCampanha.add("Fulano de Tal 1");
        System.out.println(validosParaCampanha.get(0));

    }
}