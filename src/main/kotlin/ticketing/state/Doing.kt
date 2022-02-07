package ticketing.state

import ticketing.Ticket

class Doing(override val ticket: Ticket) : TicketState() {
    override fun assign() {
        println("Error: Cannot assign a doing ticket!")
    }

    override fun implement() {
        println("Ticket wurde implementiert und zum reviewn freigegeben!")
        ticket.changeState(Review(ticket))
        println()
    }

    override fun requestChanges() {
        println("Error: Cannot request changes on a doing ticket!")
    }

    override fun close() {
        println("Error: Cannot close a doing ticket!")
    }

    override fun toString(): String {
        return "DOING"
    }
}