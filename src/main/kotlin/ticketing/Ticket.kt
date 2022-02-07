package ticketing

import ticketing.state.TicketState
import ticketing.state.ToDo

class Ticket(val id: Number, val title: String) {
    private var state: TicketState


    init {
        this.state = ToDo(this)
    }

    fun assign() {
        state.assign()
    }

    fun implement() {
        state.implement()
    }

    fun requestChanges() {
        state.requestChanges()
    }

    fun close() {
        state.close()
    }

    fun changeState(newState: TicketState) {
        println("state change from $state to $newState")
        state = newState
    }
}
