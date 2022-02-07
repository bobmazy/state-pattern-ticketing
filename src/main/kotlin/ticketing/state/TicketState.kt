package ticketing.state

import ticketing.Ticket

abstract class TicketState {
    abstract val ticket: Ticket

    abstract fun assign()
    abstract fun implement()
    abstract fun requestChanges()
    abstract fun close()

    abstract override fun toString(): String
}
