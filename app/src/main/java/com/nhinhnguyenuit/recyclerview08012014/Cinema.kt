package com.nhinhnguyenuit.recyclerview08012014

class Cinema (
    var image: Int,
    var name: String,
    var address: String,
    var phone: String,
    var distance: Int
){
    companion object{

        fun getDataMock(): List<Cinema>{
            return  mutableListOf(
                Cinema(R.drawable.galaxy_nguyen_du, "Galaxy Nguyễn Du", "116 Nguyễn Du, Quận 1, Tp.HCM", "19002224", 461),
                Cinema(R.drawable.galaxy_tan_binh, "Galaxy Tân Bình", "246 Nguyễn Hồng Đào, Quận TB, Tp.HCM", "19002224", 5800),
                Cinema(R.drawable.galaxy_pham_van_chi, "Galaxy Phạm Văn Chí", "634Bis Phạm Văn Chí, Phường 8, Quận 6, Tp.HCM", "19002224", 7100),
                Cinema(R.drawable.galaxy_quang_trung, "Galaxy Quang Trung", "Lầu 3, TTTM CoopMart Foodcosa số 304A, Quang Trung, P.11, Q. Gò Vấp, Tp.HCM", "19002224", 7200),
                Cinema(R.drawable.galaxy_kinh_duong_vuong, "Galaxy Kinh Dương Vương", "718bis Đ. Kinh Dương Vương, Phường 13, Quận 6, Tp.HCM", "19002224", 7500),
                Cinema(R.drawable.galaxy_huynh_tan_phat, "Galaxy Cinema Huỳnh Tấn Phát", "1362 Huỳnh Tấn Phát, Phú Mỹ, Quận 7, Tp.HCM", "19002224", 8700),
                Cinema(R.drawable.galaxy_nguyen_du, "Galaxy Nguyễn Du", "116 Nguyễn Du, Quận 1, Tp.HCM", "19002224", 461),
                Cinema(R.drawable.galaxy_tan_binh, "Galaxy Tân Bình", "246 Nguyễn Hồng Đào, Quận TB, Tp.HCM", "19002224", 5800),
                Cinema(R.drawable.galaxy_pham_van_chi, "Galaxy Phạm Văn Chí", "634Bis Phạm Văn Chí, Phường 8, Quận 6, Tp.HCM", "19002224", 7100),
                Cinema(R.drawable.galaxy_quang_trung, "Galaxy Quang Trung", "Lầu 3, TTTM CoopMart Foodcosa số 304A, Quang Trung, P.11, Q. Gò Vấp, Tp.HCM", "19002224", 7200),
                Cinema(R.drawable.galaxy_kinh_duong_vuong, "Galaxy Kinh Dương Vương", "718bis Đ. Kinh Dương Vương, Phường 13, Quận 6, Tp.HCM", "19002224", 7500),
                Cinema(R.drawable.galaxy_huynh_tan_phat, "Galaxy Cinema Huỳnh Tấn Phát", "1362 Huỳnh Tấn Phát, Phú Mỹ, Quận 7, Tp.HCM", "19002224", 8700)
            )
        }
    }
}