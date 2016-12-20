/* Main.java
 * =========================================================================
 * This file is part of the JLaTeXMath Library - http://jlatexmath.sourceforge.net
 * 
 * Copyright (C) 2009 DENIZET Calixte
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 * 
 * A copy of the GNU General Public License can be found in the file
 * LICENSE.txt provided with the source distribution of this program (see
 * the META-INF directory in the source jar). This license can also be
 * found on the GNU website at http://www.gnu.org/licenses/gpl.html.
 * 
 * If you did not receive a copy of the GNU General Public License along
 * with this program, contact the lead developer, or write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 *
 * Linking this library statically or dynamically with other modules 
 * is making a combined work based on this library. Thus, the terms 
 * and conditions of the GNU General Public License cover the whole 
 * combination.
 * 
 * As a special exception, the copyright holders of this library give you 
 * permission to link this library with independent modules to produce 
 * an executable, regardless of the license terms of these independent 
 * modules, and to copy and distribute the resulting executable under terms 
 * of your choice, provided that you also meet, for each linked independent 
 * module, the terms and conditions of the license of that module. 
 * An independent module is a module which is not derived from or based 
 * on this library. If you modify this library, you may extend this exception 
 * to your version of the library, but you are not obliged to do so. 
 * If you do not wish to do so, delete this exception statement from your 
 * version.
 * 
 */
package export;

import java.io.File;

import org.junit.Test;

public class ExamplesTest {

    @Test
    public void testExample1() {
        Example1.main(new String[0]);
    }

    @Test
    public void testExample2() {
        Example2.main(new String[0]);
    }

    @Test
    public void testExample3() {
        Example3.main(new String[0]);
    }

    @Test
    public void testExample4() {
        Example4.main(new String[0]);
    }

    @Test
    public void testExample5() {
        Example5.main(new String[0]);
    }

    @Test
    public void testURI() {
        String s = "jar:file:/C:/Users/david/.m2/repository/org/scilab/forge/jlatexmath/1.0.5-SNAPSHOT/jlatexmath-1.0.5-SNAPSHOT.jar!/org/scilab/forge/jlatexmath/fonts/latin/optional/jlm_cmss10.ttf";
        File f = new File(s);
        System.out.println(f.exists());
    }

}
