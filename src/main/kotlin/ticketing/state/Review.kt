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
        ticket.changeState(Rework(ticket))
    }

    override fun close() {
        ticket.changeState(Done(ticket))
    }

    override fun toString(): String {
        return "REVIEW"
    }
}