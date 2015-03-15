package raspberry.gui;
import java.util.ArrayList;

public class TempHist {

	private ArrayList<TempSample> sample = new ArrayList<>();

	
	public void add(String tempF, String tempC, long timeStamp) {
		sample.add(new TempSample(tempF, tempC, timeStamp));
	}

	
	public TempSample get(int index) {
		return sample.get(index);
	}

	
	public int getSize() {
		return sample.size();
	}

	
	
	
}
