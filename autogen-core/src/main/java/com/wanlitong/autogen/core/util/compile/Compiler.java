/**
 * 
 */
package com.wanlitong.autogen.core.util.compile;

import java.util.Map;

/**
 * @author liuzeng
 *
 */
public interface Compiler {

	public String compile(String content, Map params) throws CompileException;
	
	public String compile(String content, Map params, String encoding) throws CompileException;
	
}
