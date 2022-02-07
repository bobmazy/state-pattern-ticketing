package ticketing.state

import ticketing.Ticket

class ToDo(override val ticket: Ticket) : TicketState() {
    override fun assign() {
        ticket.changeState(Doing(ticket))
    }

    override fun implement() {
        println("Error: Cannot implement a non assigned ticket!")
    }

    override fun requestChanges() {
        println("Error: Cannot rework a non assigned ticket!")
    }

    override fun close() {
        println("Error: Cannot close a non assigned ticket!")
    }

    override fun toString(): String {
        return "TODO"
    }
}