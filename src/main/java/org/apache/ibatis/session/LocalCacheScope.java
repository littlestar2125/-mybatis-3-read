/**
 * Copyright 2009-2015 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ibatis.session;

/**
 * 本地缓存范围
 * session是指在一个会话中，一个会话目前若没有开启事务那么就是一个查询就是会话，否则事务中是持有一个会话
 * statement是指在一个statement中，一个statement是指一个sql语句,不管是否有事务，其实就相当于关闭了缓存
 *
 * @author Eduardo Macarron
 */
public enum LocalCacheScope {
  SESSION, STATEMENT
}
