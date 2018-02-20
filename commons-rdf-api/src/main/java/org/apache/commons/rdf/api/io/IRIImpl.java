/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.rdf.api.io;

import org.apache.commons.rdf.api.IRI;

final class IRIImpl implements IRI {
	private final String uri;

	IRIImpl(String uri) {
		this.uri = uri;
	}

	@Override
	public String ntriplesString() {
		return "<" + uri + ">";
	}

	@Override
	public String getIRIString() {
		return uri;
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof IRI) && ((IRI) obj).getIRIString().equals(uri);
	}

	@Override
	public int hashCode() {
		return uri.hashCode();
	}
}