package patterns.bridge.models.libraries;

import patterns.bridge.interfaces.GraphicsLibrary;

public class OpenGLLibrary implements GraphicsLibrary {

    public void renderShape(String shape) {
        System.out.println("Render " + shape + " using OpenGL.");
    }
}
