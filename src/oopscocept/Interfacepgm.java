package oopscocept;

interface Whatsappcalls
{
	void calls();
	void mute();
	void disconnect();


}
class Audiocalls implements Whatsappcalls
{

	@Override
	public void calls() {
		System.out.println("audio call");		
	}

	@Override
	public void mute() {
System.out.println("audio is mute");		
	}

	@Override
	public void disconnect() {
System.out.println("audio is disconnect");		
	}
	
}
class Videocalls implements Whatsappcalls
{

	@Override
	public void calls() {
System.out.println("video call");		
	}

	@Override
	public void mute() {
System.out.println("video is mute");		
	}

	@Override
	public void disconnect() {
System.out.println("video is disconnect");		
	}
	
}

public class Interfacepgm {

	public static void main(String[] args) {
		
		/*Audiocalls ad=new Audiocalls();
		ad.calls();
		ad.mute();
		ad.disconnect();
		Videocalls vd=new Videocalls();
		vd.calls();
		vd.mute();
		vd.disconnect();*/
		Whatsappcalls wa=new Audiocalls();
		wa.calls();
		wa.mute();
		wa.disconnect();
		wa=new Videocalls();
		wa.calls();
		wa.mute();
		wa.disconnect();

	}

}
