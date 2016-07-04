/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.rdf.jena;

import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.commons.rdf.api.Graph;
import org.apache.commons.rdf.api.RDFParserBuilder.ParseResult;
import org.apache.commons.rdf.api.RDFSyntax;
import org.junit.Test;

public class TestRDFParserBuilder {
	@Test
	public void parseTurtle() throws Exception {
		Path d = Paths.get("D.ttl");
		Graph g = new RDFTermFactoryJena().createGraph();		
		Future<ParseResult> gFuture = new JenaRDFParserBuilder().contentType(RDFSyntax.TURTLE).source(d).target(g).parse();
		gFuture.get(5, TimeUnit.SECONDS);
		assertEquals(3, g.size());
	}
}