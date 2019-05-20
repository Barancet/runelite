package net.runelite.client.plugins.multilines;

import net.runelite.api.Client;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@PluginDescriptor(
        name = "Multi Lines",
        description = "Will Display all the multi lines (Wilderness only)"
)

public class MultiLinesPlugin extends Plugin {

    @Inject
    private Client client;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private MultiLineOverlay mlOverlay;

    @Override
    protected void startUp() throws Exception {
        super.startUp();
        overlayManager.add(mlOverlay);
    }

    @Override
    protected void shutDown() throws Exception {
        super.shutDown();
        overlayManager.remove(mlOverlay);
    }
}
