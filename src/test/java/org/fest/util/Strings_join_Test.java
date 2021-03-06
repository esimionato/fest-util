/*
 * Created on Sep 22, 2006
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2006-2013 the original author or authors.
 */
package org.fest.util;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.rules.ExpectedException.none;

/**
 * Tests for {@link Strings#join(String...)}.
 *
 * @author Alex Ruiz
 */
public class Strings_join_Test {
  @Rule public ExpectedException thrown = none();

  @Test
  public void should_throw_error_if_delimeter_is_null() {
    thrown.expect(NullPointerException.class);
    Strings.join(null, "Uno", "Dos").with(null);
  }

  @Test
  public void should_return_empty_String_if_array_to_join_is_null() {
    assertEquals("", Strings.join((String[]) null).with("|"));
  }

  @Test
  public void should_join_using_delimeter() {
    assertEquals("Luke|Leia|Han", Strings.join("Luke", "Leia", "Han").with("|"));
  }
}
