/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.apimgt.throttle.policy.deployer.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Entity for keeping API Policy
 */
public class ApiPolicy extends Policy {

    private List<APIPolicyConditionGroup> conditionGroups = new ArrayList<>();
    private String applicableLevel;

    public List<APIPolicyConditionGroup> getConditionGroups() {
        return conditionGroups;
    }

    public ApiPolicy() {
        setType(PolicyType.API);
    }

    public void setConditionGroups(List<APIPolicyConditionGroup> conditionGroups) {
        this.conditionGroups = conditionGroups;
    }

    public String getApplicableLevel() {
        return applicableLevel;
    }

    public void setApplicableLevel(String applicableLevel) {
        this.applicableLevel = applicableLevel;
    }
}
