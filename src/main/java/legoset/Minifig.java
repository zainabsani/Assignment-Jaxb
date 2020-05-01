package legoset;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Minifig {
    @XmlValue
    private String title;

    @XmlAttribute
    private int count;
}
