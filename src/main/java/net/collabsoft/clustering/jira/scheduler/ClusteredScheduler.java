
package net.collabsoft.clustering.jira.scheduler;

import com.atlassian.scheduler.SchedulerServiceException;
import com.atlassian.scheduler.config.JobId;
import java.util.Date;
import java.util.Map;

public interface ClusteredScheduler extends Scheduler {

    // ----------------------------------------------------------------------------------------------- Constructor

    // ----------------------------------------------------------------------------------------------- Getters & Setters

    public JobId getJobId();
    public JobId getJobId(String suffix);
    public Date getFirstRunDate();
    
    // ----------------------------------------------------------------------------------------------- Event Handlers
    
    // ----------------------------------------------------------------------------------------------- Public methods

    public void initializeJobRunner(final ClusteredTask job, final Map<String, Object> data);
    public void schedule(ClusteredTask task, Long interval) throws SchedulerServiceException;
    public void scheduleOnce(ClusteredTask task, Long interval) throws SchedulerServiceException;
    
    // ----------------------------------------------------------------------------------------------- Private methods
    
    
    // ----------------------------------------------------------------------------------------------- Private Getters & Setters

}