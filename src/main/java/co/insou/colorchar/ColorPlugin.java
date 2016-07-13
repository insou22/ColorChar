package co.insou.colorchar;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ColorPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ExampleListener(), this);
    }

    private class ExampleListener implements Listener {

        @EventHandler
        public void on(PlayerJoinEvent event) {
            event.getPlayer().sendMessage(
                            ColorChar.GREEN_LIGHT + "This " +
                            ColorChar.RED_DARK + "message " +
                            ColorChar.PURPLE_LIGHT + "is " +
                            ColorChar.YELLOW_DARK + "colored!"
            );
            event.getPlayer().sendMessage(ColorChar.color("&aThis &4message &dis &6colored!"));
            event.getPlayer().sendMessage(ColorChar.strip(ColorChar.color("&aThis &4message &dis &cNOT &6colored!")));
        }

    }

}
