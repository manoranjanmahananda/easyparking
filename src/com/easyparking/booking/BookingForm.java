/**
 * 
 */
package com.easyparking.booking;

import java.io.Serializable;

/**
 * @author Apple
 *
 */
public class BookingForm implements Serializable{
	 
	private String parkingId; 
	public String getParkingId() {
		return parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}
	private String vehicleNo;
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getTimeIn() {
		return timeIn;
	}
	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}
	public String getTimeOut() {
		return timeOut;
	}
	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}
	private String timeIn;
	private String timeOut;

}
