package ticketing

import ticketing.state.TicketState
import ticketing.state.ToDo

class Ticket(private val id: Number, private val title: String) {
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
        println("Status vom Ticket GSO-$id $title hast sich von $state zu $newState geändert")
        state = newState
    }
}
