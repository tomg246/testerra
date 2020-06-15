/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Peter Lehmann
 *     pele
 */
package eu.tsystems.mms.tic.testframework.report.model.context;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class Video extends Attachment {
    public final List<String> infos = new LinkedList<>();

    /*
    Refers to the errorContext the screenshot belongs to.
     */
    public String errorContextId;

    public Video() {
        super("Video");
    }
    public Video(File file) {
        super(file);
    }

    public File getVideoFile() {
        return getOrCreateTempFile(".mp4");
    }

    @Override
    public String toString() {
        return "Video{" +
                "filename='" + filename + '\'' +
                ", infos=" + infos +
                ", errorContextId='" + errorContextId + '\'' +
                '}';
    }
}
