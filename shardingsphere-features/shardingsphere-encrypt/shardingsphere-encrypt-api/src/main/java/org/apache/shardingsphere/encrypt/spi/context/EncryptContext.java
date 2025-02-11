/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.encrypt.spi.context;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Optional;

/**
 * Encrypt context.
 */
@RequiredArgsConstructor
@Getter
@Setter
public final class EncryptContext {
    
    private final String databaseName;
    
    private final String schemaName;
    
    private final String tableName;
    
    private final String columnName;
    
    private EncryptColumnDataType logicDataType;
    
    private EncryptColumnDataType plainDataType;
    
    private EncryptColumnDataType cipherDataType;
    
    private EncryptColumnDataType assistedQueryDataType;
    
    /**
     * Get logic data type.
     * 
     * @return logic data type
     */
    public Optional<EncryptColumnDataType> getLogicDataType() {
        return Optional.ofNullable(logicDataType);
    }
    
    /**
     * Get plain data type.
     *
     * @return plain data type
     */
    public Optional<EncryptColumnDataType> getPlainDataType() {
        return Optional.ofNullable(plainDataType);
    }
    
    /**
     * Get cipher data type.
     *
     * @return cipher data type
     */
    public Optional<EncryptColumnDataType> getCipherDataType() {
        return Optional.ofNullable(cipherDataType);
    }
    
    /**
     * Get assisted query data type.
     *
     * @return assisted query data type
     */
    public Optional<EncryptColumnDataType> getAssistedQueryDataType() {
        return Optional.ofNullable(assistedQueryDataType);
    }
}
