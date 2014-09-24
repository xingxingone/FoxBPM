/**
 * Copyright 1996-2014 FoxBPM ORG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author MAENLIANG
 */
package org.foxbpm.social.impl.cmd;

import org.foxbpm.engine.impl.interceptor.Command;
import org.foxbpm.engine.impl.interceptor.CommandContext;

/**
 * 根据用户名称查找用户ID
 * @author MAENLIANG
 *
 */
public class FindSocialUserIDCmd implements Command<String>{
	private String userName;
	FindSocialUserIDCmd(String userName){
		this.userName = userName;
	}
	@Override
	public String execute(CommandContext commandContext) {
		return null;
	}
}
