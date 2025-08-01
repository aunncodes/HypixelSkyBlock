package net.swofty.type.thefarmingislands.tab;

import net.swofty.types.generic.SkyBlockConst;
import net.swofty.types.generic.tab.TablistModule;
import net.swofty.types.generic.tab.TablistSkinRegistry;
import net.swofty.types.generic.user.SkyBlockPlayer;

import java.util.ArrayList;
import java.util.List;

public class TheFarmingIslandsServerModule extends TablistModule {
    @Override
    public List<TablistEntry> getEntries(SkyBlockPlayer player) {
        ArrayList<TablistEntry> entries = new ArrayList<>(List.of(
                new TablistEntry(getCentered("§3§lServer Info"), TablistSkinRegistry.CYAN)
        ));

        entries.add(new TablistEntry("§b§lArea: §7The Farming Islands", TablistSkinRegistry.GRAY));
        entries.add(new TablistEntry(" Server: §8" + SkyBlockConst.getServerName(), TablistSkinRegistry.GRAY));

        fillRestWithGray(entries);

        return entries;
    }
}
