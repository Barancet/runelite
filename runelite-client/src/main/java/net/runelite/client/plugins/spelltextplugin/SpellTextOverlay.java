package net.runelite.client.plugins.spelltextplugin;

import net.runelite.api.events.MenuOptionClicked;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;

import javax.inject.Inject;
import java.awt.*;

public class SpellTextOverlay extends Overlay {

    private SpellTextPlugin plugin;
    private PanelComponent panelComponent = new PanelComponent();

    @Inject
    public SpellTextOverlay(SpellTextPlugin plugin){
        super(plugin);
        setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
        setLayer(OverlayLayer.ABOVE_SCENE);
        this.plugin = plugin;
    }


    @Override
    public Dimension render(Graphics2D graphics) {
        panelComponent.getChildren().clear();

        panelComponent.setPreferredSize(new Dimension(
                graphics.getFontMetrics().stringWidth("") + 150,
                0));

        panelComponent.getChildren().add(LineComponent.builder()
                .left("you casted: ")
                .right(plugin.test.replace("</col>", " "))
                .build());

                //System.out.println(plugin.getSpellCasted());
        return panelComponent.render(graphics);
    }
}
