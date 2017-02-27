package services
import engine.Grid

import scala.util.Random

/**
  * Created by harpreetsingh on 2017-02-25.
  */

class GridUtilService (grid: Grid){

  /*
  * Returns a random unobstructed cell from the grid
  * */
  def findRandomCell: (Int, Int) = {
    Tuple2(Random.nextInt(grid.width), Random.nextInt(grid.height))
  }
}

//this is hacky. Todo: Harpreet, do it in a better way
object Directions {
  val directions: Map[(Int,Int), String] = Map((-1,0) -> "west", (1,0) -> "east", (0,-1) -> "north", (0,1) -> "south")
  val getDirectionTuples: Iterable[(Int, Int)] = directions.keys
}
