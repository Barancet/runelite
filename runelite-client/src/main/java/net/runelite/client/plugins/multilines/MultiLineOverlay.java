package net.runelite.client.plugins.multilines;

import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.components.PanelComponent;

import javax.inject.Inject;
import java.awt.*;

public class MultiLineOverlay extends Overlay {

    private MultiLinesPlugin mlPlugin;
    private PanelComponent panelComponent = new PanelComponent();

    @Inject
    public MultiLineOverlay(MultiLinesPlugin mlPlugin){
        super(mlPlugin);
        setLayer(OverlayLayer.ABOVE_SCENE);
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        panelComponent.getChildren().clear();

        //panelComponent.setBorder();
        return null;
    }
}
