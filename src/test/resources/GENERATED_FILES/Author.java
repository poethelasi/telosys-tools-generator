
/*
 * Created on 24 févr. 2014 ( Time 16:22:39 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
// This Bean has a basic Primary Key (not composite) 
/******
keyAttributes size = 1
nonKeyAttributes size = 2
bigList size = 3
. id - Integer
. firstName - String
. lastName - String
******/
package GENERATED_FILES;

/*

*/
import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Persistent class for entity stored in table "AUTHOR"
 *
 * @author Telosys Tools Generator
 *
 */
@XmlRootElement  // JAXB annotation for REST Web Services
@XmlAccessorType(XmlAccessType.PROPERTY) // JAXB accessor = getter/setter pair
@Entity
@Table(name="AUTHOR", schema="ROOT" )
// Define named queries here
// @NamedQueries ( {
//  @NamedQuery ( name="AaaaAuthorFoo.query1", query="SELECT x FROM AaaaAuthorFoo x WHERE  " ),
//  @NamedQuery ( name="AaaaAuthorFoo.query2", query="SELECT x FROM AaaaAuthorFoo x WHERE  " )
// } )
public class AaaaAuthorFoo implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="ID", nullable=false)
    @NotNull
    private Integer    id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="FIRST_NAME", length=40)
    @Size( max = 40 )
    private String     firstName    ;

    @Column(name="LAST_NAME", length=40)
    @Size( max = 40 )
    private String     lastName     ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @OneToMany(mappedBy="author", targetEntity=AaaaBookFoo.class)
    private List<AaaaBookFoo> listOfBook  ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public AaaaAuthorFoo()
    {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id )
    {
        this.id = id ;
    }
    public Integer getId()
    {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : FIRST_NAME ( VARCHAR ) 
    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return this.firstName;
    }

    //--- DATABASE MAPPING : LAST_NAME ( VARCHAR ) 
    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return this.lastName;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    @XmlTransient
    public void setListOfBook( List<AaaaBookFoo> listOfBook )
    {
        this.listOfBook = listOfBook;
    }
    public List<AaaaBookFoo> getListOfBook()
    {
        return this.listOfBook;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------

    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(firstName);
        sb.append("|");
        sb.append(lastName);
        return sb.toString(); 
    } 

}
