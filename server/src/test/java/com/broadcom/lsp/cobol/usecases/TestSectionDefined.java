/*
 * Copyright (c) 2020 Broadcom.
 * The term "Broadcom" refers to Broadcom Inc. and/or its subsidiaries.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Broadcom, Inc. - initial API and implementation
 *
 */
package com.broadcom.lsp.cobol.usecases;

import com.broadcom.lsp.cobol.usecases.engine.UseCaseEngine;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

/** This test checks that performing defined section processed correctly */
class TestSectionDefined {
  private static final String TEXT =
      "       IDENTIFICATION DIVISION.\n"
          + "          PROGRAM-ID. TEST1.\n"
          + "          DATA DIVISION.\n"
          + "          WORKING-STORAGE SECTION.\n"
          + "          PROCEDURE DIVISION.\n"
          + "            PERFORM {@GET-DATA}.\n"
          + "            STOP RUN.\n"
          + "          {@*GET-DATA} SECTION.\n"
          + "            DISPLAY \"\".";

  @Test
  void test() {
    UseCaseEngine.runTest(TEXT, List.of(), Map.of());
  }
}
