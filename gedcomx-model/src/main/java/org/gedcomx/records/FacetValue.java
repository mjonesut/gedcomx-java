/**
 * Copyright Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gedcomx.records;

import org.gedcomx.links.HypermediaEnabledData;
import org.gedcomx.rt.GedcomxConstants;

import javax.xml.bind.annotation.XmlType;

/**
 * <p>A facet value is the value that is used by a facet to group related resources.</p>
 */
@XmlType ( name = "FacetValue", propOrder = { "value" })
@org.codehaus.enunciate.Facet ( name = GedcomxConstants.FACET_GEDCOMX_RECORD )
public class FacetValue extends HypermediaEnabledData {

  private String value;
  //todo: parent ref?
  //todo: formal value?
  //todo: sort value?

  /**
   * The value.
   *
   * @return The value.
   */
  public String getValue() {
    return value;
  }

  /**
   * The value.
   *
   * @param value The value.
   */
  public void setValue(String value) {
    this.value = value;
  }

}
