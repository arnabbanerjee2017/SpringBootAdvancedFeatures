package com.arnab.spring.swagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Represents a single contact.")
public class Contact {

	@ApiModelProperty(notes = "The House Number.")
	private String houseNumber;
	
	@ApiModelProperty(notes = "The name of the building.")
	private String buildingName;
	
	@ApiModelProperty(notes = "The name of the road or the locality.")
	private String roadOrLocality;
	
	@ApiModelProperty(notes = "The name of the road or the locality 2.")
	private String roadOrLocality2;
	
	@ApiModelProperty(notes = "The name of the area.")
	private String area;
	
	@ApiModelProperty(notes = "The Pincode.")
	private String pincode;
	
	@ApiModelProperty(notes = "The name of the city.")
	private String city;
	
	@ApiModelProperty(notes = "The name of the state.")
	private String state;
	
	@ApiModelProperty(notes = "The name of the country.")
	private String country;

	public Contact() {
		super();
	}

	public Contact(String houseNumber, String buildingName, String roadOrLocality, String roadOrLocality2, String area,
			String pincode, String city, String state, String country) {
		super();
		this.houseNumber = houseNumber;
		this.buildingName = buildingName;
		this.roadOrLocality = roadOrLocality;
		this.roadOrLocality2 = roadOrLocality2;
		this.area = area;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getRoadOrLocality() {
		return roadOrLocality;
	}

	public void setRoadOrLocality(String roadOrLocality) {
		this.roadOrLocality = roadOrLocality;
	}

	public String getRoadOrLocality2() {
		return roadOrLocality2;
	}

	public void setRoadOrLocality2(String roadOrLocality2) {
		this.roadOrLocality2 = roadOrLocality2;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((buildingName == null) ? 0 : buildingName.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((houseNumber == null) ? 0 : houseNumber.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		result = prime * result + ((roadOrLocality == null) ? 0 : roadOrLocality.hashCode());
		result = prime * result + ((roadOrLocality2 == null) ? 0 : roadOrLocality2.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (buildingName == null) {
			if (other.buildingName != null)
				return false;
		} else if (!buildingName.equals(other.buildingName))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (houseNumber == null) {
			if (other.houseNumber != null)
				return false;
		} else if (!houseNumber.equals(other.houseNumber))
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		if (roadOrLocality == null) {
			if (other.roadOrLocality != null)
				return false;
		} else if (!roadOrLocality.equals(other.roadOrLocality))
			return false;
		if (roadOrLocality2 == null) {
			if (other.roadOrLocality2 != null)
				return false;
		} else if (!roadOrLocality2.equals(other.roadOrLocality2))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contact [houseNumber=" + houseNumber + ", buildingName=" + buildingName + ", roadOrLocality="
				+ roadOrLocality + ", roadOrLocality2=" + roadOrLocality2 + ", area=" + area + ", pincode=" + pincode
				+ ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
