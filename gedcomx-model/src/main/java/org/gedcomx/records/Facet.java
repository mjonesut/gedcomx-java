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

import org.codehaus.enunciate.json.JsonName;
import org.codehaus.enunciate.qname.XmlQNameEnumRef;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.gedcomx.common.TextValue;
import org.gedcomx.common.URI;
import org.gedcomx.links.HypermediaEnabledData;
import org.gedcomx.rt.GedcomxConstants;
import org.gedcomx.rt.GedcomxModelVisitor;
import org.gedcomx.types.FacetType;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * <p>A <tt>facet</tt> is a logical grouping of resources by specific criteria, used for convenience in browsing a collection or a set of search results.</p>
 */
@XmlType ( name = "Facet", propOrder = {"titles", "facets", "values" })
@org.codehaus.enunciate.Facet ( name = GedcomxConstants.FACET_GEDCOMX_RECORD )
public class Facet extends HypermediaEnabledData {

  private URI type;
  private List<TextValue> titles;
  private List<Facet> facets;
  private List<FacetValue> values;
  //todo: data type?
  //todo: formal value?
  //todo: description?


  /**
   * The type of the facet.
   *
   * @return The type of the facet.
   */
  @XmlAttribute
  @XmlQNameEnumRef ( FacetType.class )
  public URI getType() {
    return type;
  }

  /**
   * The type of the facet.
   *
   * @param type The type of the facet.
   */
  public void setType(URI type) {
    this.type = type;
  }

  /**
   * The known type of the facet.
   *
   * @return The type of the facet.
   */
  @XmlTransient
  @JsonIgnore
  public FacetType getKnownType() {
    return getType() == null ? null : FacetType.fromQNameURI(getType());
  }

  /**
   * The type of the facet.
   *
   * @param type The type of the facet.
   */
  @JsonIgnore
  public void setKnownType(FacetType type) {
    setType(type == null ? null : URI.create(org.codehaus.enunciate.XmlQNameEnumUtil.toURIValue(type)));
  }

  /**
   * The titles for the facet.
   *
   * @return The titles for the facet.
   */
  @XmlElement (name="title")
  @JsonProperty ("titles")
  @JsonName ("titles")
  public List<TextValue> getTitles() {
    return titles;
  }

  /**
   * The titles for the facet.
   *
   * @param titles The titles for the facet.
   */
  @JsonProperty ("titles")
  public void setTitles(List<TextValue> titles) {
    this.titles = titles;
  }

  /**
   * The set of sub-facets of this facet.
   *
   * @return The set of sub-facets of this facet.
   */
  @XmlElement (name="facet")
  @JsonProperty ("facets")
  @JsonName ("facets")
  public List<Facet> getFacets() {
    return facets;
  }

  /**
   * The set of sub-facets of this facet.
   *
   * @param facets The set of sub-facets of this facet.
   */
  @JsonProperty ("facets")
  public void setFacets(List<Facet> facets) {
    this.facets = facets;
  }

  /**
   * The set of values for the field.
   *
   * @return The set of values for the field.
   */
  @XmlElement (name="value")
  @JsonProperty ("values")
  @JsonName ("values")
  public List<FacetValue> getValues() {
    return values;
  }

  /**
   * The set of values for the field.
   *
   * @param values The set of values for the field.
   */
  @JsonProperty ("values")
  public void setValues(List<FacetValue> values) {
    this.values = values;
  }

  public void accept(GedcomxModelVisitor visitor) {
    visitor.visitFacet(this);
  }

}
