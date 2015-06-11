//
//  StorageValidation.java
//
//  Created by Hideki Itakura on 6/10/15.
//  Copyright (c) 2015 Couchbase, Inc All rights reserved.
//
package com.couchbase.lite.store;

import com.couchbase.lite.Revision;

public interface StorageValidation {
    /**
     * Document validation callback, passed to the insertion methods.
     */
    void validate(Revision newRev, Revision prevRev, String parentRevID);
}
