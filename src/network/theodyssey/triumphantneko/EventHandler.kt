package network.theodyssey.triumphantneko


import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class EventHandler: Listener {
    @EventHandler
    fun onJoin(playerJoinEvent: PlayerJoinEvent) {

        val player = playerJoinEvent.player
        val playerName = player.name
        println("hi")
        println(playerName)
        println("bye")

        if (!player.hasPlayedBefore()) {
            player.sendMessage("New Player")
            consoleCommand("advancement grant $playerName only sf4:age1/root")
            consoleCommand("give $playerName minecraft:torch")
            consoleCommand("give $playerName tconstruct:edible")
            consoleCommand("give $playerName xlfoodmod:donut")
            consoleCommand("give $playerName minecraft:stick 1 0 {ench:[{lvl:1s,id:51s}],display:{Name:\"Builder's Wand\"}}")
            consoleCommand("gamestage silentadd $playerName forgiving_void")

        }
    }

    private fun consoleCommand(command: String) {

        val console = Bukkit.getServer().consoleSender
        Bukkit.dispatchCommand(console, command)
    }
}
