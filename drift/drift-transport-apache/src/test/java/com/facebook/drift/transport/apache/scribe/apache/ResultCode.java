/*
 * Copyright (C) 2012 Facebook, Inc.
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
package com.facebook.drift.transport.apache.scribe.apache;

import org.apache.thrift.TEnum;

public enum ResultCode
        implements TEnum
{
    OK(0),
    TRY_LATER(1);

    private final int value;

    ResultCode(int value)
    {
        this.value = value;
    }

    /**
     * Get the integer value of this enum value, as defined in the Thrift IDL.
     */
    @Override
    public int getValue()
    {
        return value;
    }

    /**
     * Find a the enum type by its integer value, as defined in the Thrift IDL.
     *
     * @return null if the value is not found.
     */
    public static ResultCode findByValue(int value)
    {
        switch (value) {
            case 0:
                return OK;
            case 1:
                return TRY_LATER;
            default:
                return null;
        }
    }
}
