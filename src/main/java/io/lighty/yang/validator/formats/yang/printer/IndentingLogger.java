/*
 * Copyright (c) 2021 Pantheon Technologies s.r.o. All Rights Reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v10.html
 */
package io.lighty.yang.validator.formats.yang.printer;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.slf4j.Logger;

@SuppressFBWarnings("SLF4J_FORMAT_SHOULD_BE_CONST")
class IndentingLogger extends Indenting {

    private final Logger log;

    IndentingLogger(final Logger log) {
        this.log = log;
    }


    void println(int level, final String name, final String text, final boolean separately) {
        final String indent = indent(level, name, text, separately);
        this.log.info(indent);
    }

    void println(final int level, final String text) {
        final String indent = indent(level, "", text, false);
        this.log.info(indent);
    }

    void println(final String text) {
        this.log.info(text);
    }
}

