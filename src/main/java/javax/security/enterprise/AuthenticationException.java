/*
 * Copyright (c) 2015, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.security.enterprise;

import java.security.GeneralSecurityException;

import javax.security.enterprise.authentication.mechanism.http.HttpAuthenticationMechanism;

/**
 * A generic authentication exception.
 * 
 * This exception corresponds to the JASPIC (JSR 196) AuthException in that whenever a method
 * from the {@link HttpAuthenticationMechanism} throws this exception, the JASPIC bridge
 * has to throw an AuthException back to the JASPIC runtime wrapping this exception.
 *
 */
public class AuthenticationException extends GeneralSecurityException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new <code>AuthenticationException</code> exception with <code>null</code> as its detail message.
     */
    public AuthenticationException() {
        super();
    }

    /**
     * Constructs a new <code>AuthenticationException</code> exception with the specified detail message.
     * 
     * @param message
     *            the detail message.
     */
    public AuthenticationException(String message) {
        super(message);
    }

    /**
     * Constructs a new <code>AuthenticationException</code> exception with the specified detail message and cause.
     * 
     * @param message
     *            the detail message.
     * @param cause
     *            the cause.
     */
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new <code>AuthenticationException</code> exception with the specified cause.
     * 
     * @param cause
     *            the cause.
     */
    public AuthenticationException(Throwable cause) {
        super(cause);
    }

}
