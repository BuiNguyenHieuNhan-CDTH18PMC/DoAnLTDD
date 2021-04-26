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
    public partial class Ban : DevExpress.XtraEditors.XtraForm
    {
        public Ban()
        {
            InitializeComponent();
        }

        private void btnMoBan_Click(object sender, EventArgs e)
        {
            DialogResult result = MessageBox.Show("Bạn có chắc muốn mở bàn??", "Thông báo", MessageBoxButtons.YesNo, MessageBoxIcon.Warning);
            switch (result)
            {               
                case DialogResult.No:                 
                    break;
                case DialogResult.Yes:
                    {
                        layout.Visible = true;
                        btnMoBan.Visible = false;
                    }
                    break;
                default:
                    break;
            }
          
        }

        private void btnVe_Click(object sender, EventArgs e)
        {
            SoLuong sl = new SoLuong();
            sl.ShowDialog();
        }

        private void btnKhan_Click(object sender, EventArgs e)
        {
            SoLuong sl = new SoLuong();
            sl.ShowDialog();
        }
    }
}