package network.theodyssey.triumphantneko

import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {
    override fun onEnable() {
        println("Nya")
        this.server.pluginManager.registerEvents(EventHandler(),this)

    }
    override fun onDisable() {
}
}