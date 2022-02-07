import ticketing.Ticket

fun main() {
    val ticket = Ticket(1, "GSO-120")

    ticket.assign()
    ticket.implement()
    ticket.requestChanges()
    ticket.implement()
    ticket.close()
}