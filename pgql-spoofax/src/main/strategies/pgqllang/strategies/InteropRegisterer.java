/*
 * Copyright (C) 2013 - 2018 Oracle and/or its affiliates. All rights reserved.
 */
package pgqllang.strategies;

import org.strategoxt.lang.JavaInteropRegisterer;
import org.strategoxt.lang.Strategy;

public class InteropRegisterer extends JavaInteropRegisterer {
	public InteropRegisterer() {
		super(new Strategy[] { unescape_identifier_0_0.instance, unescape_string_literal_0_0.instance });
	}
}
