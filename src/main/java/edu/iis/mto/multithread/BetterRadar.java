package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BetterRadar 
{
//Pola
	private PatriotBattery patriotBaterry;
	private Executor executor;

//Konstruktor
	public BetterRadar(PatriotBattery missle, Executor executor) 
	{
		this.patriotBaterry = missle;
		this.executor = executor;
	}

//Metody
	public void notice(Scud enemyMissle) 
	{
		launchPatriot();
	}

	
	private void launchPatriot() 
	{
		Runnable launchPatriotTask = new Runnable() 
		{
			public void run() 
			{
				for (int i = 0; i < 10; i++) 
				{
					patriotBaterry.launchPatriot();
				}
			}
		};
		executor.execute(launchPatriotTask);
	}
}
