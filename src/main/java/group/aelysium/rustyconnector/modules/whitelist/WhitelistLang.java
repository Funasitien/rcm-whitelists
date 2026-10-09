package group.aelysium.rustyconnector.modules.whitelist;

import group.aelysium.rustyconnector.common.lang.Lang;
import net.kyori.adventure.text.Component;
import java.util.Set;

import static net.kyori.adventure.text.Component.text;
import static net.kyori.adventure.text.format.NamedTextColor.BLUE;
import static net.kyori.adventure.text.format.NamedTextColor.GRAY;
import static net.kyori.adventure.text.format.NamedTextColor.WHITE;
import static net.kyori.adventure.text.format.NamedTextColor.DARK_GRAY;

public class WhitelistLang {

    @Lang("rcm-whitelist-details-name")
    public static Component detailsName(String name) {
        return text("Name: ", GRAY).append(text(name, WHITE));
    }

    @Lang("rcm-whitelist-details-isBlacklist")
    public static Component detailsIsBlacklist(boolean isBlacklist) {
        return text("Is Blacklist: ", GRAY).append(text(String.valueOf(isBlacklist), WHITE));
    }

    @Lang("rcm-whitelist-details-denyMessage")
    public static Component detailsDenyMessage(String denyMessage) {
        return text("Deny Message: ", GRAY).append(text(denyMessage, WHITE));
    }

    @Lang("rcm-whitelist-details-bypassPermission")
    public static Component detailsBypassPermission(boolean enabled, String permission) {
        return text("Bypass Permission: ", GRAY).append(
            enabled && permission != null ? text(permission, WHITE) : text("Disabled", DARK_GRAY)
        );
    }

    @Lang("rcm-whitelist-details-usernames")
    public static Component detailsUsernames(Set<String> usernames) {
        Component value = usernames.isEmpty() ?
            text("There are no targeted usernames.", DARK_GRAY) :
            text(String.join(", ", usernames), BLUE);
        return text("Usernames: ", GRAY).append(value);
    }

    @Lang("rcm-whitelist-details-ids")
    public static Component detailsIds(Set<String> ids) {
        Component value = ids.isEmpty() ?
            text("There are no targeted ids.", DARK_GRAY) :
            text(String.join(", ", ids), BLUE);
        return text("IDs: ", GRAY).append(value);
    }

    @Lang("rcm-whitelistRegistry-details-availableWhitelists")
    public static Component availableWhitelists(Set<String> whitelists) {
        return text("Available Whitelists: ", GRAY).append(
            whitelists.isEmpty() ? 
            text("None", DARK_GRAY) : 
            text(String.join(", ", whitelists), WHITE)
        );
    }
}
