package net.runelite.client.plugins.spelltextplugin;

import net.runelite.api.events.MenuOptionClicked;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;

<<<<<<< HEAD


=======
>>>>>>> SpellText Plugin
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
<<<<<<< HEAD
                graphics.getFontMetrics().stringWidth("") + 180,
=======
                graphics.getFontMetrics().stringWidth("") + 150,
>>>>>>> SpellText Plugin
                0));

        panelComponent.getChildren().add(LineComponent.builder()
                .left("you casted: ")
<<<<<<< HEAD
                .right(plugin.spell)
                .build());


=======
                .right(plugin.test.replace("</col>", " "))
                .build());

                //System.out.println(plugin.getSpellCasted());
>>>>>>> SpellText Plugin
        return panelComponent.render(graphics);
    }
}
