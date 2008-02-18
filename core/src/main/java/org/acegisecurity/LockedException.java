/* Copyright 2004, 2005, 2006 Acegi Technology Pty Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.acegisecurity;

/**
 * Thrown if an authentication request is rejected because the account is locked. Makes no assertion as to whether
 * or not the credentials were valid.
 *
 * @author Ben Alex
 * @version $Id$
 */
public class LockedException extends AuthenticationException {
    //~ Constructors ===================================================================================================

/**
     * Constructs a <code>LockedException</code> with the specified message.
     *
     * @param msg the detail message.
     */
    public LockedException(String msg) {
        super(msg);
    }

/**
     * Constructs a <code>LockedException</code> with the specified message and
     * root cause.
     *
     * @param msg the detail message.
     * @param t root cause
     */
    public LockedException(String msg, Throwable t) {
        super(msg, t);
    }

    public LockedException(String msg, Object extraInformation) {
        super(msg, extraInformation);
    }
}
