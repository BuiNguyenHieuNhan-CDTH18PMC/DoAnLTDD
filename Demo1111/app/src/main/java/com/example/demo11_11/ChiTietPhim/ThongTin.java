package com.example.demo11_11.ChiTietPhim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demo11_11.GridView.GridViewTab1;
import com.example.demo11_11.GridView.GridViewTab2;
import com.example.demo11_11.R;

import java.util.ArrayList;


public class ThongTin extends Fragment {

    private ArrayList<ThongTinPhim> ListThongTin;
    private RecyclerView recyclerView;
    private ThongTinRecyclerView adapter;
    String ttm, anime, hh,cmb, four, tt, vs, gd, pt, st;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_thong_tin, container, false);
        /*recyclerView = view.findViewById(R.id.rv_ThongTin);
        Intent intent = getActivity().getIntent();
        ListThongTin = new ArrayList<>();
        if(intent!= null) {
            ttm = intent.getStringExtra(GridViewTab1.TTM);
            anime = intent.getStringExtra(GridViewTab1.ANIME);
            hh = intent.getStringExtra(GridViewTab1.HOATHINH);
            cmb = intent.getStringExtra(GridViewTab1.CMB);
            four = intent.getStringExtra(GridViewTab1.FOUR);
            tt = intent.getStringExtra(GridViewTab2.TT);
            vs = intent.getStringExtra(GridViewTab2.VS);
            gd = intent.getStringExtra(GridViewTab2.HH);
            pt = intent.getStringExtra(GridViewTab2.PT);
            st = intent.getStringExtra(GridViewTab2.ST);
            if(ttm != null) {
                ListThongTin.add(new ThongTinPhim(R.drawable.tiec_trang_mau, "Tiệc Trăng Máu", "Trong buổi họp mặt của nhóm bạn thân, một thành viên bất ngờ đề xuất trò chơi chia sẻ điện thoại nhằm tăng tinh thần đoàn kết. Từ đó, những góc khuất của từng người dần hé lộ và khiến cho mối quan hệ vốn khắn khít của họ bắt đầu lay chuyển",
                        "C18 - Phim cấm khán giả dưới 18 tuổi", "23 Thg 10 2020", "Hài, Tâm Lý", "Nguyễn Quang", "1 giờ 58 phút", "Tiếng Việt - Phụ đề Tiếng Anh", "Thái Hòa, Đức Thịnh, Hồng Ánh, Hứa Vỹ Văn, Thu Trang"));
            }
            if(anime != null)
            {
                ListThongTin.add(new ThongTinPhim(R.drawable.anime,"Hồi ức không quên","Violet Evergarden: Hồi Ức Không Quên là bộ phim hoạt hình Anime kể câu chuyện về một búp bê có tên Violet Evergarden đã từ giã sự nghiệp “công cụ chiến tranh” của mình để về làm việc tại một công ty bưu chính.\n" +
                        "\n" +
                        "Nhiều năm sau chiến tranh, \"búp bê ký ức\" Violet Evergarden vẫn mãi nhớ về thiếu tá Gilbert. Một ngày nọ, cô gặp Dietfried - anh trai của Gilbert, người khuyên cô hãy cố quên Gilbert và bắt đầu cuộc sống mới. Nhưng với Violet, điều đó là không thể. Chôn sâu hình bóng của người quan trọng trong lòng, Violet Evergarden cố gắng sống trong thế giới không có Gilbert. Ngày Violet học được cách yêu thương thì người dạy cô biết yêu thương không còn bên cạnh nữa.",
                        "PHIM DÀNH CHO MỌI ĐỐI TƯỢNG","04/12/2020","Hoạt Hình","Taichi Ishidate","140 phút","Tiếng Nhật - Phụ đề Tiếng Việt",""));
            }
            if(hh != null)
            {
                ListThongTin.add(new ThongTinPhim(R.drawable.hoathinh, "Liên minh thú cưng", "Khi cặp đôi chó oan gia ROGER và BELLE phải cùng chiến đấu chống lại sự tấn công của lũ rô bốt vào thành phố.",
                        "PHIM DÀNH CHO MỌI ĐỐI TƯỢNG", "25/01/2020", "Comedy, Adventure, Animation, Family", "Reinhard Klooss", "106 phút", "Tiếng Anh - Phụ đề tiếng Việt", "Natalie Dormer, Eddie Marsan"));
            }
            if(cmb != null)
            {
                ListThongTin.add(new ThongTinPhim(R.drawable.chi_muoi_ba, "Chị Mười Ba: 3 NGÀY SINH TỬ", "Chí Mười Ba đưa thuộc hạ cũ của mình là Kem Gai, mới ra tù, lên Đà Lạt làm việc cho gara của mình. Tại đây, có vẻ như Kem Gai cuối cùng đã tìm được bình yên và hạnh phúc. Tuy nhiên, anh ta nhanh chóng trở thành thủ phạm chính trong vụ giết Đức Điên, em trai của Thắng Khùng khét tiếng Đà Lạt, và tìm thấy mình trên đường chạy trốn. Chỉ với ba ngày, liệu Chi Mười Ba có thể xóa sổ tên Kềm Gai và cứu anh em An Cư Nghĩa Đoàn của mình khỏi hiểm họa mới? Có bí mật nham hiểm nào khác không?",
                        "C18 - KHÔNG CÓ TRẺ EM DƯỚI 18 TUỔI", "25/12/2020", "Hành động, hài hước", "Võ Thanh Hòa", "95 phút", "Tiếng Việt có phụ đề tiếng Anh", "Thu Trang, Tiến Luật, Kiều Minh Tuấn, Anh Tú, Châu Bùi, Phát La,…"));
            }
            if(four != null)
            {
                ListThongTin.add(new ThongTinPhim(R.drawable.four, "Bộ Tứ Siêu Đẳng", "Bộ Tứ Siêu Đẳng, một siêu phẩm giàu trí tưởng tượng và được xem là tác phẩm có lịch sử dài nhất trong nhóm siêu anh hùng của Marvel, tập trung vào bốn con người trẻ đi đến một vũ trụ mới đầy nguy hiểm, tại đây họ bị thay đổi thể chất một cách kỳ lạ. Cuộc sống của họ phải gắn liền với những biến đổi đó và không thể khôi phục lại như cũ, họ phải học cách khai thác những khả năng mới của mình và làm việc cùng nhau để cứu Trái đất khỏi một kẻ thù hung ác từng là bạn bè của họ.",
                        "PHIM DÀNH CHO MỌI ĐỐI TƯỢNG", "07/08/2015", "Action, Adventure, Science Fiction", "Josh Trank", "100 phút", "Tiếng Anh - Phụ đề tiếng Việt", "Miles Teller, Kate Mara, Jamie Bell, Toby Kebbell, Tim Blake Nelson"));
            }
            if(tt != null)
            {
                ListThongTin.add(new ThongTinPhim(R.drawable.trangquynh, "Trạng Quỳnh", "Phù Thủy, Phù Thủy kể về cậu bé Helga đang ở cùng bà tại khách sạn thì tình cờ lọt vào một hội nghị của phù thuỷ đang tạo ra loại thuốc biến trẻ con thành chuột. Ngay lập tức, mụ phù thuỷ Grand High thử nghiệm nó lên người cậu. Và thế là Helga trong hình hài sinh vật gặm nhấm nhỏ bé phải tìm cách cứu lấy bản thân và ngăn chặn âm mưu của “binh đoàn” phù thủy xấu xa.",
                        "C13 - KHÔNG CÓ TRẺ EM DƯỚI 13 TUỔI", "5/2/2019", "Phim hài", "Đỗ Đức Thịnh", "100 phút", "Tiếng Việt", "Trần Quốc Anh, Nhã Phương, Trấn Thành, Công Dương, Khả Như,…"));
            }
            if(pt != null)
            {
                ListThongTin.add(new ThongTinPhim(R.drawable.phuthuy, "The Witches", "óm siêu anh  khỏi một kẻ thù hung ác từng là bạn bè của họ.",
                        "PHIM DÀNH CHO MỌI ĐỐI TƯỢNG", "06/11/2020", " Comedy, Fantasy", "Robert Zemeckis", "100 phút", "Tiếng Anh - Phụ đề tiếng Việt", "Anne Hathaway, Octavia Spencer, Stanley Tucci, Codie-Lei Eastick, Jahzir Bruno"));
            }
            if(gd != null)
            {
                ListThongTin.add(new ThongTinPhim(R.drawable.giadinhcroods, "Gia Đình Crood: Kỷ Nguyên Mới", "Từ một gia đình tiền sử sống trong hang với nỗi lo sợ thường trực về thế giới nguy hiểm bên ngoài, nhà Croods đã tự tin bước khỏi vùng an toàn của mình, tiến tới việc làm chủ nhiều phát minh quan trọng.",
                        "PHIM DÀNH CHO MỌI ĐỐI TƯỢNG", "27/11/2020", "Adventure, Animation, Family, Fantasy", "Joel Crawford", "100 phút", "Tiếng Anh - Phụ đề tiếng Việt", "Nicolas Cage, Emma Stone, Ryan Reynolds, Peter Dinklage, Leslie Mann"));
            }
            if(vs != null)
            {
                ListThongTin.add(new ThongTinPhim(R.drawable.vi_sao_dua_ban_toi, "Vì Sao Đưa Bạn Tới", "Vì Sao Đưa Bạn Tới câu chuyện về những người bạn động vật đáng yêu của rừng xanh và một người bạn đặc biệt ngoài hành tinh. Một sớm thức dậy, chú khỉ Munki tinh nghịch và cô nàng voi Trunk hiền lành đột nhiên phát hiện ra mình có khả năng nói tiếng người.",
                        "PHIM DÀNH CHO MỌI ĐỐI TƯỢNG", "18/09/2020", "Animation", "Brent Dawes", "84 phút", "Tiếng Anh - Phụ đề tiếng Việt", "David Menkin, David Rintoul, Gavin Peter, Florrie Wilkinson, Adam Neill"));
            }
            if(st != null)
            {
                ListThongTin.add(new ThongTinPhim(R.drawable.sieuthu, "Liên Quân Siêu Thú", "Năm 1969, có 1 chú chó được đưa vào không gian, nhưng một sự cố xảy ra và biến chú thành Siêu Cún. Lạc lối ở tương lai nơi tất cả mọi người đều căm ghét động vật, Siêu Cún cần tìm cho mình những trợ thủ đắc lực để giúp cậu gặp lại chủ nhân của mình. Sau cuộc gặp gỡ tình cờ với Mèo Tia Chớp, Thỏ Thông Thái và tổ chức Vệ Thú – nơi bảo vệ các loài động vật ở Glenfield, Siêu Cún và bộ sậu mới của cậu bất đắc dĩ phải đối đầu với chính quyền thị trấn và trở thành những anh hùng quả cảm.",
                        "PHIM DÀNH CHO MỌI ĐỐI TƯỢNG", "06/11/2020", "Comedy, Animation, Family", "Ben Smith", "91 phút", "Tiếng Anh - Phụ đề tiếng Việt", "Luke Evans, Nick Frost, Gemma Arterton, Bill Nighy, Rachael Louise Miller"));
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        adapter = new ThongTinRecyclerView(getContext(),ListThongTin);
        recyclerView.setAdapter(adapter);*/
        return view;
    }
}