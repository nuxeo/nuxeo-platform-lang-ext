/*
 * (C) Copyright 2015 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Anahide Tchertchian
 */
package org.nuxeo.ecm.platform.lang.ext.test;

import org.nuxeo.ecm.platform.test.TranslationEnFrTestCase;

/**
 * Simple integrity tests on messages file(s).
 *
 * @since 7.3
 */
public class TestMessages extends TranslationEnFrTestCase {

    @Override
    protected String getEnTranslationsPath() {
        return "crowdin/messages.properties";
    }

    @Override
    protected String getFrTranslationsPath() {
        return "web/nuxeo.war/WEB-INF/classes/messages_fr_FR.properties";
    }

}
