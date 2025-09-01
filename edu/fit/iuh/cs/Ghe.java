package edu.fit.iuh.cs;

class Ghe extends CoSoVatChat{
	private boolean coTuaGhe;

	public Ghe(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, boolean coTuaGhe) {
		super(ma, chatLieu, kichCo, soChan);
		setCoTuaGhe(coTuaGhe);
	}

	public boolean isCoTuaGhe() {
		return coTuaGhe;
	}

	public void setCoTuaGhe(boolean coTuaGhe) {
		this.coTuaGhe = coTuaGhe;
	}
	
	@Override
	double canNang() {
		int nangNangCuaTuaGhe = coTuaGhe ? 20 : 0;
		return getSoChan() * 10 + nangNangCuaTuaGhe;
	}
	
    @Override
    public String toString() {
        return String.format("Ghe[ma = %s, chatLieu = %s, kichCo = %s, soChan = %d, coTuaGhe = %s, canNang = %.2f]"
        		, getMa(), getChatLieu(), getKichCo(), getSoChan(), coTuaGhe ? "Co" : "Khong", canNang());
    }
}
