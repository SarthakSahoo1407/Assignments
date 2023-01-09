package oops;
//Data Abstraction is the property by virtue of which only the essential details are displayed to the user. The trivial or non-essential units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components.
//Data Abstraction may also be defined as the process of identifying only the required characteristics of an object, ignoring the irrelevant details. The properties and behaviors of an object differentiate it from other objects of similar type and also help in classifying/grouping the object.

abstract class MusicInstruments {
	protected String nameofInstrument;
	abstract public void playInst();
}

abstract class NewInstrument extends MusicInstruments {
	protected int numberOfPieces;
}
public class Abstrac {

}
