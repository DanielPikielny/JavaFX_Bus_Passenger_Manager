package application;

public interface AbstractBusView {
	void registerListener(BusUIEventsListener listener);
	void addPassengerToUI(int id, String name);
	void removePassengerFromUI(int id);
	void busIsFullMessage(String msg);
	void updateNumOfPasengers(int size);
}
