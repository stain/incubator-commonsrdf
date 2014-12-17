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
package org.apache.commons.rdf;

import org.apache.commons.rdf.Resource;

/**
 * Represents a literal value that can be a node in an RDF Graph. 
 * Literals are used to identify values such as numbers and dates by 
 * means of a lexical representation. There are two types of literals 
 * represented by the subinterfaces {@link PlainLiteral} 
 * and {@link TypedLiteral} 
 *
 * @author reto
 */
public interface Literal extends Resource {
    
    /**
     * 
     * @return the text of this literal
     */
    public String getLexicalForm();
}
