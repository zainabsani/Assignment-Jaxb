package legoset;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Weight {
    @XmlValue
    private double value;

    @XmlAttribute
    private String unit;
}
