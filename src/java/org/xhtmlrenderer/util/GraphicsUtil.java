/*
 * {{{ header & license
 * Copyright (c) 2004, 2005 Joshua Marinacci
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 * }}}
 */
package org.xhtmlrenderer.util;

import java.awt.*;

import org.xhtmlrenderer.render.Box;

/**
 * Description of the Class
 *
 * @author empty
 */
public class GraphicsUtil {

    /**
     * Description of the Method
     *
     * @param g     PARAM
     * @param box   PARAM
     * @param color PARAM
     */
    public static void drawBox(Graphics g, Box box, Color color) {

        Color oc = g.getColor();

        g.setColor(color);

        //g.drawLine(-5,-5,5,5);

        //g.drawLine(-5,5,5,-5);

        g.drawRect(box.getX(), box.getY(), box.getWidth(), box.getHeight());

        g.setColor(oc);

    }

    /**
     * Description of the Method
     *
     * @param g     PARAM
     * @param box   PARAM
     * @param color PARAM
     */
    public static void draw(Graphics g, Rectangle box, Color color) {

        Color oc = g.getColor();

        g.setColor(color);

        g.drawRect(box.x, box.y, box.width, box.height);

        g.setColor(oc);

    }

    public static Image cleanImage(Image img) {
        return img.getScaledInstance(img.getWidth(null), img.getHeight(null), Image.SCALE_FAST);
    }

}

/*
 * $Id$
 *
 * $Log$
 * Revision 1.8  2007/02/07 16:33:39  peterbrant
 * Initial commit of rewritten table support and associated refactorings
 *
 * Revision 1.7  2006/10/10 20:53:46  pdoubleya
 * Removed commented code
 *
 * Revision 1.6  2005/10/06 03:20:25  tobega
 * Prettier incremental rendering. Ran into more trouble than expected and some creepy crawlies and a few pages don't look right (forms.xhtml, splash.xhtml)
 *
 * Revision 1.5  2005/06/21 17:52:12  joshy
 * new hover code
 * removed some debug statements
 * Issue number:
 * Obtained from:
 * Submitted by:
 * Reviewed by:
 *
 * Revision 1.4  2005/06/20 23:45:56  joshy
 * hack to fix the mangled background images on osx
 * Issue number:
 * Obtained from:
 * Submitted by:
 * Reviewed by:
 *
 * Revision 1.3  2005/01/29 20:21:08  pdoubleya
 * Clean/reformat code. Removed commented blocks, checked copyright.
 *
 * Revision 1.2  2004/10/23 14:06:57  pdoubleya
 * Re-formatted using JavaStyle tool.
 * Cleaned imports to resolve wildcards except for common packages (java.io, java.util, etc).
 * Added CVS log comments at bottom.
 *
 *
 */

