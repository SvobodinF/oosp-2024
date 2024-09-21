package patterns.bridge.models.renderers;

import patterns.bridge.interfaces.GraphicsLibrary;

public class ShapeRenderer extends GraphicRenderer{
    public ShapeRenderer(GraphicsLibrary graphicsLibrary) {
        super(graphicsLibrary);
    }

    @Override
    public void drawShape(String shape) {
        graphicsLibrary.renderShape(shape);
    }
}
