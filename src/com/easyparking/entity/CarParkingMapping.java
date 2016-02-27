package com.easyparking.entity;


import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.proxy.HibernateProxy;




/** 
 * Object mapping for hibernate-handled table: car_parking_mapping.
 * @author autogenerated
 */

@Entity
@Table(name = "car_parking_mapping")
public class CarParkingMapping extends BaseEntity< Integer> implements  Serializable {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558968829L;

	
	

	/** Field mapping. */
	private Integer bookingId;
	/** Field mapping. */
	private Integer carId;
	/** Field mapping. */
	private Date createdAt;
	/** Field mapping. */
	private String createdBy;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private Integer parkingId;
	/** Field mapping. */
	private Integer paymentId;
	/** Field mapping. */
	private Integer timeIn;
	/** Field mapping. */
	private Integer timeOut;
	/** Field mapping. */
	private Date updatedAt;
	/** Field mapping. */
	private String updatedBy;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public CarParkingMapping() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public CarParkingMapping(Integer id) {
		this.id = id;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return CarParkingMapping.class;
	}
 

    /**
     * Return the value associated with the column: bookingId.
	 * @return A Integer object (this.bookingId)
	 */
	@Basic( optional = true )
	@Column( name = "booking_id"  )
	public Integer getBookingId() {
		return this.bookingId;
		
	}
	

  
    /**  
     * Set the value related to the column: bookingId.
	 * @param bookingId the bookingId value you wish to set
	 */
	public void setBookingId(final Integer bookingId) {
		this.bookingId = bookingId;
	}

    /**
     * Return the value associated with the column: carId.
	 * @return A Integer object (this.carId)
	 */
	@Basic( optional = true )
	@Column( name = "car_id"  )
	public Integer getCarId() {
		return this.carId;
		
	}
	

  
    /**  
     * Set the value related to the column: carId.
	 * @param carId the carId value you wish to set
	 */
	public void setCarId(final Integer carId) {
		this.carId = carId;
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
     * Return the value associated with the column: parkingId.
	 * @return A Integer object (this.parkingId)
	 */
	@Basic( optional = true )
	@Column( name = "parking_id"  )
	public Integer getParkingId() {
		return this.parkingId;
		
	}
	

  
    /**  
     * Set the value related to the column: parkingId.
	 * @param parkingId the parkingId value you wish to set
	 */
	public void setParkingId(final Integer parkingId) {
		this.parkingId = parkingId;
	}

    /**
     * Return the value associated with the column: paymentId.
	 * @return A Integer object (this.paymentId)
	 */
	@Basic( optional = true )
	@Column( name = "payment_id"  )
	public Integer getPaymentId() {
		return this.paymentId;
		
	}
	

  
    /**  
     * Set the value related to the column: paymentId.
	 * @param paymentId the paymentId value you wish to set
	 */
	public void setPaymentId(final Integer paymentId) {
		this.paymentId = paymentId;
	}

    /**
     * Return the value associated with the column: timeIn.
	 * @return A Integer object (this.timeIn)
	 */
	@Basic( optional = true )
	@Column( name = "time_in"  )
	public Integer getTimeIn() {
		return this.timeIn;
		
	}
	

  
    /**  
     * Set the value related to the column: timeIn.
	 * @param timeIn the timeIn value you wish to set
	 */
	public void setTimeIn(final Integer timeIn) {
		this.timeIn = timeIn;
	}

    /**
     * Return the value associated with the column: timeOut.
	 * @return A Integer object (this.timeOut)
	 */
	@Basic( optional = true )
	@Column( name = "time_out"  )
	public Integer getTimeOut() {
		return this.timeOut;
		
	}
	

  
    /**  
     * Set the value related to the column: timeOut.
	 * @param timeOut the timeOut value you wish to set
	 */
	public void setTimeOut(final Integer timeOut) {
		this.timeOut = timeOut;
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
		// TODO Auto-generated method stub
		this.id=id;
	}


	
	

	
}