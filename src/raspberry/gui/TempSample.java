package raspberry.gui;

public class TempSample {

	private String tempF;
	private String tempC;
	private long timeStamp;


	public TempSample(String tempF, String tempC, long timeStamp) {
		this.tempF = tempF;
		this.tempC = tempC;
		this.timeStamp = timeStamp;
	} 

	public String getTempF() {
		return tempF;
		
	}

	public String getTempC() {
		return tempC;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	@Override
	public String toString() {
		return "TempSample [tempF=" + tempF + ", tempC=" + tempC
				+ ", timeStamp=" + timeStamp + "]";
	}




}
