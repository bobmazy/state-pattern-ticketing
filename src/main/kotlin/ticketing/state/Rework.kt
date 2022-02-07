package ticketing.state

import ticketing.Ticket

class Rework(override val ticket: Ticket) : TicketState() {
    override fun assign() {
        println("Error: Cannot assign a rework ticket!")
    }

    override fun implement() {
        println("Ticket wurde implementiert und zum reviewn freigegeben!")
        ticket.changeState(Review(ticket))
        println()
    }

    override fun requestChanges() {
        println("Error: Cannot request changes on a rework ticket!")
    }

    override fun close() {
        println("Error: Cannot close a rework ticket!")
    }

    override fun toString(): String {
        return "REWORK"
    }
}