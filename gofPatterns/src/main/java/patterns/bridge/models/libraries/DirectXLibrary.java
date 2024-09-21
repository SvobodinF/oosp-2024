package patterns.bridge.models.libraries;

import patterns.bridge.interfaces.GraphicsLibrary;

public class DirectXLibrary implements GraphicsLibrary {
    public void renderShape(String shape) {
        System.out.println("Render " + shape + " using DirectX");
    }
}
