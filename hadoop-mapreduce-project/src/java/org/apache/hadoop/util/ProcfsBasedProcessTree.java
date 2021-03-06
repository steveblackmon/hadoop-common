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

package org.apache.hadoop.util;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * A Proc file-system based ProcessTree. Works only on Linux.
 * 
 * @deprecated Use
 *             {@link org.apache.hadoop.mapreduce.util.ProcfsBasedProcessTree}
 *             instead
 */
@Deprecated
@InterfaceAudience.Private
@InterfaceStability.Unstable
public class ProcfsBasedProcessTree extends
    org.apache.hadoop.mapreduce.util.ProcfsBasedProcessTree {

  public ProcfsBasedProcessTree(String pid) {
    super(pid);
  }

  public ProcfsBasedProcessTree(String pid, boolean setsidUsed,
      long sigkillInterval) {
    super(pid, setsidUsed, sigkillInterval);
  }

  public ProcfsBasedProcessTree(String pid, boolean setsidUsed,
      long sigkillInterval, String procfsDir) {
    super(pid, setsidUsed, sigkillInterval, procfsDir);
  }

  public ProcfsBasedProcessTree getProcessTree() {
    return (ProcfsBasedProcessTree) super.getProcessTree();
  }
}
