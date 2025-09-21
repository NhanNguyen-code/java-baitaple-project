package edu.fit.iuh.cs;

class Ban extends CoSoVatChat{
	private double doRong;
	private double doDai;
	public Ban(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, double doRong, double doDai) {
		super(ma, chatLieu, kichCo, soChan);
		setDoRong(doRong);
		setDoDai(doDai);
	}
	public double getDoRong() {
		return doRong;
	}
	public void setDoRong(double doRong) {
		if(doRong <= 0) {
			throw new 
			IllegalArgumentException(
					"Do rong phai lon hon 0");
		}
		this.doRong = doRong;
	}
	public double getDoDai() {
		return doDai;
	}
	public void setDoDai(double doDai) {
		if(doDai <= 0) {
			throw new 
			IllegalArgumentException(
					"Do dai phai lon hon 0");
		}
		this.doDai = doDai;
	}
	
	@Override
	public double canNang() {
		return getSoChan() * 10 + doDai * doRong * 10;
	}
	
    @Override
    public String toString() {
        return "Ban[ma = " + getMa() + ", chatLieu = " + getChatLieu() +
               ", kichCo = " + getKichCo() + ", soChan = " + getSoChan() +
               ", doRong = " + doRong + ", doDai = " + doDai +
               ", canNang = " + canNang() + "]";
    }
}


