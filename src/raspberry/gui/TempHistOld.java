package raspberry.gui;
import java.util.ArrayList;

public class TempHistOld {

	private ArrayList<TempSampleOld> sample = new ArrayList<>();

	
	public void add(String tempF, String tempC, long timeStamp) {
		sample.add(new TempSampleOld(tempF, tempC, timeStamp));
	}

	
	public TempSampleOld get(int index) {
		return sample.get(index);
	}

	
	public int getSize() {
		return sample.size();
	}

	
	
	
}
