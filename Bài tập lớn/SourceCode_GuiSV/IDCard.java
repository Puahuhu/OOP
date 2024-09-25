public class IDCard {
      private int soDinhDanh;
      private String hoTen;
      private String gioiTinh;
      private String ngaySinh;
      private String diaChi;
      private int soDienThoai;

      public IDCard(int soDinhDanh, String hoTen, String gioiTinh, String ngaySinh, String diaChi, int soDienThoai) {
            this.soDinhDanh = soDinhDanh;
            this.hoTen = hoTen;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
            this.soDienThoai = soDienThoai;
      }

      public String getNgaySinh() {
            return this.ngaySinh;
      }

      public int getSoDienThoai() {
            return this.soDienThoai;
      }

      public int getSoDinhDanh() {
            return this.soDinhDanh;
      }

      public String getGioiTinh() {
            return this.gioiTinh;
      }

      public int getTuoi() {
		return 2023 - Integer.parseInt(getNgaySinh().substring(6));
	}

      public String toString() {
            return this.soDinhDanh + "," + this.hoTen + "," + this.gioiTinh + "," + this.ngaySinh + "," + this.diaChi + "," + this.soDienThoai;
      }
}
