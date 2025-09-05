package application;

public class BusController implements BusEventsListener, BusUIEventsListener {
	private Bus busModel;
	private AbstractBusView busView;

	public BusController(Bus model, AbstractBusView view) {
		busModel = model;
		busView = view;

		busModel.registerListener(this);
		busView.registerListener(this);
	}

	@Override
	public void addedPassengerToModelEvent(int id, String name) {
		busView.addPassengerToUI(id, name);
	}

	@Override
	public void removedPassengerFromModelEvent(int id) {
		busView.removePassengerFromUI(id);
	}

	@Override
	public void addPassengerToUI(String name) {
		try {
			busModel.addPassenger(name);
		} catch (Exception e) {
			busView.busIsFullMessage(e.getMessage());
		}
	}

	@Override
	public void removePassengerFromUI(int id) {
		busModel.removePassenger(id);
	}

	@Override
	public void numOfPasengersUpdatedInModelEvent(int size) {
		busView.updateNumOfPasengers(size);
		
	}
}
