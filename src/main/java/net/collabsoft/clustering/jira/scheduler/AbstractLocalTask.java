
package net.collabsoft.clustering.jira.scheduler;

import java.util.Map;

public abstract class AbstractLocalTask implements LocalTask {

    // ----------------------------------------------------------------------------------------------- Constructor

    public AbstractLocalTask() {
    }

    // ----------------------------------------------------------------------------------------------- Public Methods
    
    @Override
    public abstract void execute(Map<String, Object> map);

}
