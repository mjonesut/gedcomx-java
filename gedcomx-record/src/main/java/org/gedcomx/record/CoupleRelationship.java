/**
 * Copyright 2011 Intellectual Reserve, Inc.
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
package org.gedcomx.record;

import org.codehaus.enunciate.qname.XmlQNameEnumRef;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.annotate.JsonTypeIdResolver;
import org.gedcomx.id.XmlTypeIdResolver;
import org.gedcomx.types.RelationshipRole;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.namespace.QName;

/**
 * A relationship between two personas, making a genealogical "couple".
 */
@JsonTypeInfo ( use =JsonTypeInfo.Id.CUSTOM, property = "@type")
@JsonTypeIdResolver (XmlTypeIdResolver.class)
public class CoupleRelationship extends Relationship {

  /**
   * A persona in the relationship. The name "persona1" is used only to distinguish it from
   * the other persona in this relationship and implies neither order nor role.
   * 
   * @return A persona in the relationship. The name "persona1" is used only to distinguish it from
   * the other persona in this relationship and implies neither order nor role.
   */
  public Persona getPersona1() {
    return super.getPersona1();
  }

  /**
   * A persona in the relationship. The name "persona1" is used only to distinguish it from
   * the other persona in this relationship and implies neither order nor role.
   * 
   * @param persona1 A persona in the relationship. The name "persona1" is used only to distinguish it from
   * the other persona in this relationship and implies neither order nor role.
   */
  public void setPersona1(Persona persona1) {
    super.setPersona1(persona1);
  }

  /**
   * The role of the persona1 of this relationship.
   *
   * @return The role of the persona1 of this relationship.
   */
  @XmlAttribute
  @XmlQNameEnumRef (RelationshipRole.class)
  public QName getRole1() {
    return super.getRole1();
  }

  /**
   * The role of the persona1 of this relationship.
   *
   * @param role1 The role of the persona1 of this relationship.
   */
  public void setRole1(QName role1) {
    super.setRole1(role1);
  }

  /**
   * A persona in the relationship. The name "persona2" is used only to distinguish it from
   * the other persona in this relationship and implies neither order nor role.
   * 
   * @return A persona in the relationship. The name "persona2" is used only to distinguish it from
   * the other persona in this relationship and implies neither order nor role.
   */
  public Persona getPersona2() {
    return super.getPersona2();
  }

  /**
   * A persona in the relationship. The name "persona2" is used only to distinguish it from
   * the other persona in this relationship and implies neither order nor role.
   * 
   * @param persona2 A persona in the relationship. The name "persona2" is used only to distinguish it from
   * the other persona in this relationship and implies neither order nor role.
   */
  public void setPersona2(Persona persona2) {
    super.setPersona2(persona2);
  }

  /**
   * The role of the persona2 of this relationship.
   *
   * @return The role of the persona2 of this relationship.
   */
  @XmlAttribute
  @XmlQNameEnumRef(RelationshipRole.class)
  public QName getRole2() {
    return super.getRole2();
  }

  /**
   * The role of the persona2 of this relationship.
   *
   * @param role2 The role of the persona2 of this relationship.
   */
  public void setRole2(QName role2) {
    super.setRole2(role2);
  }
}
