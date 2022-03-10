package bean;

public class Task {
private int taskId;
private String taskTitle;
private String taskText;
private String assigneTo;
public int getTaskId() {
	return taskId;
}
public void setTaskId(int taskId) {
	this.taskId = taskId;
}
public String getTaskTitle() {
	return taskTitle;
}
public void setTaskTitle(String taskTitle) {
	this.taskTitle = taskTitle;
}
public String getTaskText() {
	return taskText;
}
public void setTaskText(String taskText) {
	this.taskText = taskText;
}
public String getAssigneTo() {
	return assigneTo;
}
public void setAssigneTo(String assigneTo) {
	this.assigneTo = assigneTo;
}
public Task(int taskId, String taskTitle, String taskText, String assigneTo) {
	super();
	this.taskId = taskId;
	this.taskTitle = taskTitle;
	this.taskText = taskText;
	this.assigneTo = assigneTo;
}
public Task() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Task [taskId=" + taskId + ", taskTitle=" + taskTitle + ", taskText=" + taskText + ", assigneTo=" + assigneTo
			+ "]";
}

}
