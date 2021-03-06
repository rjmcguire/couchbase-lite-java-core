/**
 * Created by Pasin Suriyentrakorn.
 *
 * Copyright (c) 2015 Couchbase, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package com.couchbase.lite.internal.database.security;

public class Key {
    private static native byte[] nativeDerivePBKDF2SHA256Key(String password, byte[] salt, int rounds);

    public static byte[] derivePBKDF2SHA256Key(
            String password, byte[] salt, int rounds) {
        return nativeDerivePBKDF2SHA256Key(password, salt, rounds);
    }
}
