package lesson11.tasks

//Симулятор большой красной кнопки.
//Кнопка должна как-то реагировать на нажатие
class RedButton {
    // Callback вызываемый когда нажимают на кнопку
    private var onClickListener: (() -> Unit)? = null

    fun setClickListener(listener: () -> Unit) {
        onClickListener = listener
    }

    //нажатие на кнопку
    fun click() {
        onClickListener?.invoke()
    }
}