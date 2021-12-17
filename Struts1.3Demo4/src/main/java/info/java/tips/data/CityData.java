package info.java.tips.data;

public class CityData {
	private String cityName;
	private String cityId;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public CityData(String cityName, String cityId) {
		super();
		this.cityName = cityName;
		this.cityId = cityId;
	}

	public CityData() {
		super();
	}

}
