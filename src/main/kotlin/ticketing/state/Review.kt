package ticketing.state

import ticketing.Ticket

class Review(override val ticket: Ticket) : TicketState() {
    override fun assign() {
        println("Error: Cannot assign a review ticket!")
    }

    override fun implement() {
        println("Error: Cannot implement a review ticket!")
    }

    override fun requestChanges() {
        println("Änderungen wurden zum Ticket angefragt!")
        ticket.changeState(Rework(ticket))
        println()
    }

    override fun close() {
        ticket.changeState(Done(ticket))
        println("Ticket wurde geschlossen!")
        println()
    }

    override fun toString(): String {
        return "REVIEW"
    }
}