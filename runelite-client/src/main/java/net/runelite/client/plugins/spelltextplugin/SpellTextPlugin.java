package net.runelite.client.plugins.spelltextplugin;

import net.runelite.api.Client;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.client.util.Text;
import javax.inject.Inject;

@PluginDescriptor(
        name = "Spell Text",
        description = "Shows what spell you casted in chat box"
)

public class SpellTextPlugin extends Plugin {

    @Inject
    private Client client;

    // Make overlay for the SpellTextOverlay Class
    @Inject
    private SpellTextOverlay overlay;

    @Inject
    String spell;


    //private String menuTarget;

    @Inject
    private OverlayManager overlayManager;

    @Override
    protected void startUp() throws Exception
    {
        overlayManager.add(overlay);
    }

    @Override
    protected void shutDown() throws Exception {
        super.shutDown();
        overlayManager.remove(overlay);
    }

    @Subscribe
    public void onMenuOptionClicked(MenuOptionClicked event){
        String menuCheck= event.getMenuOption();
        String target = event.getMenuTarget();

        if (menuCheck.equals("Cast"))
        {
            spell = Text.removeTags(event.getMenuTarget());
            System.out.println(target);
        }


    }


}
