# JavaFX_Bus_Passenger_Manager
This repository contains a Java project that implements a bus passenger management system using the Model-View-Controller (MVC) architectural pattern. The application provides a simple graphical user interface (GUI) that allows a user to add and remove passengers from a virtual bus.  The project demonstrates the separation of concerns by having a distinct data model, a controller to handle logic, and multiple views to display the data.

Project Architecture
The project is structured according to the MVC pattern:

Model (Bus.java, Passenger.java): The Bus class represents the core data model. It manages a collection of Passenger objects and handles the business logic of adding and removing passengers.

View (AbstractBusView.java, BusJavaFX.java, BusJavaFX2.java): The view layer is abstracted by the AbstractBusView interface. The project includes two separate JavaFX views, BusJavaFX and BusJavaFX2, that provide different ways to interact with the model.

Controller (BusController.java): The BusController class acts as the mediator between the model and the view. It registers listeners to both the model and the view to ensure that changes in one are reflected in the other.

The project also uses two event listener interfaces, BusEventsListener and BusUIEventsListener, to facilitate communication between the model, view, and controller.

Dependencies
This project relies on the following technologies:

JavaFX: For building the graphical user interface.

Java SE: The core Java platform.

javax.swing.JOptionPane: An older Swing library is used to display a message dialog when the bus is full.

How to Run the Project
Make sure you have a Java Development Kit (JDK) and a build tool like Maven or Gradle that supports JavaFX.

Import all the project files into your Integrated Development Environment (IDE) as a Java project.

Execute the BusMain.java file. The main method in this file will launch the application and create two separate windows, each with a different GUI for the bus passenger system.

Functionality
Adding Passengers: Enter a passenger's name in the text field and click the "Add Passenger" button.

Removing Passengers:

In the first window, select a passenger from the drop-down menu and click "Remove Passenger".

In the second window, click on a passenger's name label to remove them.

Bus Capacity: The bus has a maximum capacity of three passengers. Attempting to add more will result in an error message.

