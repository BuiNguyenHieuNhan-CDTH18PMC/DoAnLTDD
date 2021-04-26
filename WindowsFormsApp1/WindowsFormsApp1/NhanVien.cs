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
    public partial class NhanVien : DevExpress.XtraEditors.XtraForm
    {
        public NhanVien()
        {
            InitializeComponent();
        }

        private void NhanVien_Load(object sender, EventArgs e)
        {

        }

        private void textEdit6_EditValueChanged(object sender, EventArgs e)
        {

        }

        private void btnBack_Click(object sender, EventArgs e)
        {
            TrangChu tc = new TrangChu();
            tc.Show();
            this.Close();
        }

    }
}