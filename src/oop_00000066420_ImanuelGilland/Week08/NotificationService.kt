package oop_00000066420_ImanuelGilland.week08

class NotificationService {

    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        // sendEmail(user.email) // Ini akan error karena email nullable

        if (user.email != null) {
            // Smart Cast: email dianggap String (Non-Null)
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}