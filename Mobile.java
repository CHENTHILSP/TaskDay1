package julyday1;

public class Mobile {
	
	public void sendMessage() {
		System.out.println("messageSent");
	}
	public void shareDocument() {
		System.out.println("documentShared");
	}
	public void makeCall() {
		System.out.println("call");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile phone=new Mobile();
		phone.sendMessage();
		phone.shareDocument();
		phone.makeCall();
	}

	

}
