//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 06:26:03 AM CET 
//


package pl.moj.xmlschemat;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for płytoteka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="płytoteka">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="info">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="opis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="autorzy" type="{http://moj.pl/xmlschemat}autorzy"/>
 *                   &lt;element name="dataModyfikacji" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="katalogPłyt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="płyta" type="{http://moj.pl/xmlschemat}płyta" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="wydawcy">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="wydawca" type="{http://moj.pl/xmlschemat}wydawca" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="wykonawcy">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="wykonawca" type="{http://moj.pl/xmlschemat}wykonawca" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "płytoteka", propOrder = {
    "info",
    "katalogPłyt",
    "wydawcy",
    "wykonawcy"
})
public class Płytoteka {

    @XmlElement(required = true)
    protected Płytoteka.Info info;
    @XmlElement(required = true)
    protected Płytoteka.KatalogPłyt katalogPłyt;
    @XmlElement(required = true)
    protected Płytoteka.Wydawcy wydawcy;
    @XmlElement(required = true)
    protected Płytoteka.Wykonawcy wykonawcy;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link Płytoteka.Info }
     *     
     */
    public Płytoteka.Info getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link Płytoteka.Info }
     *     
     */
    public void setInfo(Płytoteka.Info value) {
        this.info = value;
    }

    /**
     * Gets the value of the katalogPłyt property.
     * 
     * @return
     *     possible object is
     *     {@link Płytoteka.KatalogPłyt }
     *     
     */
    public Płytoteka.KatalogPłyt getKatalogPłyt() {
        return katalogPłyt;
    }

    /**
     * Sets the value of the katalogPłyt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Płytoteka.KatalogPłyt }
     *     
     */
    public void setKatalogPłyt(Płytoteka.KatalogPłyt value) {
        this.katalogPłyt = value;
    }

    /**
     * Gets the value of the wydawcy property.
     * 
     * @return
     *     possible object is
     *     {@link Płytoteka.Wydawcy }
     *     
     */
    public Płytoteka.Wydawcy getWydawcy() {
        return wydawcy;
    }

    /**
     * Sets the value of the wydawcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Płytoteka.Wydawcy }
     *     
     */
    public void setWydawcy(Płytoteka.Wydawcy value) {
        this.wydawcy = value;
    }

    /**
     * Gets the value of the wykonawcy property.
     * 
     * @return
     *     possible object is
     *     {@link Płytoteka.Wykonawcy }
     *     
     */
    public Płytoteka.Wykonawcy getWykonawcy() {
        return wykonawcy;
    }

    /**
     * Sets the value of the wykonawcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Płytoteka.Wykonawcy }
     *     
     */
    public void setWykonawcy(Płytoteka.Wykonawcy value) {
        this.wykonawcy = value;
    }


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
     *         &lt;element name="opis" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="autorzy" type="{http://moj.pl/xmlschemat}autorzy"/>
     *         &lt;element name="dataModyfikacji" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "opis",
        "autorzy",
        "dataModyfikacji"
    })
    public static class Info {

        @XmlElement(required = true)
        protected String opis;
        @XmlElement(required = true)
        protected Autorzy autorzy;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataModyfikacji;

        /**
         * Gets the value of the opis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpis() {
            return opis;
        }

        /**
         * Sets the value of the opis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpis(String value) {
            this.opis = value;
        }

        /**
         * Gets the value of the autorzy property.
         * 
         * @return
         *     possible object is
         *     {@link Autorzy }
         *     
         */
        public Autorzy getAutorzy() {
            return autorzy;
        }

        /**
         * Sets the value of the autorzy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Autorzy }
         *     
         */
        public void setAutorzy(Autorzy value) {
            this.autorzy = value;
        }

        /**
         * Gets the value of the dataModyfikacji property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataModyfikacji() {
            return dataModyfikacji;
        }

        /**
         * Sets the value of the dataModyfikacji property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataModyfikacji(XMLGregorianCalendar value) {
            this.dataModyfikacji = value;
        }

    }


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
     *         &lt;element name="płyta" type="{http://moj.pl/xmlschemat}płyta" maxOccurs="unbounded" minOccurs="0"/>
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
        "płyta"
    })
    public static class KatalogPłyt {

        protected List<Płyta> płyta;

        /**
         * Gets the value of the płyta property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the płyta property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPłyta().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Płyta }
         * 
         * 
         */
        public List<Płyta> getPłyta() {
            if (płyta == null) {
                płyta = new ArrayList<Płyta>();
            }
            return this.płyta;
        }

    }


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
     *         &lt;element name="wydawca" type="{http://moj.pl/xmlschemat}wydawca" maxOccurs="unbounded" minOccurs="0"/>
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
        "wydawca"
    })
    public static class Wydawcy {

        protected List<Wydawca> wydawca;
        

        /**
         * Gets the value of the wydawca property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wydawca property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWydawca().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Wydawca }
         * 
         * 
         */
        public List<Wydawca> getWydawca() {
            if (wydawca == null) {
                wydawca = new ArrayList<Wydawca>();
            }
            return this.wydawca;
        }

    }


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
     *         &lt;element name="wykonawca" type="{http://moj.pl/xmlschemat}wykonawca" maxOccurs="unbounded" minOccurs="0"/>
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
        "wykonawca"
    })
    public static class Wykonawcy {

        protected List<Wykonawca> wykonawca;

        /**
         * Gets the value of the wykonawca property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wykonawca property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWykonawca().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Wykonawca }
         * 
         * 
         */
        public List<Wykonawca> getWykonawca() {
            if (wykonawca == null) {
                wykonawca = new ArrayList<Wykonawca>();
            }
            return this.wykonawca;
        }

    }

}
