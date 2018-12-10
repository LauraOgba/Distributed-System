//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.10 at 03:23:46 PM GMT 
//


package ie.gmit.sw.DataModel;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="car_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Customer_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Booking_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TypeOfCar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="NoOfDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "carId",
    "customerId",
    "bookingId",
    "typeOfCar",
    "regNo",
    "price",
    "noOfDays"
})
@XmlRootElement(name = "carhire")
public class Carhire implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "car_id")
    protected int carId;
    @XmlElement(name = "Customer_id")
    protected int customerId;
    @XmlElement(name = "Booking_id")
    protected int bookingId;
    @XmlElement(name = "TypeOfCar", required = true)
    protected String typeOfCar;
    @XmlElement(name = "RegNo", required = true)
    protected String regNo;
    @XmlElement(name = "Price")
    protected float price;
    @XmlElement(name = "NoOfDays")
    protected int noOfDays;
    

    public Carhire() {
    	super();
    }


    public Carhire(int carId, int customerId, int bookingId, String typeOfCar, String regNo, float price,
			int noOfDays) {
		super();
		this.carId = carId;
		this.customerId = customerId;
		this.bookingId = bookingId;
		this.typeOfCar = typeOfCar;
		this.regNo = regNo;
		this.price = price;
		this.noOfDays = noOfDays;
	}

	/**
     * Gets the value of the carId property.
     * 
     */
    public int getCarId() {
        return carId;
    }

    /**
     * Sets the value of the carId property.
     * 
     */
    public void setCarId(int value) {
        this.carId = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(int value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the bookingId property.
     * 
     */
    public int getBookingId() {
        return bookingId;
    }

    /**
     * Sets the value of the bookingId property.
     * 
     */
    public void setBookingId(int value) {
        this.bookingId = value;
    }

    /**
     * Gets the value of the typeOfCar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfCar() {
        return typeOfCar;
    }

    /**
     * Sets the value of the typeOfCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfCar(String value) {
        this.typeOfCar = value;
    }

    /**
     * Gets the value of the regNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * Sets the value of the regNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNo(String value) {
        this.regNo = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Gets the value of the noOfDays property.
     * 
     */
    public int getNoOfDays() {
        return noOfDays;
    }

    /**
     * Sets the value of the noOfDays property.
     * 
     */
    public void setNoOfDays(int value) {
        this.noOfDays = value;
    }

}