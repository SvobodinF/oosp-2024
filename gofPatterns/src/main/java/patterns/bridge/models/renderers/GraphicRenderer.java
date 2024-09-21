package patterns.bridge.models.renderers;

import patterns.bridge.interfaces.GraphicsLibrary;

public abstract class GraphicRenderer {
    protected GraphicsLibrary graphicsLibrary;

    public GraphicRenderer(GraphicsLibrary graphicsLibrary) {
        this.graphicsLibrary = graphicsLibrary;
    }

    public abstract void drawShape(String shape);
}
