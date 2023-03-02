package src

data class User(private val name: String,
private val id: String) {

    fun getId(): String {
        return name
    }
}
