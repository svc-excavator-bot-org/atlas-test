/*
 * Copyright 2016 Palantir Technologies
 * ​
 * Licensed under the BSD-3 License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * ​
 * http://opensource.org/licenses/BSD-3-Clause
 * ​
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.palantir.example.profile;

import static com.palantir.example.profile.schema.generated.UserProfileTable.CookiesIdxTable.CookiesIdxColumn;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

public class CookiesIdxColumnTest {
    @Test
    public void testHashCode() {
        UUID uuid = new UUID(3, 4);
        CookiesIdxColumn a = CookiesIdxColumn.of(new byte[]{1}, new byte[]{2}, uuid);
        CookiesIdxColumn b = CookiesIdxColumn.of(new byte[]{1}, new byte[]{2}, uuid);
        Assert.assertEquals(a.hashCode(), b.hashCode());
    }
}
