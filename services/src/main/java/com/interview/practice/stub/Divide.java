
package com.interview.practice.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for divide complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="divide">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "divide", propOrder = {
    "number2",
    "number1"
})
public class Divide {

    protected int number2;
    protected int number1;

    /**
     * Gets the value of the number2 property.
     * 
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * Sets the value of the number2 property.
     * 
     */
    public void setNumber2(int value) {
        this.number2 = value;
    }

    /**
     * Gets the value of the number1 property.
     * 
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * Sets the value of the number1 property.
     * 
     */
    public void setNumber1(int value) {
        this.number1 = value;
    }

}
