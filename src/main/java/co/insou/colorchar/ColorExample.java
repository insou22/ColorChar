package co.insou.colorchar;

import org.bukkit.entity.Player;

public class ColorExample {

    private final Player player;

    public ColorExample(Player player) {
        this.player = player;
    }

    public void sendColoredChar() {
        player.sendMessage(
                ColorChar.GREEN_LIGHT + "This " +
                ColorChar.RED_DARK + "message " +
                ColorChar.PURPLE_LIGHT + "is " +
                ColorChar.YELLOW_DARK + "colored!"
        );
    }

    public void sendColoredTranslate() {
        player.sendMessage(ColorChar.color("&aThis &4message &dis &6colored!"));
    }

    public void sendStripped() {
        player.sendMessage(ColorChar.strip(ColorChar.color("&aThis &4message &dis &cNOT &6colored!")));
    }

}
