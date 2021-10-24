package solutions.lesson5.andriyK

open class House() {
    open var text="House was build"
  open fun whiteText(){
      println(text)
  }
}
class Hospital :House (){
    override var text="Hospital was build"
    override fun whiteText() {
    println(text)
    }

}