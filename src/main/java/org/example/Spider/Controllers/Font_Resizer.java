package org.example.Spider.Controllers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.List;


public class Font_Resizer {

	public static void applyResizeLogic(JPanel panel, List<JComponent> components) {

		panel.addComponentListener(new ComponentAdapter() {

			/**
			 * Triggered whenever the panel is resized.
			 *
			 * @param e resize event
			 */
			@Override
			public void componentResized(ComponentEvent e) {

				// Calculate a base font size relative to the panel width
				int baseSize = panel.getWidth() / 50;

				// Loop through all provided components
				for (JComponent comp : components) {
					int size = baseSize;
					System.out.println();
					// If the component is marked as a title, increase its font size
					if (comp.getName() != null && comp.getName().equals("title")) {
						size = Math.round(baseSize * 0.2f);
					}


					comp.setFont(new Font("Arial", Font.PLAIN, size));
				}
			}
		});
	}
}
