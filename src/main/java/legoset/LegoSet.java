package legoset;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;
import java.util.Set;
import java.time.Year;

public class LegoSet {
    private String name;
    private String theme;
    private String subtheme;
    private Year year;
    private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;

    @XmlElement(name = "weight")
    private List<Weight> weights;
    //private double value; for weight
    private String url;

}
