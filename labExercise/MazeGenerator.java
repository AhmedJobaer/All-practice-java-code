/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labExercise;

/**
 *
 * @author aasif
 */
import java.util.Collections;
import java.util.Arrays;
 
/*
 * recursive backtracking algorithm
 * shamelessly borrowed from the ruby at
 * http://weblog.jamisbuck.org/2010/12/27/maze-generation-recursive-backtracking
 */
public class MazeGenerator
        {
	public static void main(String[] args) {
		int x = args.length >= 1 ? (Integer.parseInt(args[0])) : 10;
		int y = args.length == 2 ? (Integer.parseInt(args[1])) : 10;
		MazeGeneratorClass maze = new MazeGeneratorClass(x, y);
		maze.display();
	}
 
}