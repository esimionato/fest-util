/*
 * Created on Sep 23, 2006
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
 * Copyright @2006-2011 the original author or authors.
 */
package org.fest.util;

import static org.fest.util.Collections.list;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

/**
 * Tests for {@link StandardComparisonStrategy#iterableRemoves(Iterable, Object)}.
 * 
 * @author Joel Costigliola
 */
public class StandardComparisonStrategy_iterableRemove_Test extends AbstractTest_StandardComparisonStrategy {
  
  @Test
  public void should_pass() {
    List<?> list = list("Sam", "Merry", null, "Frodo");
    assertTrue(list.contains("Frodo"));
    standardComparisonStrategy.iterableRemoves(list, "Frodo");
    assertFalse(list.contains("Frodo"));
    standardComparisonStrategy.iterableRemoves(list, null);
    assertFalse(list.contains(null));
  }
  
  @Test
  public void should_do_nothing_if_iterable_is_null() {
    standardComparisonStrategy.iterableRemoves(null, "Sauron");
  }
  
}
