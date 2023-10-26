package Exemplu3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static List<Mobilier> citire()
    {
        try {
            File file=new File("src/main/resources/mobilier.json");
            ObjectMapper mapper=new ObjectMapper();
            List<Mobilier> lista = mapper
                    .readValue(file, new TypeReference<List<Mobilier>>(){});
            return lista;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        List<Mobilier> mobilier = new ArrayList<Mobilier>();
        mobilier=citire();
        for(Mobilier m: mobilier)
            System.out.println(m.toString());

        System.out.println("\n\n\n\n\nIntroduceti nume");
        Scanner scanner=new Scanner(System.in);
       //scanner.nextLine();
        String nume=
        scanner.nextLine();
        Mobilier.caracteristiciSpecificePiesaMobilier(nume,mobilier);
    }
}
