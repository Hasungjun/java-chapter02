package chapter02;

public class TV {
	private boolean power;
	private int channel; //0~50
	private int volume;  //0~50
	
	
	
	public TV(boolean up,boolean up2,boolean on)
	{
		int p=0;
		int v=0;
	if(on)
	power=true;

		if(up)
			p=-1;
		else
			p=-2;
		if(up2)
			v=-1;
		else
			v=-2;
	
	TV(p,v,on);
	}
	public TV(int up,int up2,boolean on)
	{
	if(on) {
	   power=true;
		}
		
	TV(up,up2,on);
	}
	
	public TV(int up,boolean up2,boolean on)
	{
		int v=0;
	if(on)
	power=true;
		
		if(up2)
			v=-1;
		else
			v=-2;
	
	TV(up,v,on);
		
	}
	public TV(boolean up,int up2,boolean on)
	{
		int p=0;
		int v=0;
	if(on)
	power=true;
		
	
		if(up)
			p=-1;
		else
			p=-2;
		
	TV(p,up2,on);
	}
	
	private void TV(int up, int up2, boolean on) {
		if(on) {
			   power=true;
				}
		
				if(up==-1)
				channel++;
				else if(up==-2)
				channel--;
				else
				channel=up;
				
				if(up2==-1)
				volume++;
				else if(up2==-2)
				volume--;
				else
				volume=up2;
				
				if(channel>50)
					channel=0;
				else if(channel<0)
					channel=50;
				
				if(volume>50)
					volume=0;
				else if(volume<0)
					volume=50;
				
	}
	
		
	public void power(boolean on) {
		power = on;
		
	}
	public void channel(int channel) {
		this.channel=channel;
		if(this.channel>50)
			this.channel=0;
		else if(this.channel<0)
			this.channel=50;
	}
	public void channel(boolean up) {
		if(up) {
			this.channel++;
			if(this.channel>50)
				this.channel=0;
			else if(this.channel<0)
				this.channel=50;
		}
		else {
			this.channel--;
			if(this.channel>50)
				this.channel=0;
			else if(channel<0)
				this.channel=50;
		}
		}
	public void volume(int volume) {
		this.volume=volume;
		if(this.volume>50)
			this.volume=0;
		else if(this.volume<0)
			this.volume=50;
		}	
		
	public void volume(boolean up) {
		if(up) {
			this.volume++;
			if(this.volume>50)
				this.volume=0;
			else if(this.volume<0)
				this.volume=50;
			}
		else {
			volume--;
			if(this.volume>50)
				this.volume=0;
			else if(this.volume<0)
				this.volume=50;
			}	
		
	}
	
	public void status() {
		System.out.println("TV[power="+power+", channel="+channel+", volume="+volume+"]");
		
	}
}
