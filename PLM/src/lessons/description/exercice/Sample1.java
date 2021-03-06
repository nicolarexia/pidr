package lessons.description.exercice;

import java.io.IOException;

import plm.core.model.Game;
import plm.core.model.lesson.ExerciseTemplated;
import plm.core.model.lesson.Lesson;
import plm.universe.BrokenWorldFileException;
import plm.universe.World;
import plm.universe.bugglequest.BuggleWorld;

public class Sample1 extends ExerciseTemplated {

	public Sample1(Game game, Lesson lesson) throws IOException, BrokenWorldFileException {
		super(game, lesson);
		tabName = "Sample1";
		this.setToolbox();
				
		/* Create initial situation */
		World[] myWorlds = new World[] {
				BuggleWorld.newFromFile(game, "lessons/description/Map1"),
		};
		for (World w: myWorlds)
			w.setDelay(50); // moving a bit faster than usual
		
		setup(myWorlds);
	}
}