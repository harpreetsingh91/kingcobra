package engine
import services.Directions._

/**
  * Created by harpreetsingh on 2017-02-25.
  */

// Todo: create a case class for cell and make it accept only positive integer values

class Grid (val width: Int, val height: Int) {
  val cells: Array[Array[Int]] = Array.ofDim(width, height)

  def containsCell(cell: (Int, Int)): Boolean = {
    cell._1 >= 0 & cell._2 >=0 & cell._1 < width & cell._2 < height
  }

  def isCellObstructed(cell: (Int, Int)): Boolean = {
    cells(cell._1)(cell._2) == 1
  }

  def obstructCell(cell: (Int, Int)): Unit = {
    if(containsCell(cell)) {
      cells(cell._1)(cell._2) = 1
    }
  }

  def getHeuristic(cell: (Int, Int)): Int = {
    cells(cell._1)(cell._2)
  }

  def getNeighborCells(cell: (Int, Int)): Iterable[(Int,Int)] = {
    getDirectionTuples.map((direction) =>  (cell._1 + direction._1, cell._2 + direction._2))
      .filter((neighbor) => containsCell(neighbor) & !isCellObstructed(neighbor))
  }

}




