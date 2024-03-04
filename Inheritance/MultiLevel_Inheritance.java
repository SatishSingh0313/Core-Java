
class Whatsapp_V1{   //MultiLevel Inheritance
	public void SendMessage() {
		System.out.println("Messages Send Successfully");
	}
}
class Whatsapp_V2 extends Whatsapp_V1{
	public void VoiceMessage() {
		System.out.println("Voice Messages Send Successfully");
	}
}
class Whatsapp_V3 extends Whatsapp_V2{
	public void VideoCall() {
		System.out.println("Video Call Started Successfully");
	}
}


public class MultiLevel_Inheritance {
		
	public static void main(String[] args) {
		Whatsapp_V3 v=new Whatsapp_V3();
		v.SendMessage();
		v.VoiceMessage();
		v.VideoCall();
		
	}
}
