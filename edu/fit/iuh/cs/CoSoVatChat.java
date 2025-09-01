package edu.fit.iuh.cs;

enum ChatLieu {
	GO,
	NHUA,
	KIMLOAI
}

enum KichCo {
	NHO, 
	VUA, 
	LON
}

abstract class CoSoVatChat {
	private String ma;
	private ChatLieu chatLieu;
	private KichCo kichCo;
	private int soChan;
	
	public CoSoVatChat(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan) {
		setMa(ma);
		setChatLieu(chatLieu); 
		setKichCo(kichCo);
		setSoChan(soChan);
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		if(ma == null || ma.trim().isEmpty() || 
				!ma.matches("[a-zA-Z0-9]+")) {
			throw new 
			IllegalArgumentException(
					"Ma khong duoc rong va ma chi chua ky tu, ky so");
		}
		this.ma = ma;
	}
	public ChatLieu getChatLieu() {
		return chatLieu;
	}
	public void setChatLieu(ChatLieu chatLieu) {
		if(!(chatLieu instanceof ChatLieu)) {
			throw new 
			IllegalArgumentException(
					"Chat lieu khong hop le");
		}
		this.chatLieu = chatLieu;
	}
	public KichCo getKichCo() {
		return kichCo;
	}
	public void setKichCo(KichCo kichCo) {
		if(!(kichCo instanceof KichCo)) {
			throw new 
			IllegalArgumentException(
					"Kich Co khong hop le");
		}
		this.kichCo = kichCo;
	}
	public int getSoChan() {
		return soChan;
	}
	public void setSoChan(int soChan) {
		if(soChan < 0) {
			throw new 
			IllegalArgumentException(
					"So chan phai lon hon hoac bang 0");
		}
		this.soChan = soChan;
	}
	
	abstract double canNang();
}
