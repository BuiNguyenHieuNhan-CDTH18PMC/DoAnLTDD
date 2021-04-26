using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;
using DevExpress.XtraEditors;

namespace WindowsFormsApp1
{
    public partial class TrangChu : DevExpress.XtraEditors.XtraForm
    {
        public TrangChu()
        {
            InitializeComponent();
        }

        private void btnNhanVien_Click(object sender, EventArgs e)
        {
            NhanVien nv = new NhanVien();
            nv.Show();
            this.Close();
        }

        private void btnNhaHang_Click(object sender, EventArgs e)
        {
            NhaHang nh = new NhaHang();
            nh.Show();
            this.Close();
        }

        private void editThanhVien_Click(object sender, EventArgs e)
        {
            ThanhVien tv = new ThanhVien();
            tv.Show();
            this.Close();
        }
    }
}