/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package apache;

/**
   SingleLineTracerPrintWriter overrides the println function in
   TracerPrintWriter by replacing the TAB character with spaces.
   It also does not print the "\n".
   <p>
   The default format generated by TracerPrintWriter for exceptions
   prints on multiple lines, which does not interact well with some
   logging systems. On the other hand, a stack-trace on one line can be a
   mite difficult to read, so this class should only be used where really
   necessary :-)
   <p>
   For syslog daemons, tabs in messages are not friendly, hence the
   replacement of tabs by spaces here. It shouldn't do any harm to
   do this for all messages...
   <p>
   Perhaps it might be better to enhance TracerPrintWriter to have
   a configuration item for one-line or multi-line mode...
*/
public class SingleLineTracerPrintWriter extends TracerPrintWriter {

  static String TAB = "    ";

  public SingleLineTracerPrintWriter(QuietWriter qWriter) {
    super(qWriter);
  }

  /**
     Make the first Exception line print properly by omitting the \n at the
     end.
  */
  public
   void println(Object o) {
    this.qWriter.write(o.toString());
  }

  // Note: the Char[] form is handled by the TracerPrinterWriter super
  // class

  /**
     Remove the first character from the string (usually a TAB) and do
     not print "\n"
  */   
  public
  void println(String s) {
      // remove '^I' and replace it with 4 spaces
      this.qWriter.write(TAB+s.substring(1));
  }
}
