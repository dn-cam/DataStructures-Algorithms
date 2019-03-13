import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 
 */

/**
 * @author camelliadebnath 19-Feb-2019
 */
public class Scheduler {
	private PriorityQueue<Entry> queue = new PriorityQueue<Entry>(new Comparator<Entry>(){
		public int compare(Entry e1,Entry e2){return(int)(e1.startTime-e2.startTime);}{}});

	/**
	 * @param args
	 */
	class Task {
		public void runTask() {
			System.out.println("Hello World");
		}

	}

	class Entry {
		public Task task;
		public long startTime;

		public Entry(Task task, long startTime) {
			this.task = task;
			this.startTime = startTime;
		}
	}

	public void addTask(Task task, int delay) {
		Entry ent = new Entry(task, System.currentTimeMillis() + delay);
		this.queue.add(ent);

	}

	public void run() throws InterruptedException {
		while (!queue.isEmpty()) {
			Entry entry = queue.poll();
			long taskTime = entry.startTime;
			int timeDiff = (int) (taskTime - System.currentTimeMillis());

			if (timeDiff > 0) {
				Thread.sleep(timeDiff);

			}

			entry.task.runTask();
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scheduler sched = new Scheduler();
		
		sched.addTask(sched.new Task(), 6000);
		sched.addTask(sched.new Task(), 3000);
		
		try {
			sched.run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		

	}

}
