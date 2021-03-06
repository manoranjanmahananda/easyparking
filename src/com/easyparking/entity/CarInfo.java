package com.easyparking.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;




/** 
 * Object mapping for hibernate-handled table: car_info.
 * @author autogenerated
 */

@Entity
@Table(name = "car_info")
public class CarInfo extends BaseEntity<Integer> implements  Serializable {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558968830L;

	
	

	/** Field mapping. */
	private String carNo;
	/** Field mapping. */
	private Date createdAt;
	/** Field mapping. */
	private String createdBy;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private String model;
	/** Field mapping. */
	private Date updatedAt;
	/** Field mapping. */
	private String updatedBy;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public CarInfo() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public CarInfo(Integer id) {
		this.id = id;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return CarInfo.class;
	}
 

    /**
     * Return the value associated with the column: carNo.
	 * @return A String object (this.carNo)
	 */
	@Basic( optional = true )
	@Column( name = "car_no", length = 20  )
	public String getCarNo() {
		return this.carNo;
		
	}
	

  
    /**  
     * Set the value related to the column: carNo.
	 * @param carNo the carNo value you wish to set
	 */
	public void setCarNo(final String carNo) {
		this.carNo = carNo;
	}

    /**
     * Return the value associated with the column: createdAt.
	 * @return A Date object (this.createdAt)
	 */
	@Basic( optional = true )
	@Column( name = "created_at"  )
	public Date getCreatedAt() {
		return this.createdAt;
		
	}
	

  
    /**  
     * Set the value related to the column: createdAt.
	 * @param createdAt the createdAt value you wish to set
	 */
	public void setCreatedAt(final Date createdAt) {
		this.createdAt = createdAt;
	}

    /**
     * Return the value associated with the column: createdBy.
	 * @return A String object (this.createdBy)
	 */
	@Basic( optional = true )
	@Column( name = "created_by", length = 250  )
	public String getCreatedBy() {
		return this.createdBy;
		
	}
	

  
    /**  
     * Set the value related to the column: createdBy.
	 * @param createdBy the createdBy value you wish to set
	 */
	public void setCreatedBy(final String createdBy) {
		this.createdBy = createdBy;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Long object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "id", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    

    /**
     * Return the value associated with the column: model.
	 * @return A String object (this.model)
	 */
	@Basic( optional = true )
	@Column( length = 20  )
	public String getModel() {
		return this.model;
		
	}
	

  
    /**  
     * Set the value related to the column: model.
	 * @param model the model value you wish to set
	 */
	public void setModel(final String model) {
		this.model = model;
	}

    /**
     * Return the value associated with the column: updatedAt.
	 * @return A Date object (this.updatedAt)
	 */
	@Basic( optional = true )
	@Column( name = "updated_at"  )
	public Date getUpdatedAt() {
		return this.updatedAt;
		
	}
	

  
    /**  
     * Set the value related to the column: updatedAt.
	 * @param updatedAt the updatedAt value you wish to set
	 */
	public void setUpdatedAt(final Date updatedAt) {
		this.updatedAt = updatedAt;
	}

    /**
     * Return the value associated with the column: updatedBy.
	 * @return A String object (this.updatedBy)
	 */
	@Basic( optional = true )
	@Column( name = "updated_by", length = 250  )
	public String getUpdatedBy() {
		return this.updatedBy;
		
	}
	

  
    /**  
     * Set the value related to the column: updatedBy.
	 * @param updatedBy the updatedBy value you wish to set
	 */
	public void setUpdatedBy(final String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public void setId(Integer id) {
		
		this.id=id;
	}




	

	

	
}
