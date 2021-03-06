/*
 * ModeShape (http://www.modeshape.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.infinispan.schematic.document;

import java.io.IOException;

public class ParsingException extends IOException {

   /** The serialVersionUID */
   private static final long serialVersionUID = 1L;

   private final int lineNumber;
   private final int columnNumber;

   public ParsingException(String message, int lineNumber, int columnNumber) {
      super(message);
      this.lineNumber = lineNumber;
      this.columnNumber = columnNumber;
   }

   public ParsingException(String message, Throwable cause, int lineNumber, int columnNumber) {
      super(message, cause);
      this.lineNumber = lineNumber;
      this.columnNumber = columnNumber;
   }

   public int getLineNumber() {
      return lineNumber;
   }

   public int getColumnNumber() {
      return columnNumber;
   }
}
