package patterns.bridge;

import patterns.bridge.models.libraries.*;
import patterns.bridge.models.renderers.GraphicRenderer;
import patterns.bridge.models.renderers.ShapeRenderer;

import java.util.ArrayList;
import java.util.List;

public class Entrypoint {
    public static void main(String[] args) {
        List<GraphicRenderer> renderers = new ArrayList<GraphicRenderer>();

        renderers.add(new ShapeRenderer(new DirectXLibrary()));
        renderers.add(new ShapeRenderer(new OpenGLLibrary()));
        renderers.add(new ShapeRenderer(new MetalLibrary()));

        for (GraphicRenderer renderer: renderers) {
            renderer.drawShape("Circle");
        }
    }
}
