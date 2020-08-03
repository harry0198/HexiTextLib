package com.haroldstudios.hexitextlib;

import com.google.common.annotations.Beta;
import com.haroldstudios.hexitextlib.components.MinecraftKeyFont;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Pattern;

public class FontResolver {

    private static final Pattern FONT_PATTERN = Pattern.compile("<(font:[a-fA-F0-9]{6})>");

    /**
     * Sets font for a base component
     * @param component BaseComponent to alter
     * @param font MinecraftKeyFont enum to set font to
     * @return The new BaseComponent
     */

    public static BaseComponent parseFontBaseComponent(@NotNull BaseComponent component, @NotNull MinecraftKeyFont font) {
        return parseFontBaseComponent(component, font.getFont());
    }

    /**
     * Sets font for a base component
     * Can cause client crashes if incorrect font is implemented only recommended if server
     * resource pack is enforced
     * @param component BaseComponent to alter
     * @param font String based font to set to
     * @return BaseComponent with font applied
     */
    @Beta
    public static BaseComponent parseFontBaseComponent(@NotNull BaseComponent component, @NotNull String font) {
        component.setFont(font);
        return component;
    }

    /**
     * Creates and Sets the font for a TextComponent based off a string
     * @param text Text to set font for
     * @param font MinecraftKeyFont enum to set font to
     * @return The new TextComponent created
     */
    public static TextComponent parseFontString(@NotNull String text, @NotNull MinecraftKeyFont font) {
        return parseFontString(text, font.getFont());
    }

    /**
     * Sets font for a text component
     * Can cause client crashes if invalid font is implemented only recommended if server
     * resource pack is enforced
     * @param text Text to set font for
     * @param font String based font to set to
     * @return TextComponent with font applied
     */
    @Beta
    public static TextComponent parseFontString(@NotNull String text, @NotNull String font) {

        TextComponent textComponent = new TextComponent(text);
        textComponent.setFont(font);

        return textComponent;
    }
}
