package ticketing.state

import ticketing.Ticket

class Done(override val ticket: Ticket) : TicketState() {
    override fun assign() {
        println("Error: Cannot assign a done ticket!")
    }

    override fun implement() {
        println("Error: Cannot implement a done ticket!")
    }

    override fun requestChanges() {
        println("Error: Cannot request changes on a done ticket!")
    }

    override fun close() {
        println("Error: Cannot close a done ticket!")
    }

    override fun toString(): String {
        return "DONE"
    }
}