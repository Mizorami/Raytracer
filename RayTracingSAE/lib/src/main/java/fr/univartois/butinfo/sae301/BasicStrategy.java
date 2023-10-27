package fr.univartois.butinfo.sae301;

import java.awt.Color;
import java.util.List;

/**
 * This class, BasicStrategy, implements the IColorStrategy interface and defines a color calculation strategy for a scene object.
 * The basic color strategy simply returns the object's color without any modification.
 * 
 * @author Theo, Louis, Hugo, Alex
 *
 */
public class BasicStrategy implements IColorStrategy {

	public static fr.univartois.butinfo.sae301.Color calculateColor(Vector normal, List<Light> light, Point intersectionPoint, ISceneObject object) {
		
			double r = object.getColor().getTrip().getX();
			double g = object.getColor().getTrip().getY();
			double b = object.getColor().getTrip().getZ();

			fr.univartois.butinfo.sae301.Color color = new fr.univartois.butinfo.sae301.Color(r, g, b);
			return color;
	}
}
