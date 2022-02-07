import ticketing.Ticket

fun main() {
    // state pattern
    val ticket = Ticket(1, "Docker Images erstellen")

    ticket.assign()
    ticket.implement()
    ticket.requestChanges()
    ticket.implement()
    ticket.close()
}