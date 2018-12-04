package planets;

import java.util.ArrayList;

public class MassAverager {
    // Complete this. Retrieve the array of planets, then compute average mass.
    public float getMeanPlanetaryMass() {
        float sum = 0;
        Planet[] list = Planet.getAll();

        for (Planet i : list) {
            sum += i.getMass();
        }

        return sum / list.length;

    }

    //
    // In almost all classes in almost all 46B homework assignments, the main()
    // method is for you to test your code. The autograder doesn't look at the
    // output from main().
    //
    // Since this assignment is simple, there's really only 1 useful version of
    // main(), and it's provided here. Later, when your assignments are more
    // complicated, your main() will change several or many times as you develop
    // different pieces of your assignment.
    public static void main(String[] args) {
        MassAverager averager = new MassAverager();
        System.out.println(averager.getMeanPlanetaryMass());
    }
}
