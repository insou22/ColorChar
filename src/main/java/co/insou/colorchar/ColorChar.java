package co.insou.colorchar;

import org.bukkit.ChatColor;

import java.util.Objects;

public final class ColorChar {

    public static final ChatColor RED_DARK = ChatColor.DARK_RED;
    public static final ChatColor RED_LIGHT = ChatColor.RED;

    public static final ChatColor YELLOW_DARK = ChatColor.GOLD;
    public static final ChatColor YELLOW_LIGHT = ChatColor.YELLOW;

    public static final ChatColor GREEN_DARK = ChatColor.DARK_GREEN;
    public static final ChatColor GREEN_LIGHT = ChatColor.GREEN;

    public static final ChatColor AQUA_DARK = ChatColor.DARK_AQUA;
    public static final ChatColor AQUA_LIGHT = ChatColor.AQUA;

    public static final ChatColor BLUE_DARK = ChatColor.DARK_BLUE;
    public static final ChatColor BLUE_LIGHT = ChatColor.BLUE;

    public static final ChatColor PURPLE_DARK = ChatColor.DARK_PURPLE;
    public static final ChatColor PURPLE_LIGHT = ChatColor.LIGHT_PURPLE;

    public static final ChatColor GRAY_DARK = ChatColor.DARK_GRAY;
    public static final ChatColor GRAY_LIGHT = ChatColor.GRAY;

    public static final ChatColor BLACK = ChatColor.BLACK;
    public static final ChatColor WHITE = ChatColor.WHITE;



    public static final ChatColor BOLD = ChatColor.BOLD;
    public static final ChatColor UNDERLINE = ChatColor.UNDERLINE;
    public static final ChatColor ITALIC = ChatColor.ITALIC;
    public static final ChatColor STRIKETHROUGH = ChatColor.STRIKETHROUGH;
    public static final ChatColor MAGIC = ChatColor.MAGIC;
    public static final ChatColor RESET = ChatColor.RESET;



    public static String color(String text) {
        return text == null ? "" : ChatColor.translateAlternateColorCodes('&', text);
    }

    public static String strip(String text) {
        return text == null ? "" : ChatColor.stripColor(text);
    }

    public static boolean equalsNoColor(String a, String b) {
        return Objects.equals(a, b) || strip(a).equals(strip(b));
    }

    private ColorChar() {
        throw new IllegalStateException("ColorChar cannot be instantiated!");
    }

}
