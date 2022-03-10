package dao;

import java.util.Scanner;

import bean.Task;

public class TaskDao {

	Task allTask[]=new Task[10];	// array object 
	String tasks[]=new String[10];
	static int count=0;
	Scanner sc = new Scanner(System.in);
	public void addTask() {
		System.out.println("Enter the task id ");		// 1, 2, 3
		int id = sc.nextInt();
		System.out.println("Enter the task title");
		String title = sc.next();
		System.out.println("Enter the task text");
		String text = sc.next();
		//System.out.println("Enter the task user assigned name");
		//String taskAssign = sc.next();
		//Task tt = new Task(id, title, text, taskAssign);
		Task tt = new Task();
		tt.setTaskId(id);
		tt.setTaskTitle(title);
		tt.setTaskText(text);
		allTask[count]=tt;
		count++;
		System.out.println("Task Added successfully");
	}
	public void updateTask() {
		/*
		 * Ask the task id 
		 * write loop check all task pojo class id with id receive from keyboard. 
		 * if present please update you have to update task title and text.	1,  
		 */	
		
	}
	
	public void deleteTask() {
		/*
		 * Ask the task id 
		 * write loop check all task pojo class id with id receive from keyboard.
		 * if presnet remove task from that index postion and display message task not present. 
		 */
	}
	
	public void searchTask() {
		/*
		 * Ask the task id 
		 * write loop check all task pojo class id with id receive from keyboard.
		 * if present display that task details and display message task not present. 
		 */
	}
	
	public void assignTask() {
		
			/*
			 * Ask the task id 
			 * write loop check all task pojo class id with id receive from keyboard.
			 * if presnet remove task from that index postion and display message task not present. 
			 */
		
	}
}
