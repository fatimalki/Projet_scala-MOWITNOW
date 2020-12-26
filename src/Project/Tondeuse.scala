/*
@author : Fatima Ezzahrae MALKI & Nisrine MOUMMOU
@Year : 2020/2021
@School : Sorbonne MOSEF 
@Teacher : Mourad KAROUI 
*/
package Project

class Tondeuse(pelouse: Pelouse, var x: Int, var y: Int, var orientation: Char) {

  /* Récupérer la position de la tondeuse */
  def coordX: Int = x
  def coordY: Int = y
  def charOrientation: Char = orientation

  /* Orientation de 90° vers la gauche  */
  def go_Left: Unit = {
    orientation = orientation match {
      case 'N' => 'W'
      case 'E' => 'N'
      case 'S' => 'E'
      case 'W' => 'S'
      case _ => orientation
    }
  }

  /* Orientation de 90° vers la droite */
  def go_Right: Unit = {
    orientation = orientation match {
      case 'N' => 'E'
      case 'E' => 'S'
      case 'S' => 'W'
      case 'W' => 'N'
      case _ => orientation
    }
  }

  /*Récupérer les nouvelles coordonnées en utilisant les coordonnées
  et orientation actuelles de la tondeuse */

  def computeCoord: Unit = {
    orientation match {
      case 'N' => if (y + 1 <= pelouse.get_Ylim) y += 1 else y
      case 'E' => if (x + 1 <= pelouse.get_Xlim) x += 1 else x
      case 'W' => if (x - 1 >= 0) x -= 1 else x
      case 'S' => if (y - 1 >= 0) y -= 1 else y
      case _ => x & y
    }
  }

}
