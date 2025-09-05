package application;

public interface BusEventsListener {
	void addedPassengerToModelEvent(int id, String name);
	void removedPassengerFromModelEvent(int id);
	void numOfPasengersUpdatedInModelEvent(int size);
}
