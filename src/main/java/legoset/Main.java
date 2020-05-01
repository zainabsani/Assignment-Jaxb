package legoset;

import album.Album;
import album.Track;
import jaxb.JAXBHelper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        LegoSet legoSet = new LegoSet();
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(2018);
        legoSet.setPieces(519);

        ArrayList<String> tags = new ArrayList<>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");
        tags.setString(tags);

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig("Imperial Mudtrooper", 2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Mimban Stormtrooper", 1));
        minifigs.setMinifigs(minifigs);

        legoSet.setWeight(0.89);
        legoSet.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        JAXBHelper.toXML(legoSet, System.out);
        JAXBHelper.toXML(legoSet, new FileOutputStream("legoSet.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoSet.xml")));
    }
}
