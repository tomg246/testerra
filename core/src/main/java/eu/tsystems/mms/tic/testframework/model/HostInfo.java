/*
 * Testerra
 *
 * (C) 2020,  Peter Lehmann, T-Systems Multimedia Solutions GmbH, Deutsche Telekom AG
 *
 * Deutsche Telekom AG and all other contributors /
 * copyright owners license this file to you under the Apache
 * License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
 package eu.tsystems.mms.tic.testframework.model;

public class HostInfo {

    private final String host;
    private final int port;
    private final boolean localMode;

    public HostInfo(boolean localMode) {
        this.localMode = true;
        this.host = null;
        this.port = -1;
    }

    public HostInfo(String host, int port) {
        this.localMode = false;
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public boolean isLocalMode() {
        return localMode;
    }

    @Override
    public String toString() {
        if (isLocalMode()) {
            return "webdriver local mode";
        }
        else {
            return host + ':' + port;
        }
    }
}
