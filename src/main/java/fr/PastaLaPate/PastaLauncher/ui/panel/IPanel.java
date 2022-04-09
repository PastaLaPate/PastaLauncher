package fr.PastaLaPate.PastaLauncher.ui.panel;

import fr.PastaLaPate.PastaLauncher.ui.PanelManager;
import javafx.scene.layout.GridPane;

public interface IPanel {
    void init(PanelManager panelManager);
    GridPane getLayout();
    void onShow();
    String getName();
    String getStylesheetPath();
}
