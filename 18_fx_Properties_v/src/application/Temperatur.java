package application;
/**
 * JavaFX Beans -> FX-Properties
 * - f�r Listener oder Binding verwendbar
 * Student
 * @author vitali orlioglo
 * 26.09.2019
 * 18_fx_Properties_v
 */

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;

public class Temperatur {
//	float grad;
	private FloatProperty grad = new SimpleFloatProperty();

	// man kann nicht �berschreiben final methoden
	/*
	 * die get-Methode f�r Property -> Listener, Binding
	 */
	public final FloatProperty gradProperty() {
		return this.grad;
	}
	

	public final float getGrad() {
		return this.gradProperty().get();
	}
	

	public final void setGrad(final float grad) {
		this.gradProperty().set(grad);
	}
	
	
}
