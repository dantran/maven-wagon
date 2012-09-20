package org.apache.maven.wagon.authentication;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.wagon.WagonException;

/**
 * This exception is thrown when an authentication
 * error occurs while accessing the remote repository.
 * An authentication error can happen, for example,
 * when the credentials supplied by the user are invalid
 *
 * @author <a href="michal.maczka@dimatics.com">Michal Maczka</a>
 *
 */
public class AuthenticationException
    extends WagonException
{

    /**
     * @see org.apache.maven.wagon.WagonException
     */
    public AuthenticationException( final String message )
    {
        super( message );
    }

    /**
     * @see org.apache.maven.wagon.WagonException
     */
    public AuthenticationException( final String message, final Throwable cause )
    {
        super( message, cause );
    }

}
