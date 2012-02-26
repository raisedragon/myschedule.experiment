package timemachine;

import java.util.Date;
import java.util.List;

public interface Schedule extends Data {
	public Long getId();
	public void setId(Long id);
	public String getName();
	public String getDesc();
	public Date getNextRun();
	public void setNextRun(Date date);
	public Date getStartTime();
	public Date computeNextRun(Date after);
	public List<Job> getJobs();
	public void addJob(Job job);
}