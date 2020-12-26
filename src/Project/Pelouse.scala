/*
@author : Fatima Ezzahrae MALKI & Nisrine MOUMMOU
@Year : 2020/2021
@School : Sorbonne MOSEF 
@Teacher : Mourad KAROUI 
*/

package Project

class Pelouse {
  /* initialisation de la pelouse */
  private var xlim = 0
  private var ylim = 0
  
  /* Retourne la limite de la pelouse sur l'axe X */
  def get_Xlim : Int = xlim

  /* Retourne la limite de la pelouse sur l'axe Y */
  def get_Ylim : Int = ylim

  /* Création des dimensions/limites de la pelouse en se basant sur le fichier d'entrée  */
  def Pelouse(coord: String): Unit ={

    val point_supdroit = coord.split(" ")

    this.xlim= point_supdroit(0).toInt
    this.ylim = point_supdroit(1).toInt
  }
}
