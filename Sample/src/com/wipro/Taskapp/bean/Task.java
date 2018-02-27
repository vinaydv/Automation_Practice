package com.wipro.Taskapp.bean;

public class Task {

	private String taskname;
	private String taskid;
	private String status;
	private int priority;
	
	
	public Task(String taskid,String taskname,int priority,String status){
		
		this.taskname = taskname;
		this.taskid = taskid;
		this.status = status;
		this.priority = priority;
	}
	
	
	public void setTaskNAme(String taskname){
		this.taskname = taskname;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Task [taskname=" + taskname + ", taskid=" + taskid + ", status=" + status + ", priority=" + priority
				+ "]";
	}


	public void setTaskID(String taskid){
		this.taskid = taskid;
	}
	
	
	public void setStatus(String status){
		this.status = status;
	}
	
	public void setPriority(int priority){
		this.priority = priority;
	}
	
	public String getTaskname(){
		return taskname;
	}
	
	public String getTaskid(){
		return taskid;
	}
	
	
	public String getstatus(){
		return status;
	}
	
	public int getpriority(){
		return priority;
	}
	
	public int compareTo(Object O){
		Task task = (Task) O;
		
		
		
		return this.taskid.compareTo(task.taskid);
	}
	

}
