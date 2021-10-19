package Calculator;

import java.awt.*;

public class VerticalLayout implements LayoutManager {

    private final Dimension area = new Dimension();
    @Override
    public void addLayoutComponent(String name, Component comp) {

    }

    @Override
    public void removeLayoutComponent(Component comp) {

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return calculateBestSize(parent);
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return calculateBestSize(parent);
    }

    private Dimension calculateBestSize(Container c) {
        Component[] list = c.getComponents();
        int maxWidth = 0;
        for (Component component : list) {
            if (component.getWidth() > maxWidth)
                maxWidth = component.getWidth();
        }
        area.width = maxWidth + 5;

        int height = 0;
        for (Component component : list) {
            height += 5;
            height += component.getHeight();
        }
        area.height = height;
        return area;
    }

    @Override
    public void layoutContainer(Container parent) {
        Component[] list = parent.getComponents();
        int currentY = 5;
        for (Component component : list){
            Dimension pref = component.getPreferredSize();
            component.setBounds(5,currentY,pref.width,pref.height);
            currentY +=5;
            currentY += pref.height;
        }

    }
}
