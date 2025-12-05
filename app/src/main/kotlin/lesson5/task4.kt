package org.example.app.lesson5

const val USER_NAME = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {
    print("Введите ваше имя: ")
    val username: String = readln().toString()

    if (username != USER_NAME) {
        print("Пожалуйста зарегестрируйтесь :)")
    } else {
        print("Введите пароль: ")
        val password: String = readln().toString()
        if (password == PASSWORD) {
            @Suppress("ktlint:standard:max-line-length")
            print(
                    "Ваши данные проверены, и о, чудо, они верны... " +
                    "Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\"." +
                    " Хотя мне всё равно... Ну вперед, войдите... " +
                    "Если вам так уж надо, в конце концов... [меланхолический вздох...] " +
                    "Надеюсь, вам понравится пребывание здесь больше, чем мне.",
            )
        } else {
            print("Пароль неверный!")
        }
    }
}
